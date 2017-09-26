package lawilliahmt.hoe;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class HoeMagmaCube extends ItemHoe {

	public HoeMagmaCube(ToolMaterial toolMaterial) {
		super(toolMaterial);
	}

	//右クリック時にブロックの変更（TNT Modders＞MOD製作チュートリアル＞ツール類の追加、を参考にさせていただきました。）
	@Override
	public boolean onItemUse(ItemStack itemStack, EntityPlayer entityPlayer, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
		Block block = world.getBlock(x, y, z);

		if (!block.getMaterial().isSolid()){
			return false; //固体以外には設置不可
	    } else {
	    	//以下でブロックのどの面を右クリックしたかによって、
    		//設置する座標に合わせてx、y、zをズラす。
    		if (side == 0){ //底面
    			--y;
    		}
    		if (side == 1){ //上面
    			++y;
    		}
    		if (side == 2){ //-z側面
    			--z;
    		}
    		if (side == 3){ //+z側面
    			++z;
    		}
    		if (side == 4){ //-x側面
    			--x;
    		}
    		if (side == 5){ //+x側面
    			++x;
    		}

    		if (!Blocks.flowing_lava.canPlaceBlockAt(world, x, y, z)){
    			//同座標に溶岩を設置できるかを判定。
    			return false;

    		} else {
    			//音を鳴らす
    			int rsp = new java.util.Random().nextInt(7);
				world.playSoundEffect(x + 0.5D, y + 0.5D, z + 0.5D, "liquid.lavapop", 0.6F, 0.3F + 0.05F * rsp);

    			if (world.isRemote){
    				return true;
    			} else { //溶岩の設置はサーバー側で行う。
    				//溶岩を設置して、耐久値を5減らす
    				world.setBlock(x, y, z, Blocks.flowing_lava, 0, 2);
    				itemStack.damageItem(5, entityPlayer);
    				return true;
    			}
    		}
	    }

	}
}
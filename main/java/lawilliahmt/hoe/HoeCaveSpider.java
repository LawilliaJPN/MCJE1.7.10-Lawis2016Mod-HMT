package lawilliahmt.hoe;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class HoeCaveSpider extends ItemHoe {

	public HoeCaveSpider(ToolMaterial toolMaterial) {
		super(toolMaterial);
	}

    //右クリック時の効果追加（耐久値を消費して、蜘蛛の巣を設置or消滅）
	@Override
	public boolean onItemUse(ItemStack itemStack, EntityPlayer entityPlayer, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
        Block block = world.getBlock(x, y, z);

		if (!block.getMaterial().isSolid()){
            return false; //固体以外には設置不可
        } else {
        	if (block == Blocks.web){
        		//音を鳴らす
    			int rsp = new java.util.Random().nextInt(5);
				world.playSoundEffect(x + 0.5D, y + 0.5D, z + 0.5D, "dig.cloth", 0.6F, 0.3F + 0.05F * rsp);

        		if (world.isRemote){
                    return true;
                } else {
                	//クモの巣を消滅させて、耐久値を1減らす。
                	world.setBlockToAir(x, y, z);
    				itemStack.damageItem(1, entityPlayer);
                	return true;
                }
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

        		if (!entityPlayer.canPlayerEdit(x, y, z, side, itemStack)){
        			//設置位置にずらしたx、y、zで、プレイヤーが座標を編集できるか判定
        			return false;
        		} else if (!Blocks.web.canPlaceBlockAt(world, x, y, z)){
        			//同座標にクモの巣を設置できるかを判定。
        			return false;

        		} else {
        			//音を鳴らす
        			int rsp = new java.util.Random().nextInt(7);
    				world.playSoundEffect(x + 0.5D, y + 0.5D, z + 0.5D, "mob.spider.say", 0.25F, 0.3F + 0.05F * rsp);

    				if (world.isRemote){
        				return true;
        			} else { //ブロックの設置はサーバー側で行う。
        				//クモの巣を設置して、耐久値を5減らす
        				world.setBlock(x, y, z, Blocks.web, 0, 3);
        				itemStack.damageItem(5, entityPlayer);
        				return true;
        			}
        		}
        	}
        }
	}
}

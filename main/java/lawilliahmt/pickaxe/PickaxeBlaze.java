package lawilliahmt.pickaxe;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class PickaxeBlaze extends ItemPickaxe {

	public PickaxeBlaze(ToolMaterial toolMaterial) {
		super(toolMaterial);
	}

	    //右クリック時の効果追加（耐久値を消費して松明を設置）
		@Override
		public boolean onItemUse(ItemStack itemStack, EntityPlayer entityPlayer, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
			if (side == 0){ //底面
	            return false; //ブロックの底面に松明は設置できない
	        }
	        else if (!world.getBlock(x, y, z).getMaterial().isSolid()){
	            return false; //固体以外に松明は設置できない

	        } else {
	        	//以下でブロックのどの面を右クリックしたかによって、
	        	//設置する座標に合わせてx、y、zをズラす。
	            if (side == 1){ //上面
	                ++y; //ブロックの上に設置
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
	                return false; //設置位置をプレイヤーが編集できるか判定
	            } else if (!Blocks.torch.canPlaceBlockAt(world, x, y, z)){
	                return false; //同座標に松明を設置できるかを判定。
	            } else {
	            	//音を鳴らす
	    			int rsp = new java.util.Random().nextInt(6);
	    			world.playSoundEffect(x + 0.5D, y + 0.5D, z + 0.5D, "fire.ignite", 0.7F, 0.3F + 0.05F * rsp);

	    			if (world.isRemote){
	    				return true;
	    			} else { //ブロックの設置はサーバー側で行う。
	    				//松明を設置する（メタデータ値は、「6 - side」）
	    				world.setBlock(x, y, z, Blocks.torch, 6 - side, 3);
	    				//耐久値を2減らす（後日調整予定）
	    				itemStack.damageItem(2, entityPlayer);
	    				return true;
	    			}
	            }
	        }
		}
}

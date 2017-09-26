package lawilliahmt.pickaxe;

import lawilliahmt.HandyMobTools;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class PickaxeEnderman extends ItemPickaxe {

	public PickaxeEnderman(ToolMaterial toolMaterial) {
		super(toolMaterial);
	}

	//右クリック時の効果追加（ブロックを削除）
	@Override
	public boolean onItemUse(ItemStack itemStack, EntityPlayer entityPlayer, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
		if (!world.getBlock(x, y, z).getMaterial().isSolid()){
            return false; //固体以外を右クリックしても無効
        } else {
        	if (side == 0){ //底面
        		int wy = 0;
        		for(int ay = 0; ay < 50 ; ay++){
                	if(world.isAirBlock(x, y + ay, z) && world.isAirBlock(x, y + ay + 1, z)){
                		Block block = world.getBlock(x, y + ay - 1, z);
                		if(block.isOpaqueCube() && block != Blocks.bedrock){
                			wy = y + ay;
                			HandyMobTools.logger.warn("x =" + x + ", y =" + wy + ", z =" + z);
                			break;
                		}
                	}
                }
        		if (wy == 0){
        			return false;
        		} else {
        			entityPlayer.setPositionAndUpdate(x + 0.5D, wy, z + 0.5D);
        			entityPlayer.fallDistance = 0.0F;

        			//音を鳴らす
        			int rsp = new java.util.Random().nextInt(5);
        			world.playSoundAtEntity(entityPlayer, "random.orb", 0.4F, 0.05F + 0.05F * rsp);

        			itemStack.damageItem(5, entityPlayer);//耐久値を5減少させる
        		}
            }

            if (side == 1){ //上面
            	//音を鳴らす
    			int rsp = new java.util.Random().nextInt(6);
    			world.playSoundAtEntity(entityPlayer, "mob.enderdragon.wings", 0.4F, 3.0F + 0.2F * rsp);

            	for (int ay = 0; ay < 5; ay++){
                	for (int ax = 0; ax < 5; ax++){
                    	for (int az = 0; az < 5; az++){
                    		if (entityPlayer.canPlayerEdit(x + ax -2, y + ay + 1, z + az - 2, side, itemStack)){
                    			if (world.getBlock(x + ax - 2, y + ay +1, z + az - 2) != Blocks.bedrock){
                        			if (!world.isRemote){
                        				world.setBlockToAir(x + ax - 2, y + ay + 1, z + az - 2);
                        			}
                    			}
             	            }
                    	}
                	}
            	}
            	itemStack.damageItem(2, entityPlayer);//耐久値を2減少させる
            }

            if (side == 2){ //-z面
            	//音を鳴らす
    			int rsp = new java.util.Random().nextInt(6);
    			world.playSoundAtEntity(entityPlayer, "mob.enderdragon.wings", 0.4F, 3.0F + 0.2F * rsp);

            	for (int ay = 0; ay < 3; ay++){
                	for (int ax = 0; ax < 3; ax++){
                    	for (int az = 0; az < 3; az++){
                    		if (entityPlayer.canPlayerEdit(x + ax -1, y + ay, z + az, side, itemStack)){
                    			if (world.getBlock(x + ax - 1, y + ay, z + az) != Blocks.bedrock){
                        			if (!world.isRemote){
                        				world.setBlockToAir(x + ax - 1, y + ay, z + az);
                        			}
                    			}
             	            }
                    	}
                	}
            	}
            	itemStack.damageItem(2, entityPlayer);//耐久値を2減少させる
            }
            if (side == 3){ //+z面
            	//音を鳴らす
    			int rsp = new java.util.Random().nextInt(6);
    			world.playSoundAtEntity(entityPlayer, "mob.enderdragon.wings", 0.4F, 3.0F + 0.2F * rsp);

            	for (int ay = 0; ay < 3; ay++){
                	for (int ax = 0; ax < 3; ax++){
                    	for (int az = 0; az < 3; az++){
                    		if (entityPlayer.canPlayerEdit(x + ax -1, y + ay, z - az, side, itemStack)){
                    			if (world.getBlock(x + ax - 1, y + ay, z - az) != Blocks.bedrock){
                        			if (!world.isRemote){
                        				world.setBlockToAir(x + ax - 1, y + ay, z - az);
                        			}
                    			}
             	            }
                    	}
                	}
            	}
            	itemStack.damageItem(2, entityPlayer);//耐久値を2減少させる
            }
            if (side == 4){ //-x面
            	//音を鳴らす
    			int rsp = new java.util.Random().nextInt(6);
    			world.playSoundAtEntity(entityPlayer, "mob.enderdragon.wings", 0.4F, 3.0F + 0.2F * rsp);

            	for (int ay = 0; ay < 3; ay++){
                	for (int ax = 0; ax < 3; ax++){
                    	for (int az = 0; az < 3; az++){
                    		if (entityPlayer.canPlayerEdit(x + ax, y + ay, z + az - 1, side, itemStack)){
                    			if (world.getBlock(x + ax, y + ay, z + az - 1) != Blocks.bedrock){
                        			if (!world.isRemote){
                        				world.setBlockToAir(x + ax, y + ay, z + az - 1);
                        			}
                    			}
             	            }
                    	}
                	}
            	}
            	itemStack.damageItem(2, entityPlayer);//耐久値を2減少させる
            }
            if (side == 5){ //+x面
            	//音を鳴らす
    			int rsp = new java.util.Random().nextInt(6);
    			world.playSoundAtEntity(entityPlayer, "mob.enderdragon.wings", 0.4F, 3.0F + 0.2F * rsp);

            	for (int ay = 0; ay < 3; ay++){
                	for (int ax = 0; ax < 3; ax++){
                    	for (int az = 0; az < 3; az++){
                    		if (entityPlayer.canPlayerEdit(x - ax, y + ay, z + az - 1, side, itemStack)){
                    			if (world.getBlock(x - ax, y + ay, z + az - 1) != Blocks.bedrock){
                        			if (!world.isRemote){
                        				world.setBlockToAir(x - ax, y + ay, z + az - 1);
                        			}
                    			}
             	            }
                    	}
                	}
            	}
            	itemStack.damageItem(2, entityPlayer);//耐久値を2減少させる
            }
            return true;
        }
    }
}

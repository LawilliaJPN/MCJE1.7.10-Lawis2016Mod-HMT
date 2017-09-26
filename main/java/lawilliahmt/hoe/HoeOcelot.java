package lawilliahmt.hoe;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class HoeOcelot extends ItemHoe{

	public HoeOcelot(ToolMaterial toolMaterial) {
		super(toolMaterial);
	}

	@Override
	public boolean onItemUse(ItemStack itemStack, EntityPlayer entityPlayer, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
		List list = entityPlayer.worldObj.getEntitiesWithinAABBExcludingEntity(entityPlayer,
        		entityPlayer.boundingBox.addCoord(x, y, z).expand(10.0D, 5.0D, 10.0D));

		if (list != null && !list.isEmpty()){
        	for (int i = 0 ; i < list.size() ; i++){
        		Entity entity = (Entity)list.get(i);

        		if (entity != null){
        			if(entity instanceof EntityCreeper){
        				EntityCreeper creeper = (EntityCreeper)entity;
        				double dcx = creeper.posX;
        				double dcy = creeper.posY;
        				double dcz = creeper.posZ;
        				double ddx = dcx - x;
        				double ddz = dcz - z;
        				int rmx = new java.util.Random().nextInt(5);
    					int rmz = new java.util.Random().nextInt(5);

        				if(ddx >= 0 && ddz >= 0){
        					for(int mcx = 0; mcx < 5; mcx++){
        						for(int mcz = 0; mcz < 5; mcz++){
        							int bmx = (int)dcx + mcx + rmx;
        							int bmz = (int)dcz + mcz + rmz;
        							Block block1 = world.getBlock(bmx, (int)dcy + 1, bmz);
        							Block block2 = world.getBlock(bmx, (int)dcy + 2, bmz);
        							if(block1.isAir(world, bmx, (int)dcy + 1, bmz) && block2.isAir(world, bmx, (int)dcy + 2, bmz)){
        								creeper.setPositionAndUpdate(bmx + 0.5D, dcy + 0.2D, bmz + 0.5D);
            	            			creeper.fallDistance = 0.0F;
            	            			break;
        							}
            					}
        					}
        				} else if(ddx < 0 && ddz >= 0){
        					for(int mcx = 0; mcx < 5; mcx++){
        						for(int mcz = 0; mcz < 5; mcz++){
        							int bmx = (int)dcx - mcx - rmx;
        							int bmz = (int)dcz + mcz + rmz;
        							Block block1 = world.getBlock(bmx, (int)dcy + 1, bmz);
        							Block block2 = world.getBlock(bmx, (int)dcy + 2, bmz);
        							if(block1.isAir(world, bmx, (int)dcy + 1, bmz) && block2.isAir(world, bmx, (int)dcy + 2, bmz)){
        								creeper.setPositionAndUpdate(bmx + 0.5D, dcy + 0.2D, bmz + 0.5D);
            	            			creeper.fallDistance = 0.0F;
            	            			break;
        							}
            					}
        					}
        				} else if(ddx >= 0 && ddz < 0){
        					for(int mcx = 0; mcx < 5; mcx++){
        						for(int mcz = 0; mcz < 5; mcz++){
        							int bmx = (int)dcx + mcx + rmx;
        							int bmz = (int)dcz - mcz - rmz;
        							Block block1 = world.getBlock(bmx, (int)dcy + 1, bmz);
        							Block block2 = world.getBlock(bmx, (int)dcy + 2, bmz);
        							if(block1.isAir(world, bmx, (int)dcy + 1, bmz) && block2.isAir(world, bmx, (int)dcy + 2, bmz)){
        								creeper.setPositionAndUpdate(bmx + 0.5D, dcy + 0.2D, bmz + 0.5D);
            	            			creeper.fallDistance = 0.0F;
            	            			break;
        							}
            					}
        					}
        				} else if(ddx < 0 && ddz < 0){
        					for(int mcx = 0; mcx < 5; mcx++){
        						for(int mcz = 0; mcz < 5; mcz++){
        							int bmx = (int)dcx - mcx - rmx;
        							int bmz = (int)dcz - mcz - rmz;
        							Block block1 = world.getBlock(bmx, (int)dcy + 1, bmz);
        							Block block2 = world.getBlock(bmx, (int)dcy + 2, bmz);
        							if(block1.isAir(world, bmx, (int)dcy + 1, bmz) && block2.isAir(world, bmx, (int)dcy + 2, bmz)){
        								creeper.setPositionAndUpdate(bmx + 0.5D, dcy + 0.2D, bmz + 0.5D);
            	            			creeper.fallDistance = 0.0F;
            	            			break;
        							}
            					}
        					}
        				}
        			}
            	}

            }
        	return true;
        } else {
        	return false;
        }
	}
}

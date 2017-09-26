package lawilliahmt.hoe;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class HoeWolf extends ItemHoe{

	public HoeWolf(ToolMaterial toolMaterial) {
		super(toolMaterial);
	}

	@Override
	public boolean onItemUse(ItemStack itemStack, EntityPlayer entityPlayer, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
		List list = entityPlayer.worldObj.getEntitiesWithinAABBExcludingEntity(entityPlayer,
        		entityPlayer.boundingBox.addCoord(x, y, z).expand(15.0D, 5.0D, 15.0D));

		if (list != null && !list.isEmpty()){
        	for (int i = 0 ; i < list.size() ; i++){
        		Entity entity = (Entity)list.get(i);

        		if (entity != null){
        			if(entity instanceof EntitySkeleton){
        				EntitySkeleton skeleton = (EntitySkeleton)entity;
        				EntityWolf wolf =(EntityWolf)null;
        				skeleton.attackEntityFrom(DamageSource.causeMobDamage(wolf), 4);
        			}
            	}

            }
        	return true;
        } else {
        	return false;
        }
	}
}

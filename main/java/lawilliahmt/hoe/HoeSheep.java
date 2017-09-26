package lawilliahmt.hoe;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.IShearable;

public class HoeSheep extends ItemHoe{

	public HoeSheep(ToolMaterial toolMaterial) {
		super(toolMaterial);
	}

	@Override
	public boolean onItemUse(ItemStack itemStack, EntityPlayer entityPlayer, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
		List list = entityPlayer.worldObj.getEntitiesWithinAABBExcludingEntity(entityPlayer,
        		entityPlayer.boundingBox.addCoord(x, y, z).expand(20.0D, 5.0D, 20.0D));

		if (list != null && !list.isEmpty()){
        	for (int i = 0 ; i < list.size() ; i++){
        		Entity entity = (Entity)list.get(i);

        		if (entity != null){
        			String epUuid = entityPlayer.getUniqueID().toString();

        			if(entity instanceof IShearable){
        				EntitySheep sheep = (EntitySheep)entity;
        				if (entity.worldObj.isRemote){
        		            return false;
        		        }
        		        if (sheep.isShearable(new ItemStack(Items.shears), sheep.worldObj, (int)sheep.posX, (int)sheep.posY, (int)sheep.posZ)){
        		                ArrayList<ItemStack> drops = sheep.onSheared(new ItemStack(Items.shears), entity.worldObj, (int)entity.posX, (int)entity.posY, (int)entity.posZ,
        		                        EnchantmentHelper.getEnchantmentLevel(Enchantment.fortune.effectId, new ItemStack(Items.shears)));

        		                Random rand = new Random();
        		                for(ItemStack stack : drops){
        		                    EntityItem ent = entityPlayer.entityDropItem(stack, 1.0F);
        		                    ent.motionY += rand.nextFloat() * 0.05F;
        		                    ent.motionX += (rand.nextFloat() - rand.nextFloat()) * 0.1F;
        		                    ent.motionZ += (rand.nextFloat() - rand.nextFloat()) * 0.1F;
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
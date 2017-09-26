package lawilliahmt.hoe;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class HoeChicken extends ItemHoe {

	public HoeChicken(ToolMaterial toolMaterial) {
		super(toolMaterial);
	}

	//右クリック時の効果追加（卵を放つ）
		@Override
		public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer){
			//音を鳴らす
			world.playSoundAtEntity(entityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

	        if (!world.isRemote){
	            world.spawnEntityInWorld(new EntityEgg(world, entityPlayer));

	            //耐久値を3減らす(後日調整)
				itemStack.damageItem(3, entityPlayer);
	        }
            return itemStack;
		}
}

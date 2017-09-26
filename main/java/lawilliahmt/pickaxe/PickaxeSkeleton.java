package lawilliahmt.pickaxe;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class PickaxeSkeleton extends ItemPickaxe {

	public PickaxeSkeleton(ToolMaterial toolMaterial) {
		super(toolMaterial);
	}

	//右クリック時の効果追加（矢を放つ）
	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer){

		EntityArrow entityarrow = new EntityArrow(world, entityPlayer, 2.0F);
		entityarrow.setIsCritical(true);
		entityarrow.setDamage(entityarrow.getDamage() / 2);

		//音を鳴らす
		world.playSoundAtEntity(entityPlayer, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + 0.5F);

		if (entityPlayer.inventory.hasItem(Items.arrow)){
			//インベントリの矢を消費する
			entityPlayer.inventory.consumeInventoryItem(Items.arrow);
			//耐久値を2減らす(後日調整)
			itemStack.damageItem(2, entityPlayer);
		} else {
			//耐久値を5減らす(後日調整)
			itemStack.damageItem(5, entityPlayer);
		}

		if (!world.isRemote){
            world.spawnEntityInWorld(entityarrow);
        }
		return itemStack;
	}
}

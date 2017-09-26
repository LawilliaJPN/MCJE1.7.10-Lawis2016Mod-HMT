package lawilliahmt.hoe;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class HoeGhast extends ItemHoe{

	public HoeGhast(ToolMaterial toolMaterial) {
		super(toolMaterial);
	}

	//右クリック時の効果追加（矢を放つ）
	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer){
	if(entityPlayer.isSneaking()){
		EntityArrow entityarrow = new EntityArrow(world, entityPlayer, 2.0F);
		entityarrow.setIsCritical(true);
		entityarrow.setFire(100); //フレイム

		//音を鳴らす
		world.playSoundAtEntity(entityPlayer, "mob.ghast.charge", 0.7F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + 0.5F);

		if (entityPlayer.inventory.hasItem(Items.arrow)){
			//インベントリの矢を消費する
			entityPlayer.inventory.consumeInventoryItem(Items.arrow);
			//耐久値を1減らす(後日調整)
			itemStack.damageItem(1, entityPlayer);
		} else {
			//耐久値を4減らす(後日調整)
			itemStack.damageItem(4, entityPlayer);
		}

		if (!world.isRemote){
            world.spawnEntityInWorld(entityarrow);
		}
		entityPlayer.fallDistance = 0.0F;

	} else {
		entityPlayer.motionY = 0.3D;
		entityPlayer.fallDistance = 0.0F;

		//耐久値を10回に1回、1減らす(後日調整)
		int r = new java.util.Random().nextInt(10);
		if(r == 0){
			itemStack.damageItem(1, entityPlayer);
		}
	}
		return itemStack;
	}
}

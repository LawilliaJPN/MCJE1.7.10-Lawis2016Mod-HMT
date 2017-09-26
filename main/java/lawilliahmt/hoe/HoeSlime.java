package lawilliahmt.hoe;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class HoeSlime extends ItemHoe {

	public HoeSlime(ToolMaterial toolMaterial) {
		super(toolMaterial);
	}

	//右クリック時の特殊効果（スライムブロックみたいな挙動）
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer){
		double jh = Math.sqrt(entityPlayer.fallDistance) / 3;
		entityPlayer.fallDistance = 0.0F;
		if(jh >= 3.0D){
			//音を鳴らす
			int rsp = new java.util.Random().nextInt(5);
			world.playSoundAtEntity(entityPlayer, "mob.slime.small", 0.7F, 0.2F + 0.05F * rsp);

			entityPlayer.motionY = 3.0D;
			itemStack.damageItem(1, entityPlayer); //耐久値を1減らす(後日調整)
		} else if(jh >= 0.5D){
			//音を鳴らす
			int rsp = new java.util.Random().nextInt(5);
			world.playSoundAtEntity(entityPlayer, "mob.slime.small", (float) (0.4F + jh * 0.1F), 0.2F + 0.05F * rsp);

			entityPlayer.motionY = jh;
			itemStack.damageItem(2, entityPlayer); //耐久値を2減らす(後日調整)
		}
		return itemStack;
	}
}
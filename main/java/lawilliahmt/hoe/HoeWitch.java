package lawilliahmt.hoe;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class HoeWitch extends ItemHoe {

	public HoeWitch(ToolMaterial toolMaterial) {
		super(toolMaterial);
	}

	//右クリック時の特殊効果（ポーション）
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer){
		//音を鳴らす
		int rsp = new java.util.Random().nextInt(5);
		world.playSoundAtEntity(entityPlayer, "random.orb", 0.4F, 0.05F + 0.05F * rsp);

		//耐性のポーション 10秒間
		entityPlayer.addPotionEffect(new PotionEffect(11, 20 * 10));
		//耐火のポーション 10秒間
		entityPlayer.addPotionEffect(new PotionEffect(12, 20 * 10));

		//耐久値を2減らす(後日調整)
		itemStack.damageItem(2, entityPlayer);
		return itemStack;
	}
}
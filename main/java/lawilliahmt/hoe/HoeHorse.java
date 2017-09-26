package lawilliahmt.hoe;

import lawilliahmt.addon.Addons;
import lawilliahmt.addon.SS2AddonStamina;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class HoeHorse extends ItemHoe {

	public HoeHorse(ToolMaterial toolMaterial) {
		super(toolMaterial);
	}

	//右クリック時の特殊効果（移動系ポーション）
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer){
		//音を鳴らす
		int rsp = new java.util.Random().nextInt(5);
		world.playSoundAtEntity(entityPlayer, "random.orb", 0.4F, 0.05F + 0.05F * rsp);

		//俊敏のポーション 10秒間
		entityPlayer.addPotionEffect(new PotionEffect(1, 20 * 10));
		//跳躍Ⅱのポーション 10秒間
		entityPlayer.addPotionEffect(new PotionEffect(8, 20 * 10, 1));

		//耐久値を4減らす(後日調整)
		itemStack.damageItem(4, entityPlayer);

		if(Addons.SS2Addon == true){
			new SS2AddonStamina(entityPlayer, 40, 3);
		}

		return itemStack;
	}
}

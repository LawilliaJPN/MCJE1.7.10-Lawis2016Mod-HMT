package lawilliahmt.hoe;

import lawilliahmt.addon.Addons;
import lawilliahmt.addon.SS2AddonMoisture;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class HoeSquid extends ItemHoe {

	public HoeSquid(ToolMaterial toolMaterial) {
		super(toolMaterial);
	}

	//右クリック時の特殊効果（水中呼吸のポーション）
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer){
		//音を鳴らす
		int rsp = new java.util.Random().nextInt(5);
		world.playSoundAtEntity(entityPlayer, "random.orb", 0.4F, 0.05F + 0.05F * rsp);

		//水中呼吸のポーション 30秒間
		entityPlayer.addPotionEffect(new PotionEffect(13, 20 * 30));

		//耐久値を4減らす(後日調整)
		itemStack.damageItem(4, entityPlayer);

		if(Addons.SS2Addon == true){ //SS2アドオン
			new SS2AddonMoisture(entityPlayer, 2, 0.5F);
		}

		return itemStack;
	}
}
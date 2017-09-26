package lawilliahmt.hoe;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class HoeCow extends ItemHoe {

	public HoeCow(ToolMaterial toolMaterial) {
		super(toolMaterial);
	}

	//右クリック時の特殊効果（ポーション）
		public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer){
			//音を鳴らす
			int rsp = new java.util.Random().nextInt(5);
			world.playSoundAtEntity(entityPlayer, "random.orb", 0.4F, 0.05F + 0.05F * rsp);

			if (!world.isRemote){
				//ポーション効果治療(牛乳と同様の効果)
				entityPlayer.curePotionEffects(new ItemStack(Items.milk_bucket));
		    }

			//耐久値を減らす(後日調整)
			itemStack.damageItem(5, entityPlayer);
			return itemStack;
		}
}
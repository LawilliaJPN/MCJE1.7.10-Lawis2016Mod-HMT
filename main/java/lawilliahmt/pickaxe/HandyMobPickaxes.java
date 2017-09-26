package lawilliahmt.pickaxe;

import cpw.mods.fml.common.registry.GameRegistry;
import lawilliahmt.api.ModToolMaterial;
import lawilliahmt.api.HMTPickaxes;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.util.EnumHelper;

public class HandyMobPickaxes {
	public HandyMobPickaxes(){
		//ツールの基本情報
		ModToolMaterial.HandyMobPickaxes = EnumHelper.addToolMaterial("HandyMobPickaxes", 3, 1561, 8.0F, 3.0F, 10);

		//敵対mobのピッケル
		HMTPickaxes.pickaxeBlaze = new PickaxeBlaze(ModToolMaterial.HandyMobPickaxes) //ブレイズのピッケル
				.setCreativeTab(CreativeTabs.tabTools)
				.setUnlocalizedName("pickaxeBlaze")
				.setTextureName("diamond_pickaxe");
			GameRegistry.registerItem(HMTPickaxes.pickaxeBlaze, "pickaxeBlaze");

		HMTPickaxes.pickaxeCreeper = new PickaxeCreeeper(ModToolMaterial.HandyMobPickaxes) //クリーパーのピッケル
				.setCreativeTab(CreativeTabs.tabTools)
				.setUnlocalizedName("pickaxeCreeper")
				.setTextureName("diamond_pickaxe");
			GameRegistry.registerItem(HMTPickaxes.pickaxeCreeper, "pickaxeCreeper");

		HMTPickaxes.pickaxeEnderman = new PickaxeEnderman(ModToolMaterial.HandyMobPickaxes) //エンダーマンのピッケル
				.setCreativeTab(CreativeTabs.tabTools)
				.setUnlocalizedName("pickaxeEnderman")
				.setTextureName("diamond_pickaxe");
			GameRegistry.registerItem(HMTPickaxes.pickaxeEnderman, "pickaxeEnderman");

		HMTPickaxes.pickaxeSkeleton = new PickaxeSkeleton(ModToolMaterial.HandyMobPickaxes) //スケルトンのピッケル
				.setCreativeTab(CreativeTabs.tabTools)
				.setUnlocalizedName("pickaxeSkeleton")
				.setTextureName("diamond_pickaxe");
			GameRegistry.registerItem(HMTPickaxes.pickaxeSkeleton, "pickaxeSkeleton");
	}
}

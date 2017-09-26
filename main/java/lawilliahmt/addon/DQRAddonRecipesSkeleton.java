package lawilliahmt.addon;

import cpw.mods.fml.common.registry.GameRegistry;
import dqr.api.Blocks.DQMobFigures;
import dqr.api.Blocks.DQMobObjects;
import lawilliahmt.api.HMTHoes;
import lawilliahmt.api.HMTPickaxes;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class DQRAddonRecipesSkeleton {
	public DQRAddonRecipesSkeleton(){
		/*スケルトンのクワ：がいこつ系
		//()：
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeSkeleton),
			Items.diamond_hoe,
			new ItemStack(DQMobObjects.BlockObj,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeSkeleton),
			Items.diamond_hoe,
			new ItemStack(DQMobFigures.BlockFigure,1,0)
		);
		*/
		//がいこつ(昼)：Gaikotu
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeSkeleton),
			Items.diamond_hoe,
			new ItemStack(DQMobObjects.BlockObjGaikotu,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeSkeleton),
			Items.diamond_hoe,
			new ItemStack(DQMobFigures.BlockFigureGaikotu,1,0)
		);
		//がいこつけんし(夜)：Gaikotukensi
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeSkeleton),
			Items.diamond_hoe,
			new ItemStack(DQMobObjects.BlockObjGaikotukensi,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeSkeleton),
			Items.diamond_hoe,
			new ItemStack(DQMobFigures.BlockFigureGaikotukensi,1,0)
		);
		//かげのきし(エンド)：Kagenokisi
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeSkeleton),
			Items.diamond_hoe,
			new ItemStack(DQMobObjects.BlockObjKagenokisi,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeSkeleton),
			Items.diamond_hoe,
			new ItemStack(DQMobFigures.BlockFigureKagenokisi,1,0)
		);
		//しりょう(ネザー)：Siryou
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeSkeleton),
			Items.diamond_hoe,
			new ItemStack(DQMobObjects.BlockObjSiryou,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeSkeleton),
			Items.diamond_hoe,
			new ItemStack(DQMobFigures.BlockFigureSiryou,1,0)
		);
		//しりょうのきし(ネザー)：Siryounokisi
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeSkeleton),
			Items.diamond_hoe,
			new ItemStack(DQMobObjects.BlockObjSiryounokisi,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeSkeleton),
			Items.diamond_hoe,
			new ItemStack(DQMobFigures.BlockFigureSiryounokisi,1,0)
		);

		/*スケルトンのピッケル：リリパット系
		//()：
		GameRegistry.addShapelessRecipe(new ItemStack(HMTPickaxes.pickaxeSkeleton),
			Items.diamond_pickaxe,
			new ItemStack(DQMobObjects.BlockObj,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(HMTPickaxes.pickaxeSkeleton),
			Items.diamond_pickaxe,
			new ItemStack(DQMobFigures.BlockFigure,1,0)
		);
		*/
		//アローインプ(ネザー)：Aroinpu
		GameRegistry.addShapelessRecipe(new ItemStack(HMTPickaxes.pickaxeSkeleton),
			Items.diamond_pickaxe,
			new ItemStack(DQMobObjects.BlockObjAroinpu,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(HMTPickaxes.pickaxeSkeleton),
			Items.diamond_pickaxe,
			new ItemStack(DQMobFigures.BlockFigureAroinpu,1,0)
		);
		//どくやずきん(夜)：Dokuyazukin
		GameRegistry.addShapelessRecipe(new ItemStack(HMTPickaxes.pickaxeSkeleton),
			Items.diamond_pickaxe,
			new ItemStack(DQMobObjects.BlockObjDokuyazukin,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(HMTPickaxes.pickaxeSkeleton),
			Items.diamond_pickaxe,
			new ItemStack(DQMobFigures.BlockFigureDokuyazukin,1,0)
		);
		//レッドアーチャー(転生)：Reddoatya
		GameRegistry.addShapelessRecipe(new ItemStack(HMTPickaxes.pickaxeSkeleton),
			Items.diamond_pickaxe,
			new ItemStack(DQMobObjects.BlockObjReddoatya,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(HMTPickaxes.pickaxeSkeleton),
			Items.diamond_pickaxe,
			new ItemStack(DQMobFigures.BlockFigureReddoatya,1,0)
		);
		//リリパット(昼)：Riripat
		GameRegistry.addShapelessRecipe(new ItemStack(HMTPickaxes.pickaxeSkeleton),
			Items.diamond_pickaxe,
			new ItemStack(DQMobObjects.BlockObjRiripat,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(HMTPickaxes.pickaxeSkeleton),
			Items.diamond_pickaxe,
			new ItemStack(DQMobFigures.BlockFigureRiripat,1,0)
		);
	}
}
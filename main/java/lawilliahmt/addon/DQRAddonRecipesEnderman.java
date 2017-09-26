package lawilliahmt.addon;

import cpw.mods.fml.common.registry.GameRegistry;
import dqr.api.Blocks.DQMobFigures;
import dqr.api.Blocks.DQMobObjects;
import lawilliahmt.api.HMTHoes;
import lawilliahmt.api.HMTPickaxes;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class DQRAddonRecipesEnderman {
	public DQRAddonRecipesEnderman(){
		/*エンダーマンのクワ：シャドー系
		//：
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeEnderman),
			Items.diamond_hoe,
			new ItemStack(DQMobObjects.BlockObj,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeEnderman),
			Items.diamond_hoe,
			new ItemStack(DQMobFigures.BlockFigure,1,0)
		);
		*/
		//あやしいかげ(昼)：Ayasiikage
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeEnderman),
			Items.diamond_hoe,
			new ItemStack(DQMobObjects.BlockObjAyasiikage,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeEnderman),
			Items.diamond_hoe,
			new ItemStack(DQMobFigures.BlockFigureAyasiikage,1,0)
		);
		//ホロゴースト(夜)：Horoghost
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeEnderman),
			Items.diamond_hoe,
			new ItemStack(DQMobObjects.BlockObjHoroghost,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeEnderman),
			Items.diamond_hoe,
			new ItemStack(DQMobFigures.BlockFigureHoroghost,1,0)
		);
		//まおうのかげ(ネザー)：Maounokage
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeEnderman),
			Items.diamond_hoe,
			new ItemStack(DQMobObjects.BlockObjMaounokage,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeEnderman),
			Items.diamond_hoe,
			new ItemStack(DQMobFigures.BlockFigureMaounokage,1,0)
		);
		//シャドー(夜)：Syado
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeEnderman),
			Items.diamond_hoe,
			new ItemStack(DQMobObjects.BlockObjSyado,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeEnderman),
			Items.diamond_hoe,
			new ItemStack(DQMobFigures.BlockFigureSyado,1,0)
		);

		/*エンダーマンのピッケル：シャドー系
		//：
		GameRegistry.addShapelessRecipe(new ItemStack(HMTPickaxes.pickaxeEnderman),
			Items.diamond_pickaxe,
		*/
		//あやしいかげ(昼)：Ayasiikage
		GameRegistry.addShapelessRecipe(new ItemStack(HMTPickaxes.pickaxeEnderman),
			Items.diamond_pickaxe,
			new ItemStack(DQMobObjects.BlockObjAyasiikage,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(HMTPickaxes.pickaxeEnderman),
			Items.diamond_pickaxe,
			new ItemStack(DQMobFigures.BlockFigureAyasiikage,1,0)
		);
		//ホロゴースト(夜)：Horoghost
		GameRegistry.addShapelessRecipe(new ItemStack(HMTPickaxes.pickaxeEnderman),
			Items.diamond_pickaxe,
			new ItemStack(DQMobObjects.BlockObjHoroghost,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(HMTPickaxes.pickaxeEnderman),
			Items.diamond_pickaxe,
			new ItemStack(DQMobFigures.BlockFigureHoroghost,1,0)
		);
		//まおうのかげ(ネザー)：Maounokage
		GameRegistry.addShapelessRecipe(new ItemStack(HMTPickaxes.pickaxeEnderman),
			Items.diamond_pickaxe,
			new ItemStack(DQMobObjects.BlockObjMaounokage,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(HMTPickaxes.pickaxeEnderman),
			Items.diamond_pickaxe,
			new ItemStack(DQMobFigures.BlockFigureMaounokage,1,0)
		);
		//シャドー(夜)：Syado
		GameRegistry.addShapelessRecipe(new ItemStack(HMTPickaxes.pickaxeEnderman),
			Items.diamond_pickaxe,
			new ItemStack(DQMobObjects.BlockObjSyado,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(HMTPickaxes.pickaxeEnderman),
			Items.diamond_pickaxe,
			new ItemStack(DQMobFigures.BlockFigureSyado,1,0)
		);
	}
}

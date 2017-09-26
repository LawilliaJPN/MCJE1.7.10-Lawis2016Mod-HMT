package lawilliahmt.addon;

import cpw.mods.fml.common.registry.GameRegistry;
import dqr.api.Blocks.DQMobFigures;
import dqr.api.Blocks.DQMobObjects;
import lawilliahmt.api.HMTHoes;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class DQRAddonRecipesZombie {
	public DQRAddonRecipesZombie(){
		/*
		//ゾンビのクワ
		//()：
		GameRegistry.addShapelessRecipe(new ItemStack(HandyMobTools.hoeZombie),
			Items.diamond_hoe,
			new ItemStack(DQMobObjects.BlockObj,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(HandyMobTools.hoeZombie),
			Items.diamond_hoe,
			new ItemStack(DQMobFigures.BlockFigure,1,0)
		);
		*/

		//ゾンビのクワ：アニマルゾンビ系、ゴースト系、スモールグール系。
		//アニマルゾンビ(夜)：Animaruzonbi
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeZombie),
			Items.diamond_hoe,
			new ItemStack(DQMobObjects.BlockObjAnimaruzonbi,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeZombie),
			Items.diamond_hoe,
			new ItemStack(DQMobFigures.BlockFigureAnimaruzonbi,1,0)
		);
		//バリイドドッグ(ネザー)：Bariidodog
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeZombie),
			Items.diamond_hoe,
			new ItemStack(DQMobObjects.BlockObjBariidodog,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeZombie),
			Items.diamond_hoe,
			new ItemStack(DQMobFigures.BlockFigureBariidodog,1,0)
		);
		//ベロベロ(夜)：Berobero
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeZombie),
			Items.diamond_hoe,
			new ItemStack(DQMobObjects.BlockObjBerobero,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeZombie),
			Items.diamond_hoe,
			new ItemStack(DQMobFigures.BlockFigureBerobero,1,0)
		);
		//デスジャッカル(エンド)：Desujakkaru
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeZombie),
			Items.diamond_hoe,
			new ItemStack(DQMobObjects.BlockObjDesujakkaru,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeZombie),
			Items.diamond_hoe,
			new ItemStack(DQMobFigures.BlockFigureDesujakkaru,1,0)
		);
		//ゴースト(夜)：Ghost
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeZombie),
			Items.diamond_hoe,
			new ItemStack(DQMobObjects.BlockObjGhost,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeZombie),
			Items.diamond_hoe,
			new ItemStack(DQMobFigures.BlockFigureGhost,1,0)
		);
		//ヘルゴースト(夜)：Herughost
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeZombie),
			Items.diamond_hoe,
			new ItemStack(DQMobObjects.BlockObjHerughost,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeZombie),
			Items.diamond_hoe,
			new ItemStack(DQMobFigures.BlockFigureHerughost,1,0)
		);
		//メトロゴースト(夜)：Metoroghost
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeZombie),
			Items.diamond_hoe,
			new ItemStack(DQMobObjects.BlockObjMetoroghost,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeZombie),
			Items.diamond_hoe,
			new ItemStack(DQMobFigures.BlockFigureMetoroghost,1,0)
		);
		//スモールグール(夜)：Sumoruguru
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeZombie),
			Items.diamond_hoe,
			new ItemStack(DQMobObjects.BlockObjSumoruguru,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeZombie),
			Items.diamond_hoe,
			new ItemStack(DQMobFigures.BlockFigureSumoruguru,1,0)
		);
		//つちわらし(夜)：Tutiwarasi
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeZombie),
			Items.diamond_hoe,
			new ItemStack(DQMobObjects.BlockObjTutiwarasi,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeZombie),
			Items.diamond_hoe,
			new ItemStack(DQMobFigures.BlockFigureTutiwarasi,1,0)
		);

		//ゾンビピッグマンのスポーンエッグ(豚のスポーンエッグ+DQRゾンビ)
		//アニマルゾンビ(夜)：Animaruzonbi
		GameRegistry.addShapelessRecipe(new ItemStack(Items.spawn_egg, 1, 57),
			new ItemStack(Items.spawn_egg, 1, 90),
			new ItemStack(DQMobObjects.BlockObjAnimaruzonbi,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.spawn_egg, 1, 57),
			new ItemStack(Items.spawn_egg, 1, 90),
			new ItemStack(DQMobFigures.BlockFigureAnimaruzonbi,1,0)
		);
		//バリイドドッグ(ネザー)：Bariidodog
		GameRegistry.addShapelessRecipe(new ItemStack(Items.spawn_egg, 1, 57),
			new ItemStack(Items.spawn_egg, 1, 90),
			new ItemStack(DQMobObjects.BlockObjBariidodog,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.spawn_egg, 1, 57),
			new ItemStack(Items.spawn_egg, 1, 90),
			new ItemStack(DQMobFigures.BlockFigureBariidodog,1,0)
		);
		//ベロベロ(夜)：Berobero
		GameRegistry.addShapelessRecipe(new ItemStack(Items.spawn_egg, 1, 57),
			new ItemStack(Items.spawn_egg, 1, 90),
			new ItemStack(DQMobObjects.BlockObjBerobero,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.spawn_egg, 1, 57),
			new ItemStack(Items.spawn_egg, 1, 90),
			new ItemStack(DQMobFigures.BlockFigureBerobero,1,0)
		);
		//デスジャッカル(エンド)：Desujakkaru
		GameRegistry.addShapelessRecipe(new ItemStack(Items.spawn_egg, 1, 57),
			new ItemStack(Items.spawn_egg, 1, 90),
			new ItemStack(DQMobObjects.BlockObjDesujakkaru,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.spawn_egg, 1, 57),
			new ItemStack(Items.spawn_egg, 1, 90),
			new ItemStack(DQMobFigures.BlockFigureDesujakkaru,1,0)
		);
		//ゴースト(夜)：Ghost
		GameRegistry.addShapelessRecipe(new ItemStack(Items.spawn_egg, 1, 57),
			new ItemStack(Items.spawn_egg, 1, 90),
			new ItemStack(DQMobObjects.BlockObjGhost,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.spawn_egg, 1, 57),
			new ItemStack(Items.spawn_egg, 1, 90),
			new ItemStack(DQMobFigures.BlockFigureGhost,1,0)
		);
		//ヘルゴースト(夜)：Herughost
		GameRegistry.addShapelessRecipe(new ItemStack(Items.spawn_egg, 1, 57),
			new ItemStack(Items.spawn_egg, 1, 90),
			new ItemStack(DQMobObjects.BlockObjHerughost,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.spawn_egg, 1, 57),
			new ItemStack(Items.spawn_egg, 1, 90),
			new ItemStack(DQMobFigures.BlockFigureHerughost,1,0)
		);
		//メトロゴースト(夜)：Metoroghost
		GameRegistry.addShapelessRecipe(new ItemStack(Items.spawn_egg, 1, 57),
			new ItemStack(Items.spawn_egg, 1, 90),
			new ItemStack(DQMobObjects.BlockObjMetoroghost,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.spawn_egg, 1, 57),
			new ItemStack(Items.spawn_egg, 1, 90),
			new ItemStack(DQMobFigures.BlockFigureMetoroghost,1,0)
		);
		//スモールグール(夜)：Sumoruguru
		GameRegistry.addShapelessRecipe(new ItemStack(Items.spawn_egg, 1, 57),
			new ItemStack(Items.spawn_egg, 1, 90),
			new ItemStack(DQMobObjects.BlockObjSumoruguru,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.spawn_egg, 1, 57),
			new ItemStack(Items.spawn_egg, 1, 90),
			new ItemStack(DQMobFigures.BlockFigureSumoruguru,1,0)
		);
		//つちわらし(夜)：Tutiwarasi
		GameRegistry.addShapelessRecipe(new ItemStack(Items.spawn_egg, 1, 57),
			new ItemStack(Items.spawn_egg, 1, 90),
			new ItemStack(DQMobObjects.BlockObjTutiwarasi,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.spawn_egg, 1, 57),
			new ItemStack(Items.spawn_egg, 1, 90),
			new ItemStack(DQMobFigures.BlockFigureTutiwarasi,1,0)
		);

		//ゾンビピッグマンのスポーンエッグ(ゾンビのスポーンエッグ+DQRブタ)
		//アルケミストン(転生)：Arukemisuton
		GameRegistry.addShapelessRecipe(new ItemStack(Items.spawn_egg, 1, 57),
			new ItemStack(Items.spawn_egg, 1, 54),
			new ItemStack(DQMobObjects.BlockObjArukemisuton,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.spawn_egg, 1, 57),
			new ItemStack(Items.spawn_egg, 1, 54),
			new ItemStack(DQMobFigures.BlockFigureArukemisuton,1,0)
		);
		//ビッグハット(昼)：Bigguhatto
		GameRegistry.addShapelessRecipe(new ItemStack(Items.spawn_egg, 1, 57),
			new ItemStack(Items.spawn_egg, 1, 54),
			new ItemStack(DQMobObjects.BlockObjBigguhatto,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.spawn_egg, 1, 57),
			new ItemStack(Items.spawn_egg, 1, 54),
			new ItemStack(DQMobFigures.BlockFigureBigguhatto,1,0)
		);
		//マジカルハット(ネザー)：Majikaruhatto
		GameRegistry.addShapelessRecipe(new ItemStack(Items.spawn_egg, 1, 57),
			new ItemStack(Items.spawn_egg, 1, 54),
			new ItemStack(DQMobObjects.BlockObjMajikaruhatto,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.spawn_egg, 1, 57),
			new ItemStack(Items.spawn_egg, 1, 54),
			new ItemStack(DQMobFigures.BlockFigureMajikaruhatto,1,0)
		);
		//トンブレロ(夜)：Tonburero
		GameRegistry.addShapelessRecipe(new ItemStack(Items.spawn_egg, 1, 57),
			new ItemStack(Items.spawn_egg, 1, 54),
			new ItemStack(DQMobObjects.BlockObjTonburero,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.spawn_egg, 1, 57),
			new ItemStack(Items.spawn_egg, 1, 54),
			new ItemStack(DQMobFigures.BlockFigureTonburero,1,0)
		);
	}
}


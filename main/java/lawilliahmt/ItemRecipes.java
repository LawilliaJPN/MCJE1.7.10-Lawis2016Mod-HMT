package lawilliahmt;

import cpw.mods.fml.common.registry.GameRegistry;
import lawilliahmt.api.HMTHoes;
import lawilliahmt.api.HMTPickaxes;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ItemRecipes {
	public ItemRecipes(){
		/*
		//不定形レシピ
		GameRegistry.addShapelessRecipe(new ItemStack(),
					,

		);

		modのアイテム HandyMobTools.
		スポーンエッグ new ItemStack(Items.spawn_egg,1,)
		*/

		//スポーンエッグ：ゾンビ+ブタ＝ゾンビピッグマン
		GameRegistry.addShapelessRecipe(new ItemStack(Items.spawn_egg, 1, 57),
				new ItemStack(Items.spawn_egg, 1, 90),
				new ItemStack(Items.spawn_egg, 1, 54)
		);

		/*クワ
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeX),
			Items.diamond_hoe,
			new ItemStack(Items.spawn_egg,1,X)
		);
		*/

		//敵対mobのクワ
		//61：ブレイズのピッケル
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeBlaze),
				Items.diamond_hoe,
				new ItemStack(Items.spawn_egg,1,61)
		);

		//59：洞窟グモのクワ
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeCaveSpider),
				Items.diamond_hoe,
				new ItemStack(Items.spawn_egg,1,59)
		);

		//50：クリーパーのクワ
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeCreeper),
				Items.diamond_hoe,
				new ItemStack(Items.spawn_egg,1,50)
		);

		//58：エンダーマンのクワ
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeEnderman),
				Items.diamond_hoe,
				new ItemStack(Items.spawn_egg,1,58)
		);

		//56：ガストのクワ
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeGhast),
				Items.diamond_hoe,
				new ItemStack(Items.spawn_egg,1,56)
			);

		//62：マグマキューブのクワ
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeMagmaCube),
				Items.diamond_hoe,
				new ItemStack(Items.spawn_egg,1,62)
		);

		//57：ゾンビピッグマンのクワ
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoePigZombie),
				Items.diamond_hoe,
				new ItemStack(Items.spawn_egg,1,57)
		);

		//60：シルバーフィッシュのクワ
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeSilverFish),
				Items.diamond_hoe,
				new ItemStack(Items.spawn_egg,1,60)
		);

		//51：スケルトンのクワ
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeSkeleton),
				Items.diamond_hoe,
				new ItemStack(Items.spawn_egg,1,51)
		);


		//55：スライムのクワ
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeSlime),
				Items.diamond_hoe,
				new ItemStack(Items.spawn_egg,1,55)
		);

		//52：クモのクワ
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeSpider),
				Items.diamond_hoe,
				new ItemStack(Items.spawn_egg,1,52)
		);

		//66：ウィッチのクワ
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeWitch),
				Items.diamond_hoe,
				new ItemStack(Items.spawn_egg,1,66)
		);

		//54：ゾンビのクワ
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeZombie),
				Items.diamond_hoe,
				new ItemStack(Items.spawn_egg,1,54)
		);

		//中立mobのクワ
		//65：コウモリのクワ
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeBat),
				Items.diamond_hoe,
				new ItemStack(Items.spawn_egg,1,65)
		);

		//93：ニワトリのクワ
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeChicken),
				Items.diamond_hoe,
				new ItemStack(Items.spawn_egg,1,93)
		);

		//92：牛のクワ
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeCow),
				Items.diamond_hoe,
				new ItemStack(Items.spawn_egg,1,92)
		);

		//100：ウマのクワ
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeHorse),
				Items.diamond_hoe,
				new ItemStack(Items.spawn_egg,1,100)
		);

		//96：ムーシュルームのクワ
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeMooshroom),
				Items.diamond_hoe,
				new ItemStack(Items.spawn_egg,1,96)
		);

		//98：ヤマネコのクワ
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeOcelot),
				Items.diamond_hoe,
				new ItemStack(Items.spawn_egg,1,98)
		);

		//91：ヒツジのクワ
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeSheep),
				Items.diamond_hoe,
				new ItemStack(Items.spawn_egg,1,91)
		);

		//094：イカのクワ
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeSquid),
				Items.diamond_hoe,
				new ItemStack(Items.spawn_egg,1,94)
		);

		//120：村人のクワ
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeVillager),
				Items.diamond_hoe,
				new ItemStack(Items.spawn_egg,1,120)
		);

		//95：オオカミのクワ
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeWolf),
				Items.diamond_hoe,
				new ItemStack(Items.spawn_egg,1,95)
		);

		/*ピッケル
		GameRegistry.addShapelessRecipe(new ItemStack(HMTPickaxes.pickaxeX),
			Items.diamond_pickaxe,
			new ItemStack(Items.spawn_egg,1,X)
		);
		*/
		//敵対mobのピッケル
		//61：ブレイズのピッケル
		GameRegistry.addShapelessRecipe(new ItemStack(HMTPickaxes.pickaxeBlaze),
				Items.diamond_pickaxe,
				new ItemStack(Items.spawn_egg,1,61)
		);

		//50：クリーパーのピッケル
		GameRegistry.addShapelessRecipe(new ItemStack(HMTPickaxes.pickaxeCreeper),
				Items.diamond_pickaxe,
				new ItemStack(Items.spawn_egg,1,50)
		);

		//58：エンダーマンのピッケル
		GameRegistry.addShapelessRecipe(new ItemStack(HMTPickaxes.pickaxeEnderman),
				Items.diamond_pickaxe,
				new ItemStack(Items.spawn_egg,1,58)
		);

		//51：スケルトンのピッケル
		GameRegistry.addShapelessRecipe(new ItemStack(HMTPickaxes.pickaxeSkeleton),
				Items.diamond_pickaxe,
				new ItemStack(Items.spawn_egg,1,51)
		);
	}
}

package lawilliahmt.village;

import java.util.Random;

import cpw.mods.fml.common.registry.VillagerRegistry.IVillageTradeHandler;
import lawilliahmt.api.HMTHoes;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;

public class HMTVillagerTrade implements IVillageTradeHandler {
	@Override
	public void manipulateTradesForVillager(EntityVillager villager, MerchantRecipeList recipeList, Random random) {
		//オーバーワールドのスポーンエッグ⇒エメラルド
		recipeList.add(new MerchantRecipe( new ItemStack(Items.spawn_egg, 1, 59), new ItemStack(Items.emerald, 1, 0))); //洞窟グモ
		recipeList.add(new MerchantRecipe( new ItemStack(Items.spawn_egg, 1, 92), new ItemStack(Items.emerald, 1, 0))); //ウシ
		recipeList.add(new MerchantRecipe( new ItemStack(Items.spawn_egg, 1, 93), new ItemStack(Items.emerald, 1, 0))); //ニワトリ
		recipeList.add(new MerchantRecipe( new ItemStack(Items.spawn_egg, 1, 90), new ItemStack(Items.emerald, 1, 0))); //ブタ
		recipeList.add(new MerchantRecipe( new ItemStack(Items.spawn_egg, 1, 51), new ItemStack(Items.emerald, 1, 0))); //スケルトン
		recipeList.add(new MerchantRecipe( new ItemStack(Items.spawn_egg, 1, 55), new ItemStack(Items.emerald, 1, 0))); //スライム
		recipeList.add(new MerchantRecipe( new ItemStack(Items.spawn_egg, 1, 52), new ItemStack(Items.emerald, 1, 0))); //クモ
		recipeList.add(new MerchantRecipe( new ItemStack(Items.spawn_egg, 1, 94), new ItemStack(Items.emerald, 1, 0))); //イカ
		recipeList.add(new MerchantRecipe( new ItemStack(Items.spawn_egg, 1, 53), new ItemStack(Items.emerald, 1, 0))); //ゾンビ

		recipeList.add(new MerchantRecipe( new ItemStack(Items.spawn_egg, 1, 50), new ItemStack(Items.emerald, 2, 0))); //クリーパー
		recipeList.add(new MerchantRecipe( new ItemStack(Items.spawn_egg, 1, 58), new ItemStack(Items.emerald, 2, 0))); //エンダーマン
		recipeList.add(new MerchantRecipe( new ItemStack(Items.spawn_egg, 1, 91), new ItemStack(Items.emerald, 2, 0))); //ヒツジ
		recipeList.add(new MerchantRecipe( new ItemStack(Items.spawn_egg, 1, 66), new ItemStack(Items.emerald, 2, 0))); //ウィッチ

		recipeList.add(new MerchantRecipe( new ItemStack(Items.spawn_egg, 1, 65), new ItemStack(Items.emerald, 4, 0))); //コウモリ
		recipeList.add(new MerchantRecipe( new ItemStack(Items.spawn_egg, 1, 100), new ItemStack(Items.emerald, 4, 0))); //ウマ
		recipeList.add(new MerchantRecipe( new ItemStack(Items.spawn_egg, 1, 120), new ItemStack(Items.emerald, 4, 0))); //村人


		//エメラルド⇒各種クワ
		recipeList.add(new MerchantRecipe( new ItemStack(Items.emerald, 4, 0), new ItemStack(HMTHoes.hoeCaveSpider, 1, 0)));
		recipeList.add(new MerchantRecipe( new ItemStack(Items.emerald, 4, 0), new ItemStack(HMTHoes.hoeChicken, 1, 0)));
		recipeList.add(new MerchantRecipe( new ItemStack(Items.emerald, 4, 0), new ItemStack(HMTHoes.hoeSkeleton, 1, 0)));
		recipeList.add(new MerchantRecipe( new ItemStack(Items.emerald, 4, 0), new ItemStack(HMTHoes.hoeSlime, 1, 0)));
		recipeList.add(new MerchantRecipe( new ItemStack(Items.emerald, 4, 0), new ItemStack(HMTHoes.hoeSpider, 1, 0)));
		recipeList.add(new MerchantRecipe( new ItemStack(Items.emerald, 4, 0), new ItemStack(HMTHoes.hoeSquid, 1, 0)));
		recipeList.add(new MerchantRecipe( new ItemStack(Items.emerald, 6, 0), new ItemStack(HMTHoes.hoeZombie, 1, 0)));

		recipeList.add(new MerchantRecipe( new ItemStack(Items.emerald, 6, 0), new ItemStack(HMTHoes.hoeBlaze, 1, 0)));
		recipeList.add(new MerchantRecipe( new ItemStack(Items.emerald, 6, 0), new ItemStack(HMTHoes.hoeCow, 1, 0)));
		recipeList.add(new MerchantRecipe( new ItemStack(Items.emerald, 6, 0), new ItemStack(HMTHoes.hoeCreeper, 1, 0)));
		recipeList.add(new MerchantRecipe( new ItemStack(Items.emerald, 6, 0), new ItemStack(HMTHoes.hoeEnderman, 1, 0)));
		recipeList.add(new MerchantRecipe( new ItemStack(Items.emerald, 6, 0), new ItemStack(HMTHoes.hoeMagmaCube, 1, 0)));
		recipeList.add(new MerchantRecipe( new ItemStack(Items.emerald, 6, 0), new ItemStack(HMTHoes.hoeMooshroom, 1, 0)));
		recipeList.add(new MerchantRecipe( new ItemStack(Items.emerald, 6, 0), new ItemStack(HMTHoes.hoeOcelot, 1, 0)));
		recipeList.add(new MerchantRecipe( new ItemStack(Items.emerald, 6, 0), new ItemStack(HMTHoes.hoePigZombie, 1, 0)));
		recipeList.add(new MerchantRecipe( new ItemStack(Items.emerald, 6, 0), new ItemStack(HMTHoes.hoeSheep, 1, 0)));
		recipeList.add(new MerchantRecipe( new ItemStack(Items.emerald, 6, 0), new ItemStack(HMTHoes.hoeSilverFish, 1, 0)));
		recipeList.add(new MerchantRecipe( new ItemStack(Items.emerald, 6, 0), new ItemStack(HMTHoes.hoeWitch, 1, 0)));
		recipeList.add(new MerchantRecipe( new ItemStack(Items.emerald, 6, 0), new ItemStack(HMTHoes.hoeWolf, 1, 0)));

		recipeList.add(new MerchantRecipe( new ItemStack(Items.emerald, 8, 0), new ItemStack(HMTHoes.hoeBat, 1, 0)));
		recipeList.add(new MerchantRecipe( new ItemStack(Items.emerald, 8, 0), new ItemStack(HMTHoes.hoeGhast, 1, 0)));
		recipeList.add(new MerchantRecipe( new ItemStack(Items.emerald, 8, 0), new ItemStack(HMTHoes.hoeHorse, 1, 0)));
		recipeList.add(new MerchantRecipe( new ItemStack(Items.emerald, 8, 0), new ItemStack(HMTHoes.hoeVillager, 1, 0)));
	}
}

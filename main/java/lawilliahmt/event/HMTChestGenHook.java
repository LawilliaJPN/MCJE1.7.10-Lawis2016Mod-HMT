package lawilliahmt.event;

import lawilliahmt.api.HMTHoes;
import net.minecraft.init.Items;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

public class HMTChestGenHook {
	public HMTChestGenHook(ChestGenHooks event){
		//WeightedRandomChestContent 引数：アイテム、メタデータ値、min、max、weight
		//event.addItem("", new WeightedRandomChestContent(HMTHoes., 0, 1, 1, 1));

		/*ボーナスチェスト bonusChest 中身は10個
		 * new WeightedRandomChestContent(Items.stick, 0, 1, 3, 10),
		 * new WeightedRandomChestContent(Item.getItemFromBlock(Blocks.planks), 0, 1, 3, 10),
		 * new WeightedRandomChestContent(Item.getItemFromBlock(Blocks.log), 0, 1, 3, 10),
		 * new WeightedRandomChestContent(Items.stone_axe, 0, 1, 1, 3),
		 * new WeightedRandomChestContent(Items.wooden_axe, 0, 1, 1, 5),
		 * new WeightedRandomChestContent(Items.stone_pickaxe, 0, 1, 1, 3),
		 * new WeightedRandomChestContent(Items.wooden_pickaxe, 0, 1, 1, 5),
		 * new WeightedRandomChestContent(Items.apple, 0, 2, 3, 5),
		 * new WeightedRandomChestContent(Items.bread, 0, 2, 3, 3),
		 * new WeightedRandomChestContent(Item.getItemFromBlock(Blocks.log2), 0, 1, 3, 10)
		*/
		event.addItem("bonusChest", new WeightedRandomChestContent(Items.diamond_hoe, 0, 1, 1, 5));

		/*廃坑のチェスト mineshaftCorridor 中身は3～7個
		 * new WeightedRandomChestContent(Items.iron_ingot, 0, 1, 5, 10),
		 * new WeightedRandomChestContent(Items.gold_ingot, 0, 1, 3, 5),
		 * new WeightedRandomChestContent(Items.redstone, 0, 4, 9, 5),
		 * new WeightedRandomChestContent(Items.dye, 4, 4, 9, 5),
		 * new WeightedRandomChestContent(Items.diamond, 0, 1, 2, 3),
		 * new WeightedRandomChestContent(Items.coal, 0, 3, 8, 10),
		 * new WeightedRandomChestContent(Items.bread, 0, 1, 3, 15),
		 * new WeightedRandomChestContent(Items.iron_pickaxe, 0, 1, 1, 1),
		 * new WeightedRandomChestContent(Item.getItemFromBlock(Blocks.rail), 0, 4, 8, 1),
		 * new WeightedRandomChestContent(Items.melon_seeds, 0, 2, 4, 10),
		 * new WeightedRandomChestContent(Items.pumpkin_seeds, 0, 2, 4, 10),
		 * new WeightedRandomChestContent(Items.saddle, 0, 1, 1, 3),
		 * new WeightedRandomChestContent(Items.iron_horse_armor, 0, 1, 1, 1)
		*/
		event.addItem("mineshaftCorridor", new WeightedRandomChestContent(Items.diamond_hoe, 0, 1, 1, 5));
		//オーバーワールド敵のクワ①
		event.addItem("mineshaftCorridor", new WeightedRandomChestContent(HMTHoes.hoeCreeper, 0, 1, 1, 1));
		event.addItem("mineshaftCorridor", new WeightedRandomChestContent(HMTHoes.hoeSkeleton, 0, 1, 1, 1));
		event.addItem("mineshaftCorridor", new WeightedRandomChestContent(HMTHoes.hoeSpider, 0, 1, 1, 1));
		event.addItem("mineshaftCorridor", new WeightedRandomChestContent(HMTHoes.hoeZombie, 0, 1, 1, 1));
		//オーバーワールド敵のクワ②
		event.addItem("mineshaftCorridor", new WeightedRandomChestContent(HMTHoes.hoeCaveSpider, 0, 1, 1, 1));
		event.addItem("mineshaftCorridor", new WeightedRandomChestContent(HMTHoes.hoeEnderman, 0, 1, 1, 1));
		event.addItem("mineshaftCorridor", new WeightedRandomChestContent(HMTHoes.hoeSilverFish, 0, 1, 1, 1));
		event.addItem("mineshaftCorridor", new WeightedRandomChestContent(HMTHoes.hoeSlime, 0, 1, 1, 1));
		event.addItem("mineshaftCorridor", new WeightedRandomChestContent(HMTHoes.hoeWitch, 0, 1, 1, 1));

		/*ピラミッドのチェスト pyramidDesertyChest 中身は2～7個
		 * new WeightedRandomChestContent(Items.diamond, 0, 1, 3, 3),
		 * new WeightedRandomChestContent(Items.iron_ingot, 0, 1, 5, 10),
		 * new WeightedRandomChestContent(Items.gold_ingot, 0, 2, 7, 15),
		 * new WeightedRandomChestContent(Items.emerald, 0, 1, 3, 2),
		 * new WeightedRandomChestContent(Items.bone, 0, 4, 6, 20),
		 * new WeightedRandomChestContent(Items.rotten_flesh, 0, 3, 7, 16),
		 * new WeightedRandomChestContent(Items.saddle, 0, 1, 1, 3),
		 * new WeightedRandomChestContent(Items.iron_horse_armor, 0, 1, 1, 1),
		 * new WeightedRandomChestContent(Items.golden_horse_armor, 0, 1, 1, 1),
		 * new WeightedRandomChestContent(Items.diamond_horse_armor, 0, 1, 1, 1)};
		*/
		event.addItem("mineshaftCorridor", new WeightedRandomChestContent(Items.diamond_hoe, 0, 1, 1, 5));
		//オーバーワールド敵のクワ②
		event.addItem("pyramidDesertyChest", new WeightedRandomChestContent(HMTHoes.hoeCaveSpider, 0, 1, 1, 1));
		event.addItem("pyramidDesertyChest", new WeightedRandomChestContent(HMTHoes.hoeEnderman, 0, 1, 1, 1));
		event.addItem("pyramidDesertyChest", new WeightedRandomChestContent(HMTHoes.hoeSilverFish, 0, 1, 1, 1));
		event.addItem("pyramidDesertyChest", new WeightedRandomChestContent(HMTHoes.hoeSlime, 0, 1, 1, 1));
		event.addItem("pyramidDesertyChest", new WeightedRandomChestContent(HMTHoes.hoeWitch, 0, 1, 1, 1));

		/*ジャングルの寺院のチェスト pyramidJungleChest 中身は2～7個
		 * new WeightedRandomChestContent(Items.diamond, 0, 1, 3, 3),
		 * new WeightedRandomChestContent(Items.iron_ingot, 0, 1, 5, 10),
		 * new WeightedRandomChestContent(Items.gold_ingot, 0, 2, 7, 15),
		 * new WeightedRandomChestContent(Items.emerald, 0, 1, 3, 2),
		 * new WeightedRandomChestContent(Items.bone, 0, 4, 6, 20),
		 * new WeightedRandomChestContent(Items.rotten_flesh, 0, 3, 7, 16),
		 * ew WeightedRandomChestContent(Items.saddle, 0, 1, 1, 3),
		 * new WeightedRandomChestContent(Items.iron_horse_armor, 0, 1, 1, 1),
		 * new WeightedRandomChestContent(Items.golden_horse_armor, 0, 1, 1, 1),
		 * new WeightedRandomChestContent(Items.diamond_horse_armor, 0, 1, 1, 1)};
		 */
		event.addItem("pyramidJungleChest", new WeightedRandomChestContent(Items.diamond_hoe, 0, 1, 1, 5));
		//オーバーワールド敵のクワ②
		event.addItem("pyramidJungleChest", new WeightedRandomChestContent(HMTHoes.hoeCaveSpider, 0, 1, 1, 1));
		event.addItem("pyramidJungleChest", new WeightedRandomChestContent(HMTHoes.hoeEnderman, 0, 1, 1, 1));
		event.addItem("pyramidJungleChest", new WeightedRandomChestContent(HMTHoes.hoeSilverFish, 0, 1, 1, 1));
		event.addItem("pyramidJungleChest", new WeightedRandomChestContent(HMTHoes.hoeSlime, 0, 1, 1, 1));
		event.addItem("pyramidJungleChest", new WeightedRandomChestContent(HMTHoes.hoeWitch, 0, 1, 1, 1));

		/*ジャングルの寺院のディスペンサー pyramidJungleDispenser 中身は2個
		 * new WeightedRandomChestContent(Items.arrow, 0, 2, 7, 30)
		 */
		//地上敵スポーンエッグ
		event.addItem("pyramidJungleDispenser", new WeightedRandomChestContent(Items.spawn_egg, 50, 2, 7, 5)); //クリーパー
		event.addItem("pyramidJungleDispenser", new WeightedRandomChestContent(Items.spawn_egg, 51, 2, 7, 5)); //スケルトン
		event.addItem("pyramidJungleDispenser", new WeightedRandomChestContent(Items.spawn_egg, 52, 2, 7, 5)); //クモ
		event.addItem("pyramidJungleDispenser", new WeightedRandomChestContent(Items.spawn_egg, 53, 2, 7, 5)); //ゾンビ
		event.addItem("pyramidJungleDispenser", new WeightedRandomChestContent(Items.spawn_egg, 58, 2, 7, 5)); //エンダーマン
		event.addItem("pyramidJungleDispenser", new WeightedRandomChestContent(Items.spawn_egg, 59, 2, 7, 5)); //洞窟グモ
		event.addItem("pyramidJungleDispenser", new WeightedRandomChestContent(Items.spawn_egg, 60, 2, 7, 5)); //シルバーフィッシュ
		event.addItem("pyramidJungleDispenser", new WeightedRandomChestContent(Items.spawn_egg, 66, 2, 7, 5)); //ウィッチ

		//入手難な中立mobスポーンエッグ
		event.addItem("pyramidJungleDispenser", new WeightedRandomChestContent(Items.spawn_egg, 65, 2, 7, 3)); //コウモリ
		event.addItem("pyramidJungleDispenser", new WeightedRandomChestContent(Items.spawn_egg, 95, 2, 7, 3)); //オオカミ
		event.addItem("pyramidJungleDispenser", new WeightedRandomChestContent(Items.spawn_egg, 96, 2, 7, 3)); //ムーシュルーム
		event.addItem("pyramidJungleDispenser", new WeightedRandomChestContent(Items.spawn_egg, 98, 2, 7, 3)); //ヤマネコ

		/*遺跡の廊下のチェスト strongholdCorridor 中身は2～4個
		 * new WeightedRandomChestContent(Items.ender_pearl, 0, 1, 1, 10),
		 * new WeightedRandomChestContent(Items.diamond, 0, 1, 3, 3),
		 * new WeightedRandomChestContent(Items.iron_ingot, 0, 1, 5, 10),
		 * new WeightedRandomChestContent(Items.gold_ingot, 0, 1, 3, 5),
		 * new WeightedRandomChestContent(Items.redstone, 0, 4, 9, 5),
		 * new WeightedRandomChestContent(Items.bread, 0, 1, 3, 15),
		 * new WeightedRandomChestContent(Items.apple, 0, 1, 3, 15),
		 * new WeightedRandomChestContent(Items.iron_pickaxe, 0, 1, 1, 5),
		 * new WeightedRandomChestContent(Items.iron_sword, 0, 1, 1, 5),
		 * new WeightedRandomChestContent(Items.iron_chestplate, 0, 1, 1, 5),
		 * new WeightedRandomChestContent(Items.iron_helmet, 0, 1, 1, 5),
		 * new WeightedRandomChestContent(Items.iron_leggings, 0, 1, 1, 5),
		 * new WeightedRandomChestContent(Items.iron_boots, 0, 1, 1, 5),
		 * new WeightedRandomChestContent(Items.golden_apple, 0, 1, 1, 1),
		 * new WeightedRandomChestContent(Items.saddle, 0, 1, 1, 1),
		 * new WeightedRandomChestContent(Items.iron_horse_armor, 0, 1, 1, 1),
		 * new WeightedRandomChestContent(Items.golden_horse_armor, 0, 1, 1, 1),
		 * new WeightedRandomChestContent(Items.diamond_horse_armor, 0, 1, 1, 1)};
		 */
		event.addItem("strongholdCorridor", new WeightedRandomChestContent(Items.diamond_hoe, 0, 1, 1, 5));
		//ネザー敵のクワ
		event.addItem("strongholdCorridor", new WeightedRandomChestContent(HMTHoes.hoeBlaze, 0, 1, 1, 1));
		event.addItem("strongholdCorridor", new WeightedRandomChestContent(HMTHoes.hoeGhast, 0, 1, 1, 1));
		event.addItem("strongholdCorridor", new WeightedRandomChestContent(HMTHoes.hoeMagmaCube, 0, 1, 1, 1));
		event.addItem("strongholdCorridor", new WeightedRandomChestContent(HMTHoes.hoePigZombie, 0, 1, 1, 1));

		/*遺跡の図書室のチェスト strongholdLibrary 中身は1～5個
		 * new WeightedRandomChestContent(Items.book, 0, 1, 3, 20),
		 * new WeightedRandomChestContent(Items.paper, 0, 2, 7, 20),
		 * new WeightedRandomChestContent(Items.map, 0, 1, 1, 1),
		 * new WeightedRandomChestContent(Items.compass, 0, 1, 1, 1)};
		 */
		event.addItem("strongholdLibrary", new WeightedRandomChestContent(Items.spawn_egg, 60, 1, 3, 5)); //シルバーフィッシュ
		//ネザー敵のクワ
		event.addItem("strongholdLibrary", new WeightedRandomChestContent(HMTHoes.hoeBlaze, 0, 1, 1, 1));
		event.addItem("strongholdLibrary", new WeightedRandomChestContent(HMTHoes.hoeGhast, 0, 1, 1, 1));
		event.addItem("strongholdLibrary", new WeightedRandomChestContent(HMTHoes.hoeMagmaCube, 0, 1, 1, 1));
		event.addItem("strongholdLibrary", new WeightedRandomChestContent(HMTHoes.hoePigZombie, 0, 1, 1, 1));

		/*遺跡の十字路のチェスト strongholdCrossing 中身は1～5個
		 * new WeightedRandomChestContent(Items.iron_ingot, 0, 1, 5, 10),
		 * new WeightedRandomChestContent(Items.gold_ingot, 0, 1, 3, 5),
		 * new WeightedRandomChestContent(Items.redstone, 0, 4, 9, 5),
		 * new WeightedRandomChestContent(Items.coal, 0, 3, 8, 10),
		 * new WeightedRandomChestContent(Items.bread, 0, 1, 3, 15),
		 * new WeightedRandomChestContent(Items.apple, 0, 1, 3, 15),
		 * new WeightedRandomChestContent(Items.iron_pickaxe, 0, 1, 1, 1)};
		 */
		event.addItem("strongholdCrossing", new WeightedRandomChestContent(Items.diamond_hoe, 0, 1, 1, 5));
		//ネザー敵のクワ
		event.addItem("strongholdCrossing", new WeightedRandomChestContent(HMTHoes.hoeBlaze, 0, 1, 1, 1));
		event.addItem("strongholdCrossing", new WeightedRandomChestContent(HMTHoes.hoeGhast, 0, 1, 1, 1));
		event.addItem("strongholdCrossing", new WeightedRandomChestContent(HMTHoes.hoeMagmaCube, 0, 1, 1, 1));
		event.addItem("strongholdCrossing", new WeightedRandomChestContent(HMTHoes.hoePigZombie, 0, 1, 1, 1));

		/* 村の鍛冶屋のチェスト villageBlacksmith 中身は3～9個
		 * new WeightedRandomChestContent(Items.diamond, 0, 1, 3, 3),
		 * new WeightedRandomChestContent(Items.iron_ingot, 0, 1, 5, 10),
		 * new WeightedRandomChestContent(Items.gold_ingot, 0, 1, 3, 5),
		 * new WeightedRandomChestContent(Items.bread, 0, 1, 3, 15),
		 * new WeightedRandomChestContent(Items.apple, 0, 1, 3, 15),
		 * new WeightedRandomChestContent(Items.iron_pickaxe, 0, 1, 1, 5),
		 * new WeightedRandomChestContent(Items.iron_sword, 0, 1, 1, 5),
		 * new WeightedRandomChestContent(Items.iron_chestplate, 0, 1, 1, 5),
		 * new WeightedRandomChestContent(Items.iron_helmet, 0, 1, 1, 5),
		 * new WeightedRandomChestContent(Items.iron_leggings, 0, 1, 1, 5),
		 * new WeightedRandomChestContent(Items.iron_boots, 0, 1, 1, 5),
		 * new WeightedRandomChestContent(Item.getItemFromBlock(Blocks.obsidian), 0, 3, 7, 5),
		 * new WeightedRandomChestContent(Item.getItemFromBlock(Blocks.sapling), 0, 3, 7, 5),
		 * new WeightedRandomChestContent(Items.saddle, 0, 1, 1, 3),
		 * new WeightedRandomChestContent(Items.iron_horse_armor, 0, 1, 1, 1),
		 * new WeightedRandomChestContent(Items.golden_horse_armor, 0, 1, 1, 1),
		 * new WeightedRandomChestContent(Items.diamond_horse_armor, 0, 1, 1, 1)};
		 */
		event.addItem("villageBlacksmith", new WeightedRandomChestContent(Items.diamond_hoe, 0, 1, 1, 5));
		//中立mobのクワ
		event.addItem("villageBlacksmith", new WeightedRandomChestContent(HMTHoes.hoeBat, 0, 1, 1, 1));
		event.addItem("villageBlacksmith", new WeightedRandomChestContent(HMTHoes.hoeChicken, 0, 1, 1, 1));
		event.addItem("villageBlacksmith", new WeightedRandomChestContent(HMTHoes.hoeCow, 0, 1, 1, 1));
		event.addItem("villageBlacksmith", new WeightedRandomChestContent(HMTHoes.hoeHorse, 0, 1, 1, 1));
		event.addItem("villageBlacksmith", new WeightedRandomChestContent(HMTHoes.hoeMooshroom, 0, 1, 1, 1));
		event.addItem("villageBlacksmith", new WeightedRandomChestContent(HMTHoes.hoeOcelot, 0, 1, 1, 1));
		event.addItem("villageBlacksmith", new WeightedRandomChestContent(HMTHoes.hoeSheep, 0, 1, 1, 1));
		event.addItem("villageBlacksmith", new WeightedRandomChestContent(HMTHoes.hoeSquid, 0, 1, 1, 1));
		event.addItem("villageBlacksmith", new WeightedRandomChestContent(HMTHoes.hoeVillager, 0, 1, 1, 1));
		event.addItem("villageBlacksmith", new WeightedRandomChestContent(HMTHoes.hoeWolf, 0, 1, 1, 1));

		/* スポブロ部屋のチェスト dungeonChest 中身は8個
		 * new WeightedRandomChestContent(Items.saddle, 0, 1, 1, 10),
		 * new WeightedRandomChestContent(Items.iron_ingot, 0, 1, 4, 10),
		 * new WeightedRandomChestContent(Items.bread, 0, 1, 1, 10),
		 * new WeightedRandomChestContent(Items.wheat, 0, 1, 4, 10),
		 * new WeightedRandomChestContent(Items.gunpowder, 0, 1, 4, 10),
		 * new WeightedRandomChestContent(Items.string, 0, 1, 4, 10),
		 * new WeightedRandomChestContent(Items.bucket, 0, 1, 1, 10),
		 * new WeightedRandomChestContent(Items.golden_apple, 0, 1, 1, 1),
		 * new WeightedRandomChestContent(Items.redstone, 0, 1, 4, 10),
		 * new WeightedRandomChestContent(Items.record_13, 0, 1, 1, 10),
		 * new WeightedRandomChestContent(Items.record_cat, 0, 1, 1, 10),
		 * new WeightedRandomChestContent(Items.name_tag, 0, 1, 1, 10),
		 * new WeightedRandomChestContent(Items.golden_horse_armor, 0, 1, 1, 2),
		 * new WeightedRandomChestContent(Items.iron_horse_armor, 0, 1, 1, 5),
		 * new WeightedRandomChestContent(Items.diamond_horse_armor, 0, 1, 1, 1)};
		 */
		event.addItem("dungeonChest", new WeightedRandomChestContent(Items.diamond_hoe, 0, 1, 1, 5));
		//オーバーワールド敵のクワ①
		event.addItem("dungeonChest", new WeightedRandomChestContent(HMTHoes.hoeCreeper, 0, 1, 1, 1));
		event.addItem("dungeonChest", new WeightedRandomChestContent(HMTHoes.hoeSkeleton, 0, 1, 1, 1));
		event.addItem("dungeonChest", new WeightedRandomChestContent(HMTHoes.hoeSpider, 0, 1, 1, 1));
		event.addItem("dungeonChest", new WeightedRandomChestContent(HMTHoes.hoeZombie, 0, 1, 1, 1));

		//ネザー要塞のチェストはChestGenHooksになし。 StructureNetherBridgePieces💲Piece.field_111019_a
	}
}

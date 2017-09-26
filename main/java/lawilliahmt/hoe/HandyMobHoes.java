package lawilliahmt.hoe;

import cpw.mods.fml.common.registry.GameRegistry;
import lawilliahmt.api.HMTHoes;
import lawilliahmt.api.ModToolMaterial;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.util.EnumHelper;

public class HandyMobHoes {
	public HandyMobHoes(){
		//ツールの基本情報
			ModToolMaterial.HandyMobHoes = EnumHelper.addToolMaterial("HandyMobHoes", 3, 1561, 8.0F, 3.0F, 10);
		
		//敵対mobのクワ
			HMTHoes.hoeBlaze = new HoeBlaze(ModToolMaterial.HandyMobHoes) //ブレイズのクワ
					.setCreativeTab(CreativeTabs.tabTools)
					.setUnlocalizedName("hoeBlaze")
					.setTextureName("handymobtools:hoe_blaze"); //✔
				GameRegistry.registerItem(HMTHoes.hoeBlaze, "hoeBlaze");

			HMTHoes.hoeCaveSpider = new HoeCaveSpider(ModToolMaterial.HandyMobHoes) //洞窟グモのクワ
					.setCreativeTab(CreativeTabs.tabTools)
					.setUnlocalizedName("hoeCaveSpider")
					.setTextureName("handymobtools:hoe_cavespider"); //✔
				GameRegistry.registerItem(HMTHoes.hoeCaveSpider, "hoeCaveSpider");

			HMTHoes.hoeCreeper = new HoeCreeper(ModToolMaterial.HandyMobHoes) //クリーパーのクワ
					.setCreativeTab(CreativeTabs.tabTools)
					.setUnlocalizedName("hoeCreeper")
					.setTextureName("handymobtools:hoe_creeper"); //✔
				GameRegistry.registerItem(HMTHoes.hoeCreeper, "hoeCreeper");

			HMTHoes.hoeEnderman = new HoeEnderman(ModToolMaterial.HandyMobHoes) //エンダーマンのクワ
					.setCreativeTab(CreativeTabs.tabTools)
					.setUnlocalizedName("hoeEnderman")
					.setTextureName("handymobtools:hoe_enderman"); //✔
				GameRegistry.registerItem(HMTHoes.hoeEnderman, "hoeEnderman");

			HMTHoes.hoeGhast = new HoeGhast(ModToolMaterial.HandyMobHoes) //ガストのクワ
						.setCreativeTab(CreativeTabs.tabTools)
						.setUnlocalizedName("hoeGhast")
						.setTextureName("handymobtools:hoe_ghast"); //✔
					GameRegistry.registerItem(HMTHoes.hoeGhast, "hoeGhast");

			HMTHoes.hoeMagmaCube = new HoeMagmaCube(ModToolMaterial.HandyMobHoes) //マグマキューブのクワ
					.setCreativeTab(CreativeTabs.tabTools)
					.setUnlocalizedName("hoeMagmaCube")
					.setTextureName("handymobtools:hoe_magmacube");//✔
				GameRegistry.registerItem(HMTHoes.hoeMagmaCube, "hoeMagmaCube");

			HMTHoes.hoePigZombie = new HoePigZombie(ModToolMaterial.HandyMobHoes) //ゾンビピッグマンのクワ
					.setCreativeTab(CreativeTabs.tabTools)
					.setUnlocalizedName("hoePigZombie")
					.setTextureName("handymobtools:hoe_pigzombie"); //✔
				GameRegistry.registerItem(HMTHoes.hoePigZombie, "hoePigZombie");

			HMTHoes.hoeSilverFish =new HoeSilverFish(ModToolMaterial.HandyMobHoes) //シルバーフィッシュのクワ
					.setCreativeTab(CreativeTabs.tabTools)
					.setUnlocalizedName("hoeSilverFish")
					.setTextureName("handymobtools:hoe_silverfish"); //✔
				GameRegistry.registerItem(HMTHoes.hoeSilverFish, "hoeSilverFish");

			HMTHoes.hoeSkeleton = new HoeSkeleton(ModToolMaterial.HandyMobHoes) //スケルトンのクワ
					.setCreativeTab(CreativeTabs.tabTools)
					.setUnlocalizedName("hoeSkeleton")
					.setTextureName("handymobtools:hoe_skeleton"); //✔
				GameRegistry.registerItem(HMTHoes.hoeSkeleton, "hoeSkeleton");

			HMTHoes.hoeSlime =new HoeSlime(ModToolMaterial.HandyMobHoes) //スライムのクワ
					.setCreativeTab(CreativeTabs.tabTools)
					.setUnlocalizedName("hoeSlime")
					.setTextureName("handymobtools:hoe_slime");//✔
				GameRegistry.registerItem(HMTHoes.hoeSlime, "hoeSlime");

			HMTHoes.hoeSpider =new HoeSpider(ModToolMaterial.HandyMobHoes) //クモのクワ
					.setCreativeTab(CreativeTabs.tabTools)
					.setUnlocalizedName("hoeSpider")
					.setTextureName("handymobtools:hoe_spider"); //✔
				GameRegistry.registerItem(HMTHoes.hoeSpider, "hoeSpider");

			HMTHoes.hoeWitch =new HoeWitch(ModToolMaterial.HandyMobHoes) //ウィッチのクワ
					.setCreativeTab(CreativeTabs.tabTools)
					.setUnlocalizedName("hoeWitch")
					.setTextureName("handymobtools:hoe_witch"); //✔
				GameRegistry.registerItem(HMTHoes.hoeWitch, "hoeWitch");

			HMTHoes.hoeZombie = new HoeZombie(ModToolMaterial.HandyMobHoes) //ゾンビのクワ
					.setCreativeTab(CreativeTabs.tabTools)
					.setUnlocalizedName("hoeZombie")
					.setTextureName("handymobtools:hoe_zombie"); //✔
				GameRegistry.registerItem(HMTHoes.hoeZombie, "hoeZombie");

		//中立mobのクワ
			HMTHoes.hoeBat = new HoeBat(ModToolMaterial.HandyMobHoes) //コウモリのクワ
					.setCreativeTab(CreativeTabs.tabTools)
					.setUnlocalizedName("hoeBat")
					.setTextureName("diamond_hoe");
				GameRegistry.registerItem(HMTHoes.hoeBat, "hoeBat");

			HMTHoes.hoeChicken = new HoeChicken(ModToolMaterial.HandyMobHoes) //ニワトリのクワ
					.setCreativeTab(CreativeTabs.tabTools)
					.setUnlocalizedName("hoeChicken")
					.setTextureName("diamond_hoe");
				GameRegistry.registerItem(HMTHoes.hoeChicken, "hoeChicken");

			HMTHoes.hoeCow = new HoeCow(ModToolMaterial.HandyMobHoes) //牛のクワ
					.setCreativeTab(CreativeTabs.tabTools)
					.setUnlocalizedName("hoeCow")
					.setTextureName("diamond_hoe");
				GameRegistry.registerItem(HMTHoes.hoeCow, "hoeCow");

			HMTHoes.hoeHorse = new HoeHorse(ModToolMaterial.HandyMobHoes) //ウマのクワ
					.setCreativeTab(CreativeTabs.tabTools)
					.setUnlocalizedName("hoeHorse")
					.setTextureName("diamond_hoe");
				GameRegistry.registerItem(HMTHoes.hoeHorse, "hoeHorse");

			HMTHoes.hoeMooshroom = new HoeMooshroom(ModToolMaterial.HandyMobHoes) //ムーシュルームのクワ
					.setCreativeTab(CreativeTabs.tabTools)
					.setUnlocalizedName("hoeMooshroom")
					.setTextureName("diamond_hoe");
				GameRegistry.registerItem(HMTHoes.hoeMooshroom, "hoeMooshroom");

			HMTHoes.hoeOcelot = new HoeOcelot(ModToolMaterial.HandyMobHoes) //ヤマネコのクワ
					.setCreativeTab(CreativeTabs.tabTools)
					.setUnlocalizedName("hoeOcelot")
					.setTextureName("diamond_hoe");
				GameRegistry.registerItem(HMTHoes.hoeOcelot, "hoeOcelot");

			HMTHoes.hoeSheep = new HoeSheep(ModToolMaterial.HandyMobHoes) //羊のクワ
					.setCreativeTab(CreativeTabs.tabTools)
					.setUnlocalizedName("hoeSheep")
					.setTextureName("diamond_hoe");
				GameRegistry.registerItem(HMTHoes.hoeSheep, "hoeSheep");

			HMTHoes.hoeSquid = new HoeSquid(ModToolMaterial.HandyMobHoes) //イカのクワ
					.setCreativeTab(CreativeTabs.tabTools)
					.setUnlocalizedName("hoeSquid")
					.setTextureName("handymobtools:hoe_squid"); //✔
				GameRegistry.registerItem(HMTHoes.hoeSquid, "hoeSquid");

			HMTHoes.hoeVillager = new HoeVillager(ModToolMaterial.HandyMobHoes) //村人のクワ
					.setCreativeTab(CreativeTabs.tabTools)
					.setUnlocalizedName("hoeVillager")
					.setTextureName("handymobtools:hoe_villager"); //✔
				GameRegistry.registerItem(HMTHoes.hoeVillager, "hoeVillager");

			HMTHoes.hoeWolf = new HoeWolf(ModToolMaterial.HandyMobHoes) //オオカミのクワ
					.setCreativeTab(CreativeTabs.tabTools)
					.setUnlocalizedName("hoeWolf")
					.setTextureName("diamond_hoe");
				GameRegistry.registerItem(HMTHoes.hoeWolf, "hoeWolf");
	}
}
package lawilliahmt.addon;

import lawilliahmt.api.HMTHoes;
import net.minecraft.item.ItemStack;
import shift.mceconomy2.api.MCEconomyAPI;

public class MCE2AddonToolPrice {
	public MCE2AddonToolPrice(){
		//バニラのダイヤツールの価格設定
		int priceshovel = 1000;
		int priceHoe = 2000;
		int pricePickaxe = 3000;
		int priceAxe =3000;

		//スポーンエッグの価値による補正設定
		int price1 = 500;
		int price2 = 1500;
		int price3 = 3000;

		//クワの売価設定
		int priceHMTHoe1 = priceHoe + price1;
		int priceHMTHoe2 = priceHoe + price2;
		int priceHMTHoe3 = priceHoe + price3;

		//クワ、価値低め
		MCEconomyAPI.addPurchaseItem(new ItemStack(HMTHoes.hoeBlaze), priceHMTHoe1);
		MCEconomyAPI.addPurchaseItem(new ItemStack(HMTHoes.hoeCaveSpider), priceHMTHoe1);
		MCEconomyAPI.addPurchaseItem(new ItemStack(HMTHoes.hoeChicken), priceHMTHoe1);
		MCEconomyAPI.addPurchaseItem(new ItemStack(HMTHoes.hoePigZombie), priceHMTHoe1);
		MCEconomyAPI.addPurchaseItem(new ItemStack(HMTHoes.hoeSkeleton), priceHMTHoe1);
		MCEconomyAPI.addPurchaseItem(new ItemStack(HMTHoes.hoeSlime), priceHMTHoe1);
		MCEconomyAPI.addPurchaseItem(new ItemStack(HMTHoes.hoeSpider), priceHMTHoe1);
		MCEconomyAPI.addPurchaseItem(new ItemStack(HMTHoes.hoeSquid), priceHMTHoe1);
		MCEconomyAPI.addPurchaseItem(new ItemStack(HMTHoes.hoeZombie), priceHMTHoe1);
		//クワ、価値中程度
		MCEconomyAPI.addPurchaseItem(new ItemStack(HMTHoes.hoeCow), priceHMTHoe2);
		MCEconomyAPI.addPurchaseItem(new ItemStack(HMTHoes.hoeCreeper), priceHMTHoe2);
		MCEconomyAPI.addPurchaseItem(new ItemStack(HMTHoes.hoeEnderman), priceHMTHoe2);
		MCEconomyAPI.addPurchaseItem(new ItemStack(HMTHoes.hoeMagmaCube), priceHMTHoe2);
		MCEconomyAPI.addPurchaseItem(new ItemStack(HMTHoes.hoeMooshroom), priceHMTHoe2);
		MCEconomyAPI.addPurchaseItem(new ItemStack(HMTHoes.hoeOcelot), priceHMTHoe2);
		MCEconomyAPI.addPurchaseItem(new ItemStack(HMTHoes.hoeSheep), priceHMTHoe2);
		MCEconomyAPI.addPurchaseItem(new ItemStack(HMTHoes.hoeSilverFish), priceHMTHoe2);
		MCEconomyAPI.addPurchaseItem(new ItemStack(HMTHoes.hoeWitch), priceHMTHoe2);
		MCEconomyAPI.addPurchaseItem(new ItemStack(HMTHoes.hoeWolf), priceHMTHoe2);
		//クワ、価値高め
		MCEconomyAPI.addPurchaseItem(new ItemStack(HMTHoes.hoeBat), priceHMTHoe3);
		MCEconomyAPI.addPurchaseItem(new ItemStack(HMTHoes.hoeGhast), priceHMTHoe3);
		MCEconomyAPI.addPurchaseItem(new ItemStack(HMTHoes.hoeHorse), priceHMTHoe3);
		MCEconomyAPI.addPurchaseItem(new ItemStack(HMTHoes.hoeVillager), priceHMTHoe3);
	}
}

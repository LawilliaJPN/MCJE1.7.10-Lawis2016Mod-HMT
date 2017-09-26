package lawilliahmt.addon;

import cpw.mods.fml.common.Loader;
import lawilliahmt.HandyMobTools;

public class Addons {
	public static boolean DQRAddon = false;
	public static boolean MCE2Addon = false;
	public static boolean SS2Addon = false;

	public Addons(){
		//DQRアドオン
		if(Loader.isModLoaded("DQMIIINext")){
			try{
				DQRAddon = true;

				//敵対mob
				//new DQRAddonRecipesBlaze();
				//new DQRAddonRecipesCaveSpider();
				new DQRAddonRecipesCreeper();
				new DQRAddonRecipesEnderman();
				//new DQRAddonRecipesGhast();
				new DQRAddonRecipesMagmaCube();
				//new DQRAddonRecipesPigZombie();
				//new DQRAddonRecipesSilverFish();
				new DQRAddonRecipesSkeleton();
				//new DQRAddonRecipesSlime();
				//new DQRAddonRecipesSpider();
				//new DQRAddonRecipesWitch();
				new DQRAddonRecipesZombie();

				//中立mob
				//new DQRAddonRecipesBat();
				//new DQRAddonRecipesChicken();
				//new DQRAddonRecipesCow();
				//new DQRAddonRecipesHorse();
				//new DQRAddonRecipesMooshroom();
				new DQRAddonRecipesOcelot();
				//new DQRAddonRecipesSheep();
				//new DQRAddonRecipesSquid();
				new DQRAddonRecipesVillager();
				//new DQRAddonRecipesWolf();
			} catch (Throwable t) {
				HandyMobTools.logger.warn("Failed to get items of DQMIIINext.");
			}
		}

		if(Loader.isModLoaded("mceconomy2")){
			try{
				MCE2Addon =true;
				new MCE2AddonToolPrice();
			} catch (Throwable t) {
				HandyMobTools.logger.warn("Failed to get items of mceconomy2.");
			}
		}

		//SS2アドオン
		if(Loader.isModLoaded("SextiarySector")){
			try{
				SS2Addon = true;
			} catch (Throwable t) {
				HandyMobTools.logger.warn("Failed to get items of SextiarySector.");
			}
		}
	}
}

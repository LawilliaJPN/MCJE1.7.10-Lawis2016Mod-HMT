package lawilliahmt.addon;

import cpw.mods.fml.common.Loader;
import lawilliahmt.HandyMobTools;

public class DQRAddonRecipes {
	public DQRAddonRecipes(){
		if(Loader.isModLoaded("DQMIIINext")){
			try{
				/*
				//()：
				GameRegistry.addShapelessRecipe(new ItemStack(HandyMobTools.),
					Items.diamond_,
					new ItemStack(DQMobObjects.BlockObj,1,0)
				);
				GameRegistry.addShapelessRecipe(new ItemStack(HandyMobTools.),
					Items.diamond_,
					new ItemStack(DQMobFigures.BlockFigure,1,0)
				);
				*/

			}
			catch (Throwable t){
				HandyMobTools.logger.warn("Failed to get items of DQMIIINext.");
			}
		}
	}
}


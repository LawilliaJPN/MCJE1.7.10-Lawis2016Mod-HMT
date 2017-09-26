package lawilliahmt.addon;

import cpw.mods.fml.common.registry.GameRegistry;
import dqr.api.Blocks.DQMobFigures;
import dqr.api.Blocks.DQMobObjects;
import lawilliahmt.api.HMTHoes;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class DQRAddonRecipesMagmaCube {
	public DQRAddonRecipesMagmaCube(){
		/*マグマキューブのクワ
		//()：
		GameRegistry.addShapelessRecipe(new ItemStack(HandyMobTools.hoeMagmaCube),
			Items.diamond_hoe,
			new ItemStack(DQMobObjects.BlockObj,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(HandyMobTools.hoeMagmaCube),
			Items.diamond_hoe,
			new ItemStack(DQMobFigures.BlockFigure,1,0)
		);
		*/
		//マグマロン(ネザー)：Magumaron
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeMagmaCube),
			Items.diamond_hoe,
			new ItemStack(DQMobObjects.BlockObjMagumaron,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeMagmaCube),
			Items.diamond_hoe,
			new ItemStack(DQMobFigures.BlockFigureMagumaron,1,0)
		);
		//ようがんまじん(夜)：Youganmajin
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeMagmaCube),
			Items.diamond_hoe,
			new ItemStack(DQMobObjects.BlockObjYouganmajin,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeMagmaCube),
			Items.diamond_hoe,
			new ItemStack(DQMobFigures.BlockFigureYouganmajin,1,0)
		);
	}
}
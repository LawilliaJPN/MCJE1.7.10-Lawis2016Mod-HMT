package lawilliahmt.addon;

import cpw.mods.fml.common.registry.GameRegistry;
import dqr.api.Blocks.DQMobFigures;
import dqr.api.Blocks.DQMobObjects;
import lawilliahmt.api.HMTHoes;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class DQRAddonRecipesVillager {
	public DQRAddonRecipesVillager(){
		/*村人のクワ：カンダタ系
		//()：
		GameRegistry.addShapelessRecipe(new ItemStack(HandyMobTools.hoeVillager),
			Items.diamond_hoe,
			new ItemStack(DQMobObjects.BlockObj,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(HandyMobTools.hoeVillager),
			Items.diamond_hoe,
			new ItemStack(DQMobFigures.BlockFigure,1,0)
		);
		*/
		//デスストーカー(エンド)：Desusutoka
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeVillager),
			Items.diamond_hoe,
			new ItemStack(DQMobObjects.BlockObjDesusutoka,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeVillager),
			Items.diamond_hoe,
			new ItemStack(DQMobFigures.BlockFigureDesusutoka,1,0)
		);
		//エリミネーター(ネザー)：Eriminator
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeVillager),
			Items.diamond_hoe,
			new ItemStack(DQMobObjects.BlockObjEriminator,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeVillager),
			Items.diamond_hoe,
			new ItemStack(DQMobFigures.BlockFigureEriminator,1,0)
		);
		//ごろつき(夜)：Gorotuki
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeVillager),
			Items.diamond_hoe,
			new ItemStack(DQMobObjects.BlockObjGorotuki,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeVillager),
			Items.diamond_hoe,
			new ItemStack(DQMobFigures.BlockFigureGorotuki,1,0)
		);
	}
}


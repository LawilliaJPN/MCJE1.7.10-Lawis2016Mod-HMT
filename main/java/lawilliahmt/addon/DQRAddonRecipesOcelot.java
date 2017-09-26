package lawilliahmt.addon;

import cpw.mods.fml.common.registry.GameRegistry;
import dqr.api.Blocks.DQMobFigures;
import dqr.api.Blocks.DQMobObjects;
import lawilliahmt.api.HMTHoes;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class DQRAddonRecipesOcelot {
	public DQRAddonRecipesOcelot(){
		/*ヤマネコのクワ
		//()：
		GameRegistry.addShapelessRecipe(new ItemStack(HandyMobTools.hoeOcelot),
			Items.diamond_hoe,
			new ItemStack(DQMobObjects.BlockObj,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(HandyMobTools.hoeOcelot),
			Items.diamond_hoe,
			new ItemStack(DQMobFigures.BlockFigure,1,0)
		);
		*/
		//ベビーパンサー(昼)：Kirapan
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeOcelot),
			Items.diamond_hoe,
			new ItemStack(DQMobObjects.BlockObjKirapan,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeOcelot),
			Items.diamond_hoe,
			new ItemStack(DQMobFigures.BlockFigureKirapan,1,0)
		);
		//キラーパンサー(夜)：Kirapan2
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeOcelot),
			Items.diamond_hoe,
			new ItemStack(DQMobObjects.BlockObjKirapan2,1,0)
		);
		GameRegistry.addShapelessRecipe(new ItemStack(HMTHoes.hoeOcelot),
			Items.diamond_hoe,
			new ItemStack(DQMobFigures.BlockFigureKirapan2,1,0)
		);
	}
}

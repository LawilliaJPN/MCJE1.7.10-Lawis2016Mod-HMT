package lawilliahmt.addon;

import net.minecraft.entity.player.EntityPlayer;
import shift.sextiarysector.api.SextiarySectorAPI;

public class SS2AddonMoisture {
		//メモ  MAX水分 20
	public SS2AddonMoisture(EntityPlayer entityPlayer, int par1, float par2){
		SextiarySectorAPI.playerManager.addMoistureStats(entityPlayer, par1, par2);
	}
}

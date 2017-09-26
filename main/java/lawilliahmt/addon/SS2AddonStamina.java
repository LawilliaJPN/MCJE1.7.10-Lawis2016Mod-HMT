package lawilliahmt.addon;

import net.minecraft.entity.player.EntityPlayer;
import shift.sextiarysector.api.SextiarySectorAPI;

public class SS2AddonStamina {
		//メモ MAXスタミナ 100
	public SS2AddonStamina(EntityPlayer entityPlayer, int par1, float par2){
		SextiarySectorAPI.playerManager.addStaminaStats(entityPlayer, par1, par2);
	}
}
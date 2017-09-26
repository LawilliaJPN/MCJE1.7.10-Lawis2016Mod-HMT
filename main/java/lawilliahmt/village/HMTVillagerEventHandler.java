package lawilliahmt.village;

import cpw.mods.fml.common.registry.VillagerRegistry;
import lawilliahmt.api.HMTVillager;

public class HMTVillagerEventHandler {
	public HMTVillagerEventHandler(){
		HMTVillager.villagerTrade = new HMTVillagerTrade();

		//村人の職業ID
		VillagerRegistry.instance().registerVillagerId(HMTVillager.villagerHMT);
		//村人の登録
		VillagerRegistry.instance().registerVillageTradeHandler(HMTVillager.villagerHMT, HMTVillager.villagerTrade);
	}
}

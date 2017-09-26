package lawilliahmt;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import lawilliahmt.addon.Addons;
import lawilliahmt.event.HMTChestGenHook;
import lawilliahmt.event.LivingDropHandler;
import lawilliahmt.hoe.HandyMobHoes;
import lawilliahmt.pickaxe.HandyMobPickaxes;
import lawilliahmt.village.HMTVillagerEventHandler;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = HandyMobTools.MODID, name = HandyMobTools.MODNAME, version = HandyMobTools.VERSION)

public class HandyMobTools {

    public static final String MODID = "handymobtools";
    public static final String MODNAME = "Handy Mob Tools";
    public static final String VERSION = "0.1";
    public static Logger logger = LogManager.getLogger("handymobtools");

	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		//ツールの追加
		new HandyMobHoes();
		new HandyMobPickaxes();
	}

	@EventHandler
	public void init(FMLInitializationEvent event){
		//バニラmobにスポーンエッグ等のドロップ追加
		MinecraftForge.EVENT_BUS.register(new LivingDropHandler());
		//ダンジョンチェスト等の中身の追加
		MinecraftForge.EVENT_BUS.register(new HMTChestGenHook(null));
		//レシピの追加
		new ItemRecipes();
		//村人の追加
		new HMTVillagerEventHandler();
	}

	@EventHandler
	public void postInit (FMLPostInitializationEvent event){
		//他modとの連携
		new Addons();
	}
}
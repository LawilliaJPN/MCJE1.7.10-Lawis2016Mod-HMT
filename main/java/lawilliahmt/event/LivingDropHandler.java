package lawilliahmt.event;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class LivingDropHandler {

	@SubscribeEvent
	public void onLivingDrops(LivingDropsEvent event)
	{
        World world = event.entityLiving.worldObj; //EntityItemの第1引数
        double x = event.entityLiving.posX; //EntityItemの第2引数
        double y = event.entityLiving.posY; //EntityItemの第3引数
        double z = event.entityLiving.posZ; //EntityItemの第4引数

    	int re = new java.util.Random().nextInt(20);  //敵対mob
    	int rn = new java.util.Random().nextInt(50);  //中立mob
    	int rs = new java.util.Random().nextInt(100); //スライム
    	int rdh = new java.util.Random().nextInt(500); //ダイヤのクワ

		if(event.entityLiving.worldObj.isRemote) {
			return;
		}

		if(re == 0) { //敵対mob ドロップ率05％
			//50：クリーパー ToDo：DHP
			if(event.entityLiving instanceof EntityCreeper){
				event.drops.add(new EntityItem(world, x, y, z, new ItemStack(Items.spawn_egg, 1, 50)));
			//51：スケルトン ToDo：DHP
			} else if(event.entityLiving instanceof EntitySkeleton){
				event.drops.add(new EntityItem(world, x, y, z, new ItemStack(Items.spawn_egg, 1, 51)));
			//59：洞窟グモ ToDo：H
			} else if(event.entityLiving instanceof EntityCaveSpider){ //クモが洞窟グモより先だと、クモのスポーンエッグを落としてしまう。
				event.drops.add(new EntityItem(world, x, y, z, new ItemStack(Items.spawn_egg, 1, 59)));
			//52：クモ ToDo：H
			} else if(event.entityLiving instanceof EntitySpider){
				event.drops.add(new EntityItem(world, x, y, z, new ItemStack(Items.spawn_egg, 1, 52)));
			//57：ゾンビピッグマン ToDo：DH
			} else if(event.entityLiving instanceof EntityPigZombie){ //ゾンビがピッグマンより先だと、ゾンビのスポーンエッグを落としてしまう。
				event.drops.add(new EntityItem(world, x, y, z, new ItemStack(Items.spawn_egg, 1, 57)));
			//53：ゾンビ ToDo：DH
			} else if(event.entityLiving instanceof EntityZombie) {
				event.drops.add(new EntityItem(world, x, y, z, new ItemStack(Items.spawn_egg, 1, 54)));
			//56：ガスト ToDo：H
			} else if(event.entityLiving instanceof EntityGhast){
				event.drops.add(new EntityItem(world, x, y, z, new ItemStack(Items.spawn_egg, 1, 56)));
			//58：エンダーマン ToDo：DHP
			} else if(event.entityLiving instanceof EntityEnderman){
				event.drops.add(new EntityItem(world, x, y, z, new ItemStack(Items.spawn_egg, 1, 58)));
			//60：シルバーフィッシュ ToDo：H
			} else if(event.entityLiving instanceof EntitySilverfish){
				event.drops.add(new EntityItem(world, x, y, z, new ItemStack(Items.spawn_egg, 1, 60)));
			//61：ブレイズ ToDo：HP
			} else if(event.entityLiving instanceof EntityBlaze){
				event.drops.add(new EntityItem(world, x, y, z, new ItemStack(Items.spawn_egg, 1, 61)));
			//66：ウィッチ ToDo：H
			} else if(event.entityLiving instanceof EntityWitch){
				event.drops.add(new EntityItem(world, x, y, z, new ItemStack(Items.spawn_egg, 1, 66)));
			}
		}

		if(rn == 0){ //中立mob ドロップ率02％
			//65：コウモリ ToDo：H
			if(event.entityLiving instanceof EntityBat){
				event.drops.add(new EntityItem(world, x, y, z, new ItemStack(Items.spawn_egg, 1, 65)));
			//90：ブタ（ゾンビエッグとクラフトでゾンビピッグマン）
			} else if(event.entityLiving instanceof EntityPig){
				event.drops.add(new EntityItem(world, x, y, z, new ItemStack(Items.spawn_egg, 1, 90)));
			//91：ヒツジ  ToDo：H
			} else if(event.entityLiving instanceof EntitySheep){
				event.drops.add(new EntityItem(world, x, y, z, new ItemStack(Items.spawn_egg, 1, 91)));
			//96：ムーシュルーム ToDo：H
			} else if(event.entityLiving instanceof EntityMooshroom){ //ウシがムーシュルームより先だと、ウシのスポーンエッグを落としてしまう。
				event.drops.add(new EntityItem(world, x, y, z, new ItemStack(Items.spawn_egg, 1, 96)));
			//92：ウシ ToDo：H
			} else if(event.entityLiving instanceof EntityCow){
				event.drops.add(new EntityItem(world, x, y, z, new ItemStack(Items.spawn_egg, 1, 92)));
			//93：ニワトリ ToDo：H
			} else if(event.entityLiving instanceof EntityChicken){
				event.drops.add(new EntityItem(world, x, y, z, new ItemStack(Items.spawn_egg, 1, 93)));
			//94：イカ ToDo：H
			} else if(event.entityLiving instanceof EntitySquid){
				event.drops.add(new EntityItem(world, x, y, z, new ItemStack(Items.spawn_egg, 1, 94)));
			//95：オオカミ ToDo：H
			} else if(event.entityLiving instanceof EntityWolf){
				event.drops.add(new EntityItem(world, x, y, z, new ItemStack(Items.spawn_egg, 1, 95)));
			//98：ヤマネコ ToDo：DH
			} else if(event.entityLiving instanceof EntityOcelot){
				event.drops.add(new EntityItem(world, x, y, z, new ItemStack(Items.spawn_egg, 1, 98)));
			//100：ウマ ToDo：H
			} else if(event.entityLiving instanceof EntityHorse){
				event.drops.add(new EntityItem(world, x, y, z, new ItemStack(Items.spawn_egg, 1, 100)));
			//120：村人 ToDo：DH
			} else if(event.entityLiving instanceof EntityVillager){
				event.drops.add(new EntityItem(world, x, y, z, new ItemStack(Items.spawn_egg, 1, 120)));
			}
		}

		if(rs == 0){ //スライム ドロップ率01％
			//62：マグマキューブ ToDo：DH
			if(event.entityLiving instanceof EntityMagmaCube){ //スライムがマグマキューブより先だと、スライムのスポーンエッグを落としてしまう。
				event.drops.add(new EntityItem(world, x, y, z, new ItemStack(Items.spawn_egg, 1, 62)));
			//55：スライム ToDo：H
			} else if(event.entityLiving instanceof EntitySlime){
				event.drops.add(new EntityItem(world, x, y, z, new ItemStack(Items.spawn_egg, 1, 55)));
			}
		}

		if(rdh == 0) { //ダイヤのクワ 人型mob ドロップ率0.2％
			if(event.entityLiving instanceof EntityEnderman) {
				event.drops.add(new EntityItem(world, x, y, z, new ItemStack(Items.diamond_hoe)));
			} else if(event.entityLiving instanceof EntitySkeleton){
				event.drops.add(new EntityItem(world, x, y, z, new ItemStack(Items.diamond_hoe)));
			} else if(event.entityLiving instanceof EntityWitch){
				event.drops.add(new EntityItem(world, x, y, z, new ItemStack(Items.diamond_hoe)));
			} else if(event.entityLiving instanceof EntityZombie){
				event.drops.add(new EntityItem(world, x, y, z, new ItemStack(Items.diamond_hoe)));
			} else if(event.entityLiving instanceof EntityVillager){
				event.drops.add(new EntityItem(world, x, y, z, new ItemStack(Items.diamond_hoe)));
			}
		}
	}
}

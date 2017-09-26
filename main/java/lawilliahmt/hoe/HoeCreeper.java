package lawilliahmt.hoe;

import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class HoeCreeper extends ItemHoe{

	public HoeCreeper(ToolMaterial toolMaterial) {
		super(toolMaterial);
	}

	@Override //右クリック時の効果追加
	public boolean onItemUse(ItemStack itemStack, EntityPlayer entityPlayer, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
		Block block = world.getBlock(x, y, z);
		Block blockA = world.getBlock(x, y + 1, z);

		if (!(entityPlayer.canPlayerEdit(x + 5, y + 5, z + 5, side, itemStack) && entityPlayer.canPlayerEdit(x + 5, y + 5, z - 5, side, itemStack) && entityPlayer.canPlayerEdit(x - 5, y + 5, z + 5, side, itemStack) && entityPlayer.canPlayerEdit(x - 5, y + 5, z - 5, side, itemStack))) {
			//falseを返す
			return false;
		} else {
			if (side != 0 && blockA.isAir(world, x, y + 1, z) && block.isOpaqueCube()) {
				//音を鳴らす
    			int rsp = new java.util.Random().nextInt(6);
				world.playSoundEffect(x + 0.5D, y + 0.5D, z + 0.5D, "mob.creeper.say", 0.4F, 0.05F + 0.05F * rsp);

				if (world.isRemote) {
					return true;
				} else {
					y = y + 5;
					//blockPP
					//TNTを設置する
					world.setBlockToAir(x + 5, y, z + 5);
					EntityTNTPrimed entitytntprimedPP = new EntityTNTPrimed(world);
			        entitytntprimedPP.setLocationAndAngles((double)x + 5.5D, (double)y + 1, (double)z + 5.5D, 0.0F, 0.0F);
			        entitytntprimedPP.fuse = 40; //現れてから爆発するまでの時間(通常の半分)
			        world.spawnEntityInWorld(entitytntprimedPP);

			        //blockPM
					//TNTを設置する
					world.setBlockToAir(x + 5, y, z - 5);
					EntityTNTPrimed entitytntprimedPM = new EntityTNTPrimed(world);
			        entitytntprimedPM.setLocationAndAngles((double)x + 5.5D, (double)y + 1, (double)z - 4.5D, 0.0F, 0.0F);
			        entitytntprimedPM.fuse = 40; //現れてから爆発するまでの時間(通常の半分)
			        world.spawnEntityInWorld(entitytntprimedPM);

			        //blockMP
					//TNTを設置する
					world.setBlockToAir(x - 5, y, z + 5);
					EntityTNTPrimed entitytntprimedMP = new EntityTNTPrimed(world);
			        entitytntprimedMP.setLocationAndAngles((double)x - 4.5D, (double)y + 1, (double)z + 5.5D, 0.0F, 0.0F);
			        entitytntprimedMP.fuse = 40; //現れてから爆発するまでの時間(通常の半分)
			        world.spawnEntityInWorld(entitytntprimedMP);

			        //blockMM
					//TNTを設置する
					world.setBlockToAir(x - 5, y, z - 5);
					EntityTNTPrimed entitytntprimedMM = new EntityTNTPrimed(world);
			        entitytntprimedMM.setLocationAndAngles((double)x - 4.5D, (double)y + 1, (double)z - 4.5D, 0.0F, 0.0F);
			        entitytntprimedMM.fuse = 40; //現れてから爆発するまでの時間(通常の半分)
			        world.spawnEntityInWorld(entitytntprimedMM);

					//耐久値を10減らす(後日調整)
					itemStack.damageItem(10, entityPlayer);
					return true;
				}
			} else {
				return false;
			}
		}
	}
}

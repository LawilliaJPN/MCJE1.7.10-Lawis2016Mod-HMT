package lawilliahmt.hoe;

import net.minecraft.block.Block;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class HoeVillager extends ItemHoe{

	public HoeVillager(ToolMaterial toolMaterial) {
		super(toolMaterial);
	}

	@Override //右クリック時の効果追加
	public boolean onItemUse(ItemStack itemStack, EntityPlayer entityPlayer, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
		Block block = world.getBlock(x, y, z);
		Block blockA = world.getBlock(x, y + 1, z);

		//右クリックされたブロックの上が空気ブロックで、右クリックされたブロックが不透過立方体ブロックならば
		if (side == 1 && blockA.isAir(world, x, y + 1, z) && block.isOpaqueCube()) {
			//音を鳴らす
			int rsp = new java.util.Random().nextInt(6);
			world.playSoundEffect(x + 0.5D, y + 0.5D, z + 0.5D, "random.anvil_land", 0.2F, 0.05F + 0.05F * rsp);

			if (world.isRemote) {
				return true;
			} else {
	            EntityIronGolem entityirongolem = new EntityIronGolem(world);
	            entityirongolem.setLocationAndAngles((double)x + 0.5D, (double)y + 1.0D, (double)z + 0.5D, 0.0F, 0.0F);
	            world.spawnEntityInWorld(entityirongolem);
	            entityirongolem.spawnExplosionParticle();

				//耐久値を10減らす(後日調整)
				itemStack.damageItem(10, entityPlayer);
	            return true;
			}
		} else {
			return false;
		}
	}
}
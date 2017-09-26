package lawilliahmt.hoe;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class HoeBat extends ItemHoe {

	public HoeBat(ToolMaterial toolMaterial) {
		super(toolMaterial);
	}

	//右クリックブロックのX、Z座標のブロックを上下入れ替える
	@Override
	public boolean onItemUse(ItemStack itemStack, EntityPlayer entityPlayer, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
		//右クリックされたブロックを取得する
		Block block = world.getBlock(x, y, z);
		Block blockA = world.getBlock(x, y + 1, z);

			//右クリックされたブロックが不透過立方体ブロックで、その上が空気ブロックで、Y座標が10以上ならば
			if (side != 0 && blockA.isAir(world, x, y + 1, z) && block.isOpaqueCube() && y >= 10) {
				Block blockS = Blocks.farmland;
				//音を鳴らす
				world.playSoundEffect(x + 0.5D, y + 0.5D, z + 0.5D, blockS.stepSound.getStepResourcePath(), (blockS.stepSound.getVolume() + 1.0F) / 2.5F, blockS.stepSound.getPitch() * 0.8F);

				//クライアント側では何もせず
				if (world.isRemote) {
					return true;
				//サーバー側では
				} else {
					for(int i = 0;i < (y - 5) / 2 ;i++){
						Block block1 = world.getBlock(x, 5 + i, z);
						Block block2 = world.getBlock(x, y - i, z);
						world.setBlock(x, 5 + i, z, block2);
						world.setBlock(x, y - i, z, block1);
					}
					//耐久値を5減らす
					itemStack.damageItem(5, entityPlayer);
					return true;
				}
			} else {
				return false;
			}
	}
}
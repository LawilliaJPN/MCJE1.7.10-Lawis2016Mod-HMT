package lawilliahmt.hoe;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

public class HoePigZombie extends ItemHoe {

	public HoePigZombie(ToolMaterial toolMaterial) {
		super(toolMaterial);
	}

	//右クリック時にブロックの変更（TNT Modders＞MOD製作チュートリアル＞ツール類の追加、を参考にさせていただきました。）
	@Override
	public boolean onItemUse(ItemStack itemStack, EntityPlayer entityPlayer, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
		//プレイヤーが編集不可ならば
		if (!entityPlayer.canPlayerEdit(x, y, z, side, itemStack)) {
			//falseを返す
			return false;
		} else {
			//右クリックされたブロックを取得する
			Block block = world.getBlock(x, y, z);
			BiomeGenBase biome = world.getBiomeGenForCoords(x, z);
			Block topBlock = world.getBiomeGenForCoords(x, z).topBlock;
			int dim = world.provider.dimensionId;

			//右クリックされたブロックの上が空気ブロックで、トップブロックと同様のブロックや土と岩盤以外の不透過立方体ブロックならば
			if (side != 0 && world.getBlock(x, y + 1, z).isAir(world, x, y + 1, z) && block.isOpaqueCube() && !(block == Blocks.bedrock)) {
				//クライアント側では何もせず
				if (world.isRemote) {
					return true;
				//サーバー側では
				} else {
					//ブロックを置き換える
					if(dim == -1 && !(block == Blocks.netherrack)){
						//音を鳴らす
						Block blockS = Blocks.netherrack;
						world.playSoundEffect(x + 0.5D, y + 0.5D, z + 0.5D, blockS.stepSound.getStepResourcePath(), (blockS.stepSound.getVolume() + 1.0F) / 2.5F, blockS.stepSound.getPitch() * 0.8F);
						//ネザーならネザーラックに
						world.setBlock(x, y, z, Blocks.netherrack);
						itemStack.damageItem(1, entityPlayer);
						return true;

					} else if(dim == 1 && !(block == Blocks.end_stone)){
						//音を鳴らす
						Block blockS = Blocks.end_stone;
						world.playSoundEffect(x + 0.5D, y + 0.5D, z + 0.5D, blockS.stepSound.getStepResourcePath(), (blockS.stepSound.getVolume() + 1.0F) / 2.5F, blockS.stepSound.getPitch() * 0.8F);

						//エンドならエンドストーンに
						itemStack.damageItem(1, entityPlayer);
						return true;

					} else if(topBlock == Blocks.grass && !(dim == -1 || dim == 1 || block == Blocks.dirt)){
						//音を鳴らす
						Block blockS = Blocks.farmland;
						world.playSoundEffect(x + 0.5D, y + 0.5D, z + 0.5D, blockS.stepSound.getStepResourcePath(), (blockS.stepSound.getVolume() + 1.0F) / 2.5F, blockS.stepSound.getPitch() * 0.8F);

						//バイオームのトップブロックが草なら土に
						world.setBlock(x, y, z, Blocks.dirt);
						itemStack.damageItem(1, entityPlayer);
						return true;

					} else if(!(topBlock == Blocks.grass || block == topBlock)){
						//音を鳴らす
						Block blockS = topBlock;
						world.playSoundEffect(x + 0.5D, y + 0.5D, z + 0.5D, blockS.stepSound.getStepResourcePath(), (blockS.stepSound.getVolume() + 1.0F) / 2.5F, blockS.stepSound.getPitch() * 0.8F);

						//それら以外のバイオームではトップブロックに
						world.setBlock(x, y, z, topBlock);
						itemStack.damageItem(1, entityPlayer);
						return true;

					} else {
						return false;

					}
				}
			} else {
				return false;
			}
		}
	}

}

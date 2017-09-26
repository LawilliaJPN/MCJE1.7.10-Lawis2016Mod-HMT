package lawilliahmt.hoe;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class HoeSilverFish extends ItemHoe {

	public HoeSilverFish(ToolMaterial toolMaterial) {
		super(toolMaterial);
	}

	//右クリック時にブロックの変更（TNT Modders＞MOD製作チュートリアル＞ツール類の追加、を参考にさせていただきました。）
	@Override
	public boolean onItemUse(ItemStack itemStack, EntityPlayer entityPlayer, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
		if (!entityPlayer.canPlayerEdit(x, y, z, side, itemStack)) {
			//プレイヤーが編集不可ならばfalseを返す
			return false;
		} else {
			//右クリックされたブロックを取得する
			Block block = world.getBlock(x, y, z);
			Block blockS = block;

			//右クリックされたブロックが丸石ならば、
			if (block == Blocks.cobblestone) {
				//音を鳴らす
				world.playSoundEffect(x + 0.5D, y + 0.5D, z + 0.5D, blockS.stepSound.getStepResourcePath(), (blockS.stepSound.getVolume() + 1.0F) / 2.5F, blockS.stepSound.getPitch() * 0.8F);

				if (world.isRemote) {
					return true; //クライアント側では何もせず
				} else { //サーバー側では
					//ブロックを石に置き換える
					world.setBlock(x, y, z, Blocks.stone);
					//耐久値を1減らす
					itemStack.damageItem(1, entityPlayer);
					return true;
				}

			} else if (block == Blocks.stone){
				//音を鳴らす
				world.playSoundEffect(x + 0.5D, y + 0.5D, z + 0.5D, blockS.stepSound.getStepResourcePath(), (blockS.stepSound.getVolume() + 1.0F) / 2.5F, blockS.stepSound.getPitch() * 0.8F);

				if (world.isRemote) {
					return true; //クライアント側では何もせず
				} else { //サーバー側では
					//ブロックを石に置き換える
					world.setBlock(x, y, z, Blocks.stonebrick);
					//耐久値を1減らす
					itemStack.damageItem(1, entityPlayer);
					return true;
				}

			} else if (block == Blocks.stonebrick){
				//音を鳴らす
				world.playSoundEffect(x + 0.5D, y + 0.5D, z + 0.5D, blockS.stepSound.getStepResourcePath(), (blockS.stepSound.getVolume() + 1.0F) / 2.5F, blockS.stepSound.getPitch() * 0.8F);

				if (world.isRemote) {
					return true; //クライアント側では何もせず
				} else { //サーバー側では
					//ブロックを石に置き換える
					world.setBlock(x, y, z, Blocks.cobblestone);
					//耐久値を1減らす
					itemStack.damageItem(1, entityPlayer);
					return true;
				}

			} else if(block == Blocks.brick_block) {
				//音を鳴らす
				world.playSoundEffect(x + 0.5D, y + 0.5D, z + 0.5D, blockS.stepSound.getStepResourcePath(), (blockS.stepSound.getVolume() + 1.0F) / 2.5F, blockS.stepSound.getPitch() * 0.8F);

				if (world.isRemote) {
					return true; //クライアント側では何もせず
				} else { //サーバー側では
					//ブロックを石に置き換える
					world.setBlock(x, y, z, Blocks.hardened_clay);
					//耐久値を1減らす
					itemStack.damageItem(1, entityPlayer);
					return true;
				}

			} else if(block == Blocks.hardened_clay) {
				//音を鳴らす
				world.playSoundEffect(x + 0.5D, y + 0.5D, z + 0.5D, blockS.stepSound.getStepResourcePath(), (blockS.stepSound.getVolume() + 1.0F) / 2.5F, blockS.stepSound.getPitch() * 0.8F);

				if (world.isRemote) {
					return true; //クライアント側では何もせず
				} else { //サーバー側では
					//ブロックを石に置き換える
					world.setBlock(x, y, z, Blocks.brick_block);
					//耐久値を1減らす
					itemStack.damageItem(1, entityPlayer);
					return true;
				}

			} else {
				return false;
			}
		}
	}
}

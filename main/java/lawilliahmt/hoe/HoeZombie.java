package lawilliahmt.hoe;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class HoeZombie extends ItemHoe {

	public HoeZombie(ToolMaterial toolMaterial) {
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

			//右クリックされたブロックの上が空気ブロックで、土と草と岩盤以外の不透過立方体ブロックならば
			if (side != 0 && world.getBlock(x, y + 1, z).isAir(world, x, y + 1, z) && block.isOpaqueCube() && !(block == Blocks.grass || block == Blocks.dirt || block == Blocks.bedrock)) {
				Block blockS = Blocks.farmland;
				//音を鳴らす
				world.playSoundEffect(x + 0.5D, y + 0.5D, z + 0.5D, blockS.stepSound.getStepResourcePath(), (blockS.stepSound.getVolume() + 1.0F) / 2.5F, blockS.stepSound.getPitch() * 0.8F);

				//クライアント側では何もせず
				if (world.isRemote) {
					return true;
				//サーバー側では
				} else {
					//ブロックを土に置き換える
					world.setBlock(x, y, z, Blocks.dirt);
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

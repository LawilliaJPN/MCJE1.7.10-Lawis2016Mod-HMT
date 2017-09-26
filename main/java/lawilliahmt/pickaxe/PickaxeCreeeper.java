package lawilliahmt.pickaxe;

import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class PickaxeCreeeper extends ItemPickaxe {

	public PickaxeCreeeper(ToolMaterial toolMaterial) {
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

			//右クリックされたブロックが砂ブロックならば
			if (side != 0 && (block == Blocks.sand)) {

				//クライアント側では何もせず
				if (world.isRemote) {
					return true;
				//サーバー側では
				} else {
					//ブロックを空気に置き換える
					world.setBlockToAir(x, y, z);

					//TNTを設置する
					EntityTNTPrimed entitytntprimed = new EntityTNTPrimed(world);
			        entitytntprimed.setLocationAndAngles((double)x + 0.5D, (double)y + 1, (double)z + 0.5D, 0.0F, 0.0F);
			        entitytntprimed.fuse = 40; //現れてから爆発するまでの時間(通常の半分)
			        world.spawnEntityInWorld(entitytntprimed);

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

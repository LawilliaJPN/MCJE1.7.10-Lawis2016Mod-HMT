package lawilliahmt.hoe;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.InventoryEnderChest;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class HoeEnderman extends ItemHoe {

	public HoeEnderman(ToolMaterial toolMaterial) {
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

			//右クリックしたのがブロックの底面ならば
			if(side == 0){
				InventoryEnderChest inventoryenderchest = entityPlayer.getInventoryEnderChest();
				itemStack.damageItem(3, entityPlayer);//耐久値を減少させる

				if (world.isRemote){
					return true;
			    } else {
			        entityPlayer.displayGUIChest(inventoryenderchest);
			        return true;
			    }


			//右クリックされたブロックの上が空気ブロックで、右クリックされたブロックが岩盤以外の立方体不透過ブロックならば
			} else if (side != 0 && world.getBlock(x, y + 1, z).isAir(world, x, y + 1, z) && (block.isOpaqueCube()) && !(block == Blocks.bedrock)) {

				//音を鳴らす
				Block blockS = Blocks.farmland;
				world.playSoundEffect(x + 0.5D, y + 0.5D, z + 0.5D, blockS.stepSound.getStepResourcePath(), (blockS.stepSound.getVolume() + 1.0F) / 2.5F, blockS.stepSound.getPitch() * 0.8F);

				entityPlayer.fallDistance = 0.0F;

				//クライアント側では何もせず
				if (world.isRemote) {
					return true;
				//サーバー側では
				} else {
					for(int i = 0; i < 3; i++){
						//もし対象のブロックが岩盤以外の立方体不透過ブロックならば
						Block blocki =world.getBlock(x, y - i, z);
						if(!(blocki == Blocks.bedrock) && (blocki.isOpaqueCube())){
							world.setBlockToAir(x, y - i, z);//ブロックを空気に置き換える
							itemStack.damageItem(1, entityPlayer);//耐久値を減少させる
						}
					}
					return true;
				}
			} else {
				return false;
			}
		}
	}

}
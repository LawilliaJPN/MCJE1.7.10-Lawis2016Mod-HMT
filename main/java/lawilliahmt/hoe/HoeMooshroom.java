package lawilliahmt.hoe;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class HoeMooshroom extends ItemHoe {

	public HoeMooshroom(ToolMaterial toolMaterial) {
		super(toolMaterial);
	}

	//右クリック時にブロックの変更
	@Override
	public boolean onItemUse(ItemStack itemStack, EntityPlayer entityPlayer, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
		//ブロックを取得する
		Block block = world.getBlock(x, y, z);
		Block blockA = world.getBlock(x, y + 1, z);
		Block blockS = Blocks.farmland;
		Block blockM = Blocks.red_mushroom;

		//ブロックを菌糸に置き換える効果(スニーク中)
		if(entityPlayer.isSneaking()){
			if (!entityPlayer.canPlayerEdit(x, y, z, side, itemStack)) {
				//プレイヤーが編集不可ならばfalseを返す
				return false;
			} else {
				//右クリックされたブロックの上が空気ブロックで、菌糸と岩盤以外の不透過立方体ブロックならば
				if (side != 0 && blockA.isAir(world, x, y + 1, z) && block.isOpaqueCube() && !(block == Blocks.mycelium || block == Blocks.bedrock)) {
					//音を鳴らす
					world.playSoundEffect(x + 0.5D, y + 0.5D, z + 0.5D, blockS.stepSound.getStepResourcePath(), (blockS.stepSound.getVolume() + 1.0F) / 2.5F, blockS.stepSound.getPitch() * 0.8F);


					if (world.isRemote) {
						return true;
					} else { //ブロックの置き換えはサーバー側で行う
						//ブロックを菌糸に置き換える
						world.setBlock(x, y, z, Blocks.mycelium);

						//耐久値を15減らす
						itemStack.damageItem(15, entityPlayer);
						return true;
					}
				} else {
					return false;
				}
			}

		//キノコを植える効果
		} else {
			if (!entityPlayer.canPlayerEdit(x, y + 1, z, side, itemStack)) {
				//プレイヤーが編集不可ならばfalseを返す
				return false;
			} else {
				//右クリックされたブロックの上が空気ブロックで、キノコを植えられる状態ならば
				if (side != 0 && blockA.isAir(world, x, y + 1, z) && blockM.canBlockStay(world, x, y + 1, z)) {
					if (world.isRemote) {
						return true;
					} else { //ブロックの置き換えはサーバー側で行う
						//ブロックを菌糸に置き換える
						world.setBlock(x, y + 1, z, blockM);

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
}

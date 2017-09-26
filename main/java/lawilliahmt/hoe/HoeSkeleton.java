package lawilliahmt.hoe;

import cpw.mods.fml.common.eventhandler.Event.Result;
import net.minecraft.block.Block;
import net.minecraft.block.IGrowable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.BonemealEvent;

public class HoeSkeleton extends ItemHoe{

	public HoeSkeleton(ToolMaterial toolMaterial) {
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
				Block blockA = world.getBlock(x, y + 1, z);
				Block blockS = Blocks.farmland;

				if (side != 0 && blockA.isAir(world, x, y + 1, z) && (block == Blocks.grass || block == Blocks.dirt)) {
					//音を鳴らす
					world.playSoundEffect(x + 0.5D, y + 0.5D, z + 0.5D, blockS.stepSound.getStepResourcePath(), (blockS.stepSound.getVolume() + 1.0F) / 2.5F, blockS.stepSound.getPitch() * 0.8F);

					if (world.isRemote) {
						return true;
					} else {
						world.setBlock(x, y, z, blockS);
						itemStack.damageItem(1, entityPlayer);
						return true;
					}
				} else {
					BonemealEvent event = new BonemealEvent(entityPlayer, world, block, x, y, z);
			        if (MinecraftForge.EVENT_BUS.post(event)){
			            return false;
			        }

			        if (event.getResult() == Result.ALLOW){
			        	itemStack.damageItem(1, entityPlayer);
			            return true;
			        }

			        if (!(block instanceof IGrowable)){
			        	return false;
			        } else {
			            IGrowable igrowable = (IGrowable)block;

			            if (!igrowable.func_149851_a(world, x, y, z, world.isRemote)){
			            	return false;
			            } else {
			                if (world.isRemote){
			                	return false;
			                } else {
			                    if (igrowable.func_149852_a(world, world.rand, x, y, z)){
			                        igrowable.func_149853_b(world, world.rand, x, y, z);
			                        itemStack.damageItem(1, entityPlayer);
			                    } else {
			                    	return false;
			                    }
			                }

			                return true;
			            }
			        }
                }
			}
	}
}



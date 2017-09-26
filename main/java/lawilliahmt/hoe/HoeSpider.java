package lawilliahmt.hoe;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class HoeSpider extends ItemHoe {

	public HoeSpider(ToolMaterial toolMaterial) {
		super(toolMaterial);
	}

	//右クリックで、壁を登る。
	@Override
	public boolean onItemUse(ItemStack itemStack, EntityPlayer entityPlayer, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
		if(side >= 2){
			//音を鳴らす
			Block blockS = world.getBlock(x, y, z);
			world.playSoundEffect(x + 0.5D, y + 0.5D, z + 0.5D, blockS.stepSound.getStepResourcePath(), (blockS.stepSound.getVolume() + 1.0F) / 5F, blockS.stepSound.getPitch() * 1.5F);

			entityPlayer.motionY = 0.5D;
			entityPlayer.fallDistance = 0.0F;
			itemStack.damageItem(1, entityPlayer); //耐久値を1減らす(後日調整)
			return true;
		} else {
			return false;
		}
	}
}
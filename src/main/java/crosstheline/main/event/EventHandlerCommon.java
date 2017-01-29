package crosstheline.main.event;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by Joseph on 1/16/2017.
 */
public class EventHandlerCommon {



    @SubscribeEvent
    public void blockBreakEvent(PlayerEvent.BreakSpeed event)
    {
        IBlockState blockState = event.getState();

        BlockPos blockPos = event.getPos();
        //EntityPlayer player = event.getEntityPlayer();
        World world = event.getEntityPlayer().getEntityWorld();
        float originalSpeed = event.getOriginalSpeed();
        float blockHardness = blockState.getBlockHardness(world, blockPos);
// if player has belt of control in inventory, perform the following check and action
        if (originalSpeed > (blockHardness * 30f)) {
            event.setNewSpeed(blockHardness * 30f * 0.95f);
        }
    }

}




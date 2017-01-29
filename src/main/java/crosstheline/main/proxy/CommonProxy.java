package crosstheline.main.proxy;

import crosstheline.main.event.EventHandlerCommon;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;

/**
 * Created by Joseph on 1/16/2017.
 */
public class CommonProxy {
    public void registerItemRenderer(Item item, int meta, String id){

    }

    public void registerEventHandlers() {

        System.out.println("Registering event Listeners");
        EventHandlerCommon handler = new EventHandlerCommon();
        MinecraftForge.EVENT_BUS.register(handler);
    }


}

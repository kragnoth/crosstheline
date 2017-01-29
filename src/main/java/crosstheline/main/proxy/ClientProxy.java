package crosstheline.main.proxy;

import crosstheline.main.MainModClass;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

/**
 * Created by Joseph on 1/16/2017.
 */
public class ClientProxy extends CommonProxy {
    public void registerItemRenderer(Item item, int meta, String id ){
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(MainModClass.modId + ":" + id, "inventory"));

    }
}

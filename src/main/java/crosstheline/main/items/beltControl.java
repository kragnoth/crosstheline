package crosstheline.main.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


/**
 * Created by Joseph on 1/29/2017.
 */
public class beltControl extends Item{
    public beltControl() {
        setRegistryName("belt_of_control");
        setUnlocalizedName("belt_of_control");
        GameRegistry.register(this);
    }
    @SideOnly(Side.CLIENT)
    public void initModel(){
        ModelLoader.setCustomModelResourceLocation(this,0, new ModelResourceLocation(getRegistryName(), "inventory"));
        System.out.println("Test Print:" + new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}

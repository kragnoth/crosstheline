package crosstheline.main;

/**
 * Created by Joseph on 1/16/2017.
 */

import crosstheline.main.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= MainModClass.modId, name = MainModClass.name, version = MainModClass.version, acceptedMinecraftVersions = "[1.10.2]")

public class MainModClass {
    @SidedProxy(serverSide = "crosstheline.main.proxy.CommonProxy", clientSide = "crosstheline.main.proxy.ClientProxy")
    public static CommonProxy proxy;

    public static final String modId = "crosstheline";
    public static final String name = "cross the line mod";
    public static final String version = "1.0.0";

    @Mod.Instance(modId)
    public static MainModClass instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(name + " is loading!");
        ModItems.init();
        ModItems.initModels();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.registerEventHandlers();


    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

}

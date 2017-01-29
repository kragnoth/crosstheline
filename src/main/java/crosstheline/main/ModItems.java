package crosstheline.main;

import crosstheline.main.items.beltControl;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Joseph on 1/29/2017.
 */
public class ModItems {


        public static beltControl beltofControl;

        public static void init() {
            beltofControl = new beltControl();
        }

        @SideOnly(Side.CLIENT)
        public static void initModels(){
            beltofControl.initModel();
            System.out.println("Does this ever run?");
        }


}

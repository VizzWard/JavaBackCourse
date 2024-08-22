package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Association;

import java.util.*;

class Mobile {
    public String name;
    public String ram;
    public String rom;

    Mobile(String Name, String ram, String rom) {
        this.name = name;
        this.ram = ram;
        this.rom = rom;
    }
}

class MobileStore {
    private final List<Mobile> mobiles;

    MobileStore (List<Mobile> mobiles) {
        this.mobiles = mobiles;
    }

    public List<Mobile> getTotalMobileInStore(){
        return mobiles;
    }
}

public class CompositionExample {
    public static void main (String[] args) {
        Mobile mob1 = new Mobile("Realme6","8GB", "128GB");
        Mobile mob2 = new Mobile("SAMSUNG A21S", "4GB", "128");
        Mobile mob3 = new Mobile("SAMSUNG M10", "4GB", "64GB");

        List<Mobile> mobiles = new ArrayList<Mobile>();

        mobiles.add(mob1);
        mobiles.add(mob2);
        mobiles.add(mob3);

        MobileStore store = new MobileStore(mobiles);
        List<Mobile> mob = store.getTotalMobileInStore();

        for(Mobile mb : mob){
            System.out.println("Name : " + mb.name + " RAM :" +mb.ram + " and "
                    +" ROM : " + mb.rom);
        }
    }
}
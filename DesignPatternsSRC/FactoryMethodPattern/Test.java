package FactoryMethodPattern;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        BlackSmith orcBlackSmith = new OrcBlackSmith();
        BlackSmith elveBlackSmith = new ElveBlackSmith();

        orcBlackSmith.getWeaponName("spear");
        orcBlackSmith.getWeaponName("axes");

        elveBlackSmith.getWeaponName("short sword");
        elveBlackSmith.getWeaponName("spear");

    }
}

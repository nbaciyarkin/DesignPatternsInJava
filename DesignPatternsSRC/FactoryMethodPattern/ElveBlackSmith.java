package FactoryMethodPattern;

public class ElveBlackSmith extends BlackSmith {

    private String creatureName = "Elven";

    @Override
    public Weapon getWeaponName(String type) {
        Weapon weaponType = null;

        if(type.equals("short sword")){
            weaponType = new ShortSword();
            weaponType.setDamage(10);
            System.out.println(creatureName+ "" + weaponType.toString() + " damage : " + weaponType.getDamage());
        } else if (type.equals("spear")){
            weaponType = new Spear();
            weaponType.setDamage(20);
            System.out.println(creatureName+ "" + weaponType.toString() + " damage : " + weaponType.getDamage());
        }else if (type.equals("axes")) {
            weaponType = new Axes();
            weaponType.setDamage(30);
            System.out.println(creatureName+ "" + weaponType.toString() + " damage : " + weaponType.getDamage());
        }
        return weaponType;
    }




}

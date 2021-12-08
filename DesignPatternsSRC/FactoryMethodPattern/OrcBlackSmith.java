package FactoryMethodPattern;

public class OrcBlackSmith extends BlackSmith {

    private String creatureName = "Orcish";

    @Override
    public Weapon getWeaponName(String type) {

        Weapon weaponType = null;

        if (type.equals("short sword")) {
            weaponType = new ShortSword();
           weaponType.setDamage(5);
            System.out.println(creatureName + "" + weaponType.toString() + " damage : " + weaponType.getDamage());
        } else if (type.equals("spear")) {
            weaponType = new Spear();
            weaponType.setDamage(20);
            System.out.println(creatureName + "" + weaponType.toString() + " damage : " + weaponType.getDamage());
        } else if (type.equals("axes")) {
            weaponType = new Axes();
            weaponType.setDamage(33);
            System.out.println(creatureName + "" + weaponType.toString() + " damage : " + weaponType.getDamage());

        }
        return weaponType;
    }
}

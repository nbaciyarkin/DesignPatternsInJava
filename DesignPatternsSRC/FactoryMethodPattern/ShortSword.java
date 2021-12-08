package FactoryMethodPattern;

public class ShortSword extends Weapon{

    @Override
    public void setWeaponName() {
        weaponName = "SHORT SWORD";
    }


    @Override
    public void setDamage(int i) {
        damage = i;

    }

    @Override
    public String toString() {
        return "ShortSword";
    }


}

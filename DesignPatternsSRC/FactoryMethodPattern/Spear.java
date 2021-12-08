package FactoryMethodPattern;

public class Spear extends Weapon{


    @Override
    public void setWeaponName() {
        weaponName = "SPEAR";
    }

    @Override
    public void setDamage(int i) {
        damage = i;
    }


    @Override
    public String toString() {
        return "Spear";
    }


}

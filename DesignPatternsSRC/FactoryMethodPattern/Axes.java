package FactoryMethodPattern;

public class Axes extends Weapon{

    @Override
    public void setWeaponName() {
        weaponName = "AXES";
    }

    @Override
    public void setDamage(int i) {
        damage = i;
    }

    @Override
    public String toString() {
        return "Axes";
    }

}

package FactoryMethodPattern;

public abstract class Weapon {
    protected String weaponName;
    protected int damage;

    public abstract void setWeaponName();



    public String getWeaponName() {
        return weaponName;
    }


    public  int getDamage() {
        return damage;
    }


    public abstract void setDamage(int i);
}

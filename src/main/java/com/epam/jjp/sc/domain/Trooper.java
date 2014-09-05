package com.epam.jjp.sc.domain;

public class Trooper extends Person {
    private Weapon weapon;

    public Trooper(final String name, final Gender gender, final int health) {
        super(name, gender, health);
    }

    public void setWeapon(final Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String fight(final Person target) {
        String msg = weapon.hit(target);
        if ("missed".equals(msg)) {
            msg = this.name + " missed!";
        } else {
            msg = msg + this.name;
        }
        return msg;
    }

    @Override
    public String toString() {
        return "Trooper['" + getName() + "', " + getGender() + ", " + weapon + "]";
    }

}
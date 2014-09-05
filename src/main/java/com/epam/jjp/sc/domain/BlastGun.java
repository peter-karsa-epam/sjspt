package com.epam.jjp.sc.domain;

import java.util.Random;

public class BlastGun extends Weapon {
    public BlastGun(final String name, final int damage) {
        super(name, damage);
    }

    @Override
    public String hit(Person target) {
        int shot = shootTarget();
        if (target.isHit(shot)) {
            return target.getName() + " (hp:" + target.getHealth() + ") is shot by ";
        } else {
            return "missed";
        }
    }

    private int shootTarget() {
        Random rand = new Random();
        int actualDamage = rand.nextInt(getDamage());
        return actualDamage;
    }

    @Override
    public String toString() {
        return "BlastGun[" + getName() + ", " + getDamage() + "]";
    }

}

package com.epam.jjp.sc.domain;

import java.util.Random;

public class LightSabre extends Weapon {

	public LightSabre(final String name, final int damage) {
		super(name, damage);
	}

	@Override
	public String toString() {
		return "Lightsabre[" + getName() + ", " + getDamage() + " damage] "
				+ System.identityHashCode(this);
	}

	@Override
	public String hit(Person person) {
		Random rand = new Random();
		int actualDamage = rand.nextInt(getDamage() + 1);
		person.isHit(actualDamage);
		return person.getName() + "(hp: " + person.getHealth() + ")"
				+ " is lightsabred";
	}

}

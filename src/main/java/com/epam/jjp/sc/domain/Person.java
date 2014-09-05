package com.epam.jjp.sc.domain;

public abstract class Person {
	protected String name;
	private Gender gender;
	private int health;

	public Person(String name, Gender gender, int health) {
		this.name = name;
		this.gender = gender;
		this.health = health;
	}

	public abstract String fight(final Person target);

	public String getName() {
		return this.name;
	}

	public Gender getGender() {
		return gender;
	}

	public int getHealth() {
		return health;
	}

	public boolean isHit(final int shot) {
		if (shot > 0) {
			health -= shot;
			if (health < 0) {
				health = 0;
			}
			return true;
		} else {
			return false;
		}

	}

}

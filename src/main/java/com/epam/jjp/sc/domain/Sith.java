package com.epam.jjp.sc.domain;

public class Sith extends ForceUser {
	public Sith(final String name, final Gender gender, final int health) {
		super(name, gender, ForceSide.DARK, health);
	}

}

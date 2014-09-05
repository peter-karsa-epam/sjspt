package com.epam.jjp.sc.domain;

public class Jedi extends ForceUser {

	public Jedi(final String name, final Gender gender, final int health) {
		super(name, gender, ForceSide.LIGHT, health);
	}

}

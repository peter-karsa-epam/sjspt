package com.epam.jjp.sc.domain;

public class BattleField {
	private final String name;
	private final Army[] armies;

	public BattleField(final String name, final Army[] armies) {
		this.name = name;
		this.armies = armies;
	}

	public Army[] getArmies() {
		return armies;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {		
		return name + " battle between " + getArmies();
	}	
	
}

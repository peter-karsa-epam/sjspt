package com.epam.jjp.sc.domain;

public abstract class Weapon {
	private final String name;
	private int damage;
	
	public Weapon(final String name, final int damage) {
		this.name = name;
		this.damage = damage;
	}
	
	public abstract String hit(final Person person);
	
	public String getName() {
		return name;
	}
	
	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	public int getDamage() {
		return damage;
	}
}

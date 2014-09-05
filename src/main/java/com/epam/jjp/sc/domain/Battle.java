package com.epam.jjp.sc.domain;

public abstract class Battle {
	private final String name;
	private final BattleField battleField;
	
	public Battle(final String name, final BattleField battleField) {
		this.name = name;
		this.battleField = battleField;
	}
	
	public abstract void start();

	public String getName() {
		return name;
	}

	public BattleField getBattleField() {
		return battleField;
	}
}

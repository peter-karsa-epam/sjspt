package com.epam.jjp.sc.domain;

import org.springframework.beans.factory.FactoryBean;

public class BlastGunFactoryBean extends BlastGun implements
		FactoryBean<BlastGun> {

	public BlastGunFactoryBean(int damageRange) {
		super("#" + System.nanoTime(), (int) (Math.random() * damageRange));
	}

	@Override
	public BlastGun getObject() throws Exception {
		return new BlastGun(getName(), getDamage());
	}

	@Override
	public Class<?> getObjectType() {
		return BlastGun.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

}
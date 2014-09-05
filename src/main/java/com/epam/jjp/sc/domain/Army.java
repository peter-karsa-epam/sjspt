package com.epam.jjp.sc.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class Army {
	private Person leader;
	private Map<Operation, List<Person>> soldiers = new EnumMap<Operation, List<Person>>(
			Operation.class);
	private List<ForceUser> forceUsers = new ArrayList<>();

	public Army(final Person leader, final Map<Operation, List<Person>> soldiers) {
		this.soldiers.putAll(soldiers);
		this.leader = leader;
	}

	public Person getLeader() {
		return leader;
	}

	public Map<Operation, List<Person>> getSoldiers() {
		return Collections.unmodifiableMap(soldiers);
	}

	public List<Person> getSoldierList() {
		List<Person> solList = new ArrayList<>();
		solList.addAll(soldiers.get(Operation.OFFENCE));
		solList.addAll(soldiers.get(Operation.DEFENCE));
		return solList;
	}

	public void setForceUsers(final List<ForceUser> forceUsers) {
		this.forceUsers.clear();
		this.forceUsers.addAll(forceUsers);
	}

	public List<ForceUser> getForceUsers() {
		return forceUsers;
	}

	public void replaceLeader(ForceUser forceUser) {
		leader = forceUser;

	}

}

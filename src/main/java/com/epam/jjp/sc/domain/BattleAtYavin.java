package com.epam.jjp.sc.domain;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BattleAtYavin extends Battle {
    private Army[] participants;
    private static Logger LOGGER = LoggerFactory.getLogger(BattleAtYavin.class);
    private StoreObject so = new StoreObject();

    public BattleAtYavin(final String name, final BattleField battleField) {
        super(name, battleField);
        participants = battleField.getArmies();
    }

    @Override
    public final void start() {
        boolean defIsEliminated = false;
        boolean jediIsEliminated = false;
        while (!jediIsEliminated || !defIsEliminated) {
            if (!defIsEliminated) {
                defIsEliminated = fightRound(participants[1].getSoldiers().get(Operation.OFFENCE),
                        participants[0].getSoldiers().get(Operation.DEFENCE));
                if (!defIsEliminated) {
                    defIsEliminated = fightRound(participants[0].getSoldiers().get(Operation.OFFENCE),
                            participants[1].getSoldiers().get(Operation.DEFENCE));
                }
            }
            if (!jediIsEliminated) {
                jediIsEliminated = jediFight(participants[1].getForceUsers(), participants[0].getForceUsers(), participants[0]);
                if (!jediIsEliminated) {
                    jediIsEliminated = jediFight(participants[0].getForceUsers(), participants[1].getForceUsers(), participants[1]);
                }
            }
        }
    }
    /**
     * 
     * @param attackers
     *            are the list of ForceUsers attacking in this round
     * @param defenders
     *            are the list of ForceUsers defending (getting injured) in this
     *            round
     * @param defArmy
     *            is the whole defending army, one of the participants
     * @return bool value indicating if the defending ForceUser list is empty
     */
    private boolean jediFight(List<ForceUser> attackers, List<ForceUser> defenders, Army defArmy) {
        for (int i = 0; i < attackers.size(); i++) {
            if (i < defenders.size()) {
                so.addLogBattleAction(attackers.get(i).fight(defenders.get(i)));
                if (defenders.get(i).getHealth() < 1) {
                    if (defArmy.getLeader().getName() == defenders.get(i).getName() && defenders.size() > 1) {
                        promoteLeaderJedi(defArmy, defenders);
                    }
                    removeJedi(defenders, defenders.get(i));
                    if (defenders.isEmpty()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     * 
     * @param defArmy
     *            the army, whose leader has died
     * @param defenders
     *            list of the ForceUsers, one of them will replace the dead
     *            leader
     */
    private void promoteLeaderJedi(Army defArmy, List<ForceUser> defenders) {
        defArmy.replaceLeader(defenders.get(1));
        so.addLogBattleAction(defArmy.getLeader().getName() + " has became the leader");
    }

    private boolean fightRound(List<Person> offence, List<Person> defence) {
        for (int i = 0; i < offence.size(); i++) {
            if (i < defence.size()) {
                so.addLogBattleAction(offence.get(i).fight(defence.get(i)));
                if (defence.get(i).getHealth() < 1) {
                    removeSoldier(defence, defence.get(i));
                    if (defence.isEmpty()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void removeSoldier(List<Person> defence, Person person) {
        so.addLogBattleAction(person.toString() + " died for his planet with glory!");
        defence.remove(person);
    }

    private void removeJedi(List<ForceUser> defenders, ForceUser person) {
        so.addLogBattleAction(person.toString() + " became one with the Force");
        defenders.remove(person);
    }

    private int countSurvivors(final Army army) {
        int count = army.getSoldiers().get(Operation.DEFENCE).size();
        count += army.getForceUsers().size();
        return count;
    }

    public String getWinnerArmy() {
        if (countSurvivors(participants[0]) == countSurvivors(participants[1])) {
            return "It was a draw";
        }
        if (countSurvivors(participants[0]) == 0) {
            return participants[1].getLeader().toString() + "'s army was victor ";
        } else {
            return participants[0].getLeader().toString() + "'s army was victor";
        }

    }

    public StoreObject getSo() {
        return so;
    }

    public void setSo(StoreObject so) {
        this.so = so;
    }
}

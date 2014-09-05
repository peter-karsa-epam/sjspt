package com.epam.jjp.sc.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StoreObject {
    private List<String> logBattleAction = new ArrayList<>();

    public List<String> getLogBattleAction() {
        return Collections.unmodifiableList(logBattleAction);
    }

    public void addLogBattleAction(final String log) {
        this.logBattleAction.add(log);
    }
}

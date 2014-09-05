package com.epam.jjp.sjspt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import com.epam.jjp.sc.domain.BattleAtYavin;

public class BattleTag extends SimpleTagSupport {
    private BattleAtYavin battle;

    @Override
    public void doTag() throws JspException, IOException {
        battle.start();
        List<String> details = new ArrayList<>();
        details.addAll(battle.getSo().getLogBattleAction());
        getJspContext().getOut().write("<p id='details'>");
        for (String action : details) {
            getJspContext().getOut().write(action + "<br>");
        }
        getJspContext().getOut().write("</p>");
        getJspContext().getOut().write("<h4>" + battle.getWinnerArmy() + "</h4>");
    }

    public BattleAtYavin getBattle() {
        return battle;
    }

    public void setBattle(final BattleAtYavin battle) {
        this.battle = battle;
    }
}

package com.epam.jjp.sjspt;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.epam.jjp.sc.domain.BattleAtYavin;

public class BattleDetailsTag extends SimpleTagSupport {
	private BattleAtYavin battle;

	@Override
	public void doTag() throws JspException, IOException {
		battle.start();
		List<String> details = battle.getSo().getLogBattleAction();

		JSONObject obj = new JSONObject();
		// do this differently
		//or something
		
		
		JSONArray list = new JSONArray();
		obj.put("messages", list);

		for (String string : details) {
			list.add(string + "<br>");

			// getJspContext().getOut().write(string);
			// getJspContext().getOut().write("<br>");
		}

		String result = "<hr><h4>" + battle.getWinnerArmy() + "</h4>";
		list.add(result);

		try {

			FileWriter file = new FileWriter(
					"C:\\Users\\Peter_Karsa\\workspaceEpamJava\\sjspt\\src\\main\\webapp\\details.json");
			file.write(obj.toJSONString());
			file.flush();
			file.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public BattleAtYavin getBattle() {
		return battle;
	}

	public void setBattle(final BattleAtYavin battle) {
		this.battle = battle;
	}
}

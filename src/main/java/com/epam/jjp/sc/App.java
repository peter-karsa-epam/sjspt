package com.epam.jjp.sc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.epam.jjp.sc.domain.Army;
import com.epam.jjp.sc.domain.BattleAtYavin;

/**
 * 
 * @author Peter_Karsa
 * 
 */
public class App {
    private static Logger LOGGER = LoggerFactory.getLogger(App.class);

    @SuppressWarnings("resource")
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
//        /**
//         * Setting up armies
//         */
//        Army jediArmy = context.getBean("jediArmy", Army.class);
//        Army sithArmy = context.getBean("sithArmy", Army.class);
//        /**
//         * Checking armies contents
//         */
//        LOGGER.info(jediArmy.getSoldiers().toString());
//        LOGGER.info(jediArmy.getForceUsers().toString());
//        LOGGER.info(sithArmy.getSoldiers().toString());
//        LOGGER.info(sithArmy.getForceUsers().toString());
//        /**
//         * Battle start, end
//         */
//        BattleAtYavin newBattle = context.getBean("theBigBattle", BattleAtYavin.class);
//        newBattle.start();
//        LOGGER.info(newBattle.getWinnerArmy());
    }
}

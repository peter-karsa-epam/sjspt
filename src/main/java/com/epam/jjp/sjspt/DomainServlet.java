package com.epam.jjp.sjspt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.epam.jjp.sc.domain.BattleAtYavin;

public class DomainServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private BattleAtYavin battle;

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public void init() throws ServletException {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
        battle = context.getBean("theBigBattle", BattleAtYavin.class);
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        //         BattleAtYavin sessionBattle = (BattleAtYavin) session
        //         .getAttribute("theBigBattle");

        //if (session.getAttribute("theBigBattle") == null) {
            session.setAttribute("theBigBattle", battle);
        PrintWriter writer = response.getWriter();
        writer.println("OK");
    }
}

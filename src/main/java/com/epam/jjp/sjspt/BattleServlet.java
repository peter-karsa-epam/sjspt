package com.epam.jjp.sjspt;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.epam.jjp.sc.domain.BattleAtYavin;

public class BattleServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private BattleAtYavin battle;
    private ApplicationContext context;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        context = new ClassPathXmlApplicationContext("beans1.xml");
        battle = context.getBean("theBigBattle", BattleAtYavin.class);

        HttpSession session = request.getSession();
        session.setAttribute("theBigBattle", battle);
        request.setAttribute("theBigBattle", session.getAttribute("theBigBattle"));

        RequestDispatcher viewDispatcher = request.getRequestDispatcher("/battle.jsp");
        viewDispatcher.forward(request, response);
    }
}

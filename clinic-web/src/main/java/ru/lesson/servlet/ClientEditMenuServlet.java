package ru.lesson.servlet;

import ru.lesson.servlet.storage.UserCache;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Rihn Kornak on 10.06.2017.
 */
public class ClientEditMenuServlet extends HttpServlet {
    private final String EDIT_CLIENT = "/view/EditClient.jsp";
    private final UserCache USER_CASH = UserCache.getInstance();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("client", this.USER_CASH.get(req.getParameter("name")));
        req.getRequestDispatcher(EDIT_CLIENT).forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.USER_CASH.e;
    }
}

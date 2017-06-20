package ru.lesson.servlet;

import ru.lesson.servlet.storage.UserCache;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Rihn Kornak on 12.06.2017.
 */
public class ShowClientsServlet extends HttpServlet {
    private final String SHOW_CLIENTS = "/view/showClients.jsp";
    private final UserCache USER_CASH = UserCache.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("clients", this.USER_CASH.list());
        req.getRequestDispatcher(SHOW_CLIENTS).forward(req, resp);
    }
}

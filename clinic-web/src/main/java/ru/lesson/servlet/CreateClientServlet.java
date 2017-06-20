package ru.lesson.servlet;

import ru.lesson.lessons.Client;
import ru.lesson.servlet.storage.UserCache;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Rihn Kornak on 13.06.2017.
 */
public class CreateClientServlet extends HttpServlet {
    private final String EDIT_CLIENT = "/view/EditClient";
    private final UserCache USER_CASH = UserCache.getInstance();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.USER_CASH.add(new Client(req.getParameter("name")));
        req.getRequestDispatcher(EDIT_CLIENT);
    }
}

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
public class ShowPetsServlet extends HttpServlet{
    private final String SHOW_PETS = "/view/showPets.jsp";
    private final UserCache USER_CASH = UserCache.getInstance();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("pets", this.USER_CASH.listAllPets());
        req.getRequestDispatcher(SHOW_PETS).forward(req, resp);
    }
}

package ru.lesson.servlet;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Rihn Kornak on 11.06.2017.
 * This page is a homepage for clinic. Any error will redirect here, too.
 */
public class UserViewServlet extends HttpServlet {
    private static final String USER_VIEW = "/views/UserView.jsp";


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher(USER_VIEW).forward(req, resp);
    }
}

package mx.edu.utez.controller;

import mx.edu.utez.model.dao.LugarDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@MultipartConfig
@WebServlet(name = "AxiosServlet", urlPatterns = {"/registrar"})
public class AxiosServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accion = request.getParameter("accion");
        LugarDao lugarDao = new LugarDao();
        switch (accion){
            case "lugarAdd":

                break;
        }

        response.setContentType("text/html;charset=UTF-8");
        request.getRequestDispatcher("views/agregarLugar.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.getRequestDispatcher("views/agregarLugar.jsp").forward(request, response);

    }
}

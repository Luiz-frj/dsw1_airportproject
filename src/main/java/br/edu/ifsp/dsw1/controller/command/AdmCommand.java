package br.edu.ifsp.dsw1.controller.command;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "admcommand", value = "/adm-command")
class AdmCommand extends HttpServlet{

    private final String email = "admin";
    private final String password = "admin";
    private FlightDataCollection datasource;

    public void init() throws ServletExcption{
        super.init();
        datasource = new FlightDataCollection();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        proce
    }

}
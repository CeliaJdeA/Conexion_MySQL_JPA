package servlets;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.Ingrediente;
import negocio.Calendario;
import negocio.CalendarioImpl;

@WebServlet("/listarIngredientes")
public class ListadoIngredientes extends HttpServlet{
	private Calendario calendario;

    @Override
    public void init() throws ServletException {
        super.init();
        calendario = new CalendarioImpl(); // Asegúrate de que el CalendarioImpl tenga acceso a la capa de persistencia
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Ingrediente> ingredientes = calendario.getIngredientes();
        request.setAttribute("ingredientes", ingredientes);
        request.getRequestDispatcher("/listado.jsp").forward(request, response);
    }
	
}

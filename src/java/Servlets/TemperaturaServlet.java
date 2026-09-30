package servlets;

import clases.ConversorTemperatura;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "TemperaturaServlet", urlPatterns = {"/TemperaturaServlet"})
public class TemperaturaServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        System.out.println("ENTRO AL DOPOST");

        response.setContentType("text/html;charset=UTF-8");

        String tempTexto = request.getParameter("temperatura");
        String conversion = request.getParameter("conversion");

        double temperatura = Double.parseDouble(tempTexto);

        ConversorTemperatura conversor = new ConversorTemperatura();

        double resultado = conversor.convertir(temperatura, conversion);

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body>");

        out.println("<h1>Resultado de la conversión</h1>");
        out.println("<p>Temperatura ingresada: " + temperatura + "</p>");
        out.println("<p>Resultado: " + String.format("%.2f", resultado) + "</p>");

        out.println("<br>");
        out.println("<a href='temperaturas.html'>Volver</a>");

        out.println("</body>");
        out.println("</html>");
    }
}
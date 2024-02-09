package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.PriceCalculator;

/**
 * Servlet implementation class getPriceServlet
 */
@WebServlet("/getPriceServlet")
public class getPriceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getPriceServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		/**
		 * Grabs item price and amount and then uses the object to package that and sends it to the result jsp
		 */
		String itemPrice = request.getParameter("itemPrice");
		String itemAmount = request.getParameter("itemAmount");
		
		PriceCalculator itemCost = new PriceCalculator(Double.parseDouble(itemPrice), Integer.parseInt(itemAmount));
		
		request.setAttribute("itemsTotal", itemCost);
		getServletContext().getRequestDispatcher("/result_no_tax.jsp").forward(request, response);
		
	}

}

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
@WebServlet("/getPriceTaxServlet")
public class getPriceTaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getPriceTaxServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		/**
		 * Grabs item price, amount and tax and then uses the object to package that and sends it to the result jsp
		 */
		String itemPrice = request.getParameter("itemPrice");
		String itemAmount = request.getParameter("itemAmount");
		String tax = request.getParameter("tax");
		
		PriceCalculator itemCost = new PriceCalculator(Double.parseDouble(itemPrice), Integer.parseInt(itemAmount), Double.parseDouble(tax));
		
		request.setAttribute("itemsTotal", itemCost);
		getServletContext().getRequestDispatcher("/result_with_tax.jsp").forward(request, response);
		
	}

}

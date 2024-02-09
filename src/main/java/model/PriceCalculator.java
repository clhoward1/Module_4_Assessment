/**
 * @author Cory Howard - clhoward1
 * CIS175 - Spring 2024
 * Feb 8, 2024
 */
package model;

import java.text.DecimalFormat;

public class PriceCalculator {

	private double itemPrice;
	private int itemAmount;
	private double tax;
	
	
	/**
	 * Constructors
	 */
	public PriceCalculator() {
		super();
	}

	public PriceCalculator(double itemPrice, int itemAmount) {
		super();
		setItemPrice(itemPrice);
		setItemAmount(itemAmount);
	}
	
	public PriceCalculator(double itemPrice, int itemAmount, double tax) {
		super();
		setItemPrice(itemPrice);
		setItemAmount(itemAmount);
		setTax(tax);
	}

	
	/**
	 * Getters and Setters
	 */
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	public int getItemAmount() {
		return itemAmount;
	}
	public void setItemAmount(int itemAmount) {
		this.itemAmount = itemAmount;
	}

	public String getTax() {
		DecimalFormat df = new DecimalFormat("0.00");
		String taxFormatted = df.format((tax * 100));
		return taxFormatted;
	}
	public void setTax(double tax) {
		this.tax = tax / 100;
	}
	
	
	/**
	 * Methods
	 * 
	 * Formatted as Strings for output
	 */
	public String getTotalNoTax() {
		DecimalFormat df = new DecimalFormat("0.00");
		String priceNoTax = df.format(itemPrice * itemAmount);
		return priceNoTax;
	}
	
	public String getTotalWithTax() {
		DecimalFormat df = new DecimalFormat("0.00");
		String priceWithTax = df.format(Double.parseDouble(this.getTotalNoTax()) + (Double.parseDouble(this.getTotalNoTax()) * tax));
		return priceWithTax;
	}
	
}

package fowler_05;

import java.util.*;

public class Customer {
	private String _name;
	private Vector<Rental> _rentals = new Vector<Rental>();
	public Customer (String name){
		_name = name;
	}
	public void addRental(Rental arg) {
		_rentals.addElement(arg);
	}
	public String getName (){
		return _name;
	}
	public String statement( ) {
		double totalAmount = 0;
		int bonus = 0;
		Enumeration<Rental> rentals = _rentals.elements();
		String result = "Rental Record for " + getName() + "\n";
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			bonus += each.getBonus( );

			//show figures for this rental
			result += "\t" + each.getMovie().getTitle()+ "\t" +
			String.valueOf(each.getCharge()) + "\n";
			totalAmount += each.getCharge();
		}
		//add footer lines
		result += "Amount owed is " + totalAmount+"\n";
		result += "You earned " + bonus
				+ " frequent renter points";
		return result;
	}
}

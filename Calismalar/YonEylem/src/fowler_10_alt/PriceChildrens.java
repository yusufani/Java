package fowler_10_alt;

public class PriceChildrens extends Price {
	public double getCharge( int daysRented ) {
		double result = 0;
		result += 1.5;
		if (daysRented > 3)
			result += (daysRented - 3) * 1.5;
		return result;
	}
	public int getPriceCode() {
		return Movie.CHILDRENS;
	}
}

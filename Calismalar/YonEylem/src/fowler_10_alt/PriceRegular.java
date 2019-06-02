package fowler_10_alt;

public class PriceRegular extends Price {
	public double getCharge( int daysRented ) {
		double result = 0;
		result += 2;
		if (daysRented > 2)
			result += (daysRented - 2) * 1.5;
		return result;
	}
	public int getPriceCode() {
		return Movie.REGULAR;
	}

}

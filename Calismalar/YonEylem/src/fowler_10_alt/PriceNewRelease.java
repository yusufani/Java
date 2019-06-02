package fowler_10_alt;

public class PriceNewRelease extends Price {
	public double getCharge( int daysRented ) {
		double result = 0;
		result += daysRented * 3;
		return result;
	}
	public int getBonus( int daysRented ) {
		if( daysRented > 1 )
			return 2;
		else
			return 1;
	}
	public int getPriceCode() {
		return Movie.NEW_RELEASE;
	}

}

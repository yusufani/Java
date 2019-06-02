package fowler_11_alt;

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
}

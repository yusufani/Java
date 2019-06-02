package fowler_10_alt;

public abstract class Price {
	public abstract double getCharge( int daysRented );
	public abstract int getPriceCode( );
	public int getBonus( int daysRented ) {
		return 1;
	}
}

package fowler_11_alt;

public abstract class Price {
	public abstract double getCharge( int daysRented );
	public int getBonus( int daysRented ) {
		return 1;
	}
}

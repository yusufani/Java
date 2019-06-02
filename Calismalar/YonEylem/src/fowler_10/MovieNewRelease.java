package fowler_10;

public class MovieNewRelease extends Movie {

	public MovieNewRelease(String title) {
		super(title);
	}

	public int getBonus(int daysRented) {
		if ( daysRented > 1 )
			return 2;
		else return 1;
	}

	public double getCharge(int daysRented) {
		return daysRented * 3;
	}

}

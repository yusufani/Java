package fowler_10;

public class MovieChildrens extends Movie {

	public MovieChildrens(String title) {
		super(title);
	}

	public int getBonus(int daysRented) {
		return 1;
	}

	public double getCharge(int daysRented) {
		if (daysRented > 3)
			return 1.5 + (daysRented - 3) * 1.5;
		else
			return 1.5;
	}

}

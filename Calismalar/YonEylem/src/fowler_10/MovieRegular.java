package fowler_10;

public class MovieRegular extends Movie {

	public MovieRegular(String title) {
		super(title);
	}

	public int getBonus(int daysRented) {
		return 1;
	}

	public double getCharge(int daysRented) {
		if (daysRented > 2)
			return 2 + (daysRented - 2) * 1.5;
		else
			return 2;
	}
}

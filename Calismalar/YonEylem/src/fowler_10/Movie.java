package fowler_10;

public abstract class Movie {
	private String _title;
	public Movie(String title ) {
		_title = title;
	}
	public String getTitle (){
		return _title;
	}
	public abstract double getCharge( int daysRented );
	public abstract int getBonus( int daysRented );
	
}

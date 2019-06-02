package fowler_10_alt;

public class Rental {
	private Movie _movie;
	private int _daysRented;
	public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}
	public int getDaysRented() {
		return _daysRented;
	}
	public Movie getMovie() {
		return _movie;
	}
	public double getCharge( ) {
		return _movie.getCharge( _daysRented );
	}
	public int getBonus( ) {
		return _movie.getBonus( _daysRented );
	}
	public String getMovieTitle( ) {
		return _movie.getTitle( );
	}
}

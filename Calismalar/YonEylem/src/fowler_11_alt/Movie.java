package fowler_11_alt;

/*
 * 10_alt noktas�nda Strategy tasar�m kal�b� uygulanmaya ba�l�yor.
 * Ama Refactoring konusunu tasar�m kal�plar�ndan �nce anlat�yorum.
 * Bu nedenle notlarda de�inmiyorum.
 */
public class Movie {
	private String _title;
	private Price _price;
	public Movie(String title, Price price) {
		_title = title;
		setPrice( price );
	}
	public void setPrice( Price price ) {
		_price = price;
	}
	public Price getPrice( ) {
		return _price;
	}
	public String getTitle (){
		return _title;
	}
	public double getCharge( int daysRented ) {
		return _price.getCharge( daysRented );
	}
	public int getBonus( int daysRented ) {
		return _price.getBonus( daysRented );
	}
}

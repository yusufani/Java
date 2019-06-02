package fowler_11_alt;

/*
 * 10_alt noktasýnda Strategy tasarým kalýbý uygulanmaya baþlýyor.
 * Ama Refactoring konusunu tasarým kalýplarýndan önce anlatýyorum.
 * Bu nedenle notlarda deðinmiyorum.
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

package fowler_10_alt;
/*
 * Bu noktada Strategy tasarým kalýbý uygulanmaya baþlýyor.
 * Ama Refactoring konusunu tasarým kalýplarýndan önce anlatýyorum.
 * Bu nedenle notlarda deðinmiyorum.
 */
public class Movie {
	private String _title;
	private Price _price;
	public static final int CHILDRENS = 2;
	public static final int NEW_RELEASE = 1;
	public static final int REGULAR = 0;
	public Movie(String title, int priceCode) {
		_title = title;
		setPriceCode( priceCode );
	}
	public int getPriceCode() {
		return _price.getPriceCode();
	}
	public void setPriceCode( int priceCode ) {
		switch ( priceCode ) {
			case Movie.CHILDRENS:
				_price = new PriceChildrens( );
				break;
			case Movie.NEW_RELEASE:
				_price = new PriceNewRelease( );
				break;
			default:
				_price = new PriceRegular( );
				break;
		} 
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

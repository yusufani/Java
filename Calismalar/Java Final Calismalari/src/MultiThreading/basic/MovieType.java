package MultiThreading.basic;

public enum MovieType {
    REGULAR(1, 2 ) , NEW_RELEASE ( 1,2  ) , CHILDRENS(1,2 );
    private double dailyPrice , z ;
    private MovieType ( int x , int y  ) { dailyPrice=x; z=y;}
    public double getDailyPrice(){return dailyPrice;}

    public double getZ() {
        return z;
    }
}

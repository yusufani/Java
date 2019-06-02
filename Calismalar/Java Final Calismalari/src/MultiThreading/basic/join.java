package MultiThreading.basic;


public class join {
    public static void main (String [] args  ){
        int count = 0;
        deneme xyz = new deneme(count);

        Thread x = new Thread (xyz);
        x.start();
        deneme xyz2 = new deneme(count);
        Thread y = new Thread ( xyz2);
        y.start();
        try {
            x.join();
            y.join();
        } catch (InterruptedException e) {
        }

        System.out.println("ajdad" + xyz.getSayi()+xyz2.getSayi());
    }
}
class deneme implements Runnable{
    private int sayi ;

    public int getSayi() {
        return sayi;
    }

    public deneme (int x ) {
        sayi = x;
    }

    @Override
    public void run() {
        for ( int i =0 ; i< 1000 ; i ++) {
            System.out.println(sayi + Thread.currentThread().getName());
           sayi++;
    }


}



}

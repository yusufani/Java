package MultiThreading.basic;

import java.security.spec.ECField;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main
{
    public static void main(String[] args) {
        double deger = MovieType.CHILDRENS.getDailyPrice();
        double deger2 = MovieType.NEW_RELEASE.getZ();
        System.out.println(deger +"sadasasdas"+ deger2 );

        ExecutorService pool = Executors.newCachedThreadPool();

        pool.shutdown();


    }
}

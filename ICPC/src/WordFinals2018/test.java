package WordFinals2018;

import java.util.LinkedList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int num_buses = 8;
        int num_stations = 4 ;
        int time = 1000;

        Routes routes1 = new Routes();
        routes1.from=0;
        routes1.to=1;
        routes1.departure_time=0;
        routes1.way=900;
        routes1.probability=0.2;

        Routes routes2 = new Routes();
        routes1.from=0;
        routes1.to=2;
        routes1.departure_time=100;
        routes1.way=500;
        routes1.probability=0.2;

        Routes routes3 = new Routes();
        routes1.from=2;
        routes1.to=1;
        routes1.departure_time=500;
        routes1.way=700;
        routes1.probability=1.0;

        Routes routes4 = new Routes();
        routes1.from=2;
        routes1.to=1;
        routes1.departure_time=501;
        routes1.way=701;
        routes1.probability=0.1;

        Routes routes5 = new Routes();
        routes1.from=0;
        routes1.to=3;
        routes1.departure_time=200;
        routes1.way=400;
        routes1.probability=0.5;

        Routes routes6 = new Routes();
        routes1.from=3;
        routes1.to=1;
        routes1.departure_time=500;
        routes1.way=800;
        routes1.probability=0.1;

        Routes routes7 = new Routes();
        routes1.from=3;
        routes1.to=0;
        routes1.departure_time=550;
        routes1.way=650;
        routes1.probability=0.9;

        Routes routes8 = new Routes();
        routes1.from=0;
        routes1.to=1;
        routes1.departure_time=700;
        routes1.way=900;
        routes1.probability=0.1;

        LinkedList <Routes> routes = new LinkedList<>();
        routes.add(routes1);
        routes.add(routes2);
        routes.add(routes3);
        routes.add(routes4);
        routes.add(routes5);
        routes.add(routes6);
        routes.add(routes7);
        routes.add(routes8);


    }
}

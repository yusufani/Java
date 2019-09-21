package WordFinals2018;

public class Routes {
    public int from,to;

    public Routes( ) {
    }

    public Routes(int from, int to, int departure_time, int way, Double probability) {
        this.from = from;
        this.to = to;
        if(from == to ) System.out.println("Wrong input");
        this.departure_time = departure_time;
        this.way = way;
        this.probability = probability;
    }

    public int departure_time , way;
    public Double probability;
    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public int getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(int departure_time) {
        this.departure_time = departure_time;
    }

    public int getWay() {
        return way;
    }

    public void setWay(int way) {
        this.way = way;
    }

    public Double getProbability() {
        return probability;
    }

    public void setProbability(Double probability) {
        this.probability = probability;
    }
}

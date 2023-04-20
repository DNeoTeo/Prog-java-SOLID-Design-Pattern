package exercice3.transports;

public class Truck implements Transport{
    @Override
    public void deliver(String destination) {
        System.out.println("Deliver by truck to "+destination);
    }
}

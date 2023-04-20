package exercice3.transports;

public class Ship implements Transport{
    @Override
    public void deliver(String destination) {
        System.out.println("Deliver by ship to "+destination);
    }
}

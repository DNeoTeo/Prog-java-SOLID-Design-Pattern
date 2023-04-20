package exercice3;

import exercice3.logistics.*;
import exercice3.transports.*;

public class LogisticsDemo {
    public static void main(String[] args) {
        Logistics r1 = new RoadLogistics();
        r1.planDeliery("Kiev");
        Logistics s1 = new SeaLogistics();
        s1.planDeliery("Odessa");
        Logistics t1 = new RailLogistics();
        t1.planDeliery("Lviv");
    }
}

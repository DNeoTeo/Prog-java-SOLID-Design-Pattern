package exercice3.logistics;

import exercice3.transports.*;

public class RoadLogistics extends Logistics{
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}

package exercice3.logistics;

import exercice3.transports.Ship;
import exercice3.transports.Transport;

public class SeaLogistics extends Logistics{
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}

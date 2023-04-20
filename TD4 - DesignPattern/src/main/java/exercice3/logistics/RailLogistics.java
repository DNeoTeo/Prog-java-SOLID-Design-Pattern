package exercice3.logistics;

import exercice3.transports.Train;
import exercice3.transports.Transport;

public class RailLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Train();
    }
}

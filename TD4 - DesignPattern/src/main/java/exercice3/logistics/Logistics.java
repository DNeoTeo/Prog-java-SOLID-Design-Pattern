package exercice3.logistics;

import exercice3.transports.Transport;

public abstract class Logistics {
    public void planDeliery(String destination){
        createTransport().deliver(destination);
    }
    public abstract Transport createTransport();
}

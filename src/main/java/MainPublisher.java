import clients.IVeiculoClient;
import clients.VeiculoClientImpl;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class MainPublisher {
    public static void main(String[] args) throws Exception {
        LocateRegistry.createRegistry(1099);
        IVeiculoClient server = new VeiculoClientImpl();
        Naming.bind("veiculo", server);
    }
}

package clients;

import models.Veiculo;
import services.IVeiculoService;
import services.VeiculoServiceImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class VeiculoClientImpl extends UnicastRemoteObject implements IVeiculoClient {

    IVeiculoService service = new VeiculoServiceImpl();

    public VeiculoClientImpl() throws RemoteException {
        super();
    }

    @Override
    public List<Veiculo> searchByAno(int ano) throws RemoteException {
        return service.findByAno(ano);
    }

    @Override
    public void add(Veiculo obj) throws RemoteException {
        service.save(obj);
    }
}

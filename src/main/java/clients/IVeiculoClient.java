package clients;

import models.Veiculo;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IVeiculoClient extends Remote {
    List<Veiculo> searchByAno(int ano) throws RemoteException;
    void add(Veiculo obj) throws RemoteException;
}

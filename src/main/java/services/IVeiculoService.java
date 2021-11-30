package services;

import models.Veiculo;

import java.util.List;

public interface IVeiculoService {
    List<Veiculo> findByAno(int ano);
    void save(Veiculo obj);
}

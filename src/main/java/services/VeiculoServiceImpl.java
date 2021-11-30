package services;

import models.Veiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VeiculoServiceImpl implements IVeiculoService {

    List<Veiculo> lista = new ArrayList<>();

    @Override
    public List<Veiculo> findByAno(int ano) {
        return lista.stream()
                .filter(v -> v.getAno().equals(ano))
                .collect(Collectors.toList());
    }

    @Override
    public void save(Veiculo obj) {
        this.lista.add(obj);
    }
}

package models;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Veiculo implements Serializable {

    private String nomeCLiente;
    private String marcaVeiculo;
    private Double valorVenda;
    private Integer ano;

    @Override
    public String toString() {
        return "Veiculo = {\n" +
                "nome do cliente = " + nomeCLiente + "\n" +
                "marca veículo = " + marcaVeiculo + "\n" +
                "valor de venda = " + valorVenda + "\n" +
                "ano = " + ano + "\n" +
                '}';
    }
}

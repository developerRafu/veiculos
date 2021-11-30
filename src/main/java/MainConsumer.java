import clients.IVeiculoClient;
import lombok.var;
import models.Veiculo;

import java.rmi.Naming;
import java.util.Scanner;

public class MainConsumer {
    public static void main(String[] args) throws Exception {
        String url = "rmi://localhost/veiculo";
        IVeiculoClient server = (IVeiculoClient) Naming.lookup(url);
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        while (run) {
                System.out.print("Ações:\n" +
                        "Pesquisar por ano - 1\n" +
                        "Adicionar carro - 2\n" +
                        "Sair - 3\n" +
                        "IN = ");
                String in = sc.nextLine();
                in = in.trim();
                switch (in) {
                    case "1":
                        System.out.print("Entre com o ano: ");
                        Integer ano = Integer.valueOf(sc.nextLine());
                        server.searchByAno(ano).stream().forEach(x -> System.out.println(x.toString()));
                        break;
                    case "2":
                        System.out.print("Entre com o nome do cliente: ");
                        String nomeCliente = sc.nextLine();
                        System.out.print("Entre com a marca do carro: ");
                        String marcaVeiculo = sc.nextLine();
                        System.out.print("Entre com o valor da venda: ");
                        Double valorVenda = Double.valueOf(sc.nextLine());
                        System.out.print("Entre com o ano: ");
                        Integer anoCarro = Integer.valueOf(sc.nextLine());
                        Veiculo obj = new Veiculo(nomeCliente, marcaVeiculo, valorVenda, anoCarro);
                        server.add(obj);
                        System.out.println("Carro adicionado");
                        break;
                    case "3":
                        run = false;
                        break;
                }
        }
    }
}

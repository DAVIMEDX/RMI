
package rmi;

import entidades.Produto;
import com.google.gson.Gson;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClienteRMI {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            EstoqueRemoto estoque = (EstoqueRemoto) registry.lookup("EstoqueService");

            Gson gson = new Gson();

            Produto p1 = new Produto(1, "Teclado", 10);
            Produto p2 = new Produto(2, "Mouse", 25);

            estoque.enviarProdutoJson(gson.toJson(p1));
            estoque.enviarProdutoJson(gson.toJson(p2));

            String produtosJson = estoque.listarProdutos();
            System.out.println("Lista de produtos (JSON):");
            System.out.println(produtosJson);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

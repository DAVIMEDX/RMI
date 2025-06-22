
package rmi;

import entidades.Produto;
import entidades.Estoque;
import com.google.gson.Gson;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class EstoqueRemotoImpl extends UnicastRemoteObject implements EstoqueRemoto {
    private Estoque estoque;
    private Gson gson = new Gson();

    public EstoqueRemotoImpl() throws RemoteException {
        this.estoque = new Estoque();
    }

    public String buscarProdutoPorId(int id) {
        Produto p = estoque.buscarProdutoPorId(id);
        return p != null ? gson.toJson(p) : "{}";
    }

    public void atualizarQuantidadeProduto(int id, int novaQuantidade) {
        Produto p = estoque.buscarProdutoPorId(id);
        if (p != null) {
            p.setQuantidade(novaQuantidade);
        }
    }

    public String listarProdutos() {
        return gson.toJson(estoque.getProdutos());
    }

    public void enviarProdutoJson(String produtoJson) {
        Produto produto = gson.fromJson(produtoJson, Produto.class);
        estoque.adicionarProduto(produto);
    }
}

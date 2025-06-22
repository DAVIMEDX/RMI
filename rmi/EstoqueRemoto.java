
package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface EstoqueRemoto extends Remote {
    String buscarProdutoPorId(int id) throws RemoteException;
    void atualizarQuantidadeProduto(int id, int novaQuantidade) throws RemoteException;
    String listarProdutos() throws RemoteException;
    void enviarProdutoJson(String produtoJson) throws RemoteException;
}

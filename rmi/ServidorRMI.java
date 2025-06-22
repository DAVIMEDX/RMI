
package rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServidorRMI {
    public static void main(String[] args) {
        try {
            EstoqueRemotoImpl estoque = new EstoqueRemotoImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("EstoqueService", estoque);
            System.out.println("Servidor RMI pronto.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

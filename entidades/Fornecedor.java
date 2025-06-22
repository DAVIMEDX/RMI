
package entidades;

import java.io.Serializable;

public class Fornecedor implements Serializable {
    private String nome;

    public Fornecedor(String nome) {
        this.nome = nome;
    }

    public String getNome() { return nome; }
}

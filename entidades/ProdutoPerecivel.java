
package entidades;

public class ProdutoPerecivel extends Produto {
    private String validade;

    public ProdutoPerecivel(int id, String nome, int quantidade, String validade) {
        super(id, nome, quantidade);
        this.validade = validade;
    }

    public String getValidade() {
        return validade;
    }
}

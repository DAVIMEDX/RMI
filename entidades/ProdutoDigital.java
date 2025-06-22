
package entidades;

public class ProdutoDigital extends Produto {
    private String formato;

    public ProdutoDigital(int id, String nome, int quantidade, String formato) {
        super(id, nome, quantidade);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }
}

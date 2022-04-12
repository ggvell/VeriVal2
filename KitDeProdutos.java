import java.util.Collection;

public class KitDeProdutos extends Produto {

	private Collection<Produto> produtos;

	public KitDeProdutos(int cod, String desc) {

	}

	public boolean adicionarProduto(Produto p) {
		return false;
	}

	public boolean removerProduto(Produto p) {
		return false;
	}

	public boolean isValido() {
		return false;
	}

	public int getQuantidadeProdutos() {
		return 0;
	}

	public double getValorVenda() {
		return 0;
	}

	public String toString() {
		return null;
	}

}

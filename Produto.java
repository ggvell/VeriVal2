public abstract class Produto {

	private int codigo;

	private String descricao;

	private double preco;

	public Produto(int cod, String desc, double preco) {

	}

	public abstract double getValorVenda();

	public String toString() {
		return null;
	}

}

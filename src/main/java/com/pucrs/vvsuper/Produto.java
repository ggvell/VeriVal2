package com.pucrs.vvsuper;

public abstract class Produto {

	private int codigo;			// Intervalo [1; 9999]
	private String descricao;	// Pelo menos 2 caracteres
	private double precoCusto;		// Deve ser positivo

	public Produto(int codigo, String descricao, double precoCusto) throws ProdutoInvalidoException {
		
		if (codigo >= 1 && codigo <= 9999)
			this.codigo = codigo;
		else
		throw new ProdutoInvalidoException(codigo + " código inválido. Deve estar no intervalo [1; 9999].");
		
		this.descricao = descricao;
		
		if (precoCusto > 0.0)
			this.precoCusto = precoCusto;
		else
			throw new ProdutoInvalidoException(precoCusto + " preço inválido. Deve ser positivo.");
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public abstract double valorVenda();

	public String toString() {
		return "";
	}

}

package com.pucrs.vvsuper;

public class ProdEletrodomestico extends Produto {

    private String tensao; // "110v", "220v", "bivolt"

    public ProdEletrodomestico(int codigo, String descricao, double precoCusto, String tensao) throws ProdutoInvalidoException {
        super(codigo, descricao, precoCusto);
    }

    @Override
    public double valorVenda() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
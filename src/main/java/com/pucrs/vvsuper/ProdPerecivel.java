package com.pucrs.vvsuper;

import java.util.Date;

public class ProdPerecivel extends Produto {

    public ProdPerecivel(int codigo, String descricao, double precoCusto, Date dtFab, Date dtVal) throws ProdutoInvalidoException {
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
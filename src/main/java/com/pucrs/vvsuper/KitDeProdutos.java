package com.pucrs.vvsuper;

import java.util.ArrayList;
import java.util.List;

public class KitDeProdutos extends Produto {

    private List<Produto> listaDeProdutos;


    public KitDeProdutos(int codigo, String descricao) throws ProdutoInvalidoException {
        super(codigo, descricao, Double.MAX_VALUE);  // Iniciando um kit com valor possível, porém inútil.
        listaDeProdutos = new ArrayList<Produto>();
    }

    public boolean isValido () {
        return false;
    }

    public boolean adicionarProduto (Produto produto) {
        return listaDeProdutos.add(produto);
    }

    public boolean removerProduto (Produto produto) {
        return false;
    }

    public int getQuantidade () {
        return listaDeProdutos.size();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double valorVenda() {
        double total = 0.0;

        for (Produto produto : listaDeProdutos) {
            double valItem = produto.valorVenda();

            if (produto instanceof ProdBazar) {
                valItem -= (20.0 / 100.0 * valItem);
            }
            
            total += valItem;

        }

        return total;
    }

}
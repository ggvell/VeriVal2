package com.pucrs.vvsuper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class KitDeProdutosTest {

    @Test
    public void whenNovoKitSemProdutos_thenInvalid() {
        try {
            KitDeProdutos kit = new KitDeProdutos(1, "Kit de Natal");
            assertEquals(false, kit.isValido());
        } catch (ProdutoInvalidoException e) {
            // TODO
        }

    }

    @Test
    public void kitComDoisProdutos_quantidade2 () {
        try {
            ProdBazar pb1 = new ProdBazar(10, "Caneta mágica", 2.0);
            ProdBazar pb2 = new ProdBazar(20, "Lápis mágico", 3.5);
            
            KitDeProdutos kit = new KitDeProdutos(1, "Kit de Natal");
            kit.adicionarProduto(pb1);
            kit.adicionarProduto(pb2);

            assertEquals(2, kit.getQuantidade());
            //assertEquals(true, kit.isValido());
        } catch (ProdutoInvalidoException e) {
            fail("kitComDoisProdutos_quantidade2");
        }
    }

    @Test
    public void kitComDoisProdutos_ehValido () {
        try {
            ProdBazar pb1 = new ProdBazar(10, "Caneta mágica", 2.0);
            ProdBazar pb2 = new ProdBazar(20, "Lápis mágico", 3.5);
            
            KitDeProdutos kit = new KitDeProdutos(1, "Kit de Natal");
            kit.adicionarProduto(pb1);
            kit.adicionarProduto(pb2);

            assertEquals(true, kit.isValido());
        } catch (ProdutoInvalidoException e) {
            fail("kitComDoisProdutos_quantidade2");
        }
    }


    @Test
    public void kitComDoisProdutos_valor () {
        try {
            ProdBazar pb1 = new ProdBazar(10, "Caneta mágica", 2.0);
            ProdBazar pb2 = new ProdBazar(20, "Lápis mágico", 3.5);
            
            KitDeProdutos kit = new KitDeProdutos(1, "Kit de Natal");
            kit.adicionarProduto(pb1);
            kit.adicionarProduto(pb2);

            assertEquals(4.63, kit.valorVenda(), 0.01);
        } catch (ProdutoInvalidoException e) {
            fail("kitComDoisProdutos_quantidade2");
        }
    }


}
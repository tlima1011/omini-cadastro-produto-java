package br.com.omnia.draft.app;

import br.com.omnia.draft.dao.ProdutoDao;
import br.com.omnia.draft.model.Produto;

public class TesteAdiciona {

    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.setNome("Mouse Novo Gamer 3D");
        p1.setUnidade(15);
        p1.setValor(250.00);
        new ProdutoDao().adiciona(p1);
        System.out.println("Salvo no Banco de Dados");
    }
}

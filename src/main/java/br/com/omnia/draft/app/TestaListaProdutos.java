package br.com.omnia.draft.app;

import br.com.omnia.draft.dao.ProdutoDao;
import br.com.omnia.draft.model.Produto;

import java.util.List;

public class TestaListaProdutos {

    public static void main(String[] args) {

        List<Produto> produtos = new ProdutoDao().getLista();
        System.out.println("Lista de Produtos");
        produtos.forEach(i -> System.out.println(i.getCodigo()
                + " - " + i.getNome()));
    }
}

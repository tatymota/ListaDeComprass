package tech.ada.carrinho.controller;
import com.sun.source.tree.WhileLoopTree;
import tech.ada.carrinho.model.Produto;
import tech.ada.carrinho.view.Carrinho;

import java.util.Map;

public class Controller {
    private Carrinho view;

    public void menu(){
        view = new Carrinho();
        Boolean continuar = true;

        while (continuar){
            String opcao = view.pegarOpcaoMenu();
            switch(opcao) {
                case "1" -> adicionarProduto();
                case "2" -> editarProduto();
                case "3" -> listarProduto();
                case "4" -> removerProduto();
                case "0" -> continuar = false;
                default -> System.out.println("Opção inválida");
            }
        }
    }

    public void adicionarProduto(){
        Map produto = view.pegarInformacoesProduto();
        Produto.listaProdutos.add(produto);
    }

    public void editarProduto(){

    }

    public void listarProduto(){

    }

    public void removerProduto(){

    }

}

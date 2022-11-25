package tech.ada.carrinho.view;
import tech.ada.carrinho.model.Produto;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Carrinho {
    Scanner scanner = new Scanner(System.in);
   public String pegarOpcaoMenu(){
       System.out.println("Digite a opção desejada:");
       System.out.println("1. Adicionar produto");
       System.out.println("2. Editar produto");
       System.out.println("3. Listar produtos");
       System.out.println("4. Remover produto");
       System.out.println("0. Sair");

       String opcao = scanner.next();
       return opcao;

   }

    public Map pegarInformacoesProduto() {

       Map<String, Object> produto = new HashMap<>();

       System.out.println("Digite o nome do produto: ");
       produto.put("nome", scanner.nextLine());

        System.out.println("Digite a quantidade do produto: ");
        produto.put("quantidade", scanner.nextLine());

        System.out.println("Digite o preço do produto: ");
        produto.put("preço", scanner.nextDouble());

       return produto;
    }

    public void listarProdutos(){
       for (int i = 0; i<Produto.listaProdutos.size(); i++){

           Map<String, Objects> produto = Produto.listaProdutos.get(i);

           System.out.println("Identificador:" + "i " + ", ");
           System.out.println("Nome:" + produto.get("nome") + ", ");
           System.out.println("Quantidade:" + produto.get("quantidade") + ", ");
           System.out.println("Preço:" + produto.get("preço") + ", ");
       }
    }

}

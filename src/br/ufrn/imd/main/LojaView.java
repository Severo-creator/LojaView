package br.ufrn.imd.main;


import br.ufrn.imd.domino.Produto;
import br.ufrn.imd.domino.ProdutoNaoDuravel;
import br.ufrn.imd.domino.ProdutoDuravel;
import br.ufrn.imd.domino.Deposito;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class LojaView {
	
	public static void main(String args[]) {
		ArrayList<Produto> produtosIniciais = new ArrayList<>();
		
		
		
		Date data = new Date();
		/*
		 * Cria 3 produtos durpaveis e três não duraveis
		 */
		
		ProdutoDuravel carro = new ProdutoDuravel("carro", 70000, "fiat", " ", data);
		ProdutoDuravel livro = new ProdutoDuravel("livro", 20, "aquarela", " ", data);
		ProdutoDuravel celular = new ProdutoDuravel("maça", 70000, "maça", "versão atualizada que não vai quebrar", data);
		
		ProdutoNaoDuravel chocolate = new ProdutoNaoDuravel("diamante negro", 70000, "preto", "", data);
		ProdutoNaoDuravel sabonete = new ProdutoNaoDuravel("sabonete", 70000, "homo", " ", data);
		ProdutoNaoDuravel toalha = new ProdutoNaoDuravel("toalha", 60000, "", " ", data);
		
		/*
		 * Adiciona os produtos no Array
		 */
		
		produtosIniciais.add(sabonete);
		produtosIniciais.add(carro);
		produtosIniciais.add(livro);
		produtosIniciais.add(celular);
		produtosIniciais.add(chocolate);
		produtosIniciais.add(toalha);

		/*
		 * Adiciona Array na classe Deposito
		 * 
		 */
		
		Deposito deposito = new Deposito(produtosIniciais);
		

		String nome;
		double preço;
		String marca;
		String descricao;
		
		
		
		
		Scanner sc = new Scanner(System.in);
		try{
			while(true) {
				System.out.println("Informa o que deseja.\n1.Adicionar um produto\n2.Remover um produto\n3.Ver lista dos "
						+ "produtos\n4.checar se o deposito esta vazio\n5.Achar o produto de maior preço\n");
				int opcao = Integer.parseInt(sc.nextLine());
				
				switch(opcao){
				case 1:
					System.out.println("Informe o nome do produto:\n");
					nome = sc.nextLine();
					System.out.println("Preço:\n");
					preço = Double.parseDouble(sc.nextLine());
					System.out.println("marca:\n");
					marca = sc.nextLine();
					System.out.println("descrição:\n");
					descricao = sc.nextLine();
					Produto produto = new Produto(nome, preço, marca, descricao, data);
					deposito.adicionarProduto(produto);
					break;
					
				case 2:
					System.out.println("Qual produto deseja excluir?:\n");
					nome = sc.nextLine();
					deposito.removerProduto(nome);
					break;
				case 3:
					deposito.maisCaro();
					break;
				case 4:
					if(deposito.seVazio()) {
						System.out.println("Vazio...:\n");
					}else {
						System.out.println("Possui itens...:\n");
					}
					break;
				case 5:
					System.out.println(deposito.maisCaro());
					break;
				case 0:
					System.exit(0);
				}
			}
			
		}finally{
			sc.close();
		}
	}

}

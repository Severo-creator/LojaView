package br.ufrn.imd.domino;

import java.util.ArrayList;


public class Deposito {
	private ArrayList<Produto> armazenamento;
	
	/*
	 * construtor de deposito	
	 */
	public Deposito(ArrayList<Produto> array) {
		armazenamento = array; 
	}
	/*
	 * recebe classe e adiciona em ArrayList armazenamento
	 */
	public void adicionarProduto(Produto produto) {
		
		armazenamento.add(produto);
	}
	/*
	 * recebe nome do produto e remove o produto com tal nome
	 */
	
	public void removerProduto(String nome) {
		
		for (Produto produto : armazenamento) {

			if(produto.getNome().equals(nome)) {
				armazenamento.remove(produto);
			}
		}

	}
	
	/*
	 * Printa no terminal uma lista de produtos que estão armazenados
	 */
	
	public  void listProdutos() {
		for (Produto produto : armazenamento) {
			System.out.println(produto.getNome() + "\n");
		}
		System.out.println(armazenamento.size());
	}
	
	
	/*
	 * Se não possui elemento, 
	 */
	
	public boolean seVazio(){
		if(armazenamento.size()==0) {
			return true;
		}
		return false;
	}
	
	
	public String maisCaro(){
		String i ;
		double preçom = 0;
		ArrayList<String> nomes = new ArrayList<>();
		for (Produto produto : armazenamento) {
			if(produto.getPreço() > preçom ) {	
				nomes.clear();
				nomes.add(produto.getNome());
				preçom = produto.getPreço();
			}else if(produto.getPreço() >= preçom ) {
				nomes.add(produto.getNome());
			}
		}
		
		if(nomes.size() == 0) {
			i = "Vazio...";
		}else if(nomes.size() == 1) {
			i= "O maior elemento é " + nomes.get(0);
		}else {
			i = "Os maiores elementos são ";
			for (String string : nomes) {
				i= i + string + "\n";
			}
		}
		return i + "\n";
	}
}

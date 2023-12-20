package br.ufrn.imd.domino;

import java.util.Date;

public class ProdutoDuravel extends Produto {
	private int durabilidade;
	
	public ProdutoDuravel(String nome, double preço, String marca, String descrição, Date dataFabricada) {
		super (nome, preço, marca, descrição, dataFabricada);
	}

	public int getDurabilidade() {
		return durabilidade;
	}

	public void setDurabilidade(int durabilidade) {
		this.durabilidade = durabilidade;
	}

}

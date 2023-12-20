package br.ufrn.imd.domino;

import java.util.Date;

public class ProdutoNaoDuravel extends Produto {
	private Date datavalidade;
	private String genero;
	
	public ProdutoNaoDuravel(String nome, double preço, String marca, String descrição, Date dataFabricada) {
		super (nome, preço, marca, descrição, dataFabricada);
	}
	
	public Date getDatavalidade() {
		return datavalidade;
	}
	public void setDatavalidade(Date datavalidade) {
		this.datavalidade = datavalidade;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

}

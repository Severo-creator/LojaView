package br.ufrn.imd.domino;

import java.util.Date;

public class Produto {
	private String nome;
	private double preço;
	private String marca;
	private String descrição;
	private Date dataFabricada;
	
	public Produto(String nome, double preço, String marca, String descrição, Date dataFabricada) {
		this.nome = nome;
		this.preço = preço;
		this.marca = marca;
		this.descrição = descrição;
		this.dataFabricada =dataFabricada;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

	public Date getDataFabricada() {
		return dataFabricada;
	}

	public void setDataFabricada(Date dataFabricada) {
		this.dataFabricada = dataFabricada;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

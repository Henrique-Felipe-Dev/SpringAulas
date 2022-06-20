package com.generation.crudvideogame.model;

public class VideoGame {
	
	private String nome;
	private String marca;
	private String cor;
	private boolean internet;
	
	public VideoGame() {
		super();
	}
	
	public VideoGame(String nome, String marca, String cor, boolean internet) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.cor = cor;
		this.internet = internet;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isInternet() {
		return internet;
	}

	public void setInternet(boolean internet) {
		this.internet = internet;
	}
	
	
	

}

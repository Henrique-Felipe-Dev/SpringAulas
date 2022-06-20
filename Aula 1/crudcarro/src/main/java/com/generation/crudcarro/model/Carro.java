package com.generation.crudcarro.model;

public class Carro {
	
	private String marca;
	private String cor;
	private boolean calibrado;
	
	public Carro() {
		super();
	}
	
	public Carro(String marca, String cor, boolean calibrado) {
		super();
		this.marca = marca;
		this.cor = cor;
		this.calibrado = calibrado;
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

	public boolean isCalibrado() {
		return calibrado;
	}

	public void setCalibrado(boolean calibrado) {
		this.calibrado = calibrado;
	}
	
}

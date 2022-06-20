package com.generation.crudcasa.model;

public class Casa {
	
	private String cor;
	private int numLuzes;
	private int portas;
	
	public Casa() {
		super();
	}
	
	public Casa(String cor, int numLuzes, int portas) {
		super();
		this.cor = cor;
		this.numLuzes = numLuzes;
		this.portas = portas;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getNumLuzes() {
		return numLuzes;
	}
	public void setNumLuzes(int numLuzes) {
		this.numLuzes = numLuzes;
	}
	public int getPortas() {
		return portas;
	}
	public void setPortas(int portas) {
		this.portas = portas;
	}

}

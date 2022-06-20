package com.generation.crudprato.model;

public class PratoComida {
	
	private String cor;
	private boolean arroz;
	private boolean feijao;
	private String mistura;
	
	public PratoComida() {
		super();
	}
	
	
	public PratoComida(String cor, boolean arroz, boolean feijao, String mistura) {
		super();
		this.cor = cor;
		this.arroz = arroz;
		this.feijao = feijao;
		this.mistura = mistura;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public boolean isArroz() {
		return arroz;
	}


	public void setArroz(boolean arroz) {
		this.arroz = arroz;
	}


	public boolean isFeijao() {
		return feijao;
	}


	public void setFeijao(boolean feijao) {
		this.feijao = feijao;
	}


	public String getMistura() {
		return mistura;
	}


	public void setMistura(String mistura) {
		this.mistura = mistura;
	}
	
	
	
	

}

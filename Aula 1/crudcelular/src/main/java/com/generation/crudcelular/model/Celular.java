package com.generation.crudcelular.model;

public class Celular {
	
	private String so;
	private double memoria;
	private int ram;
	private boolean biometria;
	
	public Celular() {
		super();
	}
	
	public Celular(String so, double memoria, int ram, boolean biometria) {
		super();
		this.so = so;
		this.memoria = memoria;
		this.ram = ram;
		this.biometria = biometria;
	}

	public String getSo() {
		return so;
	}

	public void setSo(String so) {
		this.so = so;
	}

	public double getMemoria() {
		return memoria;
	}

	public void setMemoria(double memoria) {
		this.memoria = memoria;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public boolean isBiometria() {
		return biometria;
	}

	public void setBiometria(boolean biometria) {
		this.biometria = biometria;
	}

}

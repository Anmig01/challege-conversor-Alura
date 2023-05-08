package com.conversor.temperatura.model;

public abstract class Temperatura {
	protected double valor;
	
	public Temperatura() {
		
	}
	
	public abstract double getValor();

	public abstract void setValor(double valor);
	
	public double convertTo(Temperatura temperatura,double factor) {
		return this.getValor()*factor;
		
	}
}

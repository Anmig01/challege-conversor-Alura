package com.conversor.moneda.model;

public abstract class Moneda {
	protected double valor;
	
	public Moneda() {
		
	}

	
	public abstract double getValor();
	public abstract void setValor(double valor);
	
	public double convertTo(Moneda moneda, double factor){
		return this.getValor()*factor;
	}

}

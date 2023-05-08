package com.conversor.temperatura.model;

public class Celsius extends Temperatura {
	
	public Celsius() {
		
	}

	@Override
	public double getValor() {
		return this.valor;
	}

	@Override
	public void setValor(double valor) {
		this.valor = valor;
	}

}

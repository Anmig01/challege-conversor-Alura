package com.conversor.temperatura.model;

public class Fahrenheit extends Temperatura {
	
	public Fahrenheit() {
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

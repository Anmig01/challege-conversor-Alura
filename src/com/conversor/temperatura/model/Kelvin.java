package com.conversor.temperatura.model;

public class Kelvin extends Temperatura {
	
	public Kelvin() {
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

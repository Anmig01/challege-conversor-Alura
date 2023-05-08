package com.conversor.moneda.model;

public class GBP extends Moneda {

	public GBP() {
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

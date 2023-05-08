package com.conversor.moneda.model;

public class YEN extends Moneda {

	public YEN() {

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

package com.conversor.moneda.model;

public class COP extends Moneda{
	
	
	public COP() {
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

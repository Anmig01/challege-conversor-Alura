package com.conversor.moneda.model;

public class USD extends Moneda {
	
	public USD() {
		
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

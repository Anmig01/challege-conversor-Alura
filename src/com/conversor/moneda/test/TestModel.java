package com.conversor.moneda.test;
import com.conversor.moneda.model.*;
import com.conversor.moneda.view.MenuConversorMoneda;

public class TestModel {
	
	public static void main(String[] args) {
		double valorToConvert = 100;
		Moneda cop = new COP();
		Moneda usd = new USD();
		Moneda euro = new EURO();
		Moneda gbp = new GBP();
		Moneda yen = new YEN();
		Moneda won = new WON();
		
		cop.setValor(2);
		System.out.println(cop.convertTo(usd,4527.05));	// el metodo convertTo devuelve un double y tiene dos parametrso
														// uno de tipo moneda y el segundo el factor de conversion
		System.out.println(cop.getValor());
		//MenuConversorMoneda menuTest = new MenuConversorMoneda();
		//menuTest.setVisible(true);
		//System.out.println(menuTest.selectedComboBox());
		

	}

}

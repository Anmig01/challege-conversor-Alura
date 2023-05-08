package com.conversor.temperatura.controller;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.conversor.temperatura.model.*;

public class ControllerTemperatura {
	// Esta clase se encarga de recoger la informacion del menu
		// y pasarla a los modelos. Para eso necesito instanciar las
		// las clases de la moneda y usar el metodo convertTo
		

		
		private String selectionComboBox;
		
		//Model
		private Temperatura celsius = new Celsius();
		private Temperatura kelvin = new Fahrenheit();
		private Temperatura fahrenheit = new Kelvin();

		private double valorToConvert;
		//----------------------------------
		private double valorConverted;
		
		//-----view superior-----
		public void setValue(JTextField Txtfield) {
			this.valorToConvert = Double.valueOf(Txtfield.getText());
		}
		//----view inferior------
		public String getValueConverted() {
			return String.valueOf(getValue());
		}
		//------model superior-----
		
		public void setValueModel(Temperatura temperatura) {
			temperatura.setValor(this.valorToConvert);
		}
		
		//-----model inferior-----
		
		public double getValue() {
			if(getSelectionComboBox() != "SELECCIONE") {
				setValueModel(celsius);
				setValueModel(kelvin);
				setValueModel(fahrenheit);
				switch (getSelectionComboBox()) {
				case "De Celsius a Fahrenheit":
					this.valorConverted = celsius.convertTo(fahrenheit, ((1.8)+(32/this.valorToConvert)));
					break;
				case "De Celsius a Kelvin":
					this.valorConverted = celsius.convertTo(kelvin, (1+(273.15/this.valorToConvert)));
					break;
				case "De Fahrenheit a Celsius":
					this.valorConverted = fahrenheit.convertTo(celsius, ((5.0/9)*(1-(32.0/this.valorToConvert))));
					break;
				case "De Fahrenheit a Kelvin":
					this.valorConverted = fahrenheit.convertTo(kelvin, ((5.0/9*(1-(32.0/this.valorToConvert)))+(273.15/this.valorToConvert)));
					break;
				case "De Kelvin a Fahrenheit":
					this.valorConverted = kelvin.convertTo(fahrenheit, ((1.8*(1-(273.15/this.valorToConvert)))+(32.0/this.valorToConvert)));
					break;
					//----------------------------
				case "De Kelvin a Celsius":
					this.valorConverted = kelvin.convertTo(celsius, (1-(273.15/this.valorToConvert)) );
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opcion Invalida");
					break;
				}
				
			}
			else {
				JOptionPane.showMessageDialog(null,"Seleccione una opcion");
				return 0;
			}
			return this.valorConverted;
		}
		
		
		
		
		public void setSelectionComboBox(JComboBox<String> selectedComboBox) {
			this.selectionComboBox = (String)selectedComboBox.getSelectedItem();	
		}
		public String getSelectionComboBox() {
			return this.selectionComboBox;
		}
		
}

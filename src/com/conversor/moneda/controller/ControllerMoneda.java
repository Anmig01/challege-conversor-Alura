package com.conversor.moneda.controller;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.conversor.moneda.model.*;

public class ControllerMoneda {
	// Esta clase se encarga de recoger la informacion del menu
	// y pasarla a los modelos. Para eso necesito instanciar las
	// las clases de la moneda y usar el metodo convertTo
	
	private double usd_to_cop = 4527.05;
	private double euro_to_cop = 4993.68;
	private double gbp_to_cop = 5715.40;
	private double yen_to_cop = 33.60;
	private double won_to_cop = 3.43;
	
	private String selectionComboBox;
	//
	private Moneda cop = new COP();
	private Moneda usd = new USD();
	private Moneda euro = new EURO();
	private Moneda gbp = new GBP();
	private Moneda yen = new YEN();
	private Moneda won = new WON();
	//----------------------------
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
	
	public void setValueModel(Moneda moneda) {
		moneda.setValor(this.valorToConvert);
	}
	
	//-----model inferior-----
	
	public double getValue() {
		if(getSelectionComboBox() != "SELECCIONE") {
			setValueModel(cop);
			setValueModel(usd);
			setValueModel(euro);
			setValueModel(gbp);
			setValueModel(yen);
			setValueModel(won);
			switch (getSelectionComboBox()) {
			case "De peso a dolar":
				this.valorConverted = cop.convertTo(usd, 1/usd_to_cop);
				break;
			case "De peso a euro":
				this.valorConverted = cop.convertTo(euro, 1/euro_to_cop);
				break;
			case "De peso a libra esterlina":
				this.valorConverted = cop.convertTo(gbp, 1/gbp_to_cop);
				break;
			case "De peso a yen":
				this.valorConverted = cop.convertTo(yen, 1/yen_to_cop);
				break;
			case "De peso a won":
				this.valorConverted = cop.convertTo(won, 1/won_to_cop);
				break;
				//----------------------------
			case "De dolar a peso":
				this.valorConverted = usd.convertTo(cop, usd_to_cop);
				break;
			case "De euro a peso":
				this.valorConverted = euro.convertTo(cop, euro_to_cop);
				break;
			case "De libra esterlina a peso":
				this.valorConverted = gbp.convertTo(cop, gbp_to_cop);
				break;
			case "De yen a peso":
				this.valorConverted = yen.convertTo(cop, yen_to_cop);
				break;
			case "De won a peso":
				this.valorConverted = won.convertTo(cop, won_to_cop);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcion Invalida");
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

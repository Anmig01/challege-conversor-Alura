package com.conversor.temperatura.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.conversor.MenuPrincipal;
import com.conversor.moneda.controller.ControllerMoneda;
import com.conversor.temperatura.controller.ControllerTemperatura;

public class MenuConversorTemperatura extends JFrame {

	private JPanel contentPane;
	private JTextField TxtToConvert;
	private JTextField TxtConverted;
	private JComboBox<String> comboBOpciones;
	private ControllerTemperatura controlador = new ControllerTemperatura();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuConversorTemperatura frame = new MenuConversorTemperatura();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuConversorTemperatura() {
		setBackground(new Color(0, 157, 79));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 497, 404);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(81, 81, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel LblTituloMoneda = new JLabel("Conversor De Temperatura");
		LblTituloMoneda.setBounds(80, 11, 391, 38);
		LblTituloMoneda.setForeground(new Color(235, 235, 235));
		LblTituloMoneda.setBackground(new Color(255, 255, 255));
		LblTituloMoneda.setFont(new Font("Tahoma", Font.PLAIN, 31));
		contentPane.add(LblTituloMoneda);
		
		this.comboBOpciones = new JComboBox<String>();
		String opciones[] = new String[] {"SELECCIONE","De Celsius a Fahrenheit","De Celsius a Kelvin",
				"De Fahrenheit a Celsius","De Fahrenheit a Kelvin","De Kelvin a Fahrenheit",
				"De Kelvin a Celsius"};
		comboBOpciones.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBOpciones.setBounds(192, 147, 139, 38);
		comboBOpciones.setModel(new DefaultComboBoxModel<>(opciones));
		contentPane.add(comboBOpciones);
		
		TxtToConvert = new JTextField();
		TxtToConvert.setFont(new Font("Tahoma", Font.PLAIN, 17));
		TxtToConvert.setHorizontalAlignment(SwingConstants.RIGHT);
		TxtToConvert.setBounds(137, 77, 249, 38);
		contentPane.add(TxtToConvert);
		TxtToConvert.setColumns(10);
		
		TxtConverted = new JTextField();
		TxtConverted.setFont(new Font("Tahoma", Font.PLAIN, 17));
		TxtConverted.setHorizontalAlignment(SwingConstants.RIGHT);
		TxtConverted.setBounds(137, 211, 249, 38);
		contentPane.add(TxtConverted);
		TxtConverted.setColumns(10);
		
		JButton BtnConvertir = new JButton("CONVERTIR");
		BtnConvertir.setFont(new Font("Tahoma", Font.BOLD, 15));
		BtnConvertir.setBounds(192, 292, 139, 38);
		BtnConvertir.addActionListener(e->pressBtnConvertir()); //pressButton()
		contentPane.add(BtnConvertir);
		
		JButton BtnAtras = new JButton("<-");
		BtnAtras.setForeground(new Color(255, 255, 255));
		BtnAtras.setBackground(new Color(0,0,0));
		BtnAtras.setOpaque(false);
		BtnAtras.setFocusPainted(false);
		BtnAtras.setContentAreaFilled(false);
		BtnAtras.setBorderPainted(false);
		BtnAtras.setFont(new Font("Tahoma", Font.BOLD, 18));
		BtnAtras.setBounds(0, 0, 60, 38);
		BtnAtras.addActionListener(e->pressBtnAtras(BtnAtras));
	
		contentPane.add(BtnAtras);
	}

	private void pressBtnAtras(JButton btn) {
		btn.setBorderPainted(true);
		this.setVisible(false);
		MenuPrincipal menuPrincipal = new MenuPrincipal();
		menuPrincipal.setVisible(true);
		
	}

	private void pressBtnConvertir() {
		this.controlador.setValue(TxtToConvert);
		this.selectedComboBox();
	}
	public void selectedComboBox() {
		//envia
		this.controlador.setSelectionComboBox(comboBOpciones);
		//recive
		this.TxtConverted.setText(controlador.getValueConverted());
	}
}

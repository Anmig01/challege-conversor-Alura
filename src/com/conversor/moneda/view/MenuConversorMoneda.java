package com.conversor.moneda.view;

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

public class MenuConversorMoneda extends JFrame {

	private JPanel contentPane;
	private JTextField TxtToConvert;
	private JTextField TxtConverted;
	private JComboBox<String> comboBOpciones;
	private ControllerMoneda controlador = new ControllerMoneda();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuConversorMoneda frame = new MenuConversorMoneda();
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
	public MenuConversorMoneda() {
		setBackground(new Color(0, 157, 79));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 497, 404);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 157, 79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel LblTituloMoneda = new JLabel("Conversor De Moneda");
		LblTituloMoneda.setBounds(104, 11, 301, 38);
		LblTituloMoneda.setForeground(new Color(235, 235, 235));
		LblTituloMoneda.setBackground(new Color(255, 255, 255));
		LblTituloMoneda.setFont(new Font("Tahoma", Font.PLAIN, 31));
		contentPane.add(LblTituloMoneda);
		
		this.comboBOpciones = new JComboBox<String>();
		String opciones[] = new String[] {"SELECCIONE","De peso a dolar","De peso a euro",
				"De peso a libra esterlina","De peso a yen","De peso a won",
				"De dolar a peso","De euro a peso","De libra esterlina a peso",
				"De yen a peso","De won a peso"};
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
		BtnAtras.setBounds(10, 13, 60, 38);
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
		this.controlador.setSelectionComboBox(comboBOpciones);
		this.TxtConverted.setText(controlador.getValueConverted());
	}
}

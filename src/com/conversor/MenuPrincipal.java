package com.conversor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.conversor.moneda.view.MenuConversorMoneda;
import com.conversor.temperatura.view.MenuConversorTemperatura;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class MenuPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
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
	public MenuPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 497, 404);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel LblMenuPrincipal = new JLabel("MENU PRINCIPAL");
		LblMenuPrincipal.setForeground(new Color(49, 49, 49));
		LblMenuPrincipal.setHorizontalAlignment(SwingConstants.CENTER);
		LblMenuPrincipal.setFont(new Font("Tahoma", Font.BOLD, 22));
		LblMenuPrincipal.setBounds(108, 24, 270, 47);
		contentPane.add(LblMenuPrincipal);
		
		JButton BtnConversorMoneda = new JButton("Conversor Moneda");
		BtnConversorMoneda.setFont(new Font("Tahoma", Font.PLAIN, 17));
		BtnConversorMoneda.setBounds(136, 122, 214, 52);
		BtnConversorMoneda.addActionListener(e -> abriConversorMoneda());
		contentPane.add(BtnConversorMoneda);
		
		JButton BtnConversorTemperatura = new JButton("Conversor Temperatura");
		BtnConversorTemperatura.setFont(new Font("Tahoma", Font.PLAIN, 17));
		BtnConversorTemperatura.setBounds(136, 227, 214, 53);
		BtnConversorTemperatura.addActionListener(e->abriConversorTemperatura());
		contentPane.add(BtnConversorTemperatura);
	}
	public void abriConversorMoneda() {
		this.setVisible(false);
		MenuConversorMoneda menuConversorMoneda = new MenuConversorMoneda();
		menuConversorMoneda.setVisible(true);
		
	}
	public void abriConversorTemperatura() {
		this.setVisible(false);
		MenuConversorTemperatura menuConversorTemperatura = new MenuConversorTemperatura();
		menuConversorTemperatura.setVisible(true);
		
	}
	
}

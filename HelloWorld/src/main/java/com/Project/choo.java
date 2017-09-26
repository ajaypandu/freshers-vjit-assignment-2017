package com.Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class choo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					choo frame = new choo();
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
	public choo() {
		getContentPane().setBackground(new Color(135, 206, 250));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("INDIAN");
		btnNewButton.setBackground(new Color(255, 255, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IndianTable Table1= new IndianTable();
				Table1.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(53, 96, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CHINESE");
		btnNewButton_1.setBackground(new Color(255, 255, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
	
				ChineseTable Table1= new ChineseTable();
				Table1.setVisible(true);
				
				
				
			}
		});
		btnNewButton_1.setBounds(235, 96, 89, 23);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ITALIAN");
		btnNewButton_2.setBackground(new Color(255, 255, 0));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 			
			{
			ItalianTable Table1= new ItalianTable();
			Table1.setVisible(true);
			
			
				
				
			}
		});
		btnNewButton_2.setBounds(53, 177, 89, 23);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("MALAYSIAN");
		btnNewButton_3.setBackground(new Color(255, 255, 0));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MalaysianTable Table1= new MalaysianTable();
				Table1.setVisible(true);
				
			}
		});
		btnNewButton_3.setBounds(235, 177, 89, 23);
		getContentPane().add(btnNewButton_3);
		
		JLabel lblWelcomeToThe = new JLabel("WELCOME TO THE RUBICON RED CHILLIES RESTAURANT");
		lblWelcomeToThe.setFont(lblWelcomeToThe.getFont().deriveFont(lblWelcomeToThe.getFont().getStyle() | Font.BOLD, lblWelcomeToThe.getFont().getSize() + 2f));
		lblWelcomeToThe.setBackground(new Color(0, 0, 0));
		lblWelcomeToThe.setBounds(38, 11, 396, 14);
		getContentPane().add(lblWelcomeToThe);
		
		JLabel lblChooseYourCusine = new JLabel("Choose your Cuisine");
		lblChooseYourCusine.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblChooseYourCusine.setBounds(138, 46, 149, 34);
		getContentPane().add(lblChooseYourCusine);
	}

}

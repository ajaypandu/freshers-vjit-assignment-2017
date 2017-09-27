package com.Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class iorder extends JFrame {

	private JPanel contentPane;
	private JTextField txtFriedRice;
	private JTextField txtManchuria;
	private JTextField txtCost;
	
	public double  =50;
	public double FriedRice=60;
	
Manchuria
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					iorder frame = new iorder();
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
	public iorder() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox chckbxFriedRice = new JCheckBox("fired rice");
		chckbxFriedRice.setBounds(24, 39, 97, 23);
		contentPane.add(chckbxFriedRice);
		
		JCheckBox chckbxManchuria = new JCheckBox("manchuria");
		chckbxManchuria.setBounds(24, 102, 97, 23);
		contentPane.add(chckbxManchuria);
		
		txtFriedRice = new JTextField();
		txtFriedRice.setBounds(180, 40, 86, 20);
		contentPane.add(txtFriedRice);
		txtFriedRice.setColumns(10);
		
		txtManchuria = new JTextField();
		txtManchuria.setBounds(180, 103, 86, 20);
		contentPane.add(txtManchuria);
		txtManchuria.setColumns(10);
		
		
		 
		JButton btnNewButton = new JButton("bill");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double mCost=Manchuria*Double.parseDouble(txtManchuria.getText());
				double frCost=FriedRice*Double.parseDouble(txtFriedRice.getText());
				
				double Total= mCost+frCost;
				
				String T= String.format("Rs %.2f", Total);
				 
				txtCost.setText(T);

			}
		});
		btnNewButton.setBounds(125, 169, 89, 23);
		contentPane.add(btnNewButton);
		
		txtCost = new JTextField();
		txtCost.setBounds(128, 217, 86, 20);
		contentPane.add(txtCost);
		txtCost.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("cost=");
		lblNewLabel.setBounds(93, 220, 46, 14);
		contentPane.add(lblNewLabel);
	}
}

package com.Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class MaOrder {

	private JFrame frame;
	private JTextField txtKerabuSalad;
	private JTextField txtKaripapPusing;
	private JTextField txtPrawnFritters;
	private JTextField txtSatay;
	private JTextField txtAcar;
	private JTextField txtKampungFriedRice;
	private JTextField txtChowFriedRice;
	private JTextField txtAiskacang;
	private JTextField txtGorengPisang;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void NewScreen3() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MaOrder window = new MaOrder();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MaOrder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				txtKerabuSalad.setEnabled(false);
				txtKaripapPusing.setEnabled(false);
				txtPrawnFritters.setEnabled(false);                                     //
				txtSatay.setEnabled(false);
				txtAcar.setEnabled(false);
				txtKampungFriedRice.setEnabled(false);
				txtChowFriedRice.setEnabled(false);
				txtAiskacang.setEnabled(false);
				txtGorengPisang.setEnabled(false);
				
			}
		});
		frame.setBounds(0, 0, 1000, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MALAYSIAN MENU");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(427, 11, 218, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("STARTERS");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 81, 126, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JCheckBox chckbxKerabuSalad = new JCheckBox("KerabuSalad");
		chckbxKerabuSalad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxKerabuSalad.isSelected())                                //
				{
					txtKerabuSalad.setEnabled(true);
					txtKerabuSalad.setText("0");
					txtKerabuSalad.requestFocus();
				}
				else
				{
					txtKerabuSalad.setEnabled(false);
					txtKerabuSalad.setText("");
				}                                                                //
				
			}
		});
		chckbxKerabuSalad.setBounds(10, 131, 126, 23);
		frame.getContentPane().add(chckbxKerabuSalad);
		
		txtKerabuSalad = new JTextField();
		txtKerabuSalad.setBounds(136, 132, 32, 20);
		frame.getContentPane().add(txtKerabuSalad);
		txtKerabuSalad.setColumns(10);
		
		JCheckBox chckbxKaripapPusing = new JCheckBox("KaripapPusing");
		chckbxKaripapPusing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxKaripapPusing.isSelected())                                //
				{
					txtKaripapPusing.setEnabled(true);
					txtKaripapPusing.setText("0");
					txtKaripapPusing.requestFocus();
				}
				else
				{
					txtKaripapPusing.setEnabled(false);
					txtKaripapPusing.setText("");
				}                                                                //
				
			}
		});
		chckbxKaripapPusing.setBounds(290, 131, 126, 23);
		frame.getContentPane().add(chckbxKaripapPusing);
		
		txtKaripapPusing = new JTextField();
		txtKaripapPusing.setBounds(417, 132, 32, 20);
		frame.getContentPane().add(txtKaripapPusing);
		txtKaripapPusing.setColumns(10);
		
		JCheckBox chckbxPrawnFritters = new JCheckBox("PrawnFritters");
		chckbxPrawnFritters.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxPrawnFritters.isSelected())                                //
				{
					txtPrawnFritters.setEnabled(true);
					txtPrawnFritters.setText("0");
					txtPrawnFritters.requestFocus();
				}
				else
				{
					txtPrawnFritters.setEnabled(false);
					txtPrawnFritters.setText("");
				}                                                                //
			}
		});
		chckbxPrawnFritters.setBounds(547, 131, 126, 23);
		frame.getContentPane().add(chckbxPrawnFritters);
		
		txtPrawnFritters = new JTextField();
		txtPrawnFritters.setBounds(696, 132, 32, 20);
		frame.getContentPane().add(txtPrawnFritters);
		txtPrawnFritters.setColumns(10);
		
		JCheckBox chckbxSatay = new JCheckBox("Satay");
		chckbxSatay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSatay.isSelected())                                //
				{
					txtSatay.setEnabled(true);
					txtSatay.setText("0");
					txtSatay.requestFocus();
				}
				else
				{
					txtSatay.setEnabled(false);
					txtSatay.setText("");
				}                                                                //
				
			}
		});
		chckbxSatay.setBounds(790, 131, 64, 23);
		frame.getContentPane().add(chckbxSatay);
		
		txtSatay = new JTextField();
		txtSatay.setBounds(860, 132, 32, 20);
		frame.getContentPane().add(txtSatay);
		txtSatay.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("MAIN COURSE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(10, 194, 126, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JCheckBox chckbxAcar = new JCheckBox("Acar");
		chckbxAcar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxAcar.isSelected())                                //
				{
					txtAcar.setEnabled(true);
					txtAcar.setText("0");
					txtAcar.requestFocus();
				}
				else
				{
					txtAcar.setEnabled(false);
					txtAcar.setText("");
				}                                                                //
			}
		});
		chckbxAcar.setBounds(6, 242, 97, 23);
		frame.getContentPane().add(chckbxAcar);
		
		txtAcar = new JTextField();
		txtAcar.setBounds(104, 243, 32, 20);
		frame.getContentPane().add(txtAcar);
		txtAcar.setColumns(10);
		
		JCheckBox chckbxKampungFriedRice = new JCheckBox("KampungFriedRice");
		chckbxKampungFriedRice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxKampungFriedRice.isSelected())                                //
				{
					txtKampungFriedRice.setEnabled(true);
					txtKampungFriedRice.setText("0");
					txtKampungFriedRice.requestFocus();
				}
				else
				{
					txtKampungFriedRice.setEnabled(false);
					txtKampungFriedRice.setText("");
				}                                                                //
			}
		});
		chckbxKampungFriedRice.setBounds(226, 242, 140, 23);
		frame.getContentPane().add(chckbxKampungFriedRice);
		
		txtKampungFriedRice = new JTextField();
		txtKampungFriedRice.setBounds(384, 243, 32, 21);
		frame.getContentPane().add(txtKampungFriedRice);
		txtKampungFriedRice.setColumns(10);
		
		JCheckBox chckbxChowFriedRice = new JCheckBox("ChowFriedRice");
		chckbxChowFriedRice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxChowFriedRice.isSelected())                                //
				{
					txtChowFriedRice.setEnabled(true);
					txtChowFriedRice.setText("0");
					txtChowFriedRice.requestFocus();
				}
				else
				{
					txtChowFriedRice.setEnabled(false);
					txtChowFriedRice.setText("");
				}                                                                //
			}
		});
		chckbxChowFriedRice.setBounds(548, 242, 125, 23);
		frame.getContentPane().add(chckbxChowFriedRice);
		
		txtChowFriedRice = new JTextField();
		txtChowFriedRice.setBounds(692, 243, 32, 20);
		frame.getContentPane().add(txtChowFriedRice);
		txtChowFriedRice.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("DESERT");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(10, 301, 93, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JCheckBox chckbxAiskacang = new JCheckBox("Aiskacang");
		chckbxAiskacang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxAiskacang.isSelected())                                //
				{
					txtAiskacang.setEnabled(true);
					txtAiskacang.setText("0");
					txtAiskacang.requestFocus();
				}
				else
				{
					txtAiskacang.setEnabled(false);
					txtAiskacang.setText("");
				}                                                                //
			}
		});
		chckbxAiskacang.setBounds(10, 348, 97, 23);
		frame.getContentPane().add(chckbxAiskacang);
		
		txtAiskacang = new JTextField();
		txtAiskacang.setBounds(109, 349, 32, 20);
		frame.getContentPane().add(txtAiskacang);
		txtAiskacang.setColumns(10);
		
		JCheckBox chckbxGorengPisang = new JCheckBox("GorengPisang");
		chckbxGorengPisang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxGorengPisang.isSelected())                                //
				{
					txtGorengPisang.setEnabled(true);
					txtGorengPisang.setText("0");
					txtGorengPisang.requestFocus();
				}
				else
				{
					txtGorengPisang.setEnabled(false);
					txtGorengPisang.setText("");
				}                                                                //
			}
			
		});
		chckbxGorengPisang.setBounds(234, 348, 118, 23);
		frame.getContentPane().add(chckbxGorengPisang);
		
		txtGorengPisang = new JTextField();
		txtGorengPisang.setBounds(353, 349, 32, 20);
		frame.getContentPane().add(txtGorengPisang);
		txtGorengPisang.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Cost =");
		lblNewLabel_4.setBounds(805, 386, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_9 = new JTextField();
		textField_9.setText("");
		textField_9.setBounds(860, 383, 86, 20);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtKerabuSalad.setText(null);
				txtKaripapPusing.setText(null);
				txtPrawnFritters.setText(null);
				txtSatay.setText(null);
				txtAcar.setText(null);
				txtKampungFriedRice.setText(null);
				txtChowFriedRice.setText(null);
				txtAiskacang.setText(null);
				txtGorengPisang.setText(null);
				
				
				
				chckbxKerabuSalad.setSelected(false);				
				chckbxKaripapPusing.setSelected(false);
				chckbxPrawnFritters.setSelected(false);
				chckbxSatay.setSelected(false);
				chckbxAcar.setSelected(false);
				chckbxKampungFriedRice.setSelected(false);								
				chckbxAiskacang.setSelected(false);
				chckbxChowFriedRice.setSelected(false);
				chckbxGorengPisang.setSelected(false);
				
				
			}
		});
		btnNewButton.setBounds(632, 382, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}

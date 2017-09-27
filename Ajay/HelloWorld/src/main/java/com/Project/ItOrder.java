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

public class ItOrder {

	private JFrame frame;
	private JTextField txtCapreseSalad;
	private JTextField txtBagnaCauda;
	private JTextField txtBasilSalad;
	private JTextField txtBeetrootRisotto;
	private JTextField txtChickenScallopini;
	private JTextField txtPorkMarsala;
	private JTextField txtBrodetto;
	private JTextField txtBraisedChuckRoast;
	private JTextField txtBombolone;
	private JTextField txtAmaretti;
	private JTextField txtPanettone;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void NewScreen2() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ItOrder window = new ItOrder();
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
	public ItOrder() {
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
				txtCapreseSalad.setEnabled(false);
				txtBagnaCauda.setEnabled(false);
				txtBasilSalad.setEnabled(false);                                     //
				txtBeetrootRisotto.setEnabled(false);
				txtChickenScallopini.setEnabled(false);
				txtPorkMarsala.setEnabled(false);
				txtBrodetto.setEnabled(false);
				txtBraisedChuckRoast.setEnabled(false);
				txtBombolone.setEnabled(false);
				txtAmaretti.setEnabled(false);
				txtPanettone.setEnabled(false);
				
			}
		});
		frame.setBounds(0, 0, 1000, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ITALIAN MENU");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(417, 11, 152, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("STARTERS");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 76, 111, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		JCheckBox chckbxCapreseSalad = new JCheckBox("CapreseSalad");
		chckbxCapreseSalad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxCapreseSalad.isSelected())                                //
				{
					txtCapreseSalad.setEnabled(true);
					txtCapreseSalad.setText("0");
					txtCapreseSalad.requestFocus();
				}
				else
				{
					txtCapreseSalad.setEnabled(false);
					txtCapreseSalad.setText("");
				}                                                                //
				
				
			}
		});
		chckbxCapreseSalad.setBounds(10, 131, 111, 23);
		frame.getContentPane().add(chckbxCapreseSalad);
		
		txtCapreseSalad = new JTextField();
		txtCapreseSalad.setBounds(130, 132, 32, 20);
		frame.getContentPane().add(txtCapreseSalad);
		txtCapreseSalad.setColumns(10);
		
		JCheckBox chckbxBagnaCauda = new JCheckBox("BagnaCauda");
		chckbxBagnaCauda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBagnaCauda.isSelected())                                //
				{
					txtBagnaCauda.setEnabled(true);
					txtBagnaCauda.setText("0");
					txtBagnaCauda.requestFocus();
				}
				else
				{
					txtBagnaCauda.setEnabled(false);
					txtBagnaCauda.setText("");
				}                  
			}
		});
		chckbxBagnaCauda.setBounds(258, 131, 97, 23);
		frame.getContentPane().add(chckbxBagnaCauda);
		
		txtBagnaCauda = new JTextField();
		txtBagnaCauda.setBounds(361, 132, 32, 20);
		frame.getContentPane().add(txtBagnaCauda);
		txtBagnaCauda.setColumns(10);
		
		JCheckBox chckbxBasilSalad = new JCheckBox("BasilSalad");
		chckbxBasilSalad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBasilSalad.isSelected())                                //
				{
					txtBasilSalad.setEnabled(true);
					txtBasilSalad.setText("0");
					txtBasilSalad.requestFocus();
				}
				else
				{
					txtBasilSalad.setEnabled(false);
					txtBasilSalad.setText("");
				}                  
			}
		});
		chckbxBasilSalad.setBounds(510, 131, 97, 23);
		frame.getContentPane().add(chckbxBasilSalad);
		
		txtBasilSalad = new JTextField();
		txtBasilSalad.setBounds(607, 132, 32, 20);
		frame.getContentPane().add(txtBasilSalad);
		txtBasilSalad.setColumns(10);
		
		JCheckBox chckbxBeetrootRisotto = new JCheckBox("BeetrootRisotto");
		chckbxBeetrootRisotto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBeetrootRisotto.isSelected())                                //
				{
					txtBeetrootRisotto.setEnabled(true);
					txtBeetrootRisotto.setText("0");
					txtBeetrootRisotto.requestFocus();
				}
				else
				{
					txtBeetrootRisotto.setEnabled(false);
					txtBeetrootRisotto.setText("");
				}                  
				
				
			}
		});
		chckbxBeetrootRisotto.setBounds(733, 131, 125, 23);
		frame.getContentPane().add(chckbxBeetrootRisotto);
		
		txtBeetrootRisotto = new JTextField();
		txtBeetrootRisotto.setBounds(868, 132, 32, 20);
		frame.getContentPane().add(txtBeetrootRisotto);
		txtBeetrootRisotto.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("MAIN COURSE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(10, 198, 125, 20);
		frame.getContentPane().add(lblNewLabel_2);
		
		JCheckBox chckbxChickenScallopini = new JCheckBox("ChickenScallopini");
		chckbxChickenScallopini.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxChickenScallopini.isSelected())                                //
				{
					txtChickenScallopini.setEnabled(true);
					txtChickenScallopini.setText("0");
					txtChickenScallopini.requestFocus();
				}
				else
				{
					txtChickenScallopini.setEnabled(false);
					txtChickenScallopini.setText("");
				}                  
			}
		});
		chckbxChickenScallopini.setBounds(10, 240, 136, 23);
		frame.getContentPane().add(chckbxChickenScallopini);
		
		txtChickenScallopini = new JTextField();
		txtChickenScallopini.setBounds(152, 241, 32, 20);
		frame.getContentPane().add(txtChickenScallopini);
		txtChickenScallopini.setColumns(10);
		
		JCheckBox chckbxPorkMarsala = new JCheckBox("PorkMarsala");
		chckbxPorkMarsala.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxPorkMarsala.isSelected())                                //
				{
					txtPorkMarsala.setEnabled(true);
					txtPorkMarsala.setText("0");
					txtPorkMarsala.requestFocus();
				}
				else
				{
					txtPorkMarsala.setEnabled(false);
					txtPorkMarsala.setText("");
				}                  
			}
		});
		chckbxPorkMarsala.setBounds(258, 240, 111, 23);
		frame.getContentPane().add(chckbxPorkMarsala);
		
		txtPorkMarsala = new JTextField();
		txtPorkMarsala.setBounds(374, 241, 32, 20);
		frame.getContentPane().add(txtPorkMarsala);
		txtPorkMarsala.setColumns(10);
		
		JCheckBox chckbxBrodetto = new JCheckBox("Brodetto");
		chckbxBrodetto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBrodetto.isSelected())                                //
				{
					txtBrodetto.setEnabled(true);
					txtBrodetto.setText("0");
					txtBrodetto.requestFocus();
				}
				else
				{
					txtBrodetto.setEnabled(false);
					txtBrodetto.setText("");
				}                  
			}
		});
		chckbxBrodetto.setBounds(472, 240, 97, 23);
		frame.getContentPane().add(chckbxBrodetto);
		
		txtBrodetto = new JTextField();
		txtBrodetto.setBounds(575, 241, 32, 20);
		frame.getContentPane().add(txtBrodetto);
		txtBrodetto.setColumns(10);
		
		JCheckBox chckbxBraisedChuckRoast = new JCheckBox("BraisedChuckRoast");
		chckbxBraisedChuckRoast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBraisedChuckRoast.isSelected())                                //
				{
					txtBraisedChuckRoast.setEnabled(true);
					txtBraisedChuckRoast.setText("0");
					txtBraisedChuckRoast.requestFocus();
				}
				else
				{
					txtBraisedChuckRoast.setEnabled(false);
					txtBraisedChuckRoast.setText("");
				}                  
			}
		});
		chckbxBraisedChuckRoast.setBounds(672, 240, 152, 23);
		frame.getContentPane().add(chckbxBraisedChuckRoast);
		
		txtBraisedChuckRoast = new JTextField();
		txtBraisedChuckRoast.setBounds(836, 241, 32, 20);
		frame.getContentPane().add(txtBraisedChuckRoast);
		txtBraisedChuckRoast.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("DESERT");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(10, 280, 97, 25);
		frame.getContentPane().add(lblNewLabel_3);
		
		JCheckBox chckbxBombolone = new JCheckBox("Bombolone");
		chckbxBombolone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBombolone.isSelected())                                //
				{
					txtBombolone.setEnabled(true);
					txtBombolone.setText("0");
					txtBombolone.requestFocus();
				}
				else
				{
					txtBombolone.setEnabled(false);
					txtBombolone.setText("");
				}                  
			}
		});
		chckbxBombolone.setBounds(10, 312, 97, 23);
		frame.getContentPane().add(chckbxBombolone);
		
		txtBombolone = new JTextField();
		txtBombolone.setBounds(113, 313, 32, 20);
		frame.getContentPane().add(txtBombolone);
		txtBombolone.setColumns(10);
		
		JCheckBox chckbxAmaretti = new JCheckBox("Amaretti");
		chckbxAmaretti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxAmaretti.isSelected())                                //
				{
					txtAmaretti.setEnabled(true);
					txtAmaretti.setText("0");
					txtAmaretti.requestFocus();
				}
				else
				{
					txtAmaretti.setEnabled(false);
					txtAmaretti.setText("");
				}                  
			}
		});
		chckbxAmaretti.setBounds(258, 312, 97, 23);
		frame.getContentPane().add(chckbxAmaretti);
		
		txtAmaretti = new JTextField();
		txtAmaretti.setBounds(361, 313, 32, 20);
		frame.getContentPane().add(txtAmaretti);
		txtAmaretti.setColumns(10);
		
		JCheckBox chckbxPanettone = new JCheckBox("Panettone");
		chckbxPanettone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxPanettone.isSelected())                                //
				{
					txtPanettone.setEnabled(true);
					txtPanettone.setText("0");
					txtPanettone.requestFocus();
				}
				else
				{
					txtPanettone.setEnabled(false);
					txtPanettone.setText("");
				}                  
			}
		});
		chckbxPanettone.setBounds(472, 312, 97, 23);
		frame.getContentPane().add(chckbxPanettone);
		
		txtPanettone = new JTextField();
		txtPanettone.setBounds(575, 313, 32, 20);
		frame.getContentPane().add(txtPanettone);
		txtPanettone.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Cost =");
		lblNewLabel_4.setBounds(836, 386, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_11 = new JTextField();
		textField_11.setBounds(888, 383, 86, 20);
		frame.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCapreseSalad.setText(null);
				txtBagnaCauda.setText(null);
				txtBasilSalad.setText(null);
				txtBeetrootRisotto.setText(null);
				txtChickenScallopini.setText(null);
				txtPorkMarsala.setText(null);
				txtBrodetto.setText(null);
				txtBraisedChuckRoast.setText(null);
				txtBombolone.setText(null);
				txtPanettone.setText(null);
				txtAmaretti.setText(null);
				
				
				
				chckbxCapreseSalad.setSelected(false);				
				chckbxBagnaCauda.setSelected(false);
				chckbxBasilSalad.setSelected(false);
				chckbxBeetrootRisotto.setSelected(false);
				chckbxChickenScallopini.setSelected(false);
				chckbxPorkMarsala.setSelected(false);								
				chckbxBrodetto.setSelected(false);
				chckbxBraisedChuckRoast.setSelected(false);
				chckbxBombolone.setSelected(false);
				chckbxPanettone.setSelected(false);
				chckbxAmaretti.setSelected(false);
				
			}
		});
		btnNewButton.setBounds(679, 382, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}

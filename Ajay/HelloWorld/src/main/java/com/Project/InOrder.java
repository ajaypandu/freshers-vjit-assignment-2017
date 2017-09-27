package com.Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class InOrder {

	private JFrame frame;
	private JTextField txtManchuria;       
	private JTextField txtCost;
	
	public double  Manchuria=50;                               //
	public double FriedRice=50;
	public double  CheeseBalls=60;                               //
	public double AlooTikki=70;
	public double  SpringRolls=55;                               //
	public double BabyCorn=65;
	public double  Noodles=80;                               //
	public double Biryani=100;
	public double  Roti=10;                               //
	public double Naan=20;
	public double  Pulav=100;                               //
	public double GulabJamun=30;
	public double IceCream=30;
	public double Cake=30;
			//
	private JCheckBox chckbxFriedRice;
	private JTextField txtFriedRice;
	private JLabel lblIndianMenu;
	private JLabel lblNewLabel;
	private JCheckBox chckbxCheeseBalls;
	private JTextField txtCheeseBalls;
	private JCheckBox chckbxSpringRolls;
	private JCheckBox chckbxAlooTikki;
	private JTextField txtSpringRolls;
	private JTextField txtAlooTikki;
	private JCheckBox chckbxBabyCorn;
	private JTextField txtBabyCorn;
	private JLabel lblNewLabel_1;
	private JCheckBox chckbxNoodles;
	private JTextField txtNoodles;
	private JCheckBox chckbxBiryani;
	private JTextField txtBiryani;
	private JCheckBox chckbxRoti;
	private JTextField txtRoti;
	private JCheckBox chckbxNaan;
	private JTextField txtNaan;
	private JCheckBox chckbxPulav;
	private JTextField txtPulav;
	private JLabel lblNewLabel_2;
	private JCheckBox chckbxGulabJamun;
	private JTextField txtGulabJamun;
	private JCheckBox chckbxIceCream;
	private JTextField txtIceCream;
	private JCheckBox chckbxCake;
	private JTextField txtCake;
	private JButton btnReset;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {                                        //
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InOrder window = new InOrder();
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
	public InOrder() {
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
				
				txtManchuria.setEnabled(false);
				txtFriedRice.setEnabled(false);
				txtSpringRolls.setEnabled(false);                                     //
				txtCheeseBalls.setEnabled(false);
				txtAlooTikki.setEnabled(false);
				txtBabyCorn.setEnabled(false);
				txtNoodles.setEnabled(false);
				txtBiryani.setEnabled(false);
				txtRoti.setEnabled(false);
				txtNaan.setEnabled(false);
				txtPulav.setEnabled(false);
				txtGulabJamun.setEnabled(false);
				txtIceCream.setEnabled(false);
				txtCake.setEnabled(false);
			}
			
		});
		frame.setBounds(0,0,1000,450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JCheckBox chckbxManchuria = new JCheckBox("Manchuria");
		chckbxManchuria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxManchuria.isSelected())                                //
				{
					txtManchuria.setEnabled(true);
					txtManchuria.setText("0");
					txtManchuria.requestFocus();
				}
				else
				{
					txtManchuria.setEnabled(false);
					txtManchuria.setText("");
				}                                                                //
				
			}
		});
		chckbxManchuria.setBounds(16, 116, 97, 23);
		frame.getContentPane().add(chckbxManchuria);
		
		txtManchuria = new JTextField();
		txtManchuria.setBounds(117, 117, 32, 20);
		frame.getContentPane().add(txtManchuria);
		txtManchuria.setColumns(10);
		
		JButton btnCost = new JButton("Cost=");
		btnCost.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double mCost=Manchuria*Double.parseDouble(txtManchuria.getText());                     // 	
				double frCost=FriedRice*Double.parseDouble(txtFriedRice.getText());
				double sCost=SpringRolls*Double.parseDouble(txtSpringRolls.getText());                     // 	
				double chCost=CheeseBalls*Double.parseDouble(txtCheeseBalls.getText());
				double aCost=AlooTikki*Double.parseDouble(txtAlooTikki.getText());                     // 	
				double brCost=BabyCorn*Double.parseDouble(txtBabyCorn.getText());
				double nCost=Noodles*Double.parseDouble(txtNoodles.getText());                     // 	
				double birCost=Biryani*Double.parseDouble(txtBiryani.getText());
				double rCost=Roti*Double.parseDouble(txtRoti.getText());                     // 	
				double narCost=Naan*Double.parseDouble(txtNaan.getText());
				double pCost=Pulav*Double.parseDouble(txtPulav.getText());                     // 	
				double gCost=GulabJamun*Double.parseDouble(txtGulabJamun.getText());
				double iCost=IceCream*Double.parseDouble(txtIceCream.getText());                     // 	
				double caCost=Cake*Double.parseDouble(txtCake.getText());
				
				
				double Total= mCost+frCost+ sCost+chCost+aCost+brCost+nCost+birCost+rCost+narCost+ pCost+gCost+iCost+caCost;
				
				String T= String.format("Rs %.2f", Total);
				 
				 
				 
				txtCost.setText(T);                                                                           //
			}
		});
		btnCost.setBounds(792, 377, 79, 23);
		frame.getContentPane().add(btnCost);
		
		txtCost = new JTextField();
		txtCost.setBounds(871, 378, 86, 20);
		frame.getContentPane().add(txtCost);
		txtCost.setColumns(10);
		
		chckbxFriedRice = new JCheckBox("FriedRice");
		chckbxFriedRice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxFriedRice.isSelected())                                               //
				{
					txtFriedRice.setEnabled(true);
					txtFriedRice.setText("0");
					txtFriedRice.requestFocus();
				}
				else
				{
					txtFriedRice.setEnabled(false);
					txtFriedRice.setText("");
				}                                                                                 //
			}
		});
		chckbxFriedRice.setBounds(16, 252, 97, 23);
		frame.getContentPane().add(chckbxFriedRice);
		
		txtFriedRice = new JTextField();
		txtFriedRice.setBounds(117, 253, 32, 20);
		frame.getContentPane().add(txtFriedRice);
		txtFriedRice.setColumns(10);
		
		lblIndianMenu = new JLabel("INDIAN MENU");
		lblIndianMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblIndianMenu.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblIndianMenu.setBounds(405, 0, 197, 72);
		frame.getContentPane().add(lblIndianMenu);
		
		lblNewLabel = new JLabel("STARTERS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(16, 79, 97, 14);
		frame.getContentPane().add(lblNewLabel);
		
		chckbxCheeseBalls = new JCheckBox("CheeseBalls");
		chckbxCheeseBalls.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxCheeseBalls.isSelected())                                //
				{
					txtCheeseBalls.setEnabled(true);
					txtCheeseBalls.setText("0");
					txtCheeseBalls.requestFocus();
				}
				else
				{
					txtCheeseBalls.setEnabled(false);
					txtCheeseBalls.setText("");
				}                                                                //
				
				
				
				
			}
		});
		chckbxCheeseBalls.setBounds(172, 116, 104, 23);
		frame.getContentPane().add(chckbxCheeseBalls);
		
		txtCheeseBalls = new JTextField();
		txtCheeseBalls.setBounds(277, 117, 32, 20);
		frame.getContentPane().add(txtCheeseBalls);
		txtCheeseBalls.setColumns(10);
		
		chckbxSpringRolls = new JCheckBox("SpringRolls");
		chckbxSpringRolls.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSpringRolls.isSelected())                                               //
				{
					txtSpringRolls.setEnabled(true);
					txtSpringRolls.setText("0");
					txtSpringRolls.requestFocus();
				}
				else
				{
					txtSpringRolls.setEnabled(false);
					txtSpringRolls.setText("");
				}        
				
				
				
			}
		});
		chckbxSpringRolls.setBounds(350, 116, 100, 23);
		frame.getContentPane().add(chckbxSpringRolls);
		
		chckbxAlooTikki = new JCheckBox("AlooTikki");
		chckbxAlooTikki.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxAlooTikki.isSelected())                                //
				{
					txtAlooTikki.setEnabled(true);
					txtAlooTikki.setText("0");
					txtAlooTikki.requestFocus();
				}
				else
				{
					txtAlooTikki.setEnabled(false);
					txtAlooTikki.setText("");
				}                                                                //
			}
		});
		chckbxAlooTikki.setBounds(535, 116, 86, 23);
		frame.getContentPane().add(chckbxAlooTikki);
		
		txtSpringRolls = new JTextField();
		txtSpringRolls.setBounds(456, 117, 32, 20);
		frame.getContentPane().add(txtSpringRolls);
		txtSpringRolls.setColumns(10);
		
		txtAlooTikki = new JTextField();
		txtAlooTikki.setBounds(623, 117, 32, 20);
		frame.getContentPane().add(txtAlooTikki);
		txtAlooTikki.setColumns(10);
		
		chckbxBabyCorn = new JCheckBox("BabyCorn");
		chckbxBabyCorn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBabyCorn.isSelected())                                //
				{
					txtBabyCorn.setEnabled(true);
					txtBabyCorn.setText("0");
					txtBabyCorn.requestFocus();
				}
				else
				{
					txtBabyCorn.setEnabled(false);
					txtBabyCorn.setText("");
				}                                                                //
				
				
			}
		});
		chckbxBabyCorn.setBounds(701, 116, 97, 23);
		frame.getContentPane().add(chckbxBabyCorn);
		
		txtBabyCorn = new JTextField();
		txtBabyCorn.setBounds(818, 117, 32, 20);
		frame.getContentPane().add(txtBabyCorn);
		txtBabyCorn.setColumns(10);
		
		lblNewLabel_1 = new JLabel("MAIN COURSE");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(16, 202, 133, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		chckbxNoodles = new JCheckBox("Noodles");
		chckbxNoodles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNoodles.isSelected())                                //
				{
					txtNoodles.setEnabled(true);
					txtNoodles.setText("0");
					txtNoodles.requestFocus();
				}
				else
				{
					txtNoodles.setEnabled(false);
					txtNoodles.setText("");
				}                                                                //
			}
		});
		chckbxNoodles.setBounds(172, 252, 86, 23);
		frame.getContentPane().add(chckbxNoodles);
		
		txtNoodles = new JTextField();
		txtNoodles.setBounds(264, 253, 32, 20);
		frame.getContentPane().add(txtNoodles);
		txtNoodles.setColumns(10);
		
		chckbxBiryani = new JCheckBox("Biryani");
		chckbxBiryani.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBiryani.isSelected())                                //
				{
					txtBiryani.setEnabled(true);
					txtBiryani.setText("0");
					txtBiryani.requestFocus();
				}
				else
				{
					txtBiryani.setEnabled(false);
					txtBiryani.setText("");
				}                                                                //
			}
		});
		chckbxBiryani.setBounds(350, 252, 75, 23);
		frame.getContentPane().add(chckbxBiryani);
		
		txtBiryani = new JTextField();
		txtBiryani.setBounds(433, 253, 32, 20);
		frame.getContentPane().add(txtBiryani);
		txtBiryani.setColumns(10);
		
		chckbxRoti = new JCheckBox("Roti");
		chckbxRoti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxRoti.isSelected())                                //
				{
					txtRoti.setEnabled(true);
					txtRoti.setText("0");
					txtRoti.requestFocus();
				}
				else
				{
					txtRoti.setEnabled(false);
					txtRoti.setText("");
				}                                                                //
			}
		});
		chckbxRoti.setBounds(514, 252, 51, 23);
		frame.getContentPane().add(chckbxRoti);
		
		txtRoti = new JTextField();
		txtRoti.setBounds(571, 253, 32, 20);
		frame.getContentPane().add(txtRoti);
		txtRoti.setColumns(10);
		
		chckbxNaan = new JCheckBox("Naan");
		chckbxNaan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNaan.isSelected())                                //
				{
					txtNaan.setEnabled(true);
					txtNaan.setText("0");
					txtNaan.requestFocus();
				}
				else
				{
					txtNaan.setEnabled(false);
					txtNaan.setText("");
				}                                                                //
				
			}
		});
		chckbxNaan.setBounds(648, 252, 63, 23);
		frame.getContentPane().add(chckbxNaan);
		
		txtNaan = new JTextField();
		txtNaan.setBounds(712, 253, 32, 20);
		frame.getContentPane().add(txtNaan);
		txtNaan.setColumns(10);
		
		chckbxPulav = new JCheckBox("Pulav");
		chckbxPulav.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxPulav.isSelected())                                //
				{
					txtPulav.setEnabled(true);
					txtPulav.setText("0");
					txtPulav.requestFocus();
				}
				else
				{
					txtPulav.setEnabled(false);
					txtPulav.setText("");
				}                                                                //
			}
		});
		chckbxPulav.setBounds(782, 252, 68, 23);
		frame.getContentPane().add(chckbxPulav);
		
		txtPulav = new JTextField();
		txtPulav.setBounds(839, 253, 32, 20);
		frame.getContentPane().add(txtPulav);
		txtPulav.setColumns(10);
		
		lblNewLabel_2 = new JLabel("DESERTS");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(16, 303, 86, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		chckbxGulabJamun = new JCheckBox("GulabJamun");
		chckbxGulabJamun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					if(chckbxGulabJamun.isSelected())                                //
					{
						txtGulabJamun.setEnabled(true);
						txtGulabJamun.setText("0");
						txtGulabJamun.requestFocus();
					}
					else
					{
						txtGulabJamun.setEnabled(false);
						txtGulabJamun.setText("");
					}                                                                //
			}
		});
		chckbxGulabJamun.setBounds(16, 338, 109, 23);
		frame.getContentPane().add(chckbxGulabJamun);
		
		txtGulabJamun = new JTextField();
		txtGulabJamun.setBounds(134, 339, 32, 20);
		frame.getContentPane().add(txtGulabJamun);
		txtGulabJamun.setColumns(10);
		
		chckbxIceCream = new JCheckBox("IceCream");
		chckbxIceCream.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxIceCream.isSelected())                                //
				{
					txtIceCream.setEnabled(true);
					txtIceCream.setText("0");
					txtIceCream.requestFocus();
				}
				else
				{
					txtIceCream.setEnabled(false);
					txtIceCream.setText("");
				}                                                                //
			}
		});
		chckbxIceCream.setBounds(184, 338, 86, 23);
		frame.getContentPane().add(chckbxIceCream);
		
		txtIceCream = new JTextField();
		txtIceCream.setBounds(264, 339, 32, 20);
		frame.getContentPane().add(txtIceCream);
		txtIceCream.setColumns(10);
		
		chckbxCake = new JCheckBox("Cake");
		chckbxCake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxCake.isSelected())                                //
				{
					txtCake.setEnabled(true);
					txtCake.setText("0");
					txtCake.requestFocus();
				}
				else
				{
					txtCake.setEnabled(false);
					txtCake.setText("");
				}                                                                //
			}
		});
		chckbxCake.setBounds(350, 339, 63, 23);
		frame.getContentPane().add(chckbxCake);
		
		txtCake = new JTextField();
		txtCake.setBounds(418, 339, 32, 20);
		frame.getContentPane().add(txtCake);
		txtCake.setColumns(10);
		
		btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtManchuria.setText(null);
				txtSpringRolls.setText(null);
				txtBabyCorn.setText(null);
				txtBiryani.setText(null);
				txtFriedRice.setText(null);
				txtIceCream.setText(null);
				txtCost.setText(null);
				txtCheeseBalls.setText(null);
				txtNoodles.setText(null);
				txtRoti.setText(null);
				txtNaan.setText(null);
				txtPulav.setText(null);
				txtGulabJamun.setText(null);
				txtAlooTikki.setText(null);
				txtCake.setText(null);
				
				
				
				chckbxManchuria.setSelected(false);				
				chckbxSpringRolls.setSelected(false);
				chckbxBabyCorn.setSelected(false);
				chckbxBiryani.setSelected(false);
				chckbxFriedRice.setSelected(false);
				chckbxIceCream.setSelected(false);
								
				chckbxCheeseBalls.setSelected(false);
				chckbxNoodles.setSelected(false);
				chckbxRoti.setSelected(false);
				chckbxNaan.setSelected(false);
				chckbxPulav.setSelected(false);
				chckbxAlooTikki.setSelected(false);
				chckbxCake.setSelected(false);
				chckbxGulabJamun.setSelected(false);
						
				
				
				
			}
		});
		btnReset.setBounds(648, 377, 89, 23);
		frame.getContentPane().add(btnReset);
	}

}

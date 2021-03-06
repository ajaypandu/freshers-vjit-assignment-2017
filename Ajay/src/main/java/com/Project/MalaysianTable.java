package com.Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

import java.awt.Font;

public  class MalaysianTable extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MalaysianTable frame = new MalaysianTable();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void close()
	{
		this.setVisible(false);
		this.dispose();
	}
	/**
	 * Create the frame.
	 */
	public MalaysianTable() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Table 16");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MaOrder nw3 =new MaOrder("Ajju","Sarvam","Adam");                                         //
				 nw3.NewScreen3();                                                    //
			
				 close();
				
				
			}
		});
		btnNewButton.setBounds(10, 40, 94, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Table 17");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MaOrder nw3 =new MaOrder("Manish","Maddy","Ahmad");                                         //
				 nw3.NewScreen3();  close();                                                  //
				
			}
			
			
			
		});
		btnNewButton_1.setBounds(55, 74, 103, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Table 19");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MaOrder nw3 =new MaOrder("Munish","Satyam","Zikri");                                         //
				 nw3.NewScreen3();   close();                                                 //
			}
		});
		btnNewButton_2.setBounds(202, 142, 166, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Table 20");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MaOrder nw3 =new MaOrder("Mani","Chand","Rayyan");                                         //
				 nw3.NewScreen3();  close();                                                  //
			}
		});
		btnNewButton_3.setBounds(252, 176, 172, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Table 18");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MaOrder nw3 =new MaOrder("Sarvesh","Sunish","Danish");                                         //
				 nw3.NewScreen3();    close();                                                //
			}
		});
		btnNewButton_4.setBounds(118, 108, 159, 23);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("Choose a table");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 11, 112, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Executive Chef : Mon");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(276, 11, 148, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_5 = new JButton("Go Back");
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				choo Table1= new choo();
				Table1.setVisible(true);
				close();
			}
		});
		btnNewButton_5.setBounds(345, 238, 89, 23);
		contentPane.add(btnNewButton_5);
	}

}

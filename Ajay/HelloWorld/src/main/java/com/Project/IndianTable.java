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

public class IndianTable extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IndianTable frame = new IndianTable();
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
	public IndianTable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		
		JButton btnTable = new JButton("Table 1");
		btnTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				 InOrder nw =new InOrder();                                              //
				 nw.NewScreen();                                                         //
							}
		});
		btnTable.setBounds(33, 54, 89, 23);
		contentPane.add(btnTable);
		
		JButton btnTable_1 = new JButton("Table2");
		btnTable_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				 InOrder nw =new InOrder();                                           //
				 nw.NewScreen();                                                     //
			}
		});
		btnTable_1.setBounds(33, 227, 89, 23);
		contentPane.add(btnTable_1);
		
		JButton btnTable_2 = new JButton("Table3");
		btnTable_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				 InOrder nw =new InOrder();                                           //
				 nw.NewScreen();                                                     //
			}
		});
		btnTable_2.setBounds(287, 54, 89, 23);
		contentPane.add(btnTable_2);
		
		JButton btnTable_3 = new JButton("Table4");
		btnTable_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				 InOrder nw =new InOrder();                                         //
				 nw.NewScreen();                                                    //
			}
		});
		btnTable_3.setBounds(287, 227, 89, 23);
		contentPane.add(btnTable_3);
		
		JButton btnNewButton = new JButton("Table5");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				 InOrder nw =new InOrder();                                         //   
				 nw.NewScreen();	                                                //
			}
		});
		btnNewButton.setBounds(126, 120, 157, 67);
		contentPane.add(btnNewButton);
		
		JLabel lblChooseTheTable = new JLabel("Choose the table");
		lblChooseTheTable.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblChooseTheTable.setBounds(151, 11, 102, 14);
		contentPane.add(lblChooseTheTable);
	}

}

package com.Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MC extends JFrame {

	private JPanel contentPane;

	/**  a	qw
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MC frame = new MC();
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
	public MC() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Table21");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MCO nw4 =new MCO("Chini","Bhanu");                                         //
				 nw4.NewScreen4();      
				 close();
			}
		});
		btnNewButton.setBounds(21, 58, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Table22");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MCO nw4 =new MCO("Kutti","Batti");                                         //
				                                         //
				 nw4.NewScreen4();  
				 close();
			}
		});
		btnNewButton_1.setBounds(52, 88, 122, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Table23");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MCO nw4 =new MCO("Kathal","Sri");                                         //
				 nw4.NewScreen4();  
				 close();
			}
		});
		btnNewButton_2.setBounds(130, 115, 138, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Table24");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MCO nw4 =new MCO("Chat","Bhani");                                         //
				 nw4.NewScreen4();  
				 close();
			}
		});
		btnNewButton_3.setBounds(202, 149, 147, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Table25");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MCO nw4 =new MCO("Arzi","Farak");                                         //
				 nw4.NewScreen4();  
				 close();
			}
		});
		btnNewButton_4.setBounds(283, 183, 155, 23);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("Choose a table");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 11, 104, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Executice Chef :Moorti");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(283, 11, 177, 23);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_5 = new JButton("Go Back");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				choo Table1= new choo();
				Table1.setVisible(true);
				close();
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_5.setBounds(395, 238, 89, 23);
		contentPane.add(btnNewButton_5);
	}

}

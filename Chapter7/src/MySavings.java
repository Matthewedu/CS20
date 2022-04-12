/*

Program: MySavings.java          Last Date of this Revision: April 7 2022

Purpose: Create an application that displays the users total amount with options to 
remove or add pennies, nickels, dimes, quarters, and dollars.

Author: Matthew Pierson, 
School: CHHS
Course: Computer Programming 20
 

*/import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MySavings extends JFrame {

	private JPanel contentPane;

	int q;
	int n;
	int d;
	int p;
	

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySavings frame = new MySavings();
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
	public MySavings() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		/*JFrame Frame = new JFrame();
		String message = JOptionPane.showInputDialog(Frame, "Enter your First and Last name:");
		JOptionPane.showMessageDialog(Frame, "Your message: "+message);*/
		
		JPanel panel = new JPanel();
		
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel ql = new JLabel("Quarters:");
		ql.setFont(new Font("Tahoma", Font.BOLD, 20));
		ql.setBounds(25, 50, 100,20);
		panel.add(ql);
		
		JTextField qt = new JTextField();
		qt.setForeground(Color.BLACK);
		qt.setBounds(105,50, 90, 20);
		panel.add(qt);
		
		JLabel dl = new JLabel("Dimes:");
		dl.setFont(new Font("Tahoma", Font.BOLD, 20));
		dl.setBounds(25, 75, 100,20);
		panel.add(dl);
		
		JTextField dt = new JTextField();
		dt.setForeground(Color.BLACK);
		dt.setBounds(120, 75, 90, 20);
		panel.add(dt);
		
		JLabel nl = new JLabel("Nickels:");
		nl.setFont(new Font("Tahoma", Font.BOLD, 20));
		nl.setBounds(25, 100, 100,20);
		panel.add(nl);
		
		JTextField nt = new JTextField();
		nt.setForeground(Color.BLACK);
		nt.setBounds(105, 100, 90, 20);
		panel.add(nt);
		
		JLabel pl = new JLabel("Pennies:");
		pl.setFont(new Font("Tahoma", Font.BOLD, 20));
		pl.setBounds(25, 125, 100,20);
		panel.add(pl);
		
		JTextField pt = new JTextField();
		pt.setForeground(Color.BLACK);
		pt.setBounds(105, 125, 90, 20);
		panel.add(pt);
		
		JLabel total = new JLabel("Total:");
		total.setFont(new Font("Tahoma", Font.BOLD, 30));
		total.setBounds(300, 50, 100,70);
		panel.add(total);
		
		JLabel display = new JLabel("0.00");
		display.setFont(new Font("Tahoma", Font.BOLD, 30));
		display.setBounds(300, 80, 100,70);
		panel.add(display);
		
		/*JButton btnNewButton = new JButton("Enter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String Q = qt.getText();
				double Q2 = Double.parseDouble(Q);
				double Total = Q2 +2;
				
				display.setText("Quarters: "+ Total);
				
				
				
			}
		});
		btnNewButton.setBounds(193, 151, 119, 23);
		panel.add(btnNewButton);*/
		
		
		
		
	}
}

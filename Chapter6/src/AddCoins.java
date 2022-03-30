/*

Program: AddCoins.java          Last Date of this Revision: March 29 2022

Purpose: Ask the user to input the amount of quarters, dimes, nickels, and pennies they have then tell them the total
amount of change they have.

Author: Matthew Pierson, 
School: CHHS
Course: Computer Programming 20
 

*/
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddCoins extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCoins frame = new AddCoins();
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
	public AddCoins() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel coin = new JLabel("Enter Your Amount of Coins:");
		coin.setFont(new Font("Tahoma", Font.BOLD, 12));
		coin.setBounds(25, 10, 300,20);
		panel.add(coin);
		
		JLabel ql = new JLabel("Quarters:");
		ql.setFont(new Font("Tahoma", Font.BOLD, 12));
		ql.setBounds(25, 50, 90,20);
		panel.add(ql);
		
		JTextField qt = new JTextField();
		qt.setForeground(Color.BLACK);
		qt.setBounds(105,50, 90, 20);
		panel.add(qt);
		
		JLabel dl = new JLabel("Dimes:");
		dl.setFont(new Font("Tahoma", Font.BOLD, 12));
		dl.setBounds(25, 75, 90,20);
		panel.add(dl);
		
		JTextField dt = new JTextField();
		dt.setForeground(Color.BLACK);
		dt.setBounds(105, 75, 90, 20);
		panel.add(dt);
		
		JLabel nl = new JLabel("Nickels:");
		nl.setFont(new Font("Tahoma", Font.BOLD, 12));
		nl.setBounds(25, 100, 90,20);
		panel.add(nl);
		
		JTextField nt = new JTextField();
		nt.setForeground(Color.BLACK);
		nt.setBounds(105, 100, 90, 20);
		panel.add(nt);
		
		JLabel pl = new JLabel("Pennies:");
		pl.setFont(new Font("Tahoma", Font.BOLD, 12));
		pl.setBounds(25, 125, 90,20);
		panel.add(pl);
		
		JTextField pt = new JTextField();
		pt.setForeground(Color.BLACK);
		pt.setBounds(105, 125, 90, 20);
		panel.add(pt);
		
		JLabel total= new JLabel("");
		total.setFont(new Font("Tahoma",Font.PLAIN, 14));
		total.setBounds(25, 150, 90, 20);
		panel.add(total);
		
		
		JButton enter = new JButton("Enter");
		enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String q = qt.getText();
				String d = dt.getText();
				String n = nt.getText();
				String p = pt.getText();
				
				Double qn = Double.parseDouble(q);
				Double dn = Double.parseDouble(d);
				Double nn = Double.parseDouble(n);
				Double pn = Double.parseDouble(p);
				
				Double tqn = qn*0.25;
				Double tdn = dn*0.10;
				Double tnn = nn*0.05;
				Double tpn = pn*0.01;
				
				Double totald = tqn+tdn+tnn+tpn;
				
				String totals = Double.toString(totald);
				total.setText("Total: $"+ totald);
			}
		});
		enter.setBounds(105, 150, 90, 20);
		panel.add(enter);
	}

}

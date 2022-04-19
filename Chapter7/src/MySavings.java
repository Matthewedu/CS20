/*

Program: MySavings.java          Last Date of this Revision: April 7 2022

Purpose: Create an application that displays the users total amount with options to 
remove or add pennies, nickels, dimes, and quarters.

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
import javax.swing.JScrollBar;
import javax.swing.JSpinner;

public class MySavings extends JFrame {

	private JPanel contentPane;
	private Double Total=0.0;
	String q;
	String d;
	String n;
	String p;
	
	
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
	public static String roundOffTo2DecPlaces(Double val)
	{
	    return String.format("%.2f", val);
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
		
		JPanel panel = new JPanel();
		
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel ql = new JLabel("Quarters:");
		ql.setFont(new Font("Tahoma", Font.BOLD, 20));
		ql.setBounds(5, 25, 100,20);
		panel.add(ql);
		
		JTextField qt = new JTextField("0");
		qt.setForeground(Color.BLACK);
		qt.setBounds(27,50, 50, 20);
		panel.add(qt);
		
		JLabel dl = new JLabel("Dimes:");
		dl.setFont(new Font("Tahoma", Font.BOLD, 20));
		dl.setBounds(115, 25, 100,20);
		panel.add(dl);
		
		JTextField dt = new JTextField("0");
		dt.setForeground(Color.BLACK);
		dt.setBounds(125, 50, 50, 20);
		panel.add(dt);
		
		JLabel nl = new JLabel("Nickels:");
		nl.setFont(new Font("Tahoma", Font.BOLD, 20));
		nl.setBounds(205, 25, 100,20);
		panel.add(nl);
		
		JTextField nt = new JTextField("0");
		nt.setForeground(Color.BLACK);
		nt.setBounds(215, 50, 50, 20);
		panel.add(nt);
		
		JLabel pl = new JLabel("Pennies:");
		pl.setFont(new Font("Tahoma", Font.BOLD, 20));
		pl.setBounds(305, 25, 100,20);
		panel.add(pl);
		
		JTextField pt = new JTextField("0");
		pt.setForeground(Color.BLACK);
		pt.setBounds(325, 50, 50, 20);
		panel.add(pt);
		
		JLabel total = new JLabel("Total:");
		total.setFont(new Font("Tahoma", Font.BOLD, 30));
		total.setBounds(40, 107, 100,70);
		panel.add(total);
		
		JLabel num = new JLabel("$0.00");
		num.setFont(new Font("Tahoma", Font.BOLD, 30));
		num.setBounds(40, 156, 100,70);
		panel.add(num);
		
		
		JButton add = new JButton("Add");
		add.addActionListener(new ActionListener() {
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
				
				Total= Total+tqn+tdn+tnn+tpn;
				String totals="$"+roundOffTo2DecPlaces(Total);
				
				
				num.setText(totals);
				qt.setText("0");
				dt.setText("0");
				nt.setText("0");
				pt.setText("0");
			}
		});
		add.setBounds(309, 129, 89, 43);
		panel.add(add);
		
		
		JButton remove = new JButton("Remove");
		remove.addActionListener(new ActionListener() {
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
				
				Total= Total-tqn-tdn-tnn-tpn;
				String totals="$"+roundOffTo2DecPlaces(Total);
				
				num.setText(totals);
				qt.setText("0");
				dt.setText("0");
				nt.setText("0");
				pt.setText("0");
				
			}
			
		});
		remove.setBounds(209, 129, 89, 43);
		panel.add(remove);
		
		JButton clear = new JButton("Clear");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num.setText("0.00");
				qt.setText("0");
				dt.setText("0");
				nt.setText("0");
				pt.setText("0");
				
			}
			
		});
		clear.setBounds(259, 179, 89, 43);
		panel.add(clear);
		
	}
}

/*

Program: PrimeNumber.java          Last Date of this Revision: March 29 2022

Purpose: Ask the user for a number then tell them if its prime or not.

Author: Matthew Pierson, 
School: CHHS
Course: Computer Programming 20
 

*/
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class PrimeNumber extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumber;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimeNumber frame = new PrimeNumber();
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
	public PrimeNumber() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter A Number:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 82, 158, 37);
		panel.add(lblNewLabel);
		
		txtNumber = new JTextField();
		txtNumber.setForeground(Color.BLACK);
		txtNumber.setBounds(167, 82, 127, 37);
		panel.add(txtNumber);
		txtNumber.setColumns(10);
		
		JLabel newlabel= new JLabel("");
		newlabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		newlabel.setBounds(10, 126, 284, 37);
		panel.add(newlabel);
		
		
		btnNewButton = new JButton("Enter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num= txtNumber.getText(); 
			
				int num1 = Integer.parseInt(num);
				 
				
				boolean test = false;
				for (int i=2; i<=(num1/2);i++) {
					
					if(num1 % i ==0) {
						test =true;
						break;
					}
					
				}
				if (!test) {
				newlabel.setText("This Is A Prime Number!");
				}else {
				newlabel.setText("This Is Not A Prime Number!");
				}
				
				
				
			}

			
			
		});
		btnNewButton.setBounds(315, 82, 99, 37);
		panel.add(btnNewButton);
		
		
	}
}

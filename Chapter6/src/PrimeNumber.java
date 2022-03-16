import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.util.Scanner;

import javax.swing.SwingConstants;
import javax.swing.DropMode;
import java.awt.Color;

public class PrimeNumber extends JFrame {

	private JPanel contentPane;
	private JTextField txtTypeANumber;
	private JTextField textField;

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
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(5, 5, 424, 251);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtTypeANumber = new JTextField();
		txtTypeANumber.setBounds(100, 52, 219, 56);
		txtTypeANumber.setBackground(Color.LIGHT_GRAY);
		txtTypeANumber.setDropMode(DropMode.ON);
		txtTypeANumber.setHorizontalAlignment(SwingConstants.CENTER);
		txtTypeANumber.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtTypeANumber.setText(" Type a Number:");
		panel.add(txtTypeANumber);
		txtTypeANumber.setColumns(10);
		
		Scanner input = new Scanner(System.in);
		textField = new JTextField();
		int num =input.nextInt();
		textField.setBounds(150, 134, 124, 50);
		panel.add(textField);
		textField.setColumns(10);
	}
}

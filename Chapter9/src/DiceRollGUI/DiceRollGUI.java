/*

Program: DiceRollGUI.java          Last Date of this Revision:May 18 2022

Purpose: Create an application that rolls 3 dice and shows the number that you rolled.

Author: Matthew Pierson, 
School: CHHS
Course: Computer Programming 20
 

*/
package DiceRollGUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Color;

public class DiceRollGUI {

	private JFrame frame;
	private JTextField rollinput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DiceRollGUI window = new DiceRollGUI();
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
	public DiceRollGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel diceroll = new JLabel("Dice Roll");
		diceroll.setFont(new Font("Tahoma", Font.BOLD, 35));
		diceroll.setBounds(136, 2, 177, 39);
		panel.add(diceroll);
		
		rollinput = new JTextField();
		rollinput.setBounds(61, 219, 86, 31);
		panel.add(rollinput);
		rollinput.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("How Many Rolls Do You Want?");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 199, 194, 23);
		panel.add(lblNewLabel);
		
		JTextArea output = new JTextArea();
		output.setFont(new Font("Tahoma", Font.PLAIN, 20));
		output.setWrapStyleWord(true);
		output.setBackground(Color.LIGHT_GRAY);
		output.setBounds(25, 62, 381, 107);
		output.setLineWrap(true);
		panel.add(output);
		
		JButton dicebutton = new JButton("Roll");
		dicebutton.setBackground(Color.WHITE);
		dicebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ri = rollinput.getText();
				int rolls= Integer.parseInt(ri);
				
				int[] Aoutcome= new int[19];
				for (int roll=0; roll<rolls;roll++) 
				{
					int outcome=(int)(6*Math.random()+1) +
					(int)(6*Math.random()+1)+
					(int)(6*Math.random()+1);
					Aoutcome[outcome] +=1;
					
				}
				for (int i =3; i<=18;i++)
				{
					
					output.append(" "+ i+":" +Aoutcome[i]);
					
				}
				
				
			
			}
		});
		dicebutton.setBounds(286, 199, 89, 40);
		panel.add(dicebutton);
		
	}
}

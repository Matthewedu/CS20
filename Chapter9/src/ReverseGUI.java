import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class ReverseGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReverseGUI window = new ReverseGUI();
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
	public ReverseGUI() {
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
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JTextArea dis = new JTextArea();
		dis.setBounds(296, 198, 88, 22);
		panel.add(dis);
		
		JLabel countdown= new JLabel("Countdown");
		countdown.setBounds(61, -11, 319, 100);
		countdown.setFont(new Font("Tahoma", Font.BOLD,50));
		panel.add(countdown);
		
		JLabel cd = new JLabel("");
		cd.setBounds(71, 73, 284, 82);
		panel.add(cd);
		
		JButton start = new JButton("Start");
		start.setBounds(165, 198, 80, 36);
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				final int num_elements = 11;
				int[] numbers = new int [num_elements];
				
				//store numbers
				for(int i=0; i<num_elements; i++) 
				{
					numbers[i]= i;
					
				}
				for(int i=num_elements-1;i>=0;i--)
				{
					cd.setText(Arrays.toString(numbers));
					//dis.append(numbers.toString());
				}
				
			}
		});
		panel.add(start);
		
		
				
	}
}

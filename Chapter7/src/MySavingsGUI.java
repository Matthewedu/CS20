import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MySavingsGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySavingsGUI window = new MySavingsGUI();
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
	public MySavingsGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			
			JPanel panel = new JPanel();
			
			JLabel ql = new JLabel("Quarters:");
			ql.setFont(new Font("Tahoma", Font.BOLD, 20));
			ql.setBounds(5, 25, 100,20);
			panel.add(ql);
			
			JTextField qt = new JTextField();
			qt.setForeground(Color.BLACK);
			qt.setBounds(27,50, 50, 20);
			panel.add(qt);
			
			JLabel dl = new JLabel("Dimes:");
			dl.setFont(new Font("Tahoma", Font.BOLD, 20));
			dl.setBounds(115, 25, 100,20);
			panel.add(dl);
			
			JTextField dt = new JTextField();
			dt.setForeground(Color.BLACK);
			dt.setBounds(125, 50, 50, 20);
			panel.add(dt);
			
			JLabel nl = new JLabel("Nickels:");
			nl.setFont(new Font("Tahoma", Font.BOLD, 20));
			nl.setBounds(205, 25, 100,20);
			panel.add(nl);
			
			JTextField nt = new JTextField();
			nt.setForeground(Color.BLACK);
			nt.setBounds(215, 50, 50, 20);
			panel.add(nt);
			
			JLabel pl = new JLabel("Pennies:");
			pl.setFont(new Font("Tahoma", Font.BOLD, 20));
			pl.setBounds(305, 25, 100,20);
			panel.add(pl);
			
			JTextField pt = new JTextField();
			pt.setForeground(Color.BLACK);
			pt.setBounds(325, 50, 50, 20);
			panel.add(pt);
			
			JLabel total = new JLabel("Total:");
			total.setFont(new Font("Tahoma", Font.BOLD, 30));
			total.setBounds(40, 107, 100,70);
			panel.add(total);
			
			JLabel num = new JLabel("0.00");
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
					
					Double total= tqn+tdn+tnn+tpn;
					String totals = Double.toString(total);
					
					num.setText(totals);
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
					
					Double total= tqn+tdn+tnn+tpn;
					String totals = Double.toString(total);
					
					
				}
				
			});
			remove.setBounds(209, 129, 89, 43);
			panel.add(remove);
			
			
			
			
			
			
	}

}

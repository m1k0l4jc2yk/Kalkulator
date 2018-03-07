package Kalkulator;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;


public class Wykres {
	
	private JFrame frameWykres;

	public Wykres() {
 		initialize();
 	}
	 
	 	private void initialize() {
	 		setFrameWykres(new JFrame());
	 		getFrameWykres().setTitle("Wykres");
	 		getFrameWykres().setVisible(false);
	 		getFrameWykres().setBounds(100, 480, 650, 325);
	 		getFrameWykres().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	 		getFrameWykres().getContentPane().setLayout(null);
	 		
	 		JPanel panel = new JPanel();
	 		panel.setBounds(100, 480, 650, 325);
	 		getFrameWykres().getContentPane().add(panel);
	 		panel.setLayout(null);
	 		
	 		JLabel label = new JLabel("");
	 		label.setBounds(100, 480, 650, 325);
	 		panel.add(label);
	 		}


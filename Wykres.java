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

		public JFrame getFrameWykres() {
			return frameWykres;
		}

		public void setFrameWykres(JFrame frameWykres) {
			this.frameWykres = frameWykres;
		}

		public void wykresUsa () {

			JLabel lblNewLabel = new JLabel("New label");

			lblNewLabel.setBounds(0,0, 650, 285);
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Krzysiek\\eclipse-workspace\\Kalkulator\\Icons\\dolar.jpg"));
			getFrameWykres().getContentPane().add(lblNewLabel);
		}
		public void wykresEuro () {

			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Krzysiek\\eclipse-workspace\\Kalkulator\\Icons\\euro.jpg"));
			lblNewLabel.setBounds(0, 0, 650, 285);
			getFrameWykres().getContentPane().add(lblNewLabel);
		}
		public void wykresGbp () {

			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Krzysiek\\eclipse-workspace\\Kalkulator\\Icons\\gbp.jpg"));
			lblNewLabel.setBounds(0, 0, 650, 285);
			getFrameWykres().getContentPane().add(lblNewLabel);
		}
		public void wykresCad () {

			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Krzysiek\\eclipse-workspace\\Kalkulator\\Icons\\cad.jpg"));
			lblNewLabel.setBounds(0, 0, 650, 285);
			getFrameWykres().getContentPane().add(lblNewLabel);
		}
		public void wykresAud () {

			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Krzysiek\\eclipse-workspace\\Kalkulator\\Icons\\aud.jpg"));
			lblNewLabel.setBounds(0, 0, 650, 285);
			getFrameWykres().getContentPane().add(lblNewLabel);
		}
		public void wykresChf () {

			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Krzysiek\\eclipse-workspace\\Kalkulator\\Icons\\chf.jpg"));
			lblNewLabel.setBounds(0, 0, 650, 285);
			getFrameWykres().getContentPane().add(lblNewLabel);
		}
		public void wykresHuf () {

			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Krzysiek\\eclipse-workspace\\Kalkulator\\Icons\\huf.jpg"));
			lblNewLabel.setBounds(0, 0, 650, 285);
			getFrameWykres().getContentPane().add(lblNewLabel);
		}


 }

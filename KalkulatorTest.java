package Kalkulator;

import java.awt.EventQueue;

public class KalkulatorTest extends Kalkulator {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kalkulator window = new Kalkulator();
					window.getFrameKalkulatorStandardowy().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

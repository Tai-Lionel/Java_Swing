package stt72_22634631_PhamDucTai;

import javax.swing.SwingUtilities;

public class App {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new MainFrame();
			}
		});

	}

}

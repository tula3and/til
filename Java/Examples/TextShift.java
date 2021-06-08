import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TextShift extends JFrame {

	private JLabel keyLabel = new JLabel("Key Pressed:");
	JLabel label = new JLabel("Java is amazing!");

	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			
			if (keyCode == 39) {
				String past = label.getText();
				int len = past.length();
				String current = "";
				current += past.charAt(len - 1);
				for (int i = 0; i < len - 1; i++) {
					current += past.charAt(i);
				}
				label.setText(current);
				keyLabel.setText("Key Pressed: → pressed");
			}
			else if (keyCode == 37) {
				String past = label.getText();
				int len = past.length();
				String current = "";
				for (int i = 1; i < len; i++) {
					current += past.charAt(i);
				}
				current += past.charAt(0);
				label.setText(current);
				keyLabel.setText("Key Pressed: ← pressed");
			}
			else {
				if (keyCode == 82) { // R
					label.setForeground(Color.RED);
				}
				else if (keyCode == 71) { // G
					label.setForeground(Color.GREEN);
				}
				else if (keyCode == 66) { // B
					label.setForeground(Color.BLUE);
				}
				else {
					label.setForeground(Color.BLACK);
				}
				keyLabel.setText("Key Pressed: " + e.getKeyText(keyCode) + " pressed");
			}
		}
	}

	public TextShift() {

		setTitle("Moving Text");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();

		JTextField textField = new JTextField("Java is amazing!");

		textField.setFocusable(true);
		
		textField.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();				
				if (keyCode == 10) {
					label.requestFocus();
					label.setText(textField.getText());
					keyLabel.setText("Key Pressed: Enter pressed");
				}
			}
		});

		label.setFont(new Font("TimesRoman", Font.PLAIN, 30));
		label.setForeground(Color.BLACK);
		label.addKeyListener(new MyKeyListener());

		// move labels to center
		label.setHorizontalAlignment(JLabel.CENTER);
		keyLabel.setHorizontalAlignment(JLabel.CENTER);

		c.setLayout(new BorderLayout(30, 20));
		c.add(label, BorderLayout.CENTER);
		c.add(textField, BorderLayout.NORTH);
		c.add(keyLabel, BorderLayout.SOUTH);

		setSize(500, 300);
		setVisible(true);
		
		label.grabFocus();
		label.requestFocus();

	}

	public static void main(String[] args) {
		new TextShift();
	}

}

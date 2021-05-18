package com.icloud.jadenzaleski;

import java.awt.*;
import javax.swing.*;

public class LeftPanel extends JPanel {
	private JLabel letters;
	
	public LeftPanel() {
		letters = new JLabel(Main.s.getLetters());
		letters.setFont(new Font("Monospaced", Font.PLAIN, 14));
		
		this.setBackground(Color.white);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 10, Color.WHITE));
		this.add(letters);
	}
	
	public void updateText() {
		this.letters.setText(Main.s.getLetters());
	}
}

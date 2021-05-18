package com.icloud.jadenzaleski;

import java.awt.*;
import javax.swing.*;

public class TopPanel extends JPanel{
	private JLabel guesses;
	private JLabel round;
	private JLabel wl;
	private JLabel line1;
	private JLabel line2;
	
	public TopPanel() {
		line1 = new JLabel(" | ");
		line2 = new JLabel(" | ");
		guesses = new JLabel("guesses: " + Main.s.getGuesses());
		round = new JLabel("round: " + Main.s.getRound());
		wl = new JLabel(Main.s.getWL());

		line2.setFont(new Font("Monospaced", Font.PLAIN, 14));
		line1.setFont(new Font("Monospaced", Font.PLAIN, 14));

		wl.setFont(new Font("Monospaced", Font.PLAIN, 14));

		round.setFont(new Font("Monospaced", Font.PLAIN, 14));

		guesses.setFont(new Font("Monospaced", Font.PLAIN, 14));
		
		this.setBackground(Color.WHITE);
		this.setLayout(new FlowLayout());
		this.add(guesses);
		this.add(line1);
		this.add(round);
		this.add(line2);
		this.add(wl);
	}
	
	public void updateText() {
		guesses.setText("guesses: " + Main.s.getGuesses());
		round.setText("round: " + Main.s.getRound());
		wl.setText(Main.s.getWL());
	}
}

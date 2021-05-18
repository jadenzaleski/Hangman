package com.icloud.jadenzaleski;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
	static RightPanel rp;
	static TopPanel tp;
	//static LeftPanel lp;
	
	public GameFrame() {
		rp = new RightPanel();
		tp = new TopPanel();
		//lp = new LeftPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Hangman");
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		this.setBackground(Color.WHITE);
		this.setSize(new Dimension(340,260));
		this.setResizable(false);
		this.add(tp, BorderLayout.NORTH);
		//this.add(lp, BorderLayout.WEST);
		this.add(rp, BorderLayout.CENTER);
		this.add(new BottomPanel(), BorderLayout.SOUTH);
	}
	
	public void start() {
		this.setVisible(true);
	}
}

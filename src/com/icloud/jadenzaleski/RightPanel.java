package com.icloud.jadenzaleski;

import java.awt.*;
import javax.swing.*;

public class RightPanel extends JPanel {
	/*

	 /---|
	 |	 O
	 |	/|\
	 |	/ \
	 |
	 -^^^^^^
	 */

	public static JTextArea text;
	static LeftPanel lp;
	
	
	RightPanel() {
		lp = new LeftPanel();
		text = new JTextArea();
		this.setLayout(new FlowLayout());
		this.setBackground(Color.WHITE);
		this.setBorder(BorderFactory.createMatteBorder(0,10,0,10,Color.WHITE));
		text.setFont(new Font("Monospaced", Font.PLAIN, 14));
		text.setEditable(false);
		text.setHighlighter(null);

		setFigure(Main.s.getLives());
		this.add(lp);
		this.add(text);
	}
	
	public void setFigure(int x) {
		if (x == 6) {
			text.setText(
					"/---|\n"
					+ "|  \n"
					+ "|  \n"
					+ "|  \n"
					+ "|\n"
					+ "^^^^^^^");

		} else if (x == 5) {
			text.setText(
					"/---|\n"
					+ "|   O\n"
					+ "|  \n"
					+ "|  \n"
					+ "|\n"
					+ "^^^^^^^");
		} else if (x == 4) {
			text.setText(""
					+ "/---|\n"
					+ "|   O\n"
					+ "|  /\n"
					+ "|  \n"
					+ "|\n"
					+ "^^^^^^^");
		} else if (x == 3) {
			text.setText(""
					+ "/---|\n"
					+ "|   O\n"
					+ "|  /|\n"
					+ "|  \n"
					+ "|\n"
					+ "^^^^^^^");
		} else if (x == 2) {
			text.setText(""
					+ "/---|\n"
					+ "|   O\n"
					+ "|  /|\\\n"
					+ "|  \n"
					+ "|\n"
					+ "^^^^^^^");
		} else if (x == 1) {
			text.setText(""
					+ "/---|\n"
					+ "|   O\n"
					+ "|  /|\\\n"
					+ "|  / \n"
					+ "|\n"
					+ "^^^^^^^");
		} else if (x == 0) {
			text.setText(""
					+ "/---|\n"
					+ "|   O\n"
					+ "|  /|\\\n"
					+ "|  / \\\n"
					+ "|\n"
					+ "^^^^^^^");
		} else {
		System.out.println("error rp");
		}	
	}
}

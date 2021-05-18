package com.icloud.jadenzaleski;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BottomPanel extends JPanel implements ActionListener {
    JTextField textField;
    JTextArea history;
    JLabel colon;
    JPanel boxed;
    boolean gameOver = false;

    BottomPanel() {
        boxed = new JPanel();
        colon = new JLabel(":");
        textField = new JTextField(16);
        history = new JTextArea(2, 26);

        boxed.setLayout(new FlowLayout());
        boxed.setBackground(Color.WHITE);
        boxed.add(colon);
        boxed.add(textField);

        colon.setFont(new Font("Monospaced", Font.PLAIN, 14));

        textField.addActionListener(this);
        textField.setBackground(Color.WHITE);
        textField.setFont(new Font("Monospaced", Font.PLAIN, 14));
        textField.setBorder(BorderFactory.createMatteBorder(0,0,1,0,Color.BLACK));

        history.setBackground(Color.WHITE);
        history.setFont(new Font("Monospaced", Font.PLAIN, 14));
        history.setEditable(false);
        history.setHighlighter(null);
        history.setLineWrap(true);
        history.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, Color.black));

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(Color.WHITE);
        this.setBorder(BorderFactory.createMatteBorder(0,5,0,5,Color.WHITE));
        this.add(boxed);
        this.add(history);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = textField.getText();

        if (str.length() == 1) {
            char x = str.charAt(0);
            System.out.println(x);

            if(!gameOver) {
                if (-1 == history.getText().indexOf(x)) { // not in history
                    history.setText(history.getText() + x + " ");
                    Main.s.setGuesses(Main.s.getGuesses() + 1);
                    if (-1 == Main.s.getWord().indexOf(x)) { // not in word
                        Main.s.loseLife();
                        if (Main.s.getLives() == 0) { // game over
                            history.setText("game over you lost! \ntype p to play again, q to quit");
                            Main.s.setWL('l');
                            gameOver = true;

                            for (int i = 0; i < Main.s.getWord().length(); i++) {
                                Main.s.getLettersList().set(i, Main.s.getWord().charAt(i));
                            }
                        }
                    } else {
                        for (int i = 0; i < Main.s.getWord().length(); i++) {
                            if (Main.s.getWord().charAt(i) == x) {
                                Main.s.getLettersList().set(i, x);
                            }
                        }
                            if (!Main.s.getLettersList().contains('_')) {
                                gameOver = true;
                                history.setText("you won! \ntype p to play again, q to quit");
                                Main.s.setWL('w');
                            }
                    }
                }
            } else if (x == 'q') {
                System.exit(0);
            } else if (x == 'p') {
                gameOver = false;
                Main.s.reset();
                textField.setText("");
                history.setText("");
            } else {
                textField.setText("");
            }
        }
        RightPanel.lp.updateText();
        GameFrame.tp.updateText();
        textField.setText("");
    }
}

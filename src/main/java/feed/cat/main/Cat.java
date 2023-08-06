package feed.cat.main;

import com.formdev.flatlaf.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Cat extends JFrame implements KeyListener {
    JFrame frame;
    JButton buttonOne;
    public Cat() {
        buttonOne = new JButton("Feed");
        buttonOne.setEnabled(true);
        buttonOne.setVisible(true);
        buttonOne.addKeyListener(this);
        buttonOne.setBounds(0,0, 100,100);

        frame = new JFrame();
        frame.setSize(500, 800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.add(buttonOne);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

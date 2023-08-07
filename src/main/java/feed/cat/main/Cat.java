package feed.cat.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;

import static fontLoader.FontLoader.jetBrainsMono;
import static fontLoader.FontLoader.loadFonts;

public class Cat extends JFrame implements KeyListener {
    JButton buttonOne;
    public Cat() {
        loadFonts();

        URL homeButton = getClass().getClassLoader().getResource("home.gif");
        ImageIcon icon = new ImageIcon(new ImageIcon(homeButton).getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT));

        buttonOne = new JButton(icon);
        buttonOne.setEnabled(true);
        buttonOne.setVisible(true);
        buttonOne.addKeyListener(this);
        buttonOne.setOpaque(false);
        buttonOne.setContentAreaFilled(false);
        buttonOne.setBorderPainted(false);
        buttonOne.setFont(jetBrainsMono.deriveFont(12f));
        buttonOne.setEnabled(true);
        buttonOne.setBounds(320,0, 200,200);

        setSize(500, 800);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        add(buttonOne);
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

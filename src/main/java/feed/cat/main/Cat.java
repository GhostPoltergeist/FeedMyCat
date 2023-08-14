package feed.cat.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;

import static fontLoader.FontLoader.*;

public class Cat extends JFrame implements KeyListener {
    JButton buttonOne;
    JPanel rightPanel, leftPanel;
    public Cat() {
        loadFonts();

        rightPanel = new JPanel();
        rightPanel.setBackground(new Color(0xE072A4));
        rightPanel.setBounds(290, 0, 200, 800);
        rightPanel.setFont(jetBrainsMono.deriveFont(12f));

        leftPanel = new JPanel();
        leftPanel.setBackground(new Color(0x29AB87));
        leftPanel.setBounds(0, 0, 220, 800);
        leftPanel.setFont(jetBrainsMono.deriveFont(12f));

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

        getRootPane().putClientProperty("JRootPane.titleBarBackground", new Color(0xFFFFFF));
        getRootPane().putClientProperty("JRootPane.titleBarForeground", Color.BLACK);
        getRootPane().getContentPane().setBackground(new Color(0xF1FFFA));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        add(buttonOne);
        add(rightPanel);
        add(leftPanel);
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

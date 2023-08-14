package feed.cat.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;

import static fontLoader.FontLoader.*;

public class Cat extends JFrame implements KeyListener {
    JButton buttonOne;
    JButton start, save, settings, about;
    JPanel rightPanel, leftPanel;
    JLabel catTitle;
    public Cat() {
        loadFonts();

        start = new JButton("Start");
        start.setEnabled(true);
        start.setVisible(true);
        start.addKeyListener(this);
        start.setFont(jetBrainsMono.deriveFont(12f));
        start.setEnabled(true);
        start.setBounds(17,200, 100,40);
        start.setBackground(new Color(250, 160, 160));
        start.setForeground(Color.WHITE);

        save = new JButton("Save");
        save.setEnabled(true);
        save.setVisible(true);
        save.addKeyListener(this);
        save.setFont(jetBrainsMono.deriveFont(12f));
        save.setEnabled(true);
        save.setBounds(17,260, 100,40);
        save.setBackground(new Color(250, 160, 160));
        save.setForeground(Color.WHITE);

        settings = new JButton("Settings");
        settings.setEnabled(true);
        settings.setVisible(true);
        settings.addKeyListener(this);
        settings.setFont(jetBrainsMono.deriveFont(12f));
        settings.setEnabled(true);
        settings.setBounds(17,320, 100,40);
        settings.setBackground(new Color(250, 160, 160));
        settings.setForeground(Color.WHITE);

        about = new JButton("About");
        about.setEnabled(true);
        about.setVisible(true);
        about.addKeyListener(this);
        about.setFont(jetBrainsMono.deriveFont(12f));
        about.setEnabled(true);
        about.setBounds(17,380, 100,40);
        about.setBackground(new Color(250, 160, 160));
        about.setForeground(Color.WHITE);

        URL cat = getClass().getClassLoader().getResource("cat.gif");
        ImageIcon myCat = new ImageIcon(new ImageIcon(cat).getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT));

        catTitle = new JLabel(myCat);
        catTitle.setBounds(14,10, 200, 200);

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
        buttonOne.setBounds(7,0, 200,200);

        rightPanel = new JPanel();
        rightPanel.setBackground(new Color(0xE072A4));
        rightPanel.setBounds(290, 0, 200, 800);
        rightPanel.setFont(jetBrainsMono.deriveFont(12f));
        rightPanel.setLayout(null);
        rightPanel.add(buttonOne);

        setSize(500, 800);
        setVisible(true);

        getRootPane().putClientProperty("JRootPane.titleBarBackground", new Color(0xFFFFFF));
        getRootPane().putClientProperty("JRootPane.titleBarForeground", Color.BLACK);
        getRootPane().getContentPane().setBackground(new Color(0xF1FFFA));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        add(catTitle);

        add(start);
        add(save);
        add(settings);
        add(about);

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

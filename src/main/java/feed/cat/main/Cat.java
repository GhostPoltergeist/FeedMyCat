package feed.cat.main;

import LayoutCircleDraw.MainCircle;

import javax.swing.*;
import java.awt.*;

import static fontLoader.FontLoader.aleo;
import static fontLoader.FontLoader.loadFonts;

public class Cat extends JFrame {

    JPanel shadow, mainSideBar;
    JLabel title;
    JButton start, save, setting, about;

    public Cat() {
        loadFonts();

        start = new JButton("Start");
        start.setForeground(Color.WHITE);
        start.setBackground(new Color(0xAFC0CE));
        start.setFont(aleo.deriveFont(24f));
        start.setBounds(100, 190, 150, 50);
        start.setEnabled(true);
        start.setVisible(true);

        save = new JButton("Save");
        save.setForeground(Color.WHITE);
        save.setBackground(new Color(0xAFC0CE));
        save.setFont(aleo.deriveFont(24f));
        save.setBounds(100, 260, 150, 50);
        save.setEnabled(true);
        save.setVisible(true);

        setting = new JButton("Settings");
        setting.setForeground(Color.WHITE);
        setting.setBackground(new Color(0xAFC0CE));
        setting.setFont(aleo.deriveFont(24f));
        setting.setBounds(100, 330, 150, 50);
        setting.setEnabled(true);
        setting.setVisible(true);

        about = new JButton("About");
        about.setForeground(Color.WHITE);
        about.setBackground(new Color(0xAFC0CE));
        about.setFont(aleo.deriveFont(24f));
        about.setBounds(100, 400, 150, 50);
        about.setEnabled(true);
        about.setVisible(true);

        title = new JLabel("Feed My Cat");
        title.setFont(aleo.deriveFont(32f));
        title.setBounds(166, 24, 200, 200);
        title.setForeground(Color.WHITE);

        mainSideBar = new JPanel();
        mainSideBar.setLayout(null);
        mainSideBar.setBounds(0,0, 60, 800);
        mainSideBar.setBackground(new Color(0xBD52EA));

        shadow = new JPanel();
        shadow.setLayout(null);
        shadow.setBounds(0,0, 66, 800);
        shadow.setBackground(new Color(0x733E89));
        shadow.add(mainSideBar);

        MainCircle circlePanel = new MainCircle();

        circlePanel.setBounds(20, 432, 800, 600);
        circlePanel.setBackground(new Color(0x9C25D3));

        setLayout(null);
        setSize(500, 800);
        setVisible(true);
        setLocationRelativeTo(null);
        getRootPane().putClientProperty("JRootPane.titleBarBackground", new Color(0x733E89));
        getRootPane().putClientProperty("JRootPane.titleBarForeground", Color.white);
        getRootPane().getContentPane().setBackground(new Color(0x9C25D3));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(title);
        add(shadow);
        add(circlePanel);

        add(start);
        add(save);
        add(setting);
        add(about);
    }
}
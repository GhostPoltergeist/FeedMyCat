package feed.cat.main;

import LayoutCircleDraw.MainCircle;

import javax.swing.*;
import java.awt.*;

public class Cat extends JFrame {

    public Cat() {

        MainCircle circlePanel = new MainCircle();

        circlePanel.setBounds(20, 432, 800, 600);
        circlePanel.setBackground(new Color(0x9C25D3));

        setLayout(null);
        setSize(500, 800);
        setVisible(true);
        setLocationRelativeTo(null);
        getRootPane().putClientProperty("JRootPane.titleBarBackground", new Color(0x9C25D3));
        getRootPane().putClientProperty("JRootPane.titleBarForeground", Color.white);
        getRootPane().getContentPane().setBackground(new Color(0x9C25D3));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(circlePanel);

    }
}
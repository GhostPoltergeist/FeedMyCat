package ConfigurationPack;

import LayoutCircleDraw.MainLayout.ConfigLayout.FirstDivider;

import javax.swing.*;
import java.awt.*;

import static fontLoader.FontLoader.aleo;
import static fontLoader.FontLoader.loadFonts;

public class About extends JFrame {

    JLabel title;
    JTextArea description;

    public About() {
        loadFonts();

        FirstDivider dividerHor = new FirstDivider();
        dividerHor.setLayout(null);
        dividerHor.setBounds(0,0, 800, 800);

        title = new JLabel("About");
        title.setBounds(15, 25, 91, 38);
        title.setFont(aleo.deriveFont(32f));
        title.setForeground(Color.WHITE);

        description = new JTextArea();
        description.setBounds(40, 80, 491, 165);
        description.setEditable(false);
        description.setLineWrap(true);
        description.setWrapStyleWord(true);
        description.setOpaque(false);
        description.setFont(aleo.deriveFont(16f));
        description.setForeground(Color.WHITE);
        description.setText("""
                An enchanting desktop game crafted with Java,\s
                combining the charm of virtual pet simulation and\s
                interactive gameplay

                This game brings the joy of nurturing and\s
                engaging with anadorable virtual companion\s
                directly to your desktop environment.""");

        setLayout(null);
        setSize(500, 371);
        setVisible(true);
        setLocation(10, 205);
        setResizable(false);
        getRootPane().putClientProperty("JRootPane.titleBarBackground", new Color(0x631958));
        getRootPane().putClientProperty("JRootPane.titleBarForeground", Color.white);
        getRootPane().getContentPane().setBackground(new Color(0x9C25D3));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Adding Title and Description
        add(title);
        add(description);


        // Adding Divider
        add(dividerHor);
    }

}

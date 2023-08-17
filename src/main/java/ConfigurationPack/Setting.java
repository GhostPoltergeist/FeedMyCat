package ConfigurationPack;

import LayoutCircleDraw.MainLayout.ConfigLayout.FirstDivider;

import javax.swing.*;
import java.awt.*;

import static fontLoader.FontLoader.aleo;
import static fontLoader.FontLoader.loadFonts;

public class Setting extends JFrame {
    JLabel title;
    JButton lang, account, extras;

    public Setting() {
        loadFonts();

        lang = new JButton("Lang");
        lang.setForeground(Color.WHITE);
        lang.setBackground(new Color(0xAFC0CE));
        lang.setFont(aleo.deriveFont(24f));
        lang.setBounds(60, 75, 150, 50);
        lang.setEnabled(true);
        lang.setVisible(true);

        account = new JButton("Account");
        account.setForeground(Color.WHITE);
        account.setBackground(new Color(0xAFC0CE));
        account.setFont(aleo.deriveFont(24f));
        account.setBounds(60, 136, 150, 50);
        account.setEnabled(true);
        account.setVisible(true);

        extras = new JButton("Extras");
        extras.setForeground(Color.WHITE);
        extras.setBackground(new Color(0xAFC0CE));
        extras.setFont(aleo.deriveFont(24f));
        extras.setBounds(60, 197, 150, 50);
        extras.setEnabled(true);
        extras.setVisible(true);

        FirstDivider dividerHor = new FirstDivider();
        dividerHor.setLayout(null);
        dividerHor.setBounds(0,0, 800, 800);

        title = new JLabel("Settings");
        title.setBounds(15, 25, 91, 38);
        title.setFont(aleo.deriveFont(25f));
        title.setForeground(Color.WHITE);


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

        // Adding Divider and Circles
        add(dividerHor);

        // Adding Buttons
        add(lang);
        add(account);
        add(extras);
    }

}

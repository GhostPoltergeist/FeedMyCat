package LayoutCircleDraw.MainLayout.ConfigLayout;

import javax.swing.*;
import java.awt.*;

public class FirstDivider extends JPanel {

    public FirstDivider() {
        setOpaque(false);
        setLayout(null);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int startX = 125;
        int horizontalY = 43;
        int endX = startX + 345; // Adjust the end position to make the horizontal line about 100 pixels long

        int verticalX = 27; // Adjust the x-coordinate for the vertical line
        int startY = 80;
        int endY = startY + 155; // Adjust the end position to make the vertical line about 700 pixels long

        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.WHITE);
        g2d.setStroke(new BasicStroke(2)); // Set the line thickness

        g2d.drawLine(startX, horizontalY, endX, horizontalY); // Draw the horizontal line
        g2d.drawLine(verticalX, startY, verticalX, endY); // Draw the vertical line
    }

}

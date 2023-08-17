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

        // Draw circles left side
        int circle1X = -30;
        int circle1Y = 260;
        int circle2X = 40;
        int circle2Y = 280;
        int circle3X = 18;
        int circle3Y = 255;
        int circleRadius = 50;

        g2d.setColor(new Color(0x8A3690));
        g2d.fillOval(circle3X, circle3Y, circleRadius * 2, circleRadius * 2); // Underlying circle
        g2d.setColor(new Color(0xBBDEFB));
        g2d.fillOval(circle1X, circle1Y, circleRadius * 2, circleRadius * 2); // Upper circle
        g2d.fillOval(circle2X, circle2Y, circleRadius * 2, circleRadius * 2); // Slightly right circle

        // Draw circles right side
        int circle1XX = 420;
        int circle2XX = 356;
        int circle3XX = 380;

        g2d.setColor(new Color(0x8A3690));
        g2d.fillOval(circle3XX, circle3Y, circleRadius * 2, circleRadius * 2); // Underlying circle
        g2d.setColor(new Color(0xBBDEFB));
        g2d.fillOval(circle1XX, circle1Y, circleRadius * 2, circleRadius * 2); // Upper circle
        g2d.fillOval(circle2XX, circle2Y, circleRadius * 2, circleRadius * 2); // Slightly right circle
    }

}

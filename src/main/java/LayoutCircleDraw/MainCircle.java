package LayoutCircleDraw;

import javax.swing.*;
import java.awt.*;

public class MainCircle extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Set the color for the circle
        g.setColor(new Color(0xBBDEFB));

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        int radius = 205; // Adjust the radius as needed

        // Draw the circle
        g.fillOval(centerX - radius, centerY - radius, 2 * radius, 2 * radius);

        int oblongCircleWidth = 290; // Adjust the width as needed
        int oblongCircleHeight = 215; // Adjust the height as needed
        double rotationAngle = 47.0; // Rotation angle in degrees
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor(new Color(0x4C0E3D));
        g2d.rotate(Math.toRadians(rotationAngle), centerX, centerY);
        g2d.fillOval(centerX - oblongCircleWidth / 2, centerY - oblongCircleHeight / 2, oblongCircleWidth, oblongCircleHeight);

    }
}

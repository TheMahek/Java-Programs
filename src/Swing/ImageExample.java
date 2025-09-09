package Swing;

import javax.swing.*;
import java.awt.*;
public class ImageExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Image in JPanel-IntelliJ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);

        //Custom JPanel that paints background image
        JPanel imagePanel = new JPanel() {
            java.awt.Image backgroundImage =
                    new ImageIcon(getClass().getResource("/Swing/Image/img.png")).getImage();


            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }

        };
        frame.add(imagePanel);
        frame.setVisible(true);
    }
}
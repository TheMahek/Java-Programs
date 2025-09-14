package Swing;

import javax.swing.*;

public class TextImageLabel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Text + Image Example");

        // Load image
        Icon icon = new ImageIcon("src/Swing/Image/image.png");

        // Text + IMAGE IN ONE LABEL
        JLabel label = new JLabel("Java", icon, JLabel.CENTER);

        // Fix text position (show below the image)
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);

        frame.add(label);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

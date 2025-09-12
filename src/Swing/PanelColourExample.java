package Swing;
import javax.swing.*;
import java.awt.*;
public class PanelColourExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Colored JPalen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);

        JPanel panel = new JPanel();
        panel.setBackground(Color.pink);

        frame.add(panel);
        frame.setVisible(true);
    }
}
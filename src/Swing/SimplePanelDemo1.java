package Swing;

import javax.swing.*;

public class SimplePanelDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple JPanle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        JPanel panel = new JPanel();
        frame.add(panel);

        frame.setVisible(true);
    }

}

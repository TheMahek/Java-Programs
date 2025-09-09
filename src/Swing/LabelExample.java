package Swing;

import javax.swing.*;
public class LabelExample {
    public static void main(String[] args){
        JFrame frame = new JFrame("Jlabel Demo SK Mahek");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello,Mahek !");
        label.setBounds(50,50,200,30);//x,y, width and Height

        frame.setLayout(null); // Absolute positioning
        frame.add(label);

        frame.setVisible(true);
    }
}
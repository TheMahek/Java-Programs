package Swing;

import javax.swing.*;
import java.awt.*;

public class RegistrationForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Registration Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 350);
        frame.setLocationRelativeTo(null);

        // Load background image from resources (portable)
        ImageIcon backgroundImage = new ImageIcon(
                RegistrationForm.class.getResource("Image/img.png")
        );

        // Custom JPanel for background
        JPanel backgroundPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        backgroundPanel.setLayout(new BorderLayout());

// Heading
        JLabel headingLabel = new JLabel("Registration Form", JLabel.CENTER);
        headingLabel.setFont(new Font("Arial", Font.BOLD, 22));
        headingLabel.setOpaque(true);
        headingLabel.setBackground(new Color(255, 223, 100, 220));
        headingLabel.setForeground(Color.BLACK);
        headingLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));


        // Text fields
        JTextField nameField = new JTextField(12);
        JTextField addressField = new JTextField(12);
        JTextField mobileField = new JTextField(12);

        // Styling text fields
        JTextField[] fields = {nameField, addressField, mobileField};
        for (JTextField field : fields) {
            field.setBackground(new Color(255, 255, 255, 200));
            field.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        }

        // Labels
        JLabel nameLabel = new JLabel("Name:");
        JLabel addressLabel = new JLabel("Address:");
        JLabel mobileLabel = new JLabel("Mobile No:");
        nameLabel.setForeground(Color.WHITE);
        addressLabel.setForeground(Color.WHITE);
        mobileLabel.setForeground(Color.WHITE);

        // Form panel
        JPanel formPanel = new JPanel(new GridLayout(3, 2, 12, 12));
        formPanel.setOpaque(false);
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40));

        formPanel.add(nameLabel);
        formPanel.add(nameField);
        formPanel.add(addressLabel);
        formPanel.add(addressField);
        formPanel.add(mobileLabel);
        formPanel.add(mobileField);

        // Buttons
        JButton submitButton = new JButton("Submit");
        JButton resetButton = new JButton("Reset");

        // Button Actions
        submitButton.addActionListener(e -> {
            String name = nameField.getText().trim();
            String address = addressField.getText().trim();
            String mobile = mobileField.getText().trim();

            if (name.isEmpty() || address.isEmpty() || mobile.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Please fill all fields!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(frame,
                        "✅ Registration Successful!\n\n" +
                                "Name: " + name +
                                "\nAddress: " + address +
                                "\nMobile: " + mobile,
                        "Success",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        resetButton.addActionListener(e -> {
            for (JTextField field : fields) {
                field.setText("");
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.setOpaque(false);
        buttonPanel.add(submitButton);
        buttonPanel.add(resetButton);

        // Add everything
        backgroundPanel.add(headingLabel, BorderLayout.NORTH);
        backgroundPanel.add(formPanel, BorderLayout.CENTER);
        backgroundPanel.add(buttonPanel, BorderLayout.SOUTH);

        frame.add(backgroundPanel);
        frame.setVisible(true);
    }
}

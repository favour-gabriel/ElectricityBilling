package eletricityBillingSystem;

import javax.swing.*;
import java.awt.event.*;

public class Billing extends JFrame implements ActionListener{


    private JLabel nameLabel, meterLabel, unitsLabel, stateLabel, cityLabel, residentialAddressLabel, emailLabel, phoneLabel,
    monthLabel, resultLabel;
    private JTextField nameField, meterField, unitsField, stateField, cityField, residentialAddressField, emailField, phoneField,
            monthField, resultField;
    private JButton calculateButton;

    public Billing() {

        nameLabel = new JLabel("Consumer full name: ");
        meterLabel = new JLabel("Meter number: ");
        unitsLabel = new JLabel("Units Consumed: ");
        stateLabel = new JLabel("State: ");
        cityLabel = new JLabel("City");
        residentialAddressLabel = new JLabel("Residential address: ");
        emailLabel = new JLabel("Email address: ");
        phoneLabel = new JLabel("Phone number: ");
        monthLabel = new JLabel("Month");
        resultLabel = new JLabel("Total Amount: ");

        nameField = new JTextField();
        meterField = new JTextField();
        unitsField = new JTextField();
        stateField = new JTextField();
        cityField = new JTextField();
        residentialAddressField = new JTextField();
        emailField = new JTextField();
        phoneField = new JTextField();
        monthField = new JTextField();
        resultField = new JTextField();

        resultField.setEditable(false);

        calculateButton = new JButton("Calculate billing");
        calculateButton.addActionListener(this);

        setLayout(null);

        nameLabel.setBounds(20, 30, 120, 20);
        nameField.setBounds(150, 30, 150, 20);

        meterLabel.setBounds(20, 70, 120, 20);
        meterField.setBounds(150, 70, 150, 20);

        unitsLabel.setBounds(20, 110, 120, 20);
        unitsField.setBounds(150, 110, 150, 20);

        stateLabel.setBounds(20, 150, 120, 20);
        stateField.setBounds(150, 150, 150, 20);

        cityLabel.setBounds(20, 190, 120, 20);
        cityField.setBounds(150, 190, 150, 20);

        residentialAddressLabel.setBounds(20, 230, 120, 20);
        residentialAddressField.setBounds(150, 230, 150, 20);

        monthLabel.setBounds(20, 270, 120, 20);
        monthField.setBounds(150, 270, 150, 20);

        emailLabel.setBounds(20, 310, 120, 20);
        emailField.setBounds(150, 310, 150, 20);

        phoneLabel.setBounds(20, 350, 120, 20);
        phoneField.setBounds(150, 350, 150, 20);

        resultLabel.setBounds(20, 390, 120, 20);
        resultField.setBounds(150, 390, 150, 20);

        calculateButton.setBounds(150, 430, 150, 30);

        add(nameLabel);
        add(nameField);
        add(meterLabel);
        add(meterField);
        add(unitsLabel);
        add(unitsField);
        add(stateLabel);
        add(stateField);
        add(cityLabel);
        add(cityField);
        add(residentialAddressLabel);
        add(residentialAddressField);
        add(emailLabel);
        add(emailField);
        add(phoneLabel);
        add(phoneField);
        add(monthLabel);
        add(monthField);
        add(resultLabel);
        add(resultField);
        add(calculateButton);

        setTitle("Electricity Billing Calculator");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {

            String customerName = nameField.getText();
            int unitsConsumed = Integer.parseInt(unitsField.getText());

            double totalAmount = unitsConsumed * 0.2;

            resultField.setText(String.format("%.5f", totalAmount));
        }
    }

    public static void main(String[] args) {

        new Billing();
    }
}
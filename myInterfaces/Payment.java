package myInterfaces;


import java.lang.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.time.*;
import java.time.format.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Payment extends JFrame {

    private Container c;
    private ImageIcon icon;
    private JLabel label1, label2, cardNameLabel, cardNumberLabel, validLabel, paymentImageLabel, pinLabel, imgLabel;
    private Font f1, f2, f3, f4, f5, f6;
    private ImageIcon americanExpressImage, paypalImage, visaImage, paymentImage, backIcon;
    private JTextField cardNameField, cardNumberField, validField;
    private JPasswordField pinField;
    private JButton backButton, confirmButton, nBtn;
    private JPanel cardPanel, mobilePanel;
    private Cursor cursor;

    public Payment(String name1, String name2) {
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Payment");
        this.setSize(1000, 700);
		this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);

        // Icon
        icon = new ImageIcon(getClass().getResource("/images/motorbike2.png"));
        this.setIconImage(icon.getImage());

        // card panel
        cardPanel = new JPanel();
        cardPanel.setLayout(null);
        cardPanel.setBounds(500, 150, 500, 500);
        cardPanel.setBackground(Color.WHITE);

        // Images

        paymentImage = new ImageIcon(getClass().getResource("/images/payment1.png"));
        paymentImageLabel = new JLabel(paymentImage);
        paymentImageLabel.setBounds(50, 100, paymentImage.getIconWidth(), paymentImage.getIconHeight());
        c.add(paymentImageLabel);

        americanExpressImage = new ImageIcon(getClass().getResource("/images/american-express64.png"));
        imgLabel = new JLabel(americanExpressImage);
        imgLabel.setBounds(225, 0, 65, 60);
        cardPanel.add(imgLabel);

        paypalImage = new ImageIcon(getClass().getResource("/images/paypal64.png"));
        imgLabel = new JLabel(paypalImage);
        imgLabel.setBounds(310, 0, 65, 60);
        cardPanel.add(imgLabel);

        visaImage = new ImageIcon(getClass().getResource("/images/visa64.png"));
        imgLabel = new JLabel(visaImage);
        imgLabel.setBounds(400, 0, 65, 60);
        cardPanel.add(imgLabel);

        // Title
        label1 = new JLabel();
        label1.setText("Complete Your Payment");
        label1.setForeground(Color.decode("#184e77"));
        label1.setBounds(555, 60, 500, 50);
        label1.setFont(new Font("Times New Roman", Font.BOLD, 30));
        this.add(label1);

        label2 = new JLabel("We Accept Only");
        label2.setBounds(20, 15, 250, 35);
        label2.setHorizontalTextPosition(JLabel.CENTER);
        label2.setVerticalTextPosition(JLabel.CENTER);
        label2.setFont(new Font("Times New Roman", Font.BOLD, 25));
        cardPanel.add(label2);

        label2 = new JLabel("Please Provide Your Card Details");
        label2.setBounds(90, 65, 500, 30);
        label2.setForeground(Color.decode("#ff9505"));
        label2.setHorizontalTextPosition(JLabel.CENTER);
        label2.setVerticalTextPosition(JLabel.CENTER);
        label2.setFont(new Font("Times New Roman", Font.BOLD, 21));
        cardPanel.add(label2);

        // Name On Card
        cardNameLabel = new JLabel("Name On Card");
        cardNameLabel.setBounds(20, 100, 250, 30);
        cardNameLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        cardPanel.add(cardNameLabel);

        cardNameField = new JTextField();
        cardNameField.setBounds(20, 132, 250, 30);
        cardNameField.setFont(new Font("Times New Roman", Font.BOLD, 20));
        cardPanel.add(cardNameField);

        // Card Number
        cardNumberLabel = new JLabel("Card Number");
        cardNumberLabel.setBounds(20, 170, 250, 30);
        cardNumberLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        cardPanel.add(cardNumberLabel);

        cardNumberField = new JTextField();
        cardNumberField.setBounds(20, 202, 250, 30);
        cardNumberField.setFont(new Font("Times New Roman", Font.BOLD, 20));
        cardNumberField.setHorizontalAlignment(JTextField.CENTER);
        cardPanel.add(cardNumberField);

        // Valid On
        validLabel = new JLabel("Valid On");
        validLabel.setBounds(20, 250, 75, 20);
        validLabel.setForeground(Color.decode("#ef476f"));
        validLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        cardPanel.add(validLabel);

        validField = new JTextField();
        validField.setBounds(95, 250, 75, 25);
        validField.setFont(new Font("Times New Roman", Font.BOLD, 20));
        validField.setHorizontalAlignment(JTextField.CENTER);
        cardPanel.add(validField);

        // pin Code
        pinLabel = new JLabel("Pin");
        pinLabel.setBounds(275, 250, 75, 20);
        pinLabel.setForeground(Color.decode("#ef476f"));
        pinLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        cardPanel.add(pinLabel);

        pinField = new JPasswordField();
        pinField.setBounds(310, 250, 75, 25);
        pinField.setHorizontalAlignment(JPasswordField.CENTER);
        pinField.setEchoChar('*');
        pinField.setFont(new Font("Times New Roman", Font.BOLD, 20));
        cardPanel.add(pinField);

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // JButtons

        backButton = new JButton("Back");
        backButton.setBounds(450, 600, 80, 60);
        backButton.setText("Back");
        backButton.setForeground(Color.decode("#301934"));
        backButton.setHorizontalTextPosition(JButton.CENTER);
        backButton.setVerticalTextPosition(JButton.BOTTOM);
        backButton.setContentAreaFilled(false);
        backButton.setFocusable(false);
        backButton.setFocusPainted(false);
        backButton.setBorderPainted(false);
        backButton.setFont(new Font("Times New Roman", Font.BOLD, 20));

        backIcon = new ImageIcon(getClass().getResource("/images/reply1.png"));
        backButton.setIcon(backIcon);
        // Back Button
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                PassengerDashBoard frame = new PassengerDashBoard(name1);
                frame.setVisible(true);
            }
        });
        c.add(backButton);

        // confirm button
        confirmButton = new JButton("Confirm Payment");
        confirmButton.setBounds(125, 330, 200, 50);
        confirmButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        confirmButton.setCursor(cursor);
        confirmButton.setForeground(Color.WHITE);
        confirmButton.setBackground(Color.decode("#184e77"));
        cardPanel.add(confirmButton);

        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);
        c.add(cardPanel);

        // Confirm Payment Button
        confirmButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String nameOnCard = cardNameField.getText();
                String cardNumber = cardNumberField.getText();
                String validOn = validField.getText();
                String cvvCode = pinField.getText();

                if (nameOnCard.isEmpty() || cardNumber.isEmpty() || validOn.isEmpty() ||
                        cvvCode.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.",
                            "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    setVisible(false);
                    PaymentReceiptGenerator frame1 = new PaymentReceiptGenerator(name1, name2);
                    //frame1.setVisible(true);
					PassengerDashBoard frame2 = new PassengerDashBoard(name1);
			        frame2.setVisible(true);
                }
            }
        });

    }

    public static void main(String[] args) {

        Payment frame = new Payment("Saron1", "Saron2");
        frame.setVisible(true);
    }
}

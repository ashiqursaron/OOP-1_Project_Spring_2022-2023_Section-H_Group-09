package myInterfaces;

//package classes ;
//import classes.*;
import javax.swing.*;
import java.lang.*;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;
import java.time.*;
import java.time.format.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PassengerDashBoard extends JFrame {

    private JPanel searchPanel, userInfoPanel;
    private JLabel fromLabel, toLabel, timeLabel, passengerLabel, passengerName, carImageLabel, messagelabel;
    private JTextField fromField, toField, timeField, passengerField;
    private JButton searchButton, logoutButton, resetButton, paymentButton;
    private JTextArea resultsArea;
    public String name2;

    public PassengerDashBoard(String name) {

        this.setTitle("Passenger Dash Board");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(1000, 700);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        // this.requestFocusInWindow();
        this.setVisible(true);
        this.getContentPane().setBackground(Color.WHITE);
        // set up frame icon
        ImageIcon frameIcon = new ImageIcon(getClass().getResource("/images/motorbike2.png"));
        this.setIconImage(frameIcon.getImage());

        // setting up the user info panel
        userInfoPanel = new JPanel();
        userInfoPanel.setBounds(0, 0, 1000, 100);
        userInfoPanel.setLayout(null);
        userInfoPanel.setBackground(Color.WHITE);

        // setting up message label
        messagelabel = new JLabel("Start Your Journey With Aiub Ridez");
        messagelabel.setForeground(Color.decode("#7209b7"));
        // messagelabel.requestFocusInWindow();
        messagelabel.setFont(new Font("Cooper Black", Font.BOLD, 27));
        messagelabel.setBounds(175, 60, 600, 50);
        userInfoPanel.add(messagelabel);

        // setting up the admin name
        passengerName = new JLabel();
        passengerName.setText("Welcome " + name.toUpperCase());
        passengerName.requestFocus();
        passengerName.setForeground(Color.decode("#2b2d42"));
        passengerName.setHorizontalAlignment(JLabel.CENTER);
        passengerName.setVerticalAlignment(JLabel.CENTER);
        passengerName.setFont(new Font("Times New Roman", Font.BOLD, 18));
        passengerName.setBounds(20, 10, 200, 40);
        passengerName.setBackground(Color.WHITE);
        Border blueBorder = BorderFactory.createLineBorder(Color.decode("#240046"), 2);
        passengerName.setBorder(blueBorder);
        // passengerName.setForeground(Color.BLACK);
        userInfoPanel.add(passengerName);

        // adding signout button
        // Create login button
        logoutButton = new JButton("Log Out");
        logoutButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
        logoutButton.setBounds(800, 25, 150, 30);
        logoutButton.setFocusable(false);
        logoutButton.setForeground(Color.BLACK);
        logoutButton.requestFocusInWindow();
        logoutButton.setBackground(Color.decode("#98c1d9"));
        // logoutButton.addActionListener(this);
        userInfoPanel.add(logoutButton);
        // adding action listener
        logoutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == logoutButton) {
                    // Open the welcome frame
                    dispose();
                    PassengerLoginFrame frame = new PassengerLoginFrame();
                    frame.setVisible(true);
                }
            }
        });
        userInfoPanel.add(logoutButton);

        // setting image
        ImageIcon carImage1 = new ImageIcon(getClass().getResource("/images/hatchback.png"));

        carImageLabel = new JLabel(carImage1);
        // carImageLabel.set(carImage);
        carImageLabel.setBounds(700, 0, 300, 300);

        searchPanel = new JPanel();
        searchPanel.setLayout(null);
        searchPanel.setBounds(0, 100, 1000, 600);
        searchPanel.setBackground(Color.WHITE);

        // from label and text field
        fromLabel = new JLabel("From:");
        fromLabel.setForeground(Color.decode("#d90429"));
        fromLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
        fromLabel.setBounds(150, 50, 100, 30);

        fromField = new JTextField("Kuratoli");
        fromField.setForeground(Color.GRAY);
        fromField.setFont(new Font("Times New Roman", Font.BOLD, 12));
        Border border = BorderFactory.createLineBorder(Color.GRAY, 1, true);
        fromField.setBorder(border);
        // fromField.setFocusable(false);
        fromField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                Border highlightBorder = BorderFactory.createLineBorder(Color.decode("#2b2d42"), 2, true);
                fromField.setBorder(highlightBorder);
                fromField.setText("Kuratoli");
                fromField.setForeground(Color.BLACK);
                fromField.setFont(new Font("Times New Roman", Font.BOLD, 18));
            }

            @Override
            public void focusLost(FocusEvent e) {
                fromField.setBorder(border);
                // fromField.setText("Kuratoli");
                // fromField.setForeground(Color.GRAY);
                // fromField.setFont(new Font("Times New Roman", Font.BOLD, 12));
            }
        });
        fromField.setBounds(150, 90, 200, 30);

        // to label and to textfield
        toLabel = new JLabel("To:");
        toLabel.setForeground(Color.decode("#d90429"));
        toLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
        toLabel.setBounds(500, 50, 100, 30);

        toField = new JTextField("Airport");
        toField.setForeground(Color.GRAY);
        toField.setFont(new Font("Times New Roman", Font.BOLD, 12));
        toField.setBorder(border);
        toField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                Border highlightBorder = BorderFactory.createLineBorder(Color.decode("#2b2d42"), 2, true);
                toField.setBorder(highlightBorder);
                toField.setText(null);
                toField.setForeground(Color.BLACK);
                toField.setFont(new Font("Times New Roman", Font.BOLD, 18));
            }

            @Override
            public void focusLost(FocusEvent e) {
                toField.setBorder(border);
                // toField.setText("Airport");
                // toField.setForeground(Color.GRAY);
                // toField.setFont(new Font("Times New Roman", Font.BOLD, 12));
            }
        });
        toField.setBounds(500, 90, 200, 30);

        // adding time label and time field

        timeLabel = new JLabel("Time:");
        timeLabel.setForeground(Color.decode("#d90429"));
        timeLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
        timeLabel.setBounds(150, 130, 100, 30);

        timeField = new JTextField("11:00");
        timeField.setForeground(Color.GRAY);
        timeField.setFont(new Font("Times New Roman", Font.BOLD, 12));
        timeField.setBorder(border);
        timeField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                Border highlightBorder = BorderFactory.createLineBorder(Color.decode("#2b2d42"), 2, true);
                timeField.setBorder(highlightBorder);
                timeField.setText(null);
                timeField.setForeground(Color.BLACK);
                timeField.setFont(new Font("Times New Roman", Font.BOLD, 18));
            }

            @Override
            public void focusLost(FocusEvent e) {
                timeField.setBorder(border);
                // timeField.setText(null);
                // timeField.setForeground(Color.BLACK);
                // timeField.setFont(new Font("Times New Roman", Font.BOLD, 12));
            }
        });
        timeField.setBounds(150, 160, 200, 30);

        passengerLabel = new JLabel("Passenger Type:");
        passengerLabel.setForeground(Color.decode("#d90429"));
        passengerLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
        passengerLabel.setBounds(500, 130, 250, 30);

        passengerField = new JTextField("Single");
        passengerField.setForeground(Color.GRAY);
        passengerField.setFont(new Font("Times New Roman", Font.BOLD, 12));
        passengerField.setBorder(border);
        passengerField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                Border highlightBorder = BorderFactory.createLineBorder(Color.decode("#2b2d42"), 2, true);
                passengerField.setBorder(highlightBorder);
                passengerField.setText(null);
                passengerField.setFont(new Font("Times New Roman", Font.BOLD, 18));
                passengerField.setForeground(Color.BLACK);
            }

            @Override
            public void focusLost(FocusEvent e) {
                passengerField.setBorder(border);
                // passengerField.setText(null);
                // passengerField.setForeground(Color.Gray);
                // passengerField.setFont(new Font("Times New Roman", Font.BOLD, 12));
            }
        });
        passengerField.setBounds(500, 160, 200, 30);

        // search button

        searchButton = new JButton("Search Drivers");
        // giving image in the button
        ImageIcon carImage = new ImageIcon(getClass().getResource("/images/car2.png"));
        searchButton.setFont(new Font("Times New Roman", Font.BOLD, 25));
        searchButton.setHorizontalTextPosition(JButton.LEFT);
        searchButton.setVerticalTextPosition(JButton.CENTER);
        searchButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        searchButton.setFocusable(false);
        searchButton.setForeground(Color.WHITE);
        searchButton.setBackground(Color.decode("#2b2d42"));
        searchButton.setBounds(450, 225, 250, 40);
        searchButton.setIcon(carImage);

        // adding reset button
        resetButton = new JButton("Clear");
        resetButton.setFont(new Font("Times New Roman", Font.BOLD, 25));
        resetButton.setBounds(150, 225, 250, 40);
        resetButton.setFocusable(false);
        resetButton.setForeground(Color.WHITE);
        resetButton.setBackground(Color.decode("#2b2d42"));
        // resetButton.addActionListener(this);
        searchPanel.add(resetButton);
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                fromField.setText(null);
                toField.setText(null);
                timeField.setText(null);
                passengerField.setText(null);
                resultsArea.setText(null);
                paymentButton.setVisible(false);

            }
        });

        // adding payment button
        paymentButton = new JButton("Proceed To Payment");
        paymentButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        paymentButton.setBounds(325, 610, 250, 40);
        paymentButton.setFocusable(false);
        paymentButton.setForeground(Color.WHITE);
        paymentButton.setBackground(Color.decode("#00bbf9"));
        paymentButton.setVisible(false);

        // result area
        resultsArea = new JTextArea();
        resultsArea.setBounds(100, 300, 700, 200);
        resultsArea.setFont(new Font("Times New Roman", Font.BOLD, 18));
        resultsArea.setForeground(Color.decode("#ae2012"));
        resultsArea.setBorder(BorderFactory.createLineBorder(Color.decode("#e0fbfc")));
        resultsArea.setBackground(Color.decode("#8d99ae"));
        resultsArea.setEditable(false);

        searchPanel.add(fromLabel);
        searchPanel.add(toLabel);
        searchPanel.add(fromField);
        searchPanel.add(toField);
        searchPanel.add(timeLabel);
        searchPanel.add(passengerLabel);
        searchPanel.add(timeField);
        searchPanel.add(passengerField);
        searchPanel.add(searchButton);
        searchPanel.add(resultsArea);
        searchPanel.add(carImageLabel);

        // adding elements to the frame
        // this.add(carLabel);
        this.add(searchPanel);
        this.add(userInfoPanel);
        this.add(paymentButton);

        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                resultsArea.setText(null);

                // checking time pattern
                String timePattern = "^(0?[0-9]|1[0-9]|2[0-3]):([0-5][0-9])$";

                Pattern pattern = Pattern.compile(timePattern);

                String textField1 = fromField.getText().toLowerCase(); // from
                String textField2 = toField.getText().toLowerCase(); // to
                String textField3 = timeField.getText(); // time
                String textField4 = passengerField.getText();

                // Create a Matcher object and match the input against the pattern
                Matcher matcher = pattern.matcher(textField3);

                if (textField1.isEmpty() || textField2.isEmpty() || textField3.isEmpty() || textField4.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.ERROR_MESSAGE);
                }

                else if (!(matcher.matches())) {

                    JOptionPane.showMessageDialog(null, "Invalid Time Format", "Time Format Error!",
                            JOptionPane.ERROR_MESSAGE);

                }

                else {

                    try {
                        String from = "From : " + textField1;
                        String to = "To : " + textField2;
                        String time = "Time : " + textField3;
                        String passenger = "Passenger Type : " + textField4;

                        BufferedReader reader = new BufferedReader(new FileReader(".\\Data\\trip_data.txt"));
                        // PrintWriter pw = new PrintWriter(reader);
                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        boolean foundMatch = false; // Variable to track if any matching results are found

                        for (int i = 0; i <= totalLines; i++) {
                            String line = Files.readAllLines(Paths.get(".\\Data\\trip_data.txt")).get(i);
                            if (line.equals(from)) {
                                String line2 = Files.readAllLines(Paths.get(".\\Data\\trip_data.txt")).get((i + 1));
                                if (line2.equals(to)) {
                                    String line3 = Files.readAllLines(Paths.get(".\\Data\\trip_data.txt")).get((i + 2));
                                    if (line3.equals(time)) {
                                        String line4 = Files.readAllLines(Paths.get(".\\Data\\trip_data.txt"))
                                                .get((i + 3));
                                        if (line4.equals(passenger)) {
                                            String message = Files.readAllLines(Paths.get(".\\Data\\trip_data.txt"))
                                                    .get((i + 4)).substring(14) + " matched with you!";
                                            resultsArea.append(message);
                                            name2 = Files.readAllLines(Paths.get(".\\Data\\trip_data.txt")).get((i + 4))
                                                    .substring(14);
                                            // pw.print(name );
                                            // pw.flush();
                                            // pw.close();
                                            paymentButton.setVisible(true);

                                            foundMatch = true; // Set foundMatch to true when a match is found
                                            break;
                                        }
                                        /*
                                         * else{
                                         * String message =
                                         * "No Rider is found at the Moment ! \nSorry For Your Inconvinience . \nRetry after some time ."
                                         * ;
                                         * resultsArea.append(message);
                                         * }
                                         */
                                    }
                                }
                            } else {
                                String message = "No Rider is found at the Moment ! \nSorry For Your Inconvinience . \nRetry after some time .";
                                resultsArea.append(message);
                                break;
                            }
                        }

                        if (!foundMatch) {
                            JOptionPane.showMessageDialog(null, "No Rider Found!", "Apology Message!",
                                    JOptionPane.INFORMATION_MESSAGE);
                            // String message = "No Rider is found at the Moment ! \nSorry For Your
                            // Inconvinience . \nRetry after some time .";
                            // resultsArea.append(message);
                        }
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Error occurred!", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                }
            }
        });

        paymentButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                // setVisible(false);
                dispose();
                Payment frame = new Payment(name, name2);

            }
        });

    }

    public static void main(String[] args) {
        PassengerDashBoard userFrame = new PassengerDashBoard("Saron");
    }

}

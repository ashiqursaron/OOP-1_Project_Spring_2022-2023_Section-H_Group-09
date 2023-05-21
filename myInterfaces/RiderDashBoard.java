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

public class RiderDashBoard extends JFrame {

    private JPanel searchPanel, userInfoPanel;
    private JLabel fromLabel, toLabel, timeLabel, vehicleLabel, riderName, messagelabel;
    private JTextField fromField, toField, timeField, passengerField;
    private JButton searchButton, logoutButton, resetButton;
    private JTextArea resultsArea;

    public RiderDashBoard(String name) {

        this.setTitle("Rider Dash Board");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(1000, 700);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
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
        messagelabel = new JLabel("Look For Rides With Aiub Ridez");
        messagelabel.setForeground(Color.decode("#7209b7"));
        messagelabel.setFont(new Font("Cooper Black", Font.BOLD, 27));
        messagelabel.setBounds(175, 60, 600, 50);
        userInfoPanel.add(messagelabel);

        // setting up the admin name
        riderName = new JLabel();
        riderName.setText("Welcome " + name.toUpperCase());
        riderName.setForeground(Color.decode("#ff69eb"));
        riderName.setHorizontalAlignment(JLabel.CENTER);
        riderName.setVerticalAlignment(JLabel.CENTER);
        riderName.setFont(new Font("Times New Roman", Font.BOLD, 20));
        riderName.setBounds(20, 10, 200, 40);
        riderName.setBackground(Color.WHITE);
        Border blueBorder = BorderFactory.createLineBorder(Color.decode("#240046"), 2);
        riderName.setBorder(blueBorder);
        // riderName.setForeground(Color.BLACK);
        userInfoPanel.add(riderName);

        // adding signout button
        // Create login button
        logoutButton = new JButton("Log Out");
        logoutButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
        logoutButton.setBounds(800, 25, 150, 30);
        logoutButton.setFocusable(false);
        logoutButton.setForeground(Color.BLACK);
        logoutButton.setBackground(Color.decode("#ff69eb"));
        // logoutButton.addActionListener(this);
        userInfoPanel.add(logoutButton);
        // adding action listener
        logoutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == logoutButton) {
                    // Open the welcome frame
                    dispose();
                    RiderLoginFrame frame = new RiderLoginFrame();
                    frame.setVisible(true);
                }
            }
        });
        userInfoPanel.add(logoutButton);

        searchPanel = new JPanel();
        searchPanel.setLayout(null);
        searchPanel.setBounds(0, 100, 1000, 600);
        searchPanel.setBackground(Color.WHITE);

        // from label and text field
        fromLabel = new JLabel("From:");
        fromLabel.setForeground(Color.decode("#7b2cbf"));
        fromLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
        fromLabel.setBounds(150, 50, 100, 30);

        fromField = new JTextField();
        fromField.setFont(new Font("Times New Roman", Font.BOLD, 18));
        Border border = BorderFactory.createLineBorder(Color.GRAY, 1, true);
        fromField.setBorder(border);
        fromField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                Border highlightBorder = BorderFactory.createLineBorder(Color.decode("#5a189a"), 2, true);
                fromField.setBorder(highlightBorder);
            }

            @Override
            public void focusLost(FocusEvent e) {
                fromField.setBorder(border);
            }
        });
        fromField.setBounds(150, 90, 200, 30);

        // to label and to textfield
        toLabel = new JLabel("To:");
        toLabel.setForeground(Color.decode("#7b2cbf"));
        toLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
        toLabel.setBounds(500, 50, 100, 30);

        toField = new JTextField();
        toField.setFont(new Font("Times New Roman", Font.BOLD, 18));
        toField.setBorder(border);
        toField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                Border highlightBorder = BorderFactory.createLineBorder(Color.decode("#5a189a"), 2, true);
                toField.setBorder(highlightBorder);
            }

            @Override
            public void focusLost(FocusEvent e) {
                toField.setBorder(border);
            }
        });
        toField.setBounds(500, 90, 200, 30);

        // adding time label and time field

        timeLabel = new JLabel("Time:");
        timeLabel.setForeground(Color.decode("#7b2cbf"));
        timeLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
        timeLabel.setBounds(150, 130, 100, 30);

        timeField = new JTextField();
        timeField.setFont(new Font("Times New Roman", Font.BOLD, 18));
        timeField.setBorder(border);
        timeField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                Border highlightBorder = BorderFactory.createLineBorder(Color.decode("#5a189a"), 2, true);
                timeField.setBorder(highlightBorder);
            }

            @Override
            public void focusLost(FocusEvent e) {
                timeField.setBorder(border);
            }
        });
        timeField.setBounds(150, 160, 200, 30);

        vehicleLabel = new JLabel("Passenger Type:");
        vehicleLabel.setForeground(Color.decode("#7b2cbf"));
        vehicleLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
        vehicleLabel.setBounds(500, 130, 250, 30);

        passengerField = new JTextField();
        passengerField.setFont(new Font("Times New Roman", Font.BOLD, 18));
        passengerField.setBorder(border);
        passengerField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                Border highlightBorder = BorderFactory.createLineBorder(Color.decode("#5a189a"), 2, true);
                passengerField.setBorder(highlightBorder);
            }

            @Override
            public void focusLost(FocusEvent e) {
                passengerField.setBorder(border);
            }
        });
        passengerField.setBounds(500, 160, 200, 30);

        // search button

        searchButton = new JButton("Look For Rides");
        searchButton.setFont(new Font("Times New Roman", Font.BOLD, 25));
        searchButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        searchButton.setFocusable(false);
        searchButton.setForeground(Color.WHITE);
        searchButton.setBackground(Color.decode("#5a189a"));
        searchButton.setBounds(450, 225, 250, 40);

        // adding reset button
        resetButton = new JButton("Clear");
        resetButton.setFont(new Font("Times New Roman", Font.BOLD, 25));
        resetButton.setBounds(150, 225, 250, 40);
        resetButton.setFocusable(false);
        resetButton.setForeground(Color.WHITE);
        resetButton.setBackground(Color.decode("#5a189a"));
        // resetButton.addActionListener(this);
        searchPanel.add(resetButton);
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                fromField.setText(null);
                toField.setText(null);
                timeField.setText(null);
                passengerField.setText(null);
                resultsArea.setText(null);

            }
        });

        // result area
        resultsArea = new JTextArea();
        resultsArea.setBounds(100, 300, 700, 200);
        resultsArea.setFont(new Font("Times New Roman", Font.BOLD, 18));
        resultsArea.setBorder(BorderFactory.createLineBorder(Color.decode("#9d4edd")));
        resultsArea.setBackground(Color.decode("#c4b8fe"));
        resultsArea.setEditable(false);

        searchPanel.add(fromLabel);
        searchPanel.add(toLabel);
        searchPanel.add(fromField);
        searchPanel.add(toField);
        searchPanel.add(timeLabel);
        searchPanel.add(vehicleLabel);
        searchPanel.add(timeField);
        searchPanel.add(passengerField);
        searchPanel.add(searchButton);
        searchPanel.add(resultsArea);

        this.add(searchPanel);
        this.add(userInfoPanel);

        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                resultsArea.setText(null);
                String textField1 = fromField.getText().toLowerCase(); // User Name
                String textField2 = toField.getText(); // Email
                String textField3 = timeField.getText(); // Password
                String textField4 = passengerField.getText();

                if (textField1.isEmpty() || textField2.isEmpty() || textField3.isEmpty() || textField4.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.ERROR_MESSAGE);
                } else {

                    try {
                        File file = new File(".\\Data\\trip_data.txt");
                        if (!file.exists()) {
                            file.createNewFile();
                        }
                        FileWriter fw = new FileWriter(file, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        PrintWriter pw = new PrintWriter(bw);

                        LocalDateTime myDateObj = LocalDateTime.now();
                        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");

                        String timeAndDate = myDateObj.format(myFormatObj);

                        pw.println("From : " + textField1);
                        pw.println("To : " + textField2);
                        pw.println("Time : " + textField3);
                        pw.println("Passenger Type : " + textField4);
                        pw.println("Driver Name : " + name);
                        // pw.println("Passenger Name : ");
                        pw.println("Time & Date : " + timeAndDate);
                        pw.println("===============================================");
                        pw.close();

                    } catch (Exception ex) {
                        System.out.print(ex);
                    }

                    String message = "You Will be Notified When a Passenger Matches With you!\n";
                    resultsArea.append(message);
                    searchButton.setEnabled(false);
                }
            }
        });

    }

    public static void main(String[] args) {
        RiderDashBoard userFrame = new RiderDashBoard("Saron");
    }

}
 package myInterfaces;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;
import java.time.*;
import java.time.format.*;

public class AdminAddPassenger extends JFrame {

    private Container c;
    private ImageIcon icon;
    private JLabel label1;
    private Font f1, f2, f3, f4, f5, f6;
    private JTextField tf1, tf2, tf4,tf5,tf6,tf7;
    private JComboBox securityQsn;
    private JButton btn1, btn2, nBtn;
    private JPasswordField tf3;
    private Cursor cursor;

    public AdminAddPassenger(String name) {
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Aiub Ridez");
        this.setSize(500, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#F2F2F2"));

        // Icon
        icon = new ImageIcon(getClass().getResource("/images/motorbike2.png"));
        this.setIconImage(icon.getImage());

        // Fonts
        f1 = new Font("Segoe UI Black", Font.PLAIN, 35);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);
        f3 = new Font("Segoe UI Semibold", Font.PLAIN, 35);
        f4 = new Font("Segoe UI", Font.PLAIN, 25);
        f5 = new Font("Segoe UI", Font.PLAIN, 19);
        f6 = new Font("Segoe UI", Font.PLAIN, 25);

        // Title
        label1 = new JLabel();
        label1.setText("Enter Information");
        label1.setBounds(100, 25, 500, 50);
        label1.setFont(new Font("Times New Roman", Font.BOLD, 30));
        c.add(label1);

        // User Name
        label1 = new JLabel();
        label1.setText("User Name");
        label1.setBounds(45, 75, 500, 50);
        label1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        c.add(label1);

        tf1 = new JTextField();
        tf1.setBounds(185, 85, 260, 30);
        tf1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        c.add(tf1);

        // Email
        label1 = new JLabel();
        label1.setText("Email");
        label1.setBounds(45, 110, 500, 50);
        label1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        c.add(label1);

        tf2 = new JTextField();
        tf2.setBounds(185, 120, 260, 30);
        tf2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        c.add(tf2);

        // Password
        label1 = new JLabel();
        label1.setText("Password");
        label1.setBounds(45, 145, 500, 50);
        label1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        c.add(label1);

        tf3 = new JPasswordField();
        tf3.setBounds(185, 155, 260, 30);
        tf3.setFont(new Font("Times New Roman", Font.BOLD, 20));
        tf3.setEchoChar('*');
        c.add(tf3);

        // mobile number
        label1 = new JLabel();
        label1.setText("Mobile Number");
        label1.setBounds(45, 180, 500, 50);
        label1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        c.add(label1);
		
		tf4 = new JTextField();
        tf4.setBounds(185, 190, 259, 30);
        tf4.setFont(new Font("Times New Roman", Font.BOLD, 20));
        //tf4.setEchoChar('*');
        c.add(tf4);
		
		
		
        /* 
        String[] secQsn = { "Choose a Security Question...", "Your dream job?", "Your favorite song?",
                "First pet's name?", "Your favorite hobby?" };
        securityQsn = new JComboBox(secQsn);
        securityQsn.setBounds(185, 190, 259, 30);
        securityQsn.setSelectedIndex(0);
        securityQsn.setFont(f5);
        securityQsn.setBackground(Color.white);
        c.add(securityQsn);
        */
        // gender
        label1 = new JLabel();
        label1.setText("Gender");
        label1.setBounds(45, 215, 500, 50);
        label1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        c.add(label1);

        tf5 = new JTextField();
        tf5.setBounds(185, 225, 260, 30);
        tf5.setFont(new Font("Times New Roman", Font.BOLD, 20));
        c.add(tf5);
		
		// nid number
        label1 = new JLabel();
        label1.setText("Nid Number");
        label1.setBounds(45, 250, 500, 50);
        label1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        c.add(label1);

        tf6 = new JTextField();
        tf6.setBounds(185, 260, 260, 30);
        tf6.setFont(new Font("Times New Roman", Font.BOLD, 20));
        c.add(tf6);
		
		
		// Address
        label1 = new JLabel();
        label1.setText("Address");
        label1.setBounds(45, 285, 500, 50);
        label1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        c.add(label1);

        tf7 = new JTextField();
        tf7.setBounds(185, 295, 260, 30);
        tf7.setFont(new Font("Times New Roman", Font.BOLD, 20));
        c.add(tf7);
		
		

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // JButtons
        btn1 = new JButton();
        btn1.setText("Back");
        btn1.setForeground(Color.decode("#301934"));
        btn1.setHorizontalTextPosition(JButton.CENTER);
        btn1.setVerticalTextPosition(JButton.BOTTOM);
        btn1.setContentAreaFilled(false);
        btn1.setFocusable(false);
        btn1.setFocusPainted(false);
        btn1.setBorderPainted(false);
        btn1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btn1.setBounds(200, 420, 100, 60);
        ImageIcon backIcon = new ImageIcon(getClass().getResource("/images/reply1.png"));
        btn1.setIcon(backIcon);

        c.add(btn1);

        btn2 = new JButton("Add");
        btn2.setBounds(175, 350, 150, 50);
        btn2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.decode("#301934"));
        c.add(btn2);

        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);

        // Back Button
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                ManagePassengerFrame frame = new ManagePassengerFrame(name);
                frame.setVisible(true);
            }
        });

        // Register Button
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                String textField1 = tf1.getText().toLowerCase(); // User Name
                String textField2 = tf2.getText(); // Email
                String textField3 = tf3.getText(); // Password
                String textField4 = tf4.getText();
                String textField5 = tf5.getText();				// Security Question Answer
                String textField6 = tf6.getText();
				String textField7 = tf7.getText();
				//String secQsn = String.valueOf(securityQsn.getSelectedItem()); // Security Question

                if (textField1.isEmpty() || textField2.isEmpty() || textField3.isEmpty() || textField4.isEmpty()
                        || textField5.isEmpty() ||textField6.isEmpty() ||textField7.isEmpty()  ) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {

                    try {
                        File file = new File(".\\Data\\passenger_data.txt");
                        if (!file.exists()) {
                            file.createNewFile();
                        }
                        FileWriter fw = new FileWriter(file, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        PrintWriter pw = new PrintWriter(bw);

                        LocalDateTime myDateObj = LocalDateTime.now();
                        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");

                        String timeAndDate = myDateObj.format(myFormatObj);

                        pw.println("             ## Added by Admin ##");
                        pw.println("User Name : " + textField1);
                        
                        pw.println("Email : " + textField2);
						pw.println("Password : " + textField3);
                        pw.println("Mobile Number : " + textField4);
                        pw.println("Gender : " + textField5);
						pw.println("Nid Number : " + textField6);
						pw.println("Address : " + textField7);
                        pw.println("Time & Date : " + timeAndDate);
                        pw.println("===============================================");
                        pw.close();

                    } catch (Exception ex) {
                        System.out.print(ex);
                    }

                    JOptionPane.showMessageDialog(null, "User has been added.", "User Added",
                            JOptionPane.INFORMATION_MESSAGE);
                    setVisible(false);
                    AdminAddPassenger frame = new AdminAddPassenger(name);
                    frame.setVisible(true);
                }
            }
        });
    }

    public static void main(String[] args) {

        AdminAddPassenger frame = new AdminAddPassenger("Saron");
        frame.setVisible(true);
    }
}

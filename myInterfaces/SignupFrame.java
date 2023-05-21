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

public class SignupFrame extends JFrame {

    private Container c;
    private ImageIcon bikeIcon, bikeLogo,homeIcon,backIcon;
    private JLabel label, imageLabel,companyLabel;
    private Font f1, f2, f3, f4, f5, f6;
    private JTextField usernameField, emailField, passwordField,licenseNumberField, vehicleTypeField, mobileField, tf4, tf5;
    private JComboBox securityQsn;
    private JButton btn1, menuButton,homeButton, resetButton, signupButton, nBtn;
    private JPasswordField tf3;
    private Cursor cursor;
    private int a, b;
	private JPanel panel,robotPanel;
    private JRadioButton maleButton, femaleButton, otherButton;
    private ButtonGroup genderGroup;
	//private String textField5;

    public SignupFrame() {
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Sign Up");
        this.setSize(1000, 700);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);

        // Icon
        bikeIcon = new ImageIcon(getClass().getResource("motorbike2.png"));
        this.setIconImage(bikeIcon.getImage());
		
		
		// for company Label
		companyLabel = new JLabel();
		companyLabel.setText("AIUB RIDEZ");
		companyLabel.setLayout(null);
		companyLabel.setBounds(140, 100, 500, 50);
		companyLabel.setHorizontalTextPosition(JLabel.CENTER);
		companyLabel.setVerticalTextPosition(JLabel.CENTER);
		companyLabel.setForeground(Color.decode("#8155BA"));
		companyLabel.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 35));
		c.add(companyLabel);
		
		

        // bikeLogo
        bikeLogo = new ImageIcon(getClass().getResource("motorbike4.png"));
        imageLabel = new JLabel(bikeLogo);
        imageLabel.setBounds(50, 150, bikeLogo.getIconWidth(), bikeLogo.getIconHeight());
        c.add(imageLabel);

        // Fonts
        //f1 = 
        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);
        f3 = new Font("Segoe UI Semibold", Font.PLAIN, 35);
        f4 = new Font("Segoe UI", Font.PLAIN, 25);
        f5 = new Font("Segoe UI", Font.PLAIN, 19);
        f6 = new Font("Segoe UI", Font.PLAIN, 25);

        // Title
        label = new JLabel();
        label.setText("Provide Your Information");
		label.setLayout(null);
		label.setForeground(Color.decode("#800080"));
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.CENTER);
        label.setBounds(550, 25, 500, 50);
        label.setFont(new Font("Times New Roman", Font.BOLD, 30));
        c.add(label);

        // User Name
        label = new JLabel();
        label.setText("User Name :");
		label.setForeground(Color.decode("#301934"));
        label.setBounds(500, 100, 200, 50);
        label.setFont(new Font("Times New Roman", Font.BOLD, 25));
        c.add(label);
        
		
		
		
		//setting up user text field
        usernameField = new JTextField();
        usernameField.setBounds(650, 100, 260, 30);
		usernameField.setFont(new Font("Times New Roman", Font.BOLD, 25));
        usernameField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.GRAY));
        
		
		usernameField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                usernameField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(150, 0, 255)));
            }

            @Override
            public void focusLost(FocusEvent e) {
                usernameField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
            }
        });
        usernameField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                usernameField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(150, 0, 255)));
            }

            @Override
            public void mouseExited(MouseEvent e) {
               
                if (!usernameField.hasFocus()) {
                    usernameField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
                }
            }
        });
        c.add(usernameField);

        // setting email label
        label = new JLabel();
        label.setText("Email");
        label.setForeground(Color.decode("#301934"));
        label.setBounds(500, 150, 200, 50);
        label.setFont(new Font("Times New Roman", Font.BOLD, 25));
        c.add(label);
        
		
		// setting up email text field
        emailField = new JTextField();
        emailField.setBounds(650, 150, 260, 30);
		emailField.setFont(new Font("Times New Roman", Font.BOLD, 25));
        emailField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.GRAY));
        
		
		emailField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                emailField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(150, 0, 255)));
            }

            @Override
            public void focusLost(FocusEvent e) {
                emailField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
            }
        });
        emailField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                emailField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(150, 0, 255)));
            }

            @Override
            public void mouseExited(MouseEvent e) {
               
                if (!emailField.hasFocus()) {
                    emailField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
                }
            }
        });
        c.add(emailField);
		
		

        // Password label
        label = new JLabel();
        label.setText("Password :");
        label.setForeground(Color.decode("#301934"));
        label.setBounds(500, 200, 200, 50);
        label.setFont(new Font("Times New Roman", Font.BOLD, 25));
        c.add(label);
        
		
		
		//password field
		
        passwordField = new JPasswordField();
        passwordField.setBounds(650, 200, 260, 30);
        passwordField.setFont(new Font("Times New Roman", Font.BOLD, 20));
        passwordField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        

        passwordField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                passwordField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(150, 0, 255)));
            }

            @Override
            public void focusLost(FocusEvent e) {
                passwordField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
            }
        });
        passwordField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                passwordField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(150, 0, 255)));
            }

            @Override
            public void mouseExited(MouseEvent e) {
               
                if (!passwordField.hasFocus()) {
                    passwordField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
                }
            }
        });

        c.add(passwordField);

        // setting up mobile number
        label = new JLabel();
        label.setText("Mobile No. :");
        label.setForeground(Color.decode("#301934"));
        label.setBounds(500, 250, 200, 50);
        label.setFont(new Font("Times New Roman", Font.BOLD, 25));
        c.add(label);
		
		
		// setting up mobile text field
        mobileField = new JTextField();
        mobileField.setBounds(650, 250, 260, 30);
		mobileField.setFont(new Font("Times New Roman", Font.BOLD, 25));
        mobileField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.GRAY));
        
		
		mobileField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                mobileField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(150, 0, 255)));
            }

            @Override
            public void focusLost(FocusEvent e) {
                mobileField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
            }
        });
        mobileField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                mobileField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(150, 0, 255)));
            }

            @Override
            public void mouseExited(MouseEvent e) {
               
                if (!mobileField.hasFocus()) {
                    mobileField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
                }
            }
        });
        c.add(mobileField);
		
		//setting up gender
		// setting up gender label
        label = new JLabel();
        label.setText("Gender :");
        label.setForeground(Color.decode("#301934"));
        label.setBounds(500, 300, 200, 50);
        label.setFont(new Font("Times New Roman", Font.BOLD, 25));
        c.add(label);
		
		// Create panel
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(650,300,260, 50);
        
        // Create radio buttons
        maleButton = new JRadioButton("Male");
		maleButton.setForeground(Color.decode("#301934"));
        femaleButton = new JRadioButton("Female");
		femaleButton.setForeground(Color.decode("#301934"));
        otherButton = new JRadioButton("Other");
		otherButton.setForeground(Color.decode("#301934"));
        
        // Group radio buttons
        genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        genderGroup.add(otherButton);
        
		
		//set focus painted false
		maleButton.setFocusPainted(false);
		femaleButton.setFocusPainted(false);
		otherButton.setFocusPainted(false);
		
		
		
		
        // Set bounds for buttons
        maleButton.setBounds(10, 10, 70, 30);
        femaleButton.setBounds(90, 10, 80, 30);
        otherButton.setBounds(180, 10, 70, 30);
        
        // Add buttons to panel
        panel.add(maleButton);
        panel.add(femaleButton);
        panel.add(otherButton);
        
        // Add action listeners to buttons
        // Add lambda expression as action listener to buttons
        maleButton.addActionListener(e -> {
            maleButton.setForeground(Color.MAGENTA);
            femaleButton.setForeground(null);
            otherButton.setForeground(null);
        });

        femaleButton.addActionListener(e -> {
            maleButton.setForeground(null);
            femaleButton.setForeground(Color.MAGENTA);
            otherButton.setForeground(null);
        });

        otherButton.addActionListener(e -> {
            maleButton.setForeground(null);
            femaleButton.setForeground(null);
            otherButton.setForeground(Color.MAGENTA);
        });
        
        // Add panel to frame
        c.add(panel);
        
        // Setting up License Number
        label = new JLabel();
        label.setText("License No. :");
		label.setForeground(Color.decode("#301934"));
        label.setBounds(500, 350, 200, 50);
        label.setFont(new Font("Times New Roman", Font.BOLD, 25));
        c.add(label);

        licenseNumberField = new JTextField();
        licenseNumberField.setBounds(650, 350, 260, 30);
		licenseNumberField.setFont(new Font("Times New Roman", Font.BOLD, 25));
        licenseNumberField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.GRAY));
        
		
		licenseNumberField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                licenseNumberField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(150, 0, 255)));
            }

            @Override
            public void focusLost(FocusEvent e) {
                licenseNumberField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
            }
        });
        licenseNumberField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                licenseNumberField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(150, 0, 255)));
            }

            @Override
            public void mouseExited(MouseEvent e) {
               
                if (!licenseNumberField.hasFocus()) {
                    licenseNumberField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
                }
            }
        });
        c.add(licenseNumberField);
	    
		
		// Setting up Vehicle Type
        label = new JLabel();
        label.setText("Vehicle Type :");
		label.setForeground(Color.decode("#301934"));
        label.setBounds(495, 400, 200, 50);
        label.setFont(new Font("Times New Roman", Font.BOLD, 25));
        c.add(label);

        vehicleTypeField = new JTextField();
        vehicleTypeField.setBounds(650, 400, 260, 30);
		vehicleTypeField.setFont(new Font("Times New Roman", Font.BOLD, 25));
        vehicleTypeField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.GRAY));
        
		
		vehicleTypeField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                vehicleTypeField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(150, 0, 255)));
            }

            @Override
            public void focusLost(FocusEvent e) {
                vehicleTypeField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
            }
        });
        vehicleTypeField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                vehicleTypeField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(150, 0, 255)));
            }

            @Override
            public void mouseExited(MouseEvent e) {
               
                if (!vehicleTypeField.hasFocus()) {
                    vehicleTypeField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
                }
            }
        });
        c.add(vehicleTypeField);
		
		

        robotPanel = new JPanel();
        robotPanel.setBounds(600,500,400, 50);

        // Create a JCheckBox for the "Are you a robot?" question
        JCheckBox checkBox = new JCheckBox("Are you a robot?");
		checkBox.setFont(new Font("Times New Roman", Font.BOLD, 25));
        checkBox.setFocusPainted(false); // Disable focus painting

        // Set the tick color of the JCheckBox to purple
        checkBox.setForeground(Color.MAGENTA);

        // Add the JCheckBox to the JPanel
        robotPanel.add(checkBox);

        // Add the JPanel to the container
        c.add(panel);

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // JButtons
		//adding home button
        homeButton = new JButton();
        homeButton.setText("Home");
		homeButton.setForeground(Color.decode("#301934"));
		homeButton.setHorizontalTextPosition(JButton.CENTER);
		homeButton.setVerticalTextPosition(JButton.BOTTOM);
		homeButton.setContentAreaFilled(false);
		homeButton.setFocusable(false);
		homeButton.setFocusPainted(false);
        homeButton.setBorderPainted(false);
        homeButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        homeButton.setBounds(500, 550, 100, 60);
		homeIcon = new ImageIcon("home-page2.png");
		homeButton.setIcon(homeIcon);
  
        c.add(homeButton);
        
		
		
		
		//adding back button
        menuButton = new JButton();
        menuButton.setText("Back");
		menuButton.setForeground(Color.decode("#301934"));
		menuButton.setHorizontalTextPosition(JButton.CENTER);
		menuButton.setVerticalTextPosition(JButton.BOTTOM);
		menuButton.setContentAreaFilled(false);
		menuButton.setFocusable(false);
		menuButton.setFocusPainted(false);
        menuButton.setBorderPainted(false);
        menuButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        menuButton.setBounds(825, 540, 80, 80);
		backIcon = new ImageIcon("reply1.png");
		menuButton.setIcon(backIcon);
        
        c.add(menuButton);

        

        // adding reset button
        resetButton = new JButton("Reset");
        resetButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        resetButton.setBounds(550, 475, 150, 40);
		resetButton.setFocusable(false);
		resetButton.setForeground(Color.BLACK);
		resetButton.setBackground(Color.decode("#800080"));
        //resetButton.addActionListener(this);
        c.add(resetButton);
        
		
		
		//sign Up button
        signupButton = new JButton("Sign Up");
        signupButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        signupButton.setBounds(725, 475, 150, 40);
		signupButton.setFocusable(false);
		signupButton.setForeground(Color.BLACK);
		signupButton.setBackground(Color.decode("#800080"));
        //resetButton.addActionListener(this);
        c.add(signupButton);

        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);

        // home Button
        homeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                WelcomeFrame frame = new WelcomeFrame();
                frame.setVisible(true);
            }
        });

        // Back Button
        menuButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                RiderLoginFrame frame = new RiderLoginFrame();
                frame.setVisible(true);
            }
        });

        // Reset Button
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                SignupFrame frame = new SignupFrame();
                frame.setVisible(true);
            }
        });

        // Register Button
        signupButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
				
				
				String gender =""; 
				if (maleButton.isSelected()) {
                // Male radio button is selected
				    gender = "Male" ;
                } else if (femaleButton.isSelected()) {
                // Female radio button is selected
				    gender = "Female";
                } else if (otherButton.isSelected()) {
                // Other radio button is selected
				    gender = "Other" ;
                }
				
				
				
				
				
				
			
                String textField1 = usernameField.getText().toLowerCase(); // User Name
                String textField2 = emailField.getText(); // Email
                String textField3 = passwordField.getText(); // Password
				String textField4 = mobileField.getText(); // Mobile Number
				String textField5 = gender;//((JRadioButton) ae.getSource()).getText();// Gender
                String textField6 = licenseNumberField.getText(); // License Number
                String textField7 = vehicleTypeField.getText(); // Vehicle Type
                
                int result = 0;

                if (textField5.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    //result = Integer.parseInt(tf5.getText());
                    if (textField1.isEmpty() || textField2.isEmpty() || textField3.isEmpty() || textField4.isEmpty()
                           || textField5.isEmpty() || textField6.isEmpty() || !(textField7.equals("Male") || textField7.equals("Other") || textField7.equals("Female"))
					       || !checkBox.isSelected()) {
                        JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                                JOptionPane.WARNING_MESSAGE);
                    } /*else if (result != (a + b)) {
                        JOptionPane.showMessageDialog(null, "Wrong Captcha.", "Warning!", JOptionPane.WARNING_MESSAGE);
                    } */else {

                        try {
                            File file = new File(".\\Data\\user_data.txt");
                            if (!file.exists()) {
                                file.createNewFile();
                            }
                            FileWriter fw = new FileWriter(file, true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            PrintWriter pw = new PrintWriter(bw);

                            LocalDateTime myDateObj = LocalDateTime.now();
                            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");

                            String timeAndDate = myDateObj.format(myFormatObj);

                            pw.println("User Name : " + textField1);
							pw.println("Email : " + textField2);
                            pw.println("Password : " + textField3);
							pw.println("Mobile Number : " + textField4);
							pw.println("Gender : " + textField5);
							pw.println("License Number : " + textField6);
							pw.println("Vehicle Type : " + textField7);
                            //pw.println("Security Question : " + secQsn);
                            //pw.println("Answer : " + textField4);
                            pw.println("Time & Date : " + timeAndDate);
                            pw.println("===============================================");
                            pw.close();

                        } catch (Exception ex) {
                            System.out.print(ex);
                        }

                        //JOptionPane.showMessageDialog(null, "SignupFrame Successfully Completed.",
                            //    "SignupFrame Complete", JOptionPane.WARNING_MESSAGE);
                        setVisible(false);
                        RiderLoginFrame frame = new RiderLoginFrame();
                        frame.setVisible(true);
                    }
                }
            }
        });
    }

    public static void main(String[] args) {

        SignupFrame frame = new SignupFrame();
        frame.setVisible(true);
    }
}

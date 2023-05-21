//package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;

public class RiderLoginFrame extends JFrame /*implements ActionListener*/ {
    private JTextField usernameField;
    private JPasswordField passwordField;
	private JLabel bikeLogoLabel, questionLabel;
    private JButton loginButton,signUpButton;
    private JButton backButton;

    public RiderLoginFrame() {
        // Set up frame
        setTitle("Login");
        setResizable(false);
        setSize(500, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on screen
        setLayout(null); // Set null layout to use setBounds method

        // Set frame icon
        ImageIcon frameIcon = new ImageIcon(getClass().getResource("motorbike2.png"));
        setIconImage(frameIcon.getImage());

        // Create bikeLogo panel
        JPanel bikeLogoPanel = new JPanel();
        bikeLogoPanel.setBackground(Color.WHITE);
        bikeLogoPanel.setLayout(null);
		// adding bikeLogo
        bikeLogoLabel = new JLabel("Aiub Ridez");
        bikeLogoLabel.setBounds(165,100,250,50);
		bikeLogoLabel.setForeground(Color.decode("#800080"));
        bikeLogoLabel.setFont(new Font("Times New Roman", Font.BOLD, 36));
        bikeLogoPanel.add(bikeLogoLabel);
        bikeLogoPanel.setBounds(0, 0, 500, 150);
        add(bikeLogoPanel);

        // Create login panel
        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(null);
        loginPanel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
        loginPanel.setBounds(0, 150, 500, 550);
		loginPanel.setBackground(Color.WHITE);

        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
        usernameLabel.setBounds(50, 50, 150, 30);
		usernameLabel.setForeground(Color.decode("#301934"));
        loginPanel.add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setFont(new Font("Times New Roman", Font.BOLD, 20));
        usernameField.setBounds(200, 50, 250, 30);
        usernameField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.GRAY));
        loginPanel.add(usernameField);
		
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

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
        passwordLabel.setBounds(50, 105, 150, 30);
		passwordLabel.setForeground(Color.decode("#301934"));
        loginPanel.add(passwordLabel);
        
		
		
		
		//setting up password field
        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Times New Roman", Font.BOLD, 20));
        passwordField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        passwordField.setBounds(200, 100, 250, 30);
        loginPanel.add(passwordField);

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

        // Create login button
        loginButton = new JButton("Login");
        loginButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        loginButton.setBounds(175, 200, 150, 40);
		loginButton.setFocusable(false);
		loginButton.setForeground(Color.BLACK);
		loginButton.setBackground(Color.decode("#800080"));
        //loginButton.addActionListener(this);
        loginPanel.add(loginButton);
		
		
		// Create sign up button
        signUpButton = new JButton("Sign Up");
        signUpButton.setFont(new Font("Times New Roman", Font.BOLD, 21));
        signUpButton.setContentAreaFilled(false);
        signUpButton.setBorderPainted(false);
		signUpButton.setForeground(Color.decode("#800080"));
        signUpButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		//signUpButton.addActionListener(this);
        signUpButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                signUpButton.setText("<html><u>Sign Up</u></html>");
            }
            @Override
            public void mouseExited(MouseEvent e) {
                signUpButton.setText("Sign Up");
            }
        });
		
		
        signUpButton.setBounds(260, 250, 150, 30);
        loginPanel.add(signUpButton);
		
		
		//question label
		questionLabel = new JLabel();
		questionLabel.setText("Don't Have An Account ?");
		questionLabel.setFont(new Font("Times New Roman", Font.BOLD,15));
		questionLabel.setForeground(Color.decode("#800080"));
		questionLabel.setBounds(125, 250, 200, 30);
		loginPanel.add(questionLabel);

		
		
		
		

        // Create back button
        backButton = new JButton();
		backButton.setText("Home");
		backButton.setForeground(Color.decode("#301934"));
		backButton.setHorizontalTextPosition(JButton.CENTER);
		backButton.setVerticalTextPosition(JButton.BOTTOM);
		backButton.setContentAreaFilled(false);
		backButton.setFocusable(false);
		backButton.setFocusPainted(false);
        backButton.setBorderPainted(false);
        backButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        backButton.setBounds(195, 400, 110, 100);
		ImageIcon homeIcon = new ImageIcon("home-page2.png");
		backButton.setIcon(homeIcon);
        //backButton.addActionListener(this);
        loginPanel.add(backButton);

        add(loginPanel);

        setVisible(true);
		
		
		
		
		loginButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
        
		        String textField1 = usernameField.getText().toLowerCase(); // User Name 
                String textField2 = passwordField.getText(); // Password
		
		
		
		if (textField1.isEmpty() || textField2.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } 
				else {

                    try {
                        String userNameS = "User Name : " + textField1;
                        String passwordS = "Password : " + textField2;
                        BufferedReader reader = new BufferedReader(new FileReader(".\\Data\\user_data.txt"));

                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        for (int i = 0; i <= totalLines; i++) {
                            String line = Files.readAllLines(Paths.get(".\\Data\\user_data.txt")).get(i);
                            if (line.equals(userNameS)) {
                                String line2 = Files.readAllLines(Paths.get(".\\Data\\user_data.txt")).get((i + 2));
                                if (line2.equals(passwordS)) {
                                    //JOptionPane.showMessageDialog(null, "Login Successful.", "AIUB RIDEZ",
                                            //JOptionPane.WARNING_MESSAGE);

                                    setVisible(false);
                                    RiderDashBoard frame = new RiderDashBoard();
                                    frame.setVisible(true);
                                    break;
                                }
                            }
                        }
                    } 
					catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Invalid User Name or Password!", "Warning!",
                                JOptionPane.WARNING_MESSAGE);
                    }

                }

            }
	    });
		
		
		backButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
                if (e.getSource() == backButton) {
                    // Open the welcome frame
                    dispose();
                    WelcomeFrame frame = new WelcomeFrame();
                }
		    }	
		});
		
		
		
		signUpButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
                if (e.getSource() == signUpButton) {
                // Open the welcome frame
                    dispose();
                    SignupFrame signupFrame = new SignupFrame();
			        signupFrame.setVisible(true);
                }
		    }	
		});
		
		
		
    }

    
		
		
    
	 public static void main(String[] args) {
        RiderLoginFrame Frame = new RiderLoginFrame();
    }
}

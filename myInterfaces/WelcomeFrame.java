package myInterfaces;

import myInterfaces.*;
//package classes;
//import classes.*;
//import images.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WelcomeFrame extends JFrame implements ActionListener {

	private JLabel welcomeLabel, companyNameLabel, questionLabel, orLabel, imageLabel;
	private JButton driverButton, passangerButton;
	private JPanel purplePanel, adminPanel;
	private JButton riderButton, passengerButton, adminButton, aboutUsButton;
	// private ImageIcon bikeImage;

	public WelcomeFrame() {

		// for frame
		this.setTitle("AIUB RIDEZ");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(500, 700);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.getContentPane().setBackground(Color.WHITE);
		// set up frame icon
		ImageIcon frameIcon = new ImageIcon(getClass().getResource("/images/motorbike2.png"));
		this.setIconImage(frameIcon.getImage());

		// for purple panel
		purplePanel = new JPanel();
		purplePanel.setBounds(0, 0, 500, 30);
		purplePanel.setBackground(Color.decode("#CBC3E3"));

		// for admin panel
		adminPanel = new JPanel();
		adminPanel.setBounds(0, 30, 500, 50);
		adminPanel.setLayout(null);
		adminPanel.setBackground(Color.WHITE);

		// setting the admin buttons in admin panel
		adminButton = new JButton();
		adminButton.setText("Admin");
		adminButton.setBounds(-15, 10, 150, 50);
		adminButton.setContentAreaFilled(false);
		adminButton.setFocusable(false);
		adminButton.setHorizontalTextPosition(JButton.RIGHT);
		adminButton.setVerticalTextPosition(JButton.CENTER);
		adminButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		adminButton.setForeground(Color.BLACK);
		adminButton.addActionListener(this);

		// adminButton.setBackground(Color.decode("#CBC3E3"));
		ImageIcon adminIcon = new ImageIcon(getClass().getResource("/images/admin3.png"));
		adminButton.setIcon(adminIcon);
		adminButton.setFocusPainted(false);
		adminButton.setBorderPainted(false);
		adminButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				adminButton.setText("<html><u>Admin</u></html>");
			}

			@Override
			public void mouseExited(MouseEvent e) {
				adminButton.setText("Admin");
			}
		});

		// setting the about us button in admin panel
		aboutUsButton = new JButton();
		aboutUsButton.setText("About Us");
		aboutUsButton.setBounds(350, 10, 125, 50);
		aboutUsButton.setContentAreaFilled(false);
		aboutUsButton.setFocusable(false);
		aboutUsButton.setFocusPainted(false);
		aboutUsButton.setBorderPainted(false);
		aboutUsButton.setHorizontalTextPosition(JButton.RIGHT);
		aboutUsButton.setVerticalTextPosition(JButton.CENTER);
		aboutUsButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		aboutUsButton.setForeground(Color.BLACK);
		ImageIcon aboutUsIcon = new ImageIcon(getClass().getResource("/images/info3.png"));
		aboutUsButton.setIconTextGap(0);
		// aboutUsButton.setIconPosition(JButton.LEFT);
		aboutUsButton.setIcon(aboutUsIcon);
		aboutUsButton.addActionListener(this);
		aboutUsButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				aboutUsButton.setText("<html><u>About Us</u></html>");
			}

			@Override
			public void mouseExited(MouseEvent e) {
				aboutUsButton.setText("About Us");
			}
		});

		adminPanel.add(adminButton);
		adminPanel.add(aboutUsButton);

		// for welcome Label
		welcomeLabel = new JLabel();
		welcomeLabel.setText("Welcome !");
		welcomeLabel.setBounds(157, 100, 300, 50);
		welcomeLabel.setForeground(Color.BLACK);
		welcomeLabel.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 30));

		// for company name Label
		companyNameLabel = new JLabel();
		companyNameLabel.setText("Are You a"); // Set the text for the label
		companyNameLabel.setBounds(200, 200, 200, 30);
		companyNameLabel.setForeground(Color.BLACK);
		companyNameLabel.setFont(new Font("Arial", Font.PLAIN, 20));

		// for passenger button
		passengerButton = new JButton();
		passengerButton.setBounds(150, 250, 200, 50);
		passengerButton.setText("Passenger");
		passengerButton.setFocusable(false);
		passengerButton.setHorizontalTextPosition(JButton.CENTER);
		passengerButton.setVerticalTextPosition(JButton.CENTER);
		passengerButton.setFont(new Font("Times New Roman", Font.BOLD, 25));
		passengerButton.setForeground(Color.BLACK);
		passengerButton.setBackground(Color.decode("#CBC3E3"));

		// add action listener to passengerButton (rider button)
		passengerButton.addActionListener(this);

		// for or Label
		orLabel = new JLabel();
		orLabel.setText("OR"); // Set the text for the label
		orLabel.setBounds(225, 325, 50, 30);
		orLabel.setForeground(Color.BLACK);
		orLabel.setFont(new Font("Arial", Font.BOLD, 25));

		// for rider button
		riderButton = new JButton();
		riderButton.setBounds(150, 375, 200, 50);
		riderButton.setText("Rider");
		riderButton.setFocusable(false);
		riderButton.setHorizontalTextPosition(JButton.CENTER);
		riderButton.setVerticalTextPosition(JButton.CENTER);
		riderButton.setFont(new Font("Times New Roman", Font.BOLD, 25));
		riderButton.setForeground(Color.BLACK);
		riderButton.setBackground(Color.decode("#CBC3E3"));

		// add action listener to Rider Button (passenger button)
		riderButton.addActionListener(this);

		// for bike Image
		ImageIcon bikeImage = new ImageIcon(getClass().getResource("/images/BikeMoving1.gif"));

		// for image label
		imageLabel = new JLabel();
		imageLabel.setIcon(bikeImage);
		imageLabel.setBounds(0, 175, 800, 600);

		this.add(purplePanel);
		this.add(adminPanel);
		this.add(welcomeLabel);
		this.add(companyNameLabel);
		this.add(riderButton);
		this.add(orLabel);
		this.add(passengerButton);
		this.add(imageLabel);

	}

	// implementation of actionPerformed method
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == riderButton) {
			// create and show login frame
			RiderLoginFrame frame1 = new RiderLoginFrame();
			frame1.setVisible(true);

			// hide current frame
			setVisible(false);
		} else if (e.getSource() == passengerButton) {
			// create and show login frame
			PassengerLoginFrame frame2 = new PassengerLoginFrame();
			frame2.setVisible(true);

			// hide current frame
			setVisible(false);
		} else if (e.getSource() == aboutUsButton) {
			// create and show login frame
			AboutUsFrame aboutFrame = new AboutUsFrame();
			aboutFrame.setVisible(true);

			// hide current frame
			// setVisible(false);
		} else if (e.getSource() == adminButton) {
			// create and show login frame
			AdminLoginFrame adminFrame = new AdminLoginFrame();
			adminFrame.setVisible(true);

			// hide current frame
			setVisible(false);
		}
	}

	public static void main(String[] args) {
		WelcomeFrame welcomeFrame = new WelcomeFrame();
	}

}
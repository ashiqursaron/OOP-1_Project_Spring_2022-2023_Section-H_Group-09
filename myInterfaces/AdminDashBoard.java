package myInterfaces;
//package classes ;
//import classes.*;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import java.awt.event.*;
public class AdminDashBoard extends JFrame {
	
	private JPanel userInfoPanel,riderAddPanel,passangerAddPanel,adminAddPanel;
	private JLabel adminName,manageRiderLabel,managePassengerlabel;
	private JButton logoutButton,passengerManagingButton,riderManagingButton,adminManagingButton;
	private JLabel addingAdminLabel;
	
	
	
	
	public AdminDashBoard(String name){
		
		this.setTitle("Admin Dash Board");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(500, 700);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.getContentPane().setBackground(Color.WHITE);
		//set up frame icon
		ImageIcon frameIcon = new ImageIcon(getClass().getResource("/images/motorbike2.png"));
		this.setIconImage(frameIcon.getImage());
		
		//setting up the user info panel
		userInfoPanel = new JPanel();
		userInfoPanel.setBounds(0,0,500,60);
		userInfoPanel.setLayout(null);
		userInfoPanel.setBackground(Color.decode("#ffcad4"));
		
		
		
		//setting up the admin name
		adminName = new JLabel();
		adminName.setText("Welcome "+name.toUpperCase());
		adminName.setForeground(Color.decode("#ef233c"));
		adminName.setFont(new Font("Times New Roman", Font.BOLD, 12));
		adminName.setBounds(25,5,100,50);
		adminName.setBackground(Color.WHITE);
		//adminName.setForeground(Color.BLACK);
		userInfoPanel.add(adminName);
		
		
		// adding signout button
		// Create login button
        logoutButton = new JButton("Log Out");
        logoutButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
        logoutButton.setBounds(330, 10, 150, 30);
		logoutButton.setFocusable(false);
		logoutButton.setForeground(Color.BLACK);
		logoutButton.setBackground(Color.decode("#ff8fab"));
        //logoutButton.addActionListener(this);
        userInfoPanel.add(logoutButton);
		// adding action listener
		logoutButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
                if (e.getSource() == logoutButton) {
                    // Open the welcome frame
                    dispose();
                    AdminLoginFrame frame = new AdminLoginFrame();
					frame.setVisible(true);
                }
		    }	
		});
		userInfoPanel.add(logoutButton);
		
		
		
		 RoundRectangle2D roundedRectangle = new RoundRectangle2D.Float(0, 50, 450, 250, 50, 50);
		//setting up the user info panel
		passangerAddPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setColor(getBackground());
                g2.fill(roundedRectangle);
                g2.dispose();
            }
        };
		// Create Adding rider button
        passengerManagingButton = new JButton();
		//riderManagingButton.setText("Home");
		//riderManagingButton.setForeground(Color.decode("#301934"));
		passengerManagingButton.setHorizontalTextPosition(JButton.CENTER);
		passengerManagingButton.setVerticalTextPosition(JButton.BOTTOM);
		passengerManagingButton.setContentAreaFilled(false);
		passengerManagingButton.setFocusable(false);
		passengerManagingButton.setFocusPainted(false);
        passengerManagingButton.setBorderPainted(false);
        //riderManagingButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        passengerManagingButton.setBounds(375, 125, 50, 50);
		ImageIcon homeIcon = new ImageIcon(getClass().getResource("/images/enter.png"));
		passengerManagingButton.setIcon(homeIcon);
		passengerManagingButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                dispose();
                ManagePassengerFrame frame = new ManagePassengerFrame(name);
                frame.setVisible(true);
            }
        });
        //riderManagingButton.addActionListener(this);
        passangerAddPanel.add(passengerManagingButton);
		
		
		//add label to panel mannage rider
		
		
		managePassengerlabel = new JLabel("Manage Passengers");
		managePassengerlabel.setBounds(50,75,300,100);
		managePassengerlabel.setFont(new Font("Serif", Font.BOLD, 35));
		managePassengerlabel.setForeground(Color.BLACK);
		passangerAddPanel.add(managePassengerlabel);
		
		
		
        
		
		passangerAddPanel.setBounds(16,50,450,200);
		passangerAddPanel.setOpaque(false);
        passangerAddPanel.setLayout(null);
		passangerAddPanel.setLayout(null);
		passangerAddPanel.setBackground(Color.decode("#8ecae6"));
		
		
		
		
		
		
		
		
		
		
		riderAddPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setColor(getBackground());
                g2.fill(roundedRectangle);
                g2.dispose();
            }
        };
		// Create Adding rider button
        riderManagingButton = new JButton();
		//riderManagingButton.setText("Home");
		//riderManagingButton.setForeground(Color.decode("#301934"));
		riderManagingButton.setHorizontalTextPosition(JButton.CENTER);
		riderManagingButton.setVerticalTextPosition(JButton.BOTTOM);
		riderManagingButton.setContentAreaFilled(false);
		riderManagingButton.setFocusable(false);
		riderManagingButton.setFocusPainted(false);
        riderManagingButton.setBorderPainted(false);
        //riderManagingButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        riderManagingButton.setBounds(375, 125, 50, 50);
		//ImageIcon homeIcon = new ImageIcon(getClass().getResource("/images/enter.png"));
		riderManagingButton.setIcon(homeIcon);
        //riderManagingButton.addActionListener(this);
		riderManagingButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                dispose();
                ManageRiderFrame frame = new ManageRiderFrame(name);
                frame.setVisible(true);
            }
        });
        riderAddPanel.add(riderManagingButton);
		
		
		//add label to panel mannage rider
		
		
		manageRiderLabel = new JLabel("Manage Riders");
		manageRiderLabel.setBounds(50,75,300,100);
		manageRiderLabel.setFont(new Font("Serif", Font.BOLD, 35));
		manageRiderLabel.setForeground(Color.BLACK);
		riderAddPanel.add(manageRiderLabel);
		
		
		
		
		

        //add(riderAddPanel);
		
		
		
		
		
		
		
		
		
		
		
		
		
		riderAddPanel.setBounds(16,250,450,200);
		riderAddPanel.setOpaque(false);
        riderAddPanel.setLayout(null);
		riderAddPanel.setLayout(null);
		riderAddPanel.setBackground(Color.decode("#8fc0a9"));
		
		
		
		
		
		
		
		
		
		
		adminAddPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setColor(getBackground());
                g2.fill(roundedRectangle);
                g2.dispose();
            }
        };
		// Create Adding rider button
        adminManagingButton = new JButton();
		//riderManagingButton.setText("Home");
		//riderManagingButton.setForeground(Color.decode("#301934"));
		adminManagingButton.setHorizontalTextPosition(JButton.CENTER);
		adminManagingButton.setVerticalTextPosition(JButton.BOTTOM);
		adminManagingButton.setContentAreaFilled(false);
		adminManagingButton.setFocusable(false);
		adminManagingButton.setFocusPainted(false);
        adminManagingButton.setBorderPainted(false);
        //riderManagingButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        adminManagingButton.setBounds(375, 125, 50, 50);
		//ImageIcon homeIcon = new ImageIcon(getClass().getResource("/images/enter.png"));
		adminManagingButton.setIcon(homeIcon);
        //riderManagingButton.addActionListener(this);
		adminManagingButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                dispose();
                AddAdmin frame = new AddAdmin(name);
                frame.setVisible(true);
            }
        });
        adminAddPanel.add(adminManagingButton);
		
		
		//add label to panel mannage rider
		
		
		addingAdminLabel = new JLabel("Add Admin");
		addingAdminLabel.setBounds(50,75,300,100);
		addingAdminLabel.setFont(new Font("Serif", Font.BOLD, 35));
		addingAdminLabel.setForeground(Color.BLACK);
		adminAddPanel.add(addingAdminLabel);
		
		
		
		
		

        
		
		
		
		
		
		
		
		
		
		
		
		
		
		adminAddPanel.setBounds(16,450,450,200);
		adminAddPanel.setOpaque(false);
        adminAddPanel.setLayout(null);
		adminAddPanel.setLayout(null);
		adminAddPanel.setBackground(Color.decode("#83c5be"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//   adding the info panel to the frame
		this.add(userInfoPanel);
		this.add(passangerAddPanel);
		this.add(riderAddPanel);
		this.add(adminAddPanel);
		
		
		
	}
	
	public static void main(String[] args) {
		AdminDashBoard userFrame = new AdminDashBoard("Saron");
	}
	
}
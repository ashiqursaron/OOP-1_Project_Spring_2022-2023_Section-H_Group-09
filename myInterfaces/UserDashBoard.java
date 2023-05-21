package myInterfaces;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
public class UserDashBoard extends JFrame {
	
	
	public UserDashBoard(){
		
		this.setTitle("User Dash Board");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(500, 700);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.getContentPane().setBackground(Color.WHITE);
		//set up frame icon
		ImageIcon frameIcon = new ImageIcon("motorbike2.png");
		this.setIconImage(frameIcon.getImage());
		
		
		
	}
	
	public static void main(String[] args) {
		UserDashBoard userFrame = new UserDashBoard();
	}
	
}
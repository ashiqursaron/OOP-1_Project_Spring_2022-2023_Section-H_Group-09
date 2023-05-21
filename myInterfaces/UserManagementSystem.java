package myInterfaces;
import javax.swing.*;
import java.awt.*;

public class UserManagementSystem extends JFrame {
    
    public UserManagementSystem() {
        // Set the size of the frame
        setSize(1000, 700);
        
        // Set the layout to null
        setLayout(null);
        
        // Create the three buttons
        JButton addButton = new JButton("Add User");
        addButton.setBounds(50, 50, 200, 50);
        
        JButton deleteButton = new JButton("Delete User");
        deleteButton.setBounds(50, 150, 200, 50);
        
        JButton suspendButton = new JButton("Suspend User");
        suspendButton.setBounds(50, 250, 200, 50);
        
        // Add the buttons to the frame
        add(addButton);
        add(deleteButton);
        add(suspendButton);
        
        // Set the frame to be visible
        setVisible(true);
    }
    
    public static void main(String[] args) {
        UserManagementSystem frame = new UserManagementSystem();
    }
}

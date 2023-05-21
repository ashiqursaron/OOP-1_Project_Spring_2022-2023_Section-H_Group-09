package myInterfaces;


//import classes.*;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.*;

public class AboutUsFrame extends JFrame {

  public AboutUsFrame() {

    this.setTitle("About Us");
    this.setLocationRelativeTo(null);
    ImageIcon frameIcon = new ImageIcon(getClass().getResource("/images/motorbike2.png"));
    this.setIconImage(frameIcon.getImage());
    // this.setLayout(null);
    // Create the data for the table
    String[][] data = {
      {"Ashiqur Rahman Saron", "22-48697-3", "50%", "Coding & Design"},
      {"Bijoy Ahamed", "22-49373-3", "20%", "UI Design"},
      {"tahabi Hossain", "22-47610-2", "20%", "Application Testing"},
      {"Md.Mehedy Sazzat", "22-48528-3", "10%", "User Management"},
  };

    // Create the column headers for the table
    String[] columnHeaders = { "Name", "ID", "Department", "Area of Work" };

    // Create the JTable object
    JTable table = new JTable(data, columnHeaders);
    table.setBackground(Color.MAGENTA);
    table.setForeground(Color.BLACK);
    //table.setFont(new Font("Times New Roman", Font.BOLD, 20));

    // Create the scroll pane and add the table to it
    JScrollPane scrollPane = new JScrollPane(table);


  
    add(scrollPane);

    // Set the size of the frame and make it visible
    setSize(400, 300);
    setVisible(true);
  }

  public static void main(String[] args) {
    AboutUsFrame frame = new AboutUsFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}

package myInterfaces;
import javax.swing.*;
import java.awt.*;

public class SearchFrame extends JFrame {
    private JPanel searchPanel;
    private JLabel fromLabel, toLabel, timeLabel, vehicleLabel;
    private JTextField fromField, toField, timeField, vehicleField;
    private JButton searchButton;
    private JTextArea resultsArea;

    public SearchFrame() {
        this.setTitle("Search Frame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(1000, 700);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        searchPanel = new JPanel();
        searchPanel.setLayout(null);
        searchPanel.setBounds(0, 0, 1000, 600);
        searchPanel.setBackground(Color.WHITE);

        fromLabel = new JLabel("From:");
        fromLabel.setBounds(100, 50, 100, 30);

        toLabel = new JLabel("To:");
        toLabel.setBounds(400, 50, 100, 30);

        fromField = new JTextField();
        fromField.setBounds(200, 50, 150, 30);

        toField = new JTextField();
        toField.setBounds(500, 50, 150, 30);

        timeLabel = new JLabel("Time:");
        timeLabel.setBounds(100, 100, 100, 30);

        vehicleLabel = new JLabel("Preferred Vehicle:");
        vehicleLabel.setBounds(400, 100, 150, 30);

        timeField = new JTextField();
        timeField.setBounds(200, 100, 150, 30);

        vehicleField = new JTextField();
        vehicleField.setBounds(550, 100, 100, 30);

        searchButton = new JButton("Search");
        searchButton.setBounds(400, 150, 100, 30);

        resultsArea = new JTextArea();
        resultsArea.setBounds(100, 200, 800, 300);
        resultsArea.setEditable(false);

        searchPanel.add(fromLabel);
        searchPanel.add(toLabel);
        searchPanel.add(fromField);
        searchPanel.add(toField);
        searchPanel.add(timeLabel);
        searchPanel.add(vehicleLabel);
        searchPanel.add(timeField);
        searchPanel.add(vehicleField);
        searchPanel.add(searchButton);
        searchPanel.add(resultsArea);

        this.add(searchPanel);
    }

    public static void main(String[] args) {
        SearchFrame searchFrame = new SearchFrame();
    }
}

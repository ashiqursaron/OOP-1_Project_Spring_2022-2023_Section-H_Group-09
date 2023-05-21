import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaymentOptionsDemo extends JFrame implements ActionListener {
    private JPanel mainPanel;
    private JPanel creditCardPanel;
    private JPanel paypalPanel;
    private JPanel bitcoinPanel;
    private JComboBox<String> paymentOptionsComboBox;

    public PaymentOptionsDemo(String name) {
		
		
		
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setTitle("Travel Agency");
        this.setSize(900, 700);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Payment Options Demo");

        mainPanel = new JPanel();
        mainPanel.setLayout(null);
		mainPanel.setBounds(0,0,500,500);

        // Create payment options combo box
        String[] paymentOptions = {"Credit Card", "PayPal", "Bitcoin"};
        paymentOptionsComboBox = new JComboBox<>(paymentOptions);
		paymentOptionsComboBox.setBounds(100,50,150,50);
        paymentOptionsComboBox.addActionListener(this);

        // Create panels for different payment options
        creditCardPanel = new JPanel();
        creditCardPanel.add(new JLabel("Credit Card Panel"));
		creditCardPanel.setBounds(100,100,300,300);
		creditCardPanel.setBackground(Color.RED);

        paypalPanel = new JPanel();
        paypalPanel.add(new JLabel("PayPal Panel"));
		paypalPanel.setBounds(100,100,300,300);
		paypalPanel.setBackground(Color.BLUE);

        bitcoinPanel = new JPanel();
        bitcoinPanel.add(new JLabel("Bitcoin Panel"));
		bitcoinPanel.setBounds(100,100,300,300);
		bitcoinPanel.setBackground(Color.YELLOW);


        // Add components to the main panel
        mainPanel.add(paymentOptionsComboBox);
        

        add(mainPanel);

        pack();
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Get the selected payment option
        String selectedOption = (String) paymentOptionsComboBox.getSelectedItem();

        // Set the visibility of panels based on the selected option
		if(selectedOption.equals("Credit Card")){
			mainPanel.add(creditCardPanel, BorderLayout.CENTER);
		}
		else if(selectedOption.equals("PayPal")){
			mainPanel.add(paypalPanel, BorderLayout.CENTER);
		}
		else if(selectedOption.equals("Bitcoin")){
			mainPanel.add(bitcoinPanel, BorderLayout.CENTER);
		}
        //creditCardPanel.setVisible(selectedOption.equals("Credit Card"));
        //paypalPanel.setVisible(selectedOption.equals("PayPal"));
        //;

        // Repaint the main panel
        //mainPanel.revalidate();
        //mainPanel.repaint();
    }

    public static void main(String[] args) {
        //SwingUtilities.invokeLater(() -> {
            PaymentOptionsDemo demo = new PaymentOptionsDemo("Saron");
            demo.setVisible(true);
        //});
    }
}

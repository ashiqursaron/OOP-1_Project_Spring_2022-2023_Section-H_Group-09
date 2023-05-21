import javax.swing.*;    
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.imageio.*;
import java.awt.*;

public class LogIn extends JFrame implements ActionListener {  

 

    JButton b,b1;
    final JLabel label,l1,l2,l3;
    final JTextField text;
    final JPasswordField value;

    LogIn() { 

    JFrame f=new JFrame("ATM SIMULETION SYSTEM");

     label = new JLabel();            
     label.setBounds(20,150, 200,50); 

     l1=new JLabel("ACCOUNT NO:");    
     l1.setBounds(205,60, 80,30); 

     l2=new JLabel("PIN:");    
     l2.setBounds(265,100, 80,30);

     l3=new JLabel("*enter 4 digit pin");    
     l3.setBounds(290,100, 90,90);

     text = new JTextField();  
     text.setBounds(290,60, 100,30);
     //text.setBorder(null);

     value = new JPasswordField();   
     value.setBounds(290,100, 100,30);   

     b = new JButton("Login");  
     b.setBounds(220,170, 80,30);
     b.addActionListener(this);

     b1 = new JButton("SignUp");  
     b1.setBounds(310,170, 80,30);
     b1.addActionListener(this);
    // b1.setBackground(Color.CYAN);

    ImageIcon ImageIcon = new ImageIcon("logo.png");
    Image Image = ImageIcon.getImage();
    f.setIconImage(Image);

    JLabel Background;
    ImageIcon img = new ImageIcon("background.png");
    Background = new JLabel ("",img,JLabel.CENTER);
    Background.setBounds(0,0,600,300);


     f.add(value); 
     f.add(l1); 
     f.add(label); 
     f.add(l2); 
     f.add(l3);
     f.add(b); 
     f.add(b1);
     f.add(text);

    f.add(Background);



 

     
     f.setSize(600,300);    
     f.setLayout(null);    
     f.setVisible(true);
     f.setLocationRelativeTo(null);
     f.setDefaultCloseOperation(EXIT_ON_CLOSE);     
}  

 

     public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b)
        {
            String data = "ACCOUTNT NO:" + text.getText();  
            data += ", PIN: " + new String(value.getPassword());   
            label.setText(data);



        }
        else if (e.getSource() == b1)
        {   
            label.setText("SignUp");
        }
    }
}
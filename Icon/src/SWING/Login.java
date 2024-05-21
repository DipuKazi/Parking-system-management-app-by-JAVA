//This is the first class in the project and it has user login system that can give access further

package SWING;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame{
    private Container c;
    private ImageIcon image;
    private JLabel imageLabel,password,label1,label2, label3;
    private JTextField tf,tf2,tf3;
    private JButton loginButton,clearButton;
    private Font f,font;
    private JPasswordField pass;
    private Cursor cursor;
    
    Login()
    {
        //frame characteristics
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(0,0,1600,1200);
        this.setTitle("VEHICLE PARKING MANAGEMENT SYSTEM");
        
        //container definition
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
        
        image = new ImageIcon(getClass().getResource("CP.png"));
        imageLabel = new JLabel(image);
        imageLabel.setBounds(0,0,image.getIconWidth(),image.getIconHeight());
        f = new Font("Arial",Font.BOLD,20);
        font = new Font("Algerian",Font.BOLD,60);
        cursor = new Cursor(Cursor.HAND_CURSOR);
        

        //Header (Administrator Login)
        label3 = new JLabel();
        label3.setBounds(440,50,700,80);
        label3.setText("ADMINISTRATOR LOGIN");
        label3.setForeground(new Color(22,69,118));
        label3.setOpaque(true);
        label3.setFont(font);
        label3.setHorizontalAlignment(JLabel.CENTER);
        
        c.add(label3);
        
        
        //Username label
        label1 = new JLabel();
        label1.setBounds(590,210,140,50);
        label1.setText("User Name: ");
        label1.setForeground(Color.CYAN);
        label1.setBackground(Color.DARK_GRAY);
        label1.setOpaque(true);
        label1.setFont(f);
        label1.setHorizontalAlignment(JLabel.CENTER);
        
        c.add(label1);
        
        //textfield for username
        tf2 = new JTextField();
        tf2.setBounds(730,210,250,50);
        tf2.setHorizontalAlignment(JTextField.CENTER);
        tf2.setBackground(Color.BLUE);
        tf2.setForeground(Color.CYAN);
        tf2.setFont(f);
        
        c.add(tf2);


        //password label
        label2 = new JLabel();
        label2.setBounds(590,270,140,50);
        label2.setText("Passsword: ");
        label2.setForeground(Color.CYAN);
        label2.setBackground(Color.DARK_GRAY);
        label2.setOpaque(true);
        label2.setFont(f);
        label2.setHorizontalAlignment(JLabel.CENTER);
        
        c.add(label2);
        
        
        //passwordfield for password input
        pass = new JPasswordField();
        pass.setBounds(730,270,250,50);
        pass.setEchoChar('*');
        pass.setHorizontalAlignment(JTextField.CENTER);
        pass.setBackground(Color.BLUE);
        pass.setForeground(Color.CYAN);
        pass.setFont(f);
        
        c.add(pass);
        
        //Login Button
        loginButton = new JButton("Login");
        loginButton.setBounds(675,345,100,50);
        loginButton.setCursor(cursor);
        loginButton.setFont(f);
        loginButton.setForeground(Color.DARK_GRAY);
        loginButton.setFocusable(false);
        
        c.add(loginButton);
        
        //Clear Button
        clearButton = new JButton("Clear");
        clearButton.setBounds(800,345,100,50);
        clearButton.setCursor(cursor);
        clearButton.setFont(f);
        clearButton.setForeground(Color.DARK_GRAY);
        clearButton.setFocusable(false);
        
        c.add(clearButton);
        
        //Add Login Button Functionality
        loginButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String USERNAME = tf2.getText();
                String PASSWORD = pass.getText();
                
                if(USERNAME.equals("ashik") && PASSWORD.equals("dipu"))
                {
                    JOptionPane.showMessageDialog(null,"Login Successful.");
                    
                    dispose();
                    
                    WelcomeFrame FRAME = new WelcomeFrame();
                    FRAME.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Invalid User Name or Password.","Login Error",JOptionPane.ERROR_MESSAGE);
                }
            }        
        });
        
        //Add Clear Button Functionality
        clearButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                tf2.setText("");
                pass.setText("");
            }     
        });
        
        
        c.add(imageLabel);
    }

    public static void main(String args[]) {
        Login frame = new Login();
        frame.setVisible(true);
    }
}

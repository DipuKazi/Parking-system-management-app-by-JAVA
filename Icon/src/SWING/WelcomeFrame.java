//Welcome frame

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
import javax.swing.JTextField;

public class WelcomeFrame extends JFrame{
    
    private Container c;
    private ImageIcon img;
    private JLabel imgLabel, label;
    private JTextField text;
    private Font font;
    private JButton next;
    private Cursor csr;
    
    WelcomeFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(0,0,1600,1200);
        this.setTitle("Welcome");
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
        
        csr = new Cursor(Cursor.HAND_CURSOR);
        img = new ImageIcon(getClass().getResource("car.png"));
        imgLabel = new JLabel(img);
        imgLabel.setBounds(0,0,img.getIconWidth(),img.getIconHeight());
        font = new Font("Bookman Old Style",Font.BOLD+Font.ITALIC,30);
        
        
        
        
//        text = new JTextField("Welcome to Vehicle Parking Management System");
//        text.setBounds(300,200,900,50);
//        text.setHorizontalAlignment(JTextField.CENTER);
//        text.setFont(font);
//        
//        c.add(text);

        label = new JLabel();
        label.setBounds(300,200,900,50);
        label.setText("Welcome to Vehicle Parking Management System");
        label.setFont(font);
        label.setOpaque(true);
        label.setHorizontalAlignment(JLabel.CENTER);
        
        c.add(label);
        
        
        
        next = new JButton("Next");
        next.setBounds(700,350,120,60);
        next.setFont(font);
        next.setCursor(csr);
        next.setForeground(Color.BLUE);
        next.setFocusable(false);
        
        c.add(next);
        
        next.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(null, "Work in Progress...", "Message",JOptionPane.WARNING_MESSAGE);
                
                Menu Frame = new Menu();
                Frame.setVisible(true);
                
                dispose();
            }
        });
        
        
        c.add(imgLabel);
    }
    
//    public static void main(String[] args) {
//        WelcomeFrame frame = new WelcomeFrame();
//        frame.setVisible(true);
//    }
    
}

//This class is used to change parking charges for 3 wheelers

package SWING;

import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class CPC_three extends JFrame{
    private Container c;
    private JTextField tf;
    private JButton button;
    private Font f;
    
    CPC_three(){
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setBounds(400,300,300,200);
        this.setTitle("Three Wheeler");
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
        
        f = new Font("Arial", Font.BOLD, 25);
        
        tf = new JTextField();
        tf.setHorizontalAlignment(JTextField.CENTER);
        tf.setBounds(70,50,140,50);
        tf.setBackground(Color.DARK_GRAY);
        tf.setForeground(Color.CYAN);
        tf.setFont(f);
       
        c.add(tf);
        
        button = new JButton("CHANGE");
        button.setBounds(95,100,90,40);
        button.setForeground(Color.BLUE);
        button.setFocusable(false);
        
        c.add(button);
        
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Parking Charge Updated Successfully.", "3 WHEELER", JOptionPane.INFORMATION_MESSAGE);
                int x=Integer.parseInt(tf.getText());
                Parkingcharges.setthreecharge(x);
                
                dispose();
            }   
        });
    }
    
//    public static void main(String[] args) {
//        CPC_three obj = new CPC_three();
//        obj.setVisible(true);
//    }
}


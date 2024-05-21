// This class contains the framework for change parking charges

package SWING;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;


public class Change_Parking_Charges extends JFrame{
    private Container c;
    private Font font,f;
    private JButton two, three, four, back;
    private ImageIcon image;
    private JLabel imageLabel,LABEL;
    private Cursor cursor;
    
    Change_Parking_Charges(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(0,0,1600,1200);
        this.setTitle("Change Parking Charges");
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
        
        font = new Font("Bookman Old Style", Font.BOLD+Font.ITALIC,20);
        f = new Font("Algerian",Font.BOLD,45);
        cursor = new Cursor(Cursor.HAND_CURSOR);
        
        image = new ImageIcon(getClass().getResource("DP1.jpg"));
        imageLabel = new JLabel(image);
        imageLabel.setBounds(0,-100,image.getIconWidth(),image.getIconHeight());
        
        
        //Header (CHANGE PARKING CHARGES)
        LABEL = new JLabel();
        LABEL.setBounds(435,40,700,80);
        LABEL.setText("CHANGE PARKING CHARGES");
        LABEL.setForeground(new Color(22,69,118));
        LABEL.setOpaque(true);
        LABEL.setFont(f);
        LABEL.setHorizontalAlignment(JLabel.CENTER);
        
        c.add(LABEL);
        
        
        two = new JButton("2 Wheeler");
        two.setBounds(200,300,200,100);
        two.setFont(font);
        two.setForeground(Color.BLUE);
        two.setCursor(cursor);
        two.setFocusable(false);
        
        c.add(two);
        
        three = new JButton("3 Wheeler");
        three.setBounds(660,300,200,100);
        three.setFont(font);
        three.setForeground(Color.BLUE);
        three.setCursor(cursor);
        three.setFocusable(false);
        
        c.add(three);
        
        four = new JButton("4 Wheeler");
        four.setBounds(1100,300,200,100);
        four.setFont(font);
        four.setForeground(Color.BLUE);
        four.setCursor(cursor);
        four.setFocusable(false);
        
        c.add(four);
        
        
        back = new JButton("BACK");
        back.setBounds(100,600,150,80);
        back.setFont(font);
        back.setForeground(Color.RED);
        back.setCursor(cursor);
        back.setFocusable(false);
        
        c.add(back);
        
        two.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                CPC_two frame_two = new CPC_two();
                frame_two.setVisible(true);
            }   
        });
        
        
        three.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                CPC_three frame_three = new CPC_three();
                frame_three.setVisible(true);
            }  
        });
        
        
        four.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                CPC_four frame_four = new CPC_four();
                frame_four.setVisible(true);
            }  
        });
        
        
        
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
//                Menu Frame = new Menu();
//                Frame.setVisible(true);

                ParkingCharge pc = new ParkingCharge();
                pc.setVisible(true);
                
                dispose();
            }  
        });
        
        
        c.add(imageLabel);
    }
    
    
//    public static void main(String[] args) {
//        
//        Change_Parking_Charges object = new Change_Parking_Charges();
//        object.setVisible(true);
//    }
}

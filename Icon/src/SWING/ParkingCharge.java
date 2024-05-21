//Framework for parking charges option 

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

public class ParkingCharge extends JFrame{
    private Container c;
    private Font font, f;
    private JButton two, three, four, back, cpc;
    private ImageIcon image;
    private JLabel imageLabel,LABEL;
    private Cursor cursor;
    private int twocharge,threecharge,fourcharge;
    
    ParkingCharge(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(0,0,1600,1200);
        this.setTitle("Parking Charges");
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
        
        font = new Font("Bookman Old Style", Font.BOLD+Font.ITALIC,20);
        f = new Font("Algerian",Font.BOLD,60);
        cursor = new Cursor(Cursor.HAND_CURSOR);
        
        image = new ImageIcon(getClass().getResource("road.jpg"));
        imageLabel = new JLabel(image);
        imageLabel.setBounds(0,-100,image.getIconWidth(),image.getIconHeight());
        
        
        
        //Header (PARKING CHARGES)
        LABEL = new JLabel();
        LABEL.setBounds(435,50,700,80);
        LABEL.setText("PARKING CHARGES");
        LABEL.setForeground(new Color(22,69,118));
        LABEL.setOpaque(true);
        LABEL.setFont(f);
        LABEL.setHorizontalAlignment(JLabel.CENTER);
        
        c.add(LABEL);
        
        
        twocharge=Parkingcharges.gettwocharge();
        threecharge=Parkingcharges.getthreecharge();
        fourcharge=Parkingcharges.getfourcharge();
        
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
        
        cpc = new JButton("Change Parking Charges");
        cpc.setBounds(1000,600,400,80);
        cpc.setFont(font);
        cpc.setForeground(Color.BLACK);
        cpc.setCursor(cursor);
        cpc.setFocusable(false);
        
        c.add(cpc);
        
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
                twocharge=Parkingcharges.gettwocharge();
                JOptionPane.showMessageDialog(null,"Current Parking Charge = "+twocharge+ "Tk.", "2 WHEELER", JOptionPane.INFORMATION_MESSAGE);
            }   
        });
        
        
        three.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                threecharge=Parkingcharges.getthreecharge();
                JOptionPane.showMessageDialog(null,"Current Parking Charge = "+threecharge+ "Tk.", "3 WHEELER", JOptionPane.INFORMATION_MESSAGE);
            }  
        });
        
        
        four.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                fourcharge=Parkingcharges.getfourcharge();
                JOptionPane.showMessageDialog(null,"Current Parking Charge = "+fourcharge+ "Tk.", "4 WHEELER", JOptionPane.INFORMATION_MESSAGE);
            }  
        });
        
        
        cpc.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Change_Parking_Charges CPC = new Change_Parking_Charges();
                CPC.setVisible(true);
                
                dispose();
            }
        });
        
        
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu Frame = new Menu();
                Frame.setVisible(true);
                
                dispose();
            }  
        });
        
        
        c.add(imageLabel);
    }
    
    
//    public static void main(String[] args) {
//        
//        ParkingCharge object = new ParkingCharge();
//        object.setVisible(true);
//    }
}

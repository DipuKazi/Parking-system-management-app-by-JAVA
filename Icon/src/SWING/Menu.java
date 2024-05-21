// This class contains menu framework

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

public class Menu extends JFrame{
    
    private Container c;
    private JButton button, button2, button3, button4, button5, button6, button7;
    private Font f,font;
    private Cursor cursor;
    private ImageIcon img;
    private JLabel imgLabel,label;
    
    Menu(){
        //Frame characteristics
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(0,0,1600,1200);
        this.setTitle("MENU");
        
        //Read from files
        Parkingcharges.readfilesystem();
        HistoryBackend.readHistoryFile();
        
        //Container definition
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        //font,cursor and background image setup
        f = new Font("Bookman Old Style",Font.BOLD+Font.ITALIC,18);
        font = new Font("Algerian",Font.BOLD,60);
        cursor = new Cursor(Cursor.HAND_CURSOR);
        img = new ImageIcon(getClass().getResource("menuBg2.png"));
        imgLabel = new JLabel(img);
        imgLabel.setBounds(0,0,img.getIconWidth(),img.getIconHeight());
        
        //Header (MENU)
        label = new JLabel();
        label.setBounds(450,50,700,80);
        label.setText("MENU");
        label.setForeground(new Color(22,69,118));
        label.setOpaque(true);
        label.setFont(font);
        label.setHorizontalAlignment(JLabel.CENTER);
        
        c.add(label);
        
        //Add Vehicle Button
        button = new JButton("ADD VEHICLE");
        button.setBounds(685,190,230,50);
        button.setFont(f);
        button.setForeground(Color.BLUE);
        button.setCursor(cursor);
        button.setFocusable(false);
        
        c.add(button);
        
        
        //Vehicle List Button
        button2 = new JButton("VEHICLE LIST");
        button2.setBounds(685,250,230,50);
        button2.setFont(f);
        button2.setForeground(Color.BLUE);
        button2.setCursor(cursor);
        button2.setFocusable(false);
        
        c.add(button2);
        
        
        //History Button
        button3 = new JButton("HISTORY");
        button3.setBounds(685,310,230,50);
        button3.setFont(f);
        button3.setForeground(Color.BLUE);
        button3.setCursor(cursor);
        button3.setFocusable(false);
        c.add(button3);
        
        //Collections button
        button4 = new JButton("COLLECTIONS");
        button4.setBounds(685,370,230,50);
        button4.setFont(f);
        button4.setForeground(Color.BLUE);
        button4.setCursor(cursor);
        button4.setFocusable(false);
        
        c.add(button4);
        
        //Depart Vehicle Button
        button5 = new JButton("DEPART VEHICLE");
        button5.setBounds(685,430,230,50);
        button5.setFont(f);
        button5.setForeground(Color.BLUE);
        button5.setCursor(cursor);
        button5.setFocusable(false);
        
        c.add(button5);
        
        //Parking Charges Button
        button6 = new JButton("PARKING CHARGES");
        button6.setBounds(685,490,230,50);
        button6.setFont(f);
        button6.setForeground(Color.BLUE);
        button6.setCursor(cursor);
        button6.setFocusable(false);
        
        c.add(button6);
        
        //Exit Button
        button7 = new JButton("EXIT");
        button7.setBounds(685,550,230,50);
        button7.setFont(f);
        button7.setForeground(Color.BLUE);
        button7.setCursor(cursor);
        button7.setFocusable(false);
        
        c.add(button7);
        
        
        //Add Button Functionalities
        button7.addActionListener(new ActionListener(){
        
        public void actionPerformed(ActionEvent e){

            int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to quit?", "EXIT", JOptionPane.YES_NO_OPTION);
            
            if(choice == JOptionPane.YES_OPTION){
                System.exit(0);
            }              
        }
    });
        
        
        button6.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            ParkingCharge object = new ParkingCharge();
            object.setVisible(true);
            
            dispose(); //Clear resources in the frame
        }
    });
        
        
        button5.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            DepartVehicle ob = new DepartVehicle();
            ob.setVisible(true);
            
            dispose(); //Clear resources in the frame
        }
    });
        
        button4.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            Collection col = new Collection();
            col.setVisible(true);
            dispose(); //Clear resources in the frame
        }
    });
        
        button3.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            History hst = new History();
            hst.setVisible(true);
            dispose(); //Clear resources in the frame
        }
    });
        
        
        button2.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            VehicleList object = new VehicleList();
            object.setVisible(true);
            
            dispose(); //Clear resources in the frame
        }
    });
        
        
        button.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            AddVehicle object = new AddVehicle();
            object.setVisible(true);
            
            dispose(); //Clear resources in the frame
        }
    });
        
    c.add(imgLabel);
}
    
    
//    public static void main(String[] args) {
//        Menu Frame = new Menu(); //create frame
//        Frame.setVisible(true); //makes the frame visible to the user
//    }
    
}

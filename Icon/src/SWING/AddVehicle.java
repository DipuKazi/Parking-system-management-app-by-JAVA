//This class contains attributes, functionality and framework of Add Vehicle Option

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


public class AddVehicle extends JFrame{
    private Container c;
    private Font f,font;
    private JButton two_wheeler,three_wheeler,four_wheeler,back;
    private ImageIcon image;
    private JLabel imageLabel,label;
    private Cursor cursor;
    
    AddVehicle(){
        //frame characteristics
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(0,0,1600,1200);
        this.setTitle("ADD VEHICLE");
        
        //read file
        HistoryBackend.readHistoryFile();
        
        //container definition
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
        
        //set font and cursor
        f = new Font("Bookman Old Style", Font.BOLD+Font.ITALIC,20);
        font = new Font("Algerian",Font.BOLD,60);
        cursor = new Cursor(Cursor.HAND_CURSOR);
        
        image = new ImageIcon(getClass().getResource("DP3.jpg"));
        imageLabel = new JLabel(image);
        imageLabel.setBounds(0,-100,image.getIconWidth(),image.getIconHeight());
        
        //Header (ADD VEHICLE)
        label = new JLabel();
        label.setBounds(450,50,700,80);
        label.setText("ADD VEHICLE");
        label.setForeground(new Color(22,69,118));
        label.setOpaque(true);
        label.setFont(font);
        label.setHorizontalAlignment(JLabel.CENTER);
        
        c.add(label);
        
        //2 wheeler button
        two_wheeler = new JButton("2 Wheeler");
        two_wheeler.setBounds(200,300,200,100);
        two_wheeler.setFont(f);
        two_wheeler.setForeground(Color.BLUE);
        two_wheeler.setCursor(cursor);
        two_wheeler.setFocusable(false);
        
        c.add(two_wheeler);
        
        //3 wheeler button
        three_wheeler = new JButton("3 Wheeler");
        three_wheeler.setBounds(660,300,200,100);
        three_wheeler.setFont(f);
        three_wheeler.setForeground(Color.BLUE);
        three_wheeler.setCursor(cursor);
        three_wheeler.setFocusable(false);
        
        c.add(three_wheeler);
        
        //four wheeler button
        four_wheeler = new JButton("4 Wheeler");
        four_wheeler.setBounds(1100,300,200,100);
        four_wheeler.setFont(f);
        four_wheeler.setForeground(Color.BLUE);
        four_wheeler.setCursor(cursor);
        four_wheeler.setFocusable(false);
        
        c.add(four_wheeler);
        
        //back button
        back= new JButton("Back");
        back.setBounds(100,600,150,80);
        back.setFont(f);
        back.setForeground(Color.red);
        back.setCursor(cursor);
        back.setFocusable(false);
        
        c.add(back);
        
        //add 2 wheeler button functionality
        two_wheeler.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            Data_Entry_Two data = new Data_Entry_Two();
            data.setVisible(true);

            dispose(); //Clear resources in the frame
        }
    });
        
        //add 3 wheeler button functionality
        three_wheeler.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            Data_Entry_Three object = new Data_Entry_Three();
            object.setVisible(true);
            
            dispose(); //Clear resources in the frame
        }
    });
        
        //add 4 wheeler button functionality
        four_wheeler.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            Data_Entry_Four obj = new Data_Entry_Four();
            obj.setVisible(true);

            dispose(); //Clear resources in the frame
        }
    });
        
        //add back button functionality
        back.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            Menu Frame=new Menu();
            Frame.setVisible(true);
            
            dispose(); //Clear resources in the frame
        }
    }); 
        
        c.add(imageLabel);
    }
    
    
//   public static void main(String[] args) {
//        AddVehicle obj= new AddVehicle();
//        obj.setVisible(true);
//    }
}

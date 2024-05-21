//this class Shows vehicle list

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


public class VehicleList extends JFrame{
    private Container c;
    private Font f,font;
    private JButton two_wheeler,three_wheeler,four_wheeler,back;
    private ImageIcon image;
    private JLabel imageLabel,LABEL;
    private Cursor cursor;
    private JLabel namelabel[] = new JLabel[11];
    private JLabel slotlabel[] = new JLabel[11];
    private JLabel vehiclenolabel[] = new JLabel[11];
    private JLabel phonenolabel[] = new JLabel[11];
    private JLabel typelabel[] = new JLabel[11];
    private JLabel occupylabel[] = new JLabel[11];
    
    VehicleList(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(0,0,1600,1200);
        this.setTitle("VEHICLE LIST");
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
        
        f = new Font("Bookman Old Style", Font.BOLD+Font.ITALIC,20);
        font = new Font("Algerian",Font.BOLD,60);
        cursor = new Cursor(Cursor.HAND_CURSOR);
        
        image = new ImageIcon(getClass().getResource("c3.png"));
        imageLabel = new JLabel(image);
        imageLabel.setBounds(0,-100,image.getIconWidth(),image.getIconHeight());
        
        //Header (VEHICLE LIST)
        LABEL = new JLabel();
        LABEL.setBounds(435,40,700,80);
        LABEL.setText("VEHICLE LIST");
        LABEL.setForeground(new Color(22,69,118));
        LABEL.setOpaque(true);
        LABEL.setFont(font);
        LABEL.setHorizontalAlignment(JLabel.CENTER);
        
        c.add(LABEL);
        
        
        //SLOT label
        
        int x=320,y=130,width=80,height=50,slot=1,i;
        
        for(i=0;i<11;i++)
        {
            slotlabel[i]=new JLabel();
            slotlabel[i].setBounds(x,y,width,height);
            slotlabel[i].setFont(f);
            slotlabel[i].setOpaque(true);
            slotlabel[i].setHorizontalAlignment(JLabel.CENTER);
            slotlabel[i].setBackground(Color.darkGray);
            slotlabel[i].setForeground(Color.GREEN);
            slotlabel[i].setCursor(cursor);
            y+=55;
        }
        
        //Name label
         
        x=400;
        y=130;
        width=150;
        height=50;
        String naam;
        
        for(i=0;i<11;i++)
        {
            namelabel[i]=new JLabel();
            namelabel[i].setBounds(x,y,width,height);
            namelabel[i].setFont(f);
            namelabel[i].setOpaque(true);
            namelabel[i].setHorizontalAlignment(JLabel.CENTER);
            namelabel[i].setBackground(Color.darkGray);
            namelabel[i].setForeground(Color.GREEN);
            namelabel[i].setCursor(cursor);
            y+=55;
        }           
        
        //Vehicle number label
        
        x=550;
        y=130;
        width=150;
        height=50;
        String vehicleno;
        
        for(i=0;i<11;i++)
        {
            vehiclenolabel[i]=new JLabel();
            vehiclenolabel[i].setBounds(x,y,width,height);
            vehiclenolabel[i].setFont(f);
            vehiclenolabel[i].setOpaque(true);
            vehiclenolabel[i].setHorizontalAlignment(JLabel.CENTER);
            vehiclenolabel[i].setBackground(Color.darkGray);
            vehiclenolabel[i].setForeground(Color.GREEN);
            vehiclenolabel[i].setCursor(cursor);
            y+=55;
        }           
        
        //Phone no label
        
        x=700;
        y=130;
        width=250;
        height=50;
        String phoneno;
        
        for(i=0;i<11;i++)
        {
            phonenolabel[i]=new JLabel();
            phonenolabel[i].setBounds(x,y,width,height);
            phonenolabel[i].setFont(f);
            phonenolabel[i].setOpaque(true);
            phonenolabel[i].setHorizontalAlignment(JLabel.CENTER);
            phonenolabel[i].setBackground(Color.darkGray);
            phonenolabel[i].setForeground(Color.GREEN);
            phonenolabel[i].setCursor(cursor);
            y+=55;
        }           
        
        //Vehicle type label
        
        x=950;
        y=130;
        width=180;
        height=50;
        String vehicletype;
        
        for(i=0;i<11;i++)
        {
            typelabel[i]=new JLabel();
            typelabel[i].setBounds(x,y,width,height);
            typelabel[i].setFont(f);
            typelabel[i].setOpaque(true);
            typelabel[i].setHorizontalAlignment(JLabel.CENTER);
            typelabel[i].setBackground(Color.darkGray);
            typelabel[i].setForeground(Color.GREEN);
            typelabel[i].setCursor(cursor);
            y+=55;
        }           
        
        //Occupy label
        
        x=1130;
        y=130;
        width=100;
        height=50;
        boolean occupy;
        
        for(i=0;i<11;i++)
        {
            occupylabel[i]=new JLabel();
            occupylabel[i].setBounds(x,y,width,height);
            occupylabel[i].setFont(f);
            occupylabel[i].setOpaque(true);
            occupylabel[i].setHorizontalAlignment(JLabel.CENTER);
            occupylabel[i].setBackground(Color.darkGray);
            occupylabel[i].setForeground(Color.GREEN);
            occupylabel[i].setCursor(cursor);
            y+=55;
        }           
        
        //All labels setText workings
        
        slotlabel[0].setText("SLOT");
        namelabel[0].setText("NAME");
        vehiclenolabel[0].setText("VEHICLE NO.");
        phonenolabel[0].setText("PHONE NO.");
        typelabel[0].setText("VEHICLE TYPE");
        occupylabel[0].setText("OCCUPY");
        for(i=1;i<11;i++)
        {
            slotlabel[i].setText(""+i);
            naam=AddVehicleBackend.getname(i);
            namelabel[i].setText(naam);
            vehicleno=AddVehicleBackend.getvehicleno(i);
            vehiclenolabel[i].setText(vehicleno);
            phoneno=AddVehicleBackend.getphone_number(i);
            phonenolabel[i].setText(phoneno);
            vehicletype=AddVehicleBackend.type(i);
            typelabel[i].setText(vehicletype);
            occupy=AddVehicleBackend.getoccupy(i);
            occupylabel[i].setText(""+occupy);
        }
        
        for(i=0;i<11;i++)
        {
            c.add(slotlabel[i]);
            c.add(namelabel[i]);
            c.add(vehiclenolabel[i]);
            c.add(phonenolabel[i]);
            c.add(typelabel[i]);
            c.add(occupylabel[i]);
        }
        
        
        back= new JButton("Back");
        back.setBounds(50,680,150,80);
        back.setFont(f);
        back.setForeground(Color.red);
        back.setCursor(cursor);
        back.setFocusable(false);
        
        c.add(back);
        
        
        
        back.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            Menu Frame=new Menu();
            Frame.setVisible(true);
            
            dispose();
        }
    });
        
        c.add(imageLabel);
    }
    
//    public static void main(String[] args) {
//        VehicleList obj=new VehicleList();
//        obj.setVisible(true);
//    }
}

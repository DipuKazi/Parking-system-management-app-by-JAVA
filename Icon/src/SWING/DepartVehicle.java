//Vehicle departure famework and mechanisms are handled in this class.

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


public class DepartVehicle extends JFrame{
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
    private JButton depart[] = new JButton[11];
    private boolean check;
    
    DepartVehicle(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(0,0,1600,1200);
        this.setTitle("DEPART VEHICLE");
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
        
        f = new Font("Bookman Old Style", Font.BOLD+Font.ITALIC,20);
        font = new Font("Algerian",Font.BOLD,60);
        cursor = new Cursor(Cursor.HAND_CURSOR);
        
        image = new ImageIcon(getClass().getResource("DP3.jpg"));
        imageLabel = new JLabel(image);
        imageLabel.setBounds(0,-100,image.getIconWidth(),image.getIconHeight());
        
        
        //Header (DEPART VEHICLE)
        LABEL = new JLabel();
        LABEL.setBounds(435,40,700,80);
        LABEL.setText("DEPART VEHICLE");
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
        
        //Buttons
        x=1290;
        y=185;
        width=150;
        height=50;
        int buttonValue=1;
        
        for(i=1; i<11;i++)
        {
            depart[i]=new JButton();
            depart[i].setBounds(x,y,width,height);
            depart[i].setFont(f);
            depart[i].setOpaque(true);
            depart[i].setText("Depart");
            depart[i].setBackground(Color.GRAY);
            depart[i].setForeground(Color.ORANGE);
            depart[i].setCursor(cursor);
            depart[i].setFocusable(false);
            depart[i].putClientProperty("value", buttonValue);
            buttonValue++;
            y+=55;
        }
        
        //Add Buttons
        for(i = 1; i < 11; i++){
            c.add(depart[i]);
        }
        
        
        back= new JButton("Back");
        back.setBounds(50,680,150,80);
        back.setFont(f);
        back.setForeground(Color.red);
        back.setCursor(cursor);
        back.setFocusable(false);
        
        c.add(back); 
        
        
        depart[1].addActionListener(new ActionListener(){

            @Override

            public void actionPerformed(ActionEvent e){

                int slot=(int)depart[1].getClientProperty("value");

                check=AddVehicleBackend.getoccupy(slot);

                if(check==true)

                {

                    JOptionPane.showMessageDialog(null,""+"Slot "+slot+" Vehicle Departed", "Depart Message", JOptionPane.INFORMATION_MESSAGE);

                    AddVehicleBackend.removedata(slot);

                    DepartVehicle obj = new DepartVehicle();

                    obj.setVisible(true);

                    dispose();

                }

                else

                {

                    JOptionPane.showMessageDialog(null,""+"Slot "+slot+" is already empty", "Depart Message", JOptionPane.INFORMATION_MESSAGE);

                }

            }

            });

        depart[2].addActionListener(new ActionListener(){

            @Override

            public void actionPerformed(ActionEvent e){

                int slot=(int)depart[2].getClientProperty("value");

                check=AddVehicleBackend.getoccupy(slot);

                if(check==true)

                {

                    JOptionPane.showMessageDialog(null,""+"Slot "+slot+" Vehicle Departed", "Depart Message", JOptionPane.INFORMATION_MESSAGE);

                    AddVehicleBackend.removedata(slot);

                    DepartVehicle obj = new DepartVehicle();

                    obj.setVisible(true);

                    dispose();

                }

                else

                {

                    JOptionPane.showMessageDialog(null,""+"Slot "+slot+" is already empty", "Depart Message", JOptionPane.INFORMATION_MESSAGE);

                }

            }

            });

        depart[3].addActionListener(new ActionListener(){

            @Override

            public void actionPerformed(ActionEvent e){

                int slot=(int)depart[3].getClientProperty("value");

                check=AddVehicleBackend.getoccupy(slot);

                if(check==true)

                {

                    JOptionPane.showMessageDialog(null,""+"Slot "+slot+" Vehicle Departed", "Depart Message", JOptionPane.INFORMATION_MESSAGE);

                    AddVehicleBackend.removedata(slot);

                    DepartVehicle obj = new DepartVehicle();

                    obj.setVisible(true);

                    dispose();

                }

                else

                {

                    JOptionPane.showMessageDialog(null,""+"Slot "+slot+" is already empty", "Depart Message", JOptionPane.INFORMATION_MESSAGE);

                }

            }

            });

        depart[4].addActionListener(new ActionListener(){

            @Override

            public void actionPerformed(ActionEvent e){

                int slot=(int)depart[4].getClientProperty("value");

                check=AddVehicleBackend.getoccupy(slot);

                if(check==true)

                {

                    JOptionPane.showMessageDialog(null,""+"Slot "+slot+" Vehicle Departed", "Depart Message", JOptionPane.INFORMATION_MESSAGE);

                    AddVehicleBackend.removedata(slot);

                    DepartVehicle obj = new DepartVehicle();

                    obj.setVisible(true);

                    dispose();

                }

                else

                {

                    JOptionPane.showMessageDialog(null,""+"Slot "+slot+" is already empty", "Depart Message", JOptionPane.INFORMATION_MESSAGE);

                }

            }

            });

        depart[5].addActionListener(new ActionListener(){

            @Override

            public void actionPerformed(ActionEvent e){

                int slot=(int)depart[5].getClientProperty("value");

                check=AddVehicleBackend.getoccupy(slot);

                if(check==true)

                {

                    JOptionPane.showMessageDialog(null,""+"Slot "+slot+" Vehicle Departed", "Depart Message", JOptionPane.INFORMATION_MESSAGE);

                    AddVehicleBackend.removedata(slot);

                    DepartVehicle obj = new DepartVehicle();

                    obj.setVisible(true);

                    dispose();

                }

                else

                {

                    JOptionPane.showMessageDialog(null,""+"Slot "+slot+" is already empty", "Depart Message", JOptionPane.INFORMATION_MESSAGE);

                }

            }

            });

        depart[6].addActionListener(new ActionListener(){

            @Override

            public void actionPerformed(ActionEvent e){

                int slot=(int)depart[6].getClientProperty("value");

                check=AddVehicleBackend.getoccupy(slot);

                if(check==true)

                {

                    JOptionPane.showMessageDialog(null,""+"Slot "+slot+" Vehicle Departed", "Depart Message", JOptionPane.INFORMATION_MESSAGE);

                    AddVehicleBackend.removedata(slot);

                    DepartVehicle obj = new DepartVehicle();

                    obj.setVisible(true);

                    dispose();

                }

                else

                {

                    JOptionPane.showMessageDialog(null,""+"Slot "+slot+" is already empty", "Depart Message", JOptionPane.INFORMATION_MESSAGE);

                }

            }

            });

        depart[7].addActionListener(new ActionListener(){

            @Override

            public void actionPerformed(ActionEvent e){

                int slot=(int)depart[7].getClientProperty("value");

                check=AddVehicleBackend.getoccupy(slot);

                if(check==true)

                {

                    JOptionPane.showMessageDialog(null,""+"Slot "+slot+" Vehicle Departed", "Depart Message", JOptionPane.INFORMATION_MESSAGE);

                    AddVehicleBackend.removedata(slot);

                    DepartVehicle obj = new DepartVehicle();

                    obj.setVisible(true);

                    dispose();

                }

                else

                {

                    JOptionPane.showMessageDialog(null,""+"Slot "+slot+" is already empty", "Depart Message", JOptionPane.INFORMATION_MESSAGE);

                }

            }

            });

        depart[8].addActionListener(new ActionListener(){

            @Override

            public void actionPerformed(ActionEvent e){

                int slot=(int)depart[8].getClientProperty("value");

                check=AddVehicleBackend.getoccupy(slot);

                if(check==true)

                {

                    JOptionPane.showMessageDialog(null,""+"Slot "+slot+" Vehicle Departed", "Depart Message", JOptionPane.INFORMATION_MESSAGE);

                    AddVehicleBackend.removedata(slot);

                    DepartVehicle obj = new DepartVehicle();

                    obj.setVisible(true);

                    dispose();

                }

                else

                {

                    JOptionPane.showMessageDialog(null,""+"Slot "+slot+" is already empty", "Depart Message", JOptionPane.INFORMATION_MESSAGE);

                }

            }

            });

        depart[9].addActionListener(new ActionListener(){

            @Override

            public void actionPerformed(ActionEvent e){

                int slot=(int)depart[9].getClientProperty("value");

                check=AddVehicleBackend.getoccupy(slot);

                if(check==true)

                {

                    JOptionPane.showMessageDialog(null,""+"Slot "+slot+" Vehicle Departed", "Depart Message", JOptionPane.INFORMATION_MESSAGE);

                    AddVehicleBackend.removedata(slot);

                    DepartVehicle obj = new DepartVehicle();

                    obj.setVisible(true);

                    dispose();

                }

                else

                {

                    JOptionPane.showMessageDialog(null,""+"Slot "+slot+" is already empty", "Depart Message", JOptionPane.INFORMATION_MESSAGE);

                }

            }

            });

        depart[10].addActionListener(new ActionListener(){

            @Override

            public void actionPerformed(ActionEvent e){

                int slot=(int)depart[10].getClientProperty("value");

                check=AddVehicleBackend.getoccupy(slot);

                if(check==true)

                {

                    JOptionPane.showMessageDialog(null,""+"Slot "+slot+" Vehicle Departed", "Depart Message", JOptionPane.INFORMATION_MESSAGE);

                    AddVehicleBackend.removedata(slot);

                    DepartVehicle obj = new DepartVehicle();

                    obj.setVisible(true);

                    dispose();

                }

                else

                {

                    JOptionPane.showMessageDialog(null,""+"Slot "+slot+" is already empty", "Depart Message", JOptionPane.INFORMATION_MESSAGE);

                }

            }

            });
        
        
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
//        DepartVehicle obj = new DepartVehicle();
//        obj.setVisible(true);
//    }
}

//This class takes data entry for 2 wheeler

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
import javax.swing.JTextField;

public class Data_Entry_Two extends JFrame{
    private Container c;
    private ImageIcon image;
    private JLabel imageLabel,label1,label2,label3,label4,LABEL;
    private JTextField tf,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9;
    private JButton saveButton,clearButton,cancelButton;
    private Font f,font;
    private Cursor cursor;
    
    
    Data_Entry_Two(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(0,0,1600,1200);
        this.setTitle("Two Wheeler");
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
        
        f = new Font("Arial",Font.BOLD,20);
        font = new Font("Algerian",Font.BOLD,45);
        cursor = new Cursor(Cursor.HAND_CURSOR);
        
        image = new ImageIcon(getClass().getResource("two.png"));
        imageLabel = new JLabel(image);
        imageLabel.setBounds(0,-185,image.getIconWidth(),image.getIconHeight());
        

        
        //Header (2 WHEELER)
        LABEL = new JLabel();
        LABEL.setBounds(435,50,700,80);
        LABEL.setText("2 WHEELER");
        LABEL.setForeground(new Color(22,69,118));
        LABEL.setOpaque(true);
        LABEL.setFont(font);
        LABEL.setHorizontalAlignment(JLabel.CENTER);
        
        c.add(LABEL);
        

        label1 = new JLabel();
        label1.setBounds(200,270,400,50);
        label1.setText("Slot:");
        label1.setFont(f);
        label1.setBackground(Color.DARK_GRAY);
        label1.setForeground(Color.CYAN);
        label1.setOpaque(true);
        label1.setHorizontalAlignment(JLabel.CENTER);
        
        c.add(label1);
        
        
        tf8 = new JTextField();
        tf8.setHorizontalAlignment(JTextField.CENTER);
        tf8.setBounds(600,270,700,50);
        tf8.setBackground(Color.BLUE);
        tf8.setForeground(Color.CYAN);
        tf8.setFont(f);
        
        c.add(tf8);

        
        label2 = new JLabel();
        label2.setBounds(200,330,400,50);
        label2.setText("Owner's name:");
        label2.setFont(f);
        label2.setBackground(Color.DARK_GRAY);
        label2.setForeground(Color.CYAN);
        label2.setOpaque(true);
        label2.setHorizontalAlignment(JLabel.CENTER);
        
        c.add(label2);
        
        tf2 = new JTextField();
        tf2.setBounds(600,330,700,50);
        tf2.setHorizontalAlignment(JTextField.CENTER);
        tf2.setBackground(Color.BLUE);
        tf2.setForeground(Color.CYAN);
        tf2.setFont(f);
        
        c.add(tf2);
        


        label3 = new JLabel();
        label3.setBounds(200,390,400,50);
        label3.setText("Vehicle Number:");
        label3.setFont(f);
        label3.setBackground(Color.DARK_GRAY);
        label3.setForeground(Color.CYAN);
        label3.setOpaque(true);
        label3.setHorizontalAlignment(JLabel.CENTER);
        
        c.add(label3);
        
        tf4 = new JTextField();
        tf4.setBounds(600,390,700,50);
        tf4.setHorizontalAlignment(JTextField.CENTER);
        tf4.setBackground(Color.BLUE);
        tf4.setForeground(Color.CYAN);
        tf4.setFont(f);
        
        c.add(tf4);
        

        label4 = new JLabel();
        label4.setBounds(200,450,400,50);
        label4.setText("Owner's Contact Number:");
        label4.setFont(f);
        label4.setBackground(Color.DARK_GRAY);
        label4.setForeground(Color.CYAN);
        label4.setOpaque(true);
        label4.setHorizontalAlignment(JLabel.CENTER);
        
        c.add(label4);
        
        tf6 = new JTextField();
        tf6.setBounds(600,450,700,50);
        tf6.setHorizontalAlignment(JTextField.CENTER);
        tf6.setBackground(Color.BLUE);
        tf6.setForeground(Color.CYAN);
        tf6.setFont(f);
        
        c.add(tf6);
        
        saveButton = new JButton("Save");
        saveButton.setBounds(450,540,100,50);
        saveButton.setCursor(cursor);
        saveButton.setFont(f);
        saveButton.setForeground(Color.DARK_GRAY);
        saveButton.setFocusable(false);
        
        c.add(saveButton);
        
        clearButton = new JButton("Clear");
        clearButton.setBounds(700,540,100,50);
        clearButton.setCursor(cursor);
        clearButton.setFont(f);
        clearButton.setForeground(Color.DARK_GRAY);
        clearButton.setFocusable(false);
        
        c.add(clearButton);
        
        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(950,540,100,50);
        cancelButton.setCursor(cursor);
        cancelButton.setFont(f);
        cancelButton.setForeground(Color.DARK_GRAY);
        cancelButton.setFocusable(false);
        
        c.add(cancelButton);
        
        cancelButton.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            AddVehicle object = new AddVehicle();
            object.setVisible(true);
            
            dispose();
        }
    });
        
        clearButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                tf2.setText("");
                tf4.setText("");
                tf6.setText("");
            }     
        });
        
        saveButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String naam=tf2.getText();
                String vehicleno=tf4.getText();
                String phoneno=tf6.getText();
                
                int slot=Integer.parseInt(tf8.getText());
                boolean occupyChecker;
                boolean check=true;
                String type="2 Wheeler";
                
                if(slot>0&&slot<11)
                {
                    occupyChecker=AddVehicleBackend.getoccupy(slot);
                    if(occupyChecker==false)
                    {
                        AddVehicleBackend.setdata(slot,naam,vehicleno,phoneno,type,check);
                        HistoryBackend.readHistoryFile();
                        HistoryBackend.setTwoWheelerCount();
                        CollectionBackend.settwoWheelerCollection();
                        JOptionPane.showMessageDialog(null,"Successfully Data Added.", "2 WHEELER", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Slot is already occupied. Please select other slots.", "2 WHEELER", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                else
                {
                     JOptionPane.showMessageDialog(null,"Invalid Slot", "2 WHEELER", JOptionPane.INFORMATION_MESSAGE);
                }
                tf8.setText("");
                tf2.setText("");
                tf4.setText("");
                tf6.setText("");                              
            }     
        });
        
        c.add(imageLabel);
    }
 
//    public static void main(String[] args) {
//        Data_Entry_Two obj=new Data_Entry_Two();
//        obj.setVisible(true);
//    }
    
}

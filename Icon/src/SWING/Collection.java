//This class contains the framework of the collection option in the menu

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


public class Collection extends JFrame{
    private Container c;
    private JLabel label[] = new JLabel[13];
    private Font f,font;
    private Cursor cursor;
    private ImageIcon image;
    private JLabel imageLabel,lbl1,lbl2,lbl3,LABEL;
    private JButton back;
    
    Collection(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(0,0,1600,1200);
        this.setTitle("COLLECTIONS");
        
        Parkingcharges.readfilesystem();
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
        
        f = new Font("Bookman Old Style", Font.BOLD+Font.ITALIC,20);
        font = new Font("Algerian",Font.BOLD,60);
        cursor = new Cursor(Cursor.HAND_CURSOR);
        
        image = new ImageIcon(getClass().getResource("c2.png"));
        imageLabel = new JLabel(image);
        imageLabel.setBounds(0,-100,image.getIconWidth(),image.getIconHeight());
        
        //Header (COLLECTIONS)
        LABEL = new JLabel();
        LABEL.setBounds(455,50,720,80);
        LABEL.setText("COLLECTIONS");
        LABEL.setForeground(new Color(22,69,118));
        LABEL.setOpaque(true);
        LABEL.setFont(font);
        LABEL.setHorizontalAlignment(JLabel.CENTER);
        
        c.add(LABEL);
        
        int i, x = 470, y = 200, width = 230, height = 50;
        
        for(i = 1; i <= 4; i++){
            label[i] = new JLabel();
            label[i].setBounds(x,y,width,height);
            label[i].setFont(f);
            label[i].setOpaque(true);
            label[i].setHorizontalAlignment(JLabel.CENTER);
            label[i].setBackground(Color.DARK_GRAY);
            label[i].setForeground(Color.GREEN);
            
            y+=55;
        }
        
        x = 700;
        y = 200;
        
        for(i = 5; i <= 8; i++){
            label[i] = new JLabel();
            label[i].setBounds(x,y,width,height);
            label[i].setFont(f);
            label[i].setOpaque(true);
            label[i].setHorizontalAlignment(JLabel.CENTER);
            label[i].setBackground(Color.YELLOW);
            label[i].setForeground(Color.GREEN);
            
            y+=55;
        }
        
        x = 930;
        y = 200;
        
        for(i = 9; i <= 12; i++){
            label[i] = new JLabel();
            label[i].setBounds(x,y,width,height);
            label[i].setFont(f);
            label[i].setOpaque(true);
            label[i].setHorizontalAlignment(JLabel.CENTER);
            label[i].setBackground(Color.GRAY);
            label[i].setForeground(Color.GREEN);
            
            y+=55;
        }
        
        
        label[1].setText("Vehicle Type");
        label[1].setForeground(Color.BLUE);
        
        label[2].setText("2 Wheeler");
        label[3].setText("3 Wheeler");
        label[4].setText("4 Wheeler");
        
        label[5].setText("Vehicle Count");
        label[5].setForeground(Color.BLUE);
        
        label[9].setText("Amount");
        label[9].setForeground(Color.BLUE);
        
        
        lbl1 = new JLabel();
        lbl1.setBounds(465,480,360,60);
        lbl1.setFont(f);
        lbl1.setOpaque(true);
        lbl1.setHorizontalAlignment(JLabel.CENTER);
        lbl1.setBackground(Color.ORANGE);
        lbl1.setForeground(Color.BLACK);
        lbl1.setText("Total Collections:");
        
        c.add(lbl1);
        
        
        lbl2 = new JLabel();
        lbl2.setBounds(825,480,350,60);
        lbl2.setFont(f);
        lbl2.setOpaque(true);
        lbl2.setHorizontalAlignment(JLabel.CENTER);
        lbl2.setBackground(Color.BLUE);
        lbl2.setForeground(Color.WHITE);
        
        c.add(lbl2);
        
        int totalVehicleCount=HistoryBackend.getVehicleCount();
        
        lbl3 = new JLabel();
        lbl3.setBounds(630,570,350,60);
        lbl3.setFont(f);
        lbl3.setOpaque(true);
        lbl3.setHorizontalAlignment(JLabel.CENTER);
        lbl3.setBackground(Color.WHITE);
        lbl3.setForeground(Color.BLACK);
        lbl3.setText("Total Number of Vehicles: "+totalVehicleCount);
        c.add(lbl3);
        
        int twoWheelerCount=HistoryBackend.getTwoWheelerCount();
        int threeWheelerCount=HistoryBackend.getThreeWheelerCount();
        int fourWheelerCount=HistoryBackend.getFourWheelerCount();
        
        label[6].setText(twoWheelerCount+"");
        label[7].setText(threeWheelerCount+"");
        label[8].setText(fourWheelerCount+"");
        
        int twoWheelerCollection=CollectionBackend.gettwoWheelerCollection();
        int threeWheelerCollection=CollectionBackend.getthreeWheelerCollection();
        int fourWheelerCollection=CollectionBackend.getfourWheelerCollection();
        
        label[10].setText(twoWheelerCollection+" BDT");
        label[11].setText(threeWheelerCollection+" BDT");
        label[12].setText(fourWheelerCollection+" BDT");
        
        int totalCollection=CollectionBackend.gettotalCollection();
        
        lbl2.setText(totalCollection+" BDT");
        
        back= new JButton("Back");
        back.setBounds(100,600,150,80);
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
        
        
        for(i = 1; i <= 12; i++){
            c.add(label[i]);
        }
        c.add(imageLabel);
    }
    
//    public static void main(String[] args) {
//        Collection col = new Collection();
//        col.setVisible(true);
//    }
}

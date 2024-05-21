//This class contains history.

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


public class History extends JFrame{
    private Container c;
    private JLabel label[] = new JLabel[9];
    private Font f,font;
    private Cursor cursor;
    private ImageIcon image;
    private JLabel imageLabel,LABEL;
    private JButton back,reset;
    private int totalVehicleCount,twoWheelerCount,threeWheelerCount,fourWheelerCount;
    
    
    History(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(0,0,1600,1200);
        this.setTitle("HISTORY");
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
        
        f = new Font("Bookman Old Style", Font.BOLD+Font.ITALIC,20);
        font = new Font("Algerian",Font.BOLD,60);
        cursor = new Cursor(Cursor.HAND_CURSOR);
        
        image = new ImageIcon(getClass().getResource("DP4.jpg"));
        imageLabel = new JLabel(image);
        imageLabel.setBounds(0,-100,image.getIconWidth(),image.getIconHeight());
        
        //Header (HISTORY)
        LABEL = new JLabel();
        LABEL.setBounds(450,50,700,80);
        LABEL.setText("HISTORY");
        LABEL.setForeground(new Color(22,69,118));
        LABEL.setOpaque(true);
        LABEL.setFont(font);
        LABEL.setHorizontalAlignment(JLabel.CENTER);
        
        c.add(LABEL);
        
        
        int i, x = 800, y = 220, width = 230, height = 50;
        
        for(i = 1; i <= 4; i++){
            label[i] = new JLabel();
            label[i].setBounds(x,y,width,height);
            label[i].setFont(f);
            label[i].setOpaque(true);
            label[i].setHorizontalAlignment(JLabel.CENTER);
            label[i].setBackground(Color.GRAY);
            label[i].setForeground(Color.GREEN);
            
            y+=55;
        }
        
        x = 580;
        y = 220;
        
        for(i = 5; i <= 8; i++){
            label[i] = new JLabel();
            label[i].setBounds(x,y,width,height);
            label[i].setFont(f);
            label[i].setOpaque(true);
            label[i].setHorizontalAlignment(JLabel.CENTER);
            label[i].setBackground(Color.DARK_GRAY);
            label[i].setForeground(Color.GREEN);
            
            y+=55;
        }
        
        int j;
        label[5].setText("Total Vehicles:");
        for(i=6,j=2;i<=8;i++,j++)
        {
            label[i].setText(j+" Wheeler");
        }
        
        HistoryBackend.readHistoryFile();
        totalVehicleCount=HistoryBackend.getVehicleCount();
        twoWheelerCount=HistoryBackend.getTwoWheelerCount();
        threeWheelerCount=HistoryBackend.getThreeWheelerCount();
        fourWheelerCount=HistoryBackend.getFourWheelerCount();
        
        label[1].setText(totalVehicleCount+"");
        label[2].setText(twoWheelerCount+"");
        label[3].setText(threeWheelerCount+"");
        label[4].setText(fourWheelerCount+"");
        
        back= new JButton("Back");
        back.setBounds(100,600,150,80);
        back.setFont(f);
        back.setForeground(Color.red);
        back.setCursor(cursor);
        back.setFocusable(false);
        
        c.add(back);
        
        reset= new JButton("Reset");
        reset.setBounds(695,465,250,60);
        reset.setFont(f);
        reset.setForeground(Color.blue);
        reset.setCursor(cursor);
        reset.setFocusable(false);
        
        c.add(reset);
        
        back.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            Menu Frame=new Menu();
            Frame.setVisible(true);
            
            dispose();
        }
    });
        
        
        reset.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            HistoryBackend.resetHistoryFile();
            History Frame=new History();
            Frame.setVisible(true);
            
            dispose();
        }
    });
        
        for(i = 1; i <= 8; i++){
            c.add(label[i]);
        }
        c.add(imageLabel);
    }
    
//    public static void main(String[] args) {
//        History hst = new History();
//        hst.setVisible(true);
//    }
}

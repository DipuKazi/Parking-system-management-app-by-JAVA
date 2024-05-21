package SWING;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Parkingcharges {
    static int[]charge=new int [3];
    /*void defaultsetcharge()
    {
        twocharge=15;
        threecharge=25;
        fourcharge=40;
    }*/
    static void createfilesystem()
    {
        File parkingcharges=new File("ParkingCharges.txt");
        try {
            parkingcharges.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(Parkingcharges.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    static void writefilesystem()
    {
        try {
            FileWriter writeParkingCharges=new FileWriter("ParkingCharges.txt");
            writeParkingCharges.write(charge[0]+"\n"+charge[1]+"\n"+charge[2]+"\n");
            writeParkingCharges.close();
        } catch (IOException ex) {
            Logger.getLogger(Parkingcharges.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    static void readfilesystem()
    {
        int i=0;
        File readParkingCharges=new File("ParkingCharges.txt");
        try {
            Scanner input=new Scanner(readParkingCharges);
            while(input.hasNextLine())
            {
                charge[i]=Integer.parseInt(input.nextLine());
                i++;
            }
            input.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Parkingcharges.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    static void settwocharge(int x)
    {
        charge[0]=x;
        writefilesystem();
    }
    static void setthreecharge(int x)
    {
        charge[1]=x;
        writefilesystem();
    }
    static void setfourcharge(int x)
    {
        charge[2]=x;
        writefilesystem();
    }
    static int gettwocharge()
    {
        readfilesystem();
        return charge[0];
    }
     static int getthreecharge()
    {
        readfilesystem();
        return charge[1];
    }
    static int getfourcharge()
    {
        readfilesystem();
        return charge[2];
    }
    /*public static void main(String[] args) {
        //createfilesystem();
        //writefilesystem(10,25,40);
    }*/
}

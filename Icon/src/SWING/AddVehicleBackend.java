
package SWING;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AddVehicleBackend {
    
    final static private int size=11;
    static private String name[]=new String[size];
    static private String vehicle_number[]=new String[size];
    static private String phone_number[]=new String[size];
    static private boolean occupy[]=new boolean[size];
    static private String vehicle_type[]=new String[size];
    
    static void setdata(int slot,String naam,String vehicleno,String phoneno,String type,boolean check)
    {
        if(slot<=10)
        {
            name[slot]=naam;
            vehicle_number[slot]=vehicleno;
            phone_number[slot]=phoneno;
            vehicle_type[slot]=type;
            occupy[slot]=check;
        }
        writefile();
    }
    
    static void removedata(int slot)
    {
        name[slot]=null;
        vehicle_number[slot]=null;
        phone_number[slot]=null;
        vehicle_type[slot]=null;
        occupy[slot]=false;
        writefile();
    }
    
    static String getname(int slot)
    {
        readfile();
        return name[slot];
    }
    
    static String getvehicleno(int slot)
    {
        readfile();
        return vehicle_number[slot];
    }
    
    static String getphone_number(int slot)
    {
        readfile();
        return phone_number[slot];
    }
    
    static String type(int slot)
    {
        readfile();
        return vehicle_type[slot];
    }
    
    static boolean getoccupy(int slot)
    {
        readfile();
        return occupy[slot];
    }
    
    static void createfile()
    {
        File namedata=new File("name.txt");
        File vehicle_numberdata=new File("vehicle_number.txt");
        File phone_numberdata=new File("phone_number.txt");
        File occupydata=new File("occupy.txt");
        File vehicle_typedata=new File("vehicle_type.txt");
        try {
            namedata.createNewFile();
            vehicle_numberdata.createNewFile();
            phone_numberdata.createNewFile();
            occupydata.createNewFile();
            vehicle_typedata.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(Parkingcharges.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    static void writefile()
    {
        int i;
        try {
            FileWriter writenamedata=new FileWriter("name.txt");
            FileWriter writevehicle_numberdata=new FileWriter("vehicle_number.txt");
            FileWriter writephone_numberdata=new FileWriter("phone_number.txt");
            FileWriter writeoccupydata=new FileWriter("occupy.txt");
            FileWriter writevehicle_typedata=new FileWriter("vehicle_type.txt");
            for(i=1;i<=10;i++)
            {
                writenamedata.write(name[i]+"\n");
                writevehicle_numberdata.write(vehicle_number[i]+"\n");
                writephone_numberdata.write(phone_number[i]+"\n");
                writeoccupydata.write(occupy[i]+"\n");
                writevehicle_typedata.write(vehicle_type[i]+"\n");
            }
            writenamedata.close();
            writevehicle_numberdata.close();
            writephone_numberdata.close();
            writeoccupydata.close();
            writevehicle_typedata.close();
        } catch (IOException ex) {
            Logger.getLogger(Parkingcharges.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    static void readfile()
    {
        int i=1;
        File readnamedata=new File("name.txt");
        File readvehicle_numberdata=new File("vehicle_number.txt");
        File readphone_numberdata=new File("phone_number.txt");
        File readoccupydata=new File("occupy.txt");
        File readvehicle_typedata=new File("vehicle_type.txt");
        try {
            Scanner nameinput=new Scanner(readnamedata);
            Scanner vehicle_numberinput=new Scanner(readvehicle_numberdata);
            Scanner phone_numberinput=new Scanner(readphone_numberdata);
            Scanner occupyinput=new Scanner(readoccupydata);
            Scanner vehicle_typeinput=new Scanner(readvehicle_typedata);
            
            while(occupyinput.hasNextLine())
            {
                name[i]=nameinput.nextLine();
                vehicle_number[i]=vehicle_numberinput.nextLine();
                phone_number[i]=phone_numberinput.nextLine();
                occupy[i]=Boolean.parseBoolean(occupyinput.nextLine());
                vehicle_type[i]=vehicle_typeinput.nextLine();
                i++;
            }
            nameinput.close();
            vehicle_numberinput.close();
            phone_numberinput.close();
            occupyinput.close();
            vehicle_typeinput.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Parkingcharges.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /*public static void main(String[] args) {
        //createfile();
        //name[1]="dipu";
        //name[2]="ashik";
        occupy[1]=true;
        writefile();
        readfile();  
    }*/
    
}

package SWING;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HistoryBackend {
    static private int totalVehicleCount,twoWheelerCount,threeWheelerCount,fourWheelerCount;
    
    static void setVehicleCount()
    {
        totalVehicleCount=totalVehicleCount+1;
        writeHistoryFile();
    }
    
    static void setTwoWheelerCount()
    {
       twoWheelerCount=twoWheelerCount+1;
       setVehicleCount();
       writeHistoryFile();
    }
    
    static void setThreeWheelerCount()
    {
       threeWheelerCount=threeWheelerCount+1;
       setVehicleCount();
       writeHistoryFile();
    }
    
    static void setFourWheelerCount()
    {
       fourWheelerCount=fourWheelerCount+1;
       setVehicleCount();
       writeHistoryFile();
    }
    
    static int getVehicleCount()
    {
        //readHistoryFile();
        return totalVehicleCount;
    }
    
    static int getTwoWheelerCount()
    {
        //readHistoryFile();
        return twoWheelerCount;
    }
    
    static int getThreeWheelerCount()
    {
       //readHistoryFile();
       return threeWheelerCount;
    }
    
    static int getFourWheelerCount()
    {
       //readHistoryFile();
       return fourWheelerCount;
    }
    
    static void createHistoryFile()
    {
        File historydata=new File("History.txt");
        try {
            historydata.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(Parkingcharges.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    static void writeHistoryFile()
    {
        try {
            FileWriter writehistorydata=new FileWriter("History.txt");
            writehistorydata.write(totalVehicleCount+"\n"+twoWheelerCount+"\n"+threeWheelerCount+"\n"+fourWheelerCount);
            writehistorydata.close();
        } catch (IOException ex) {
            Logger.getLogger(HistoryBackend.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    static void readHistoryFile()
    {
        File readhistorydata = new File("History.txt");
        try {
            Scanner historyinput=new Scanner(readhistorydata);
            while(historyinput.hasNextLine())
            {
                totalVehicleCount=Integer.parseInt(historyinput.nextLine());
                twoWheelerCount=Integer.parseInt(historyinput.nextLine());
                threeWheelerCount=Integer.parseInt(historyinput.nextLine());
                fourWheelerCount=Integer.parseInt(historyinput.nextLine());
            }
            historyinput.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HistoryBackend.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    static void resetHistoryFile()
    {
        //totalVehicleCount=twoWheelerCount=threeWheelerCount=fourWheelerCount=0;
        
        try {
            FileWriter resethistorydata=new FileWriter("History.txt");
            //resethistorydata.write(totalVehicleCount+"\n"+twoWheelerCount+"\n"+threeWheelerCount+"\n"+fourWheelerCount);
            resethistorydata.write(0+"\n"+0+"\n"+0+"\n"+0);
            resethistorydata.close();
        } catch (IOException ex) {
            Logger.getLogger(HistoryBackend.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /*public static void main(String[] args) {
        //createHistoryFile();
        //readHistoryFile();
        
        //resetHistoryFile();
        //System.out.println(totalVehicleCount+"\n"+twoWheelerCount+"\n"+threeWheelerCount+"\n"+fourWheelerCount);
    }*/
}

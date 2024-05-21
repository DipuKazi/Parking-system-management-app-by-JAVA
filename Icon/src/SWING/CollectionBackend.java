package SWING;

public class CollectionBackend {
    static private int totalCollection=0,twoWheelerCollection=0,threeWheelerCollection=0,fourWheelerCollection=0;
    
    static void settwoWheelerCollection()
    {
        twoWheelerCollection+=Parkingcharges.charge[0];
        totalCollection+=Parkingcharges.charge[0];
    }
    
    static void setthreeWheelerCollection()
    {
        threeWheelerCollection+=Parkingcharges.charge[1];
        totalCollection+=Parkingcharges.charge[1];
    }
    
    static void setfourWheelerCollection()
    {
        fourWheelerCollection+=Parkingcharges.charge[2];
        totalCollection+=Parkingcharges.charge[2];
    }
    
    static int gettwoWheelerCollection()
    {
        return twoWheelerCollection;
    }
    
    static int getthreeWheelerCollection()
    {
        return threeWheelerCollection;
    }
    
    static int getfourWheelerCollection()
    {
        return fourWheelerCollection;
    }
    
    static int gettotalCollection()
    {
        return totalCollection;
    }
}

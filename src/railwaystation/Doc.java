/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package railwaystation;

/**
 *
 * @author illya
 */
public class Doc {
    int id_w;
    String Date;
    String Type;
    String Descr;
    
    
    public Doc(int ID, String date, String type, String descr)
    { 
        this.id_w = ID;
        this.Date = date;
        this.Type = type;
        this.Descr = descr;
        
    }   

    public int getId()
    {
        return id_w;
    }        
    
    public String getDate()
    {
        return Date;
    }
    
    public String getType()
    {
        return Type;
    }   
    
    public String getDescr()
    {
        return Descr;
    }
}

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
public class Stime {
  String s,e;
    int id,d;
    
    public Stime(int id,int d,String s, String e)
    { 
        this.id = id;
        this.s = s;
        this.e = e;
        this.d = d;
        
    }   

    public int getId()
    {
        return id;
    }
    public String getS()
    {
        return s;
    }        
    
    public String getE()
    {
        return e;
    }
    
    public int getD()
    {
        return d;
    }        
    
}

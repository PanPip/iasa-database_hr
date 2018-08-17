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
public class Time {
    String ms,me,ts,te,ws,we,ths,the,fs,fe,ss,se,sus,sue;
    int id;
    
    public Time(int id,String ms, String me, String ts, String te,String ws, String we, String ths, String the,String fs, String fe, String ss, String se,String sus, String sue)
    { 
        this.id = id;
        this.ms = ms;
        this.me = me;
        this.ts = ts;
        this.te = te;
        this.ws = ws;
        this.we = we;
        this.ths = ths;
        this.the = the;
        this.fs = fs;
        this.fe = fe;
        this.ss = ss;
        this.se = se;
        this.sus = sus;
        this.sue = se;
        
    }   

    public int getId()
    {
        return id;
    }
    public String getMs()
    {
        return ms;
    }        
    
    public String getMe()
    {
        return me;
    }
    
    public String getTs()
    {
        return ts;
    }        
    
    public String getTe()
    {
        return te;
    }
    
    public String getWs()
    {
        return ws;
    }        
    
    public String getWe()
    {
        return we;
    }
    
    public String getThs()
    {
        return ths;
    }        
    
    public String getThe()
    {
        return the;
    }
    
    public String getFs()
    {
        return fs;
    }        
    
    public String getFe()
    {
        return fe;
    }
    
    public String getSs()
    {
        return ss;
    }        
    
    public String getSe()
    {
        return se;
    }
    
    public String getSus()
    {
        return sus;
    }        
    
    public String getSue()
    {
        return sue;
    }
    
}

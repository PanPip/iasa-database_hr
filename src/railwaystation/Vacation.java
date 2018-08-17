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
public class Vacation {
    int id_worker;
    String StartDate;
    String EndDate;
    String VacationType;
    
    
    public Vacation(int id, String sd, String ed, String vt)
    { 
        this.id_worker = id;
        this.StartDate = sd;
        this.EndDate = ed;
        this.VacationType = vt;
        
    }   

    public int getId()
    {
        return id_worker;
    }        
    
    public String getStartDate()
    {
        return StartDate;
    }
    
    public String getEndDate()
    {
        return EndDate;
    }   
    
    public String getVacationType()
    {
        return VacationType;
    }
}

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
public class Medical {
    int id_worker;
    String InspectionDate;
    String Result;

    public Medical(int id, String insdate, String res)
    { 
        this.id_worker = id;
        this.InspectionDate = insdate;
        this.Result = res;
        
    }   

    public int getId()
    {
        return id_worker;
    }        
    
    public String getInspectionDate()
    {
        return InspectionDate;
    }
    
    public String getResult()
    {
        return Result;
    }   
    
}

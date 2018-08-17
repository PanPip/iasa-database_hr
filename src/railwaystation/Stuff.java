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
public class Stuff {
    int id_worker;
    String id_paper;
    int id_position;
    String DateStart;
    String DateEnd;
    float salary;
    
    
    public Stuff(int id_w,int id_p, String ds, String de, float sal,String idp)
    { 
        this.id_worker = id_w;
        this.id_position = id_p;
        this.DateStart = ds;
        this.DateEnd = de;
        this.salary = sal;
        this.id_paper = idp;
    }   

    public String getIdPaper()
    {
        return id_paper;
    }
    
    public int getIdWorker()
    {
        return id_worker;
    }    

    public int getIdPosition()
    {
        return id_position;
    }     
    
    public String getDateStart()
    {
        return DateStart;
    }
    
    public String getDateEnd()
    {
        return DateEnd;
    }   
    
    public float getSalary()
    {
        return salary;
    }
}

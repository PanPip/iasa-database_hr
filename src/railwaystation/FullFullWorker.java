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
public class FullFullWorker extends FullWorker{
    private String department;
    private String position;
    private Float salary;
    private String hire;
    private String fire;
    
    public FullFullWorker(int ID, String firstName, String lastName, String fathersName,
                      String bd, String fw, String tel, String mil, String adr,Float sal,
                      String dpt, String pos, String hir, String fir)
    { 
        super(ID, firstName, lastName, fathersName,bd,fw,tel,mil,adr);
        this.department = dpt;
        this.position = pos;
        this.salary = sal;
        this.fire = fir;
        this.hire = hir;
    } 
    
    public String getDepartment()
    {
        return department;
    }        
    
    public String getPosition()
    {
        return position;
    }
    
    public Float getSalary()
    {
        return salary;
    }   
    
    public String getHire()
    {
        return hire;
    }
    
    public String getFire()
    {
        return fire;
    }        
    
      
}


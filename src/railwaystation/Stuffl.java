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
public class Stuffl {
    int id;
    int id_department;
    int id_position;
    String name_position;
    String name_department;
    float MinSalary;
    float MaxSalary;
    
    
    public Stuffl(int id,int id_d,int id_p, String np, String nd, float min, float max)
    { 
        this.id = id;
        this.id_department = id_d;
        this.id_position = id_p;
        this.name_position = np;
        this.name_department = nd;

        this.MinSalary = min;
        this.MaxSalary = max;
        
    }   

    public int getId()
    {
        return id;
    }    

    public int getIdDepartment()
    {
        return id_department;
    }     
    
    public int getIdPosition()
    {
        return id_position;
    }     
    
    public String getNamePosition()
    {
        return name_position;
    }
    
    public String getNameDepartment()
    {
        return name_department;
    }
    
    public float getMinSalary()
    {
        return MinSalary;
    }   
    
    public float getMaxSalary()
    {
        return MaxSalary;
    } 
}

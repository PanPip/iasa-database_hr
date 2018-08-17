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
public class Worker {
    int id;
    String FirstName;
    String LastName;
    String FathersName;
    
    
    public Worker(int ID, String firstName, String lastName, String fathersName)
    { 
        this.id = ID;
        this.FirstName = firstName;
        this.LastName = lastName;
        this.FathersName = fathersName;
        
    }   

    public int getId()
    {
        return id;
    }        
    
    public String getFirstName()
    {
        return FirstName;
    }
    
    public String getLastName()
    {
        return LastName;
    }   
    
    public String getFathersName()
    {
        return FathersName;
    }
}

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
public class CombinedWorker {
    String id_paper;
    String FirstName;
    String LastName;
    String FathersName;
    
    
    public CombinedWorker(String ID, String firstName, String lastName, String fathersName)
    { 
        this.id_paper = ID;
        this.FirstName = firstName;
        this.LastName = lastName;
        this.FathersName = fathersName;
        
    }   

    public String getId()
    {
        return id_paper;
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

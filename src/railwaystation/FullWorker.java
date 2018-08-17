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
public class FullWorker extends Worker{
    private String birthday;
    private String firstwork;
    private String telephone;
    private String mail;
    private String adress;
    //private String department;
    //private String position;
    
    public FullWorker(int ID, String firstName, String lastName, String fathersName,
                      String bd, String fw, String tel, String mil, String adr)
    { 
        super(ID, firstName, lastName, fathersName);
        this.birthday = bd;
        this.adress = adr;
        this.telephone = tel;
        this.mail = mil;
        this.firstwork = fw;
    } 
    
    public String getBirthday()
    {
        return birthday;
    }        
    
    public String getFirstWork()
    {
        return firstwork;
    }
    
    public String getTelephone()
    {
        return telephone;
    }   
    
    public String getMail()
    {
        return mail;
    }
    
    public String getAdress()
    {
        return adress;
    }        
    
      
}

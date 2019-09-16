
package gebeya.enterprise.app;

import java.util.ArrayList;


public class TalentController extends AuthenticationMenu{
    
    ArrayList<Talent> talents;
private String userName;
private String email;
private String password;
private String specialization;
int input;

public TalentController(String userName,String email,String password,String specialization)
{
    super(userName,email,password,specialization);
}

    public void addTalent(Talent talent)
    {
        talents.add(talent);
    }

    public ArrayList<Talent> getTalents() {
        return talents;
    }

    public String getTalents(String talent)
    {
        return talent;
    }
    

   @Override 
   public void SignUpMenu()
{   System.out.println("User Name: ");
    super.setUserName(in.next());
    System.out.println("Email: ");
    super.setEmail(in.next());
    System.out.println("Password: ");
    super.setPassword(in.next());
    System.out.println("Specialization: ");
    super.setSpecialization(in.next());
}
    
@Override
    public void Login()
{
    System.out.println("User Name: ");
    super.setUserName(in.next());
    System.out.println("Password: ");
    super.setPassword(in.next());
}

}

   
package gebeya.enterprise.app;
import java.util.Scanner;
import java.util.ArrayList;

public class AuthenticationMenu extends Menu{
private String userName;
private String email;
private String password;
private String specialization;
int input;

Scanner in=new Scanner(System.in);
public AuthenticationMenu(){    }
    
public AuthenticationMenu(String userName,String email,String password,String specialization)
{
    this.userName=userName;
    this.email=email;
    this.password=password;
    this.specialization=specialization;
}

public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

public void show()
{
    System.out.println("1 - sign up");
    System.out.println("2 - login");
    input=in.nextInt();
    
    if(input==1)
    {
        SignUpMenu();
    }
    if(input==2)
    {
      Login();   
    }
}

public void SignUpMenu()
{   MainMenu choice=new MainMenu();
    if(choice.input==1)
    {
//        TalentController talents = new TalentController();
//        ArrayList<TalentMenu> menu=new ArrayList<TalentMenu>();
        //talents.SignUpMenu();  
       //ArrayList<AuthenticationMenu> = new ArrayList<AuthenticationMenu>;

    }
//    if(choice.input==2)
//    {
//        ClientMenu clients = new ClientMenu();
//        ArrayList<TalentMenu> menu=new ArrayList<TalentMenu>();
//        talents.SignUpMenu(); 
//    }

}

public void Login()
{
    System.out.println("User Name: ");
    userName=in.next();
    
    System.out.println("Password: ");
    password=in.next();
}
@Override
 public void processInput(int input) {
        switch (input){
            case 1:
               
                break;
            case 2:
                break;
            case 3:
                break;
            case 0:
                break;
            default:
        }
    }
}

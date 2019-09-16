
package gebeya.enterprise.app;
import java.util.Scanner;
public class TalentMenu extends Menu{
    
Scanner in=new Scanner(System.in);
    public void show()
    { int choice;
       System.out.println("1 - My Projects"+"\n"+"2 - All Projects"+"\n"+"0 - Exit");
       choice=in.nextInt();
       processInput(choice);    
    }
 @Override
    public void processInput(int input) {
        ProjectMenu project=new ProjectMenu();
        MainMenu menus=new MainMenu();
       
        switch (input){
            case 1:
               project.talentProjects();
                break;
            case 2:
                project.allProjects();
                break;
            case 0:
               // menus.start();
                menus.showMenu();
                break;
            default:
                System.out.println("you have choosen wrong choice");
        }
    }
       
}

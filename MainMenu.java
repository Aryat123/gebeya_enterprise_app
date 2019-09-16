
package gebeya.enterprise.app;

import java.util.ArrayList;
import java.util.Scanner;


public class MainMenu extends Menu{
    
   
    ArrayList<MenuItem> menuItem =new ArrayList<>();
    Scanner in=new Scanner(System.in);
    public int input;


    public MainMenu() {
    }

    public MainMenu(String title) {
        super(title);

    }

    @Override
    public void addMenuItem(int choice, String description)
    {
        MenuItem menuItem1=new MenuItem(choice,description);
        menuItem.add(menuItem1);
    }

    public void showMenu()

    {
        
        System.out.println(getTitle());
        for(MenuItem m:menuItem)
        {
            m.show();
        }
    }

    public void waitForInput()
    {   System.out.print(">: ");
        input=in.nextInt();
        if (input>=0 && input<3)
        {
        processInput(input);
        }
        else
        {
            System.out.println("you have choosen incorrect choice please enter again");
            waitForInput();
        }
    }
    
    

    public void processInput(int input)
    {  switch(input)
       {case 0:
           System.out.println("The application closed!");
       case 1:
       {
           AuthenticationMenu authenticate=new AuthenticationMenu();
           TalentMenu talents=new TalentMenu();
           authenticate.show();
           talents.show();
       }
        
       }

    }
    public void start()
    {
        showMenu();
        waitForInput();
    }
    
    
}

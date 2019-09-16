
package gebeya.enterprise.app;
import java.util.ArrayList;
//import java.util.Scanner;

public abstract class Menu {
    private String title;
    ArrayList<MenuItem> menuItem =new ArrayList<>();
    //Scanner in=new Scanner(System.in);
    private int input;


    public Menu() {
    }

    public Menu(String title) {
        this.title = title;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

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
    { 
    }

    public abstract void processInput(int input);
    
    public void start()
    {
        showMenu();
        waitForInput();
    }
    
}

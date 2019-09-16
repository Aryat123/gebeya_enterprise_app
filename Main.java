
package gebeya.enterprise.app;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        int in;
       Scanner input =new Scanner(System.in);
       ArrayList<Menu> menuItem = new ArrayList<Menu>(); 
       MainMenu menu=new MainMenu("Welcome to Gebeya Enterprise!");
        menu.addMenuItem(1,"continue as talent");
        menu.addMenuItem(2,"continue as client");
        menu.addMenuItem(0,"exit");
        menuItem.add(menu);
       
        for (Menu M : menuItem)
        {
            M.start();

        }
        
        
    }
    
}

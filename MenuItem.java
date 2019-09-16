
package gebeya.enterprise.app;

public class MenuItem {
    private int choice;
    private String description;

     public MenuItem() {
     }

    public MenuItem(int choice, String description)
    {
        this.choice=choice;
        this.description=description;
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void show()
    {
        System.out.println(+getChoice()+" - "+getDescription());
    }
    
}

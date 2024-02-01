
/**
 * Write a description of class File here.
 *
 * @author Gitchler and G0dOfGit
 * @version 2/1/2024
 */
import java.util.Scanner;

public class File
{
    // instance variables - replace the example below with your own
    private static String name;
    private static String date;
    private static String title;
    private static String body;
    private static boolean click;
    
    public File()
    {
        this.name = "";
        this.date = "";
        this.title = "";
        this.body = "";
        this.click = false;
    }
    
    public static boolean click()
    {
        click = true;
        return click;
    }
    
    public static void writeHeader()
    {
        if (click == true)
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Name is: ");
            name = in.nextLine();
            System.out.println("Date is: ");
            date = in.nextLine();
            System.out.println("------------ Header -------------");
            System.out.println(name);
            System.out.println(date);
        }
    }

}

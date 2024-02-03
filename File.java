
/**
 * Write a description of class File here.
 *
 * @author Gitchler and G0dOfGit
 * @version 2/1/2024
 */

public class File
{
    // instance variables - replace the example below with your own
    private static String name;
    private static String date;
    private static String title;
    private static String body;
    private static boolean click;
    private static String answer;
    
    public File()
    {
        name = "";
        date = "";
        title = "";
        body = "";
        click = false;
    }
    
    public static boolean clickPen()
    {
        click = true;
        return click;
    }
    
    public static String penStatus()
    {
        answer = "";
        if (click == true)
        {
            answer = "Pen clicked -- ready to write.";
            return answer;
        }
        else
        {
            answer = "Pen not clicked -- not ready to write.";
            return answer;
        }
    }
    
    public static void writeName(String nameA)
    {
        if (click == true)
        {
            name = nameA;
        }
        else
        {
            name = "";
        }
    }
    
    public static void writeDate(String dateA)
    {
        if (click == true)
        {
            date = dateA;
        }
        else
        {
            date = "";
        }
    }
    
    public static void writeTitle(String titleA)
    {
        if (click == true)
        {
            title = titleA;
        }
        else
        {
            title = "";
        }
    }
    
    public void writeBody(String bodyA)
    {
        if (click == true)
        {
            body = bodyA;
        }
        else
        {
            body = "";
        }
    }
    
    public static String getName()
    {
        return name;
    }
    
    public static String getDate()
    {
        return date;
    }
    
    public static String getTitle()
    {
        return title;
    }
    
    public static String getBody()
    {
        return body;
    }
    
    public static void viewFile()
    {
        System.out.println(name);
        System.out.println(date);
        System.out.println();
        System.out.println(title);
        System.out.println();
        System.out.println(body);
    }
}

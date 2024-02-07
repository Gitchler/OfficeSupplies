
/**
 * The File class allows the user to create a new file for a report, analysis,
 * record, statement, transaction, article, essay, story, etc., what have you.
 * The user may choose to insert portions of the header (company, name, date),
 * a title, and a body, all of which are included in different method.
 * The last method arranges all of these elements together to print out the
 * entire formatted file.
 *
 * @author Gitchler and G0dOfGit
 * @version 2/1/2024
 */

public class File
{
    // instance variables of File
    private static String company;
    private static String name;
    private static String date;
    private static String title;
    private static String body;
    private static boolean click;
    private static String answer;
    
    /**
     * Constructor for the File object
     */
    public File()
    {
        company = "";
        name = "";
        date = "";
        title = "";
        body = "";
        click = false;
    }
    
    /**
     * The clickPen method clicks a pen and returns a boolean true if clicked,
     * need to click the pen in order to write
     * @return click the boolean affirmation that the pen has been clicked
     */
    public static boolean clickPen()
    {
        click = true;
        return click;
    }
    
    /**
     * The penStatus method gives the status of the pen (if clicked or not)
     * @return answer the String status of the pen
     */
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
    
    /**
     * the writeCompany method allows the user to state their company to be 
     * included in the header
     * 
     * @param co the company the user inputs
     */
    public static void writeCompany(String co)
    {
        if (click == true)
        {
            company = co;
        }
        else
        {
            company = "";
        }
    }
    
    /**
     * the writeName method allows the user to write their name in the header
     * @param nameA the user's inputted name
     */
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
    
    /**
     * the writeDate method allows the user to write the date of the report
     * @param dateA the user's inputted date
     */
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
    
    /**
     * the writeTitle method allows the user to write the title of the report
     * @param titleA the title of the report
     */
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
    
    /**
     * the writeBody method allows the user to write the actual body/report/
     * analysis in the file
     * 
     * @param bodyA the analysis portion of the file
     */
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
    
    /**
     * the getCompany method returns the company in the header
     * @return company (depending on clickPen, either empty String or the company)
     */
    public static String getCompany()
    {
        return company;
    }
    
    /**
     * the getName method returns the name in the header
     * @return name (depending on clickPen, either empty String or the name)
     */
    public static String getName()
    {
        return name;
    }
    
    /**
     * the getDate method returns the date in the header
     * @return date (depending on clickPen, either empty String or the date)
     */
    public static String getDate()
    {
        return date;
    }
    
    /**
     * The getTitle method returns the title of the file
     * @return title (depending on clickPen, either empty String or the title)
     */
    public static String getTitle()
    {
        return title;
    }
    
    /**
     * The getBody method returns the report/analysis segment of the file
     * @return body (depending on clickPen, either empty String or the report)
     */
    public static String getBody()
    {
        return body;
    }
    
    /**
     * The viewFile method prints out the file in its entirety, with a
     * formatted header, title, and body
     */
    public static void viewFile()
    {
        System.out.println(company);
        System.out.println(name);
        System.out.println(date);
        System.out.println();
        System.out.println(title);
        System.out.println();
        System.out.println(body);
    }
}

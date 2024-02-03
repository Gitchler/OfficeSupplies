
/**
 * Write a description of class OfficeSupplies here.
 *
 * @author Gitchler and G0dOfGit
 * @version 2/1/2024
 */

public class OfficeSupplies
{
    public static void main (String[] args)
    {
        
        //FILE CLASS TESTER
        System.out.println("Testing the File class....");
        System.out.println("Initializing a new file...");
        File a = new File();
        System.out.println("Clicking pen to write...");
        a.clickPen();
        System.out.println("Checking pen status...");
        System.out.println(a.penStatus());
        System.out.println("Inputting a name for the header...");
        a.writeName("John");
        System.out.println("Checking the name...");
        System.out.println("Name: " + a.getName());
        System.out.println("Inputting a date for the header...");
        a.writeDate("2/7/2024");
        System.out.println("Checking the date...");
        System.out.println("Date: " + a.getDate());
        System.out.println("Inputting a title...");
        a.writeTitle("Shoot to Thrill");
        System.out.println("Checking the title...");
        System.out.println("Title: " + a.getTitle());
        System.out.println("Inputting a report");
        a.writeBody("Sample report analysis, could be extended .....");
        System.out.println("Checking the report...");
        System.out.println("Report: " + a.getBody());
        System.out.println();
        System.out.println("Checking the whole file at once...");
        System.out.println();
        a.viewFile();
    }
}

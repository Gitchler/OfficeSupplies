
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
        System.out.println();
        System.out.println("Inputting a company name for the header...");
        a.writeCompany("Sphinx Equity Partners");
        System.out.println("Checking the company name...");
        System.out.println("Company: " + a.getCompany());
        System.out.println();
        System.out.println("Inputting a name for the header...");
        a.writeName("Associate: Reggie Del Grosso");
        System.out.println("Checking the name...");
        System.out.println("Name: " + a.getName());
        System.out.println();
        System.out.println("Inputting a date for the header...");
        a.writeDate("2/7/2024");
        System.out.println("Checking the date...");
        System.out.println("Date: " + a.getDate());
        System.out.println();
        System.out.println("Inputting a title...");
        a.writeTitle("Private Equity Acquisition - Corona Clay Company");
        System.out.println("Checking the title...");
        System.out.println("Title: " + a.getTitle());
        System.out.println();
        a.writeBody("The Corona Clay Company (“Corona” or “the Company”) is a producer \nand distributor of fine clay, sand, silt, and crushed brick \nblends that are combined in a specific ratio and sold as infield mix \nfor baseball fields, track mixes for race cars, and clay mix for tennis \ncourts. “Infield mix” is a specialty blend of clay, sand, and silt that \nis used in all baseball/softball infields, foul areas, and warning \ntracks, and has essential fast drying and weed-preventative properties. \nCorona was founded by Joe Deleo in 1958 and is headquartered on a \n42-acre clay repository in Corona, California. Corona is a private, \nfamily-owned business that has mined clay and sold mineral products and \nspecialty mixes to customers in Southern California for over 60 years. \n\n2022A Financials – EBITDA: $35.5M");
        System.out.println();
        System.out.println("Checking the report...");
        System.out.println("Report: " + a.getBody());
        System.out.println();
        System.out.println("Checking the whole file at once...");
        System.out.println();
        a.viewFile();
    }
}

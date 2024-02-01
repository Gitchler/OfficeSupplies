
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
        File a = new File();
        a.clickPen();
        a.writeName("John");
        a.writeDate("2/1/2024");
        a.writeTitle("Shoot to Thrill");
        a.writeBody("This report will analyze the stock performance of Exelon (Ticker: EXC) from June 2022 - January 2024.");
        a.viewFile();
    }
}

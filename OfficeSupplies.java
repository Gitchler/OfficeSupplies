
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
        System.out.println("------------- Testing the File class -------------");
        System.out.println();
        System.out.println();
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
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
        //CLOCK CLASS TESTER
        
        System.out.println("------------- Testing the Clock class -------------");
        System.out.println();
        System.out.println();
        System.out.println("Initializing a default clock (constructor)...");
        Clock b = new Clock();
        System.out.println("Getting time for the default clock...");
        System.out.println(b.getTime());
        System.out.println("Setting time as 4 hr, 23 min on the default clock...");
        b.setTime("4", "23");
        System.out.println("Getting the new time on the default clock...");
        System.out.println(b.getTime());
        System.out.println();
        System.out.println("Making a new clock (overloaded constructor and input 6 hr, 45 min)...");
        Clock c = new Clock("6", "45");
        System.out.println("Getting the time on the clock...");
        System.out.println("Setting time on the default clock (input 2 hr, 21 min)...");
        b.setTime("2", "21");
        System.out.println("Getting the new time...");
        System.out.println(b.getTime());
        System.out.println();
        System.out.println("Making a new clock (overloaded constructor w/ input 6 hr, 45 min)...");
        Clock d = new Clock("6", "45");
        System.out.println("Getting the time...");
        System.out.println(d.getTime());
        
        
        //PORTFOLIO TESTER
        System.out.println("-----------------");
        System.out.println("Now testing the Portfolio class");
        Portfolio TheTradingTavern = new Portfolio();
        System.out.println("Initalizing a portfolio...");
        System.out.println("Portfolio initialized: TheTradingTavern");
        System.out.println("Liquidity available: " + TheTradingTavern.getLiquidity());
        
        StockMarket BigStock = new StockMarket();
        
        System.out.println("----------------");
        
        System.out.println("Initializing the market");
        
        System.out.println("----------------");
        
        Stock AAPL = new Stock("AAPL", "Information Technology", 185.85, 0.52, 6.43);
        BigStock.marketMaking(AAPL);
        Stock META = new Stock("META", "Information Technology", 474.99, 0.42, 14.86);
        BigStock.marketMaking(META);
        Stock GOOG = new Stock("GOOG", "Information Technology", 143.54, 0, 5.80);
        BigStock.marketMaking(GOOG);
        Stock NVDA = new Stock("NVDA", "Information Technology", 639.74, 0.02, 7.61);
        BigStock.marketMaking(NVDA);
        Stock AMZN = new Stock("AMZN", "Information Technology", 185.04, 0, 4.30);
        BigStock.marketMaking(AMZN);
        
        Stock NKE = new Stock("NKE", "Consumer Discretionary", 100.88, 1.47, 3.43);
        BigStock.marketMaking(NKE);
        Stock SBUX = new Stock("SBUX", "Consumer Discretionary", 92.69, 2.45, 3.75);
        BigStock.marketMaking(SBUX);
        Stock MCD = new Stock("MCD", "Consumer Discretionary", 296.07, 2.25, 11.35);
        BigStock.marketMaking(MCD);
        
        Stock LMT = new Stock("LMT", "Industrials", 428.14, 2.96, 27.56);
        BigStock.marketMaking(LMT);
        Stock BA = new Stock("BA", "Industrials", 209.06, 0, -3.66);
        BigStock.marketMaking(BA);
        Stock RTX = new Stock("RTX", "Industrials", 92.94, 2.57, 41.32);
        BigStock.marketMaking(RTX);

        Stock GS = new Stock("GS", "Financials", 381.80, 2.84, 16.96);
        BigStock.marketMaking(GS);
        Stock JPM = new Stock("JPM", "Financials", 173.30, 2.40, 10.77);
        BigStock.marketMaking(JPM);
        
        System.out.println("Displaying the market");
        
        System.out.println("----------------");
        
        BigStock.viewMarket();
        
        System.out.println("Screening the market for a maximum P/E ratio of 20.00 (the price to earnings ratio is the most common indicator of a stock being over/under value)");
        TheTradingTavern.valueScreener(20.00, BigStock);
        System.out.println("----------------");
        
        System.out.println("Screening the market for a minimum dividend yield of 1.00");
        TheTradingTavern.divScreener(1.00, BigStock);
        System.out.println("----------------");
        
        System.out.println("Screening the market for the Information Technology sector");
        TheTradingTavern.sectorScreener("Information Technology", BigStock);
        System.out.println("----------------");
        
        System.out.println("Buying 3 shares of AAPL and 2 shares of LMT");
        TheTradingTavern.buy("AAPL", 3, BigStock);
        TheTradingTavern.buy("LMT", 2, BigStock);
        System.out.println("----------------");
        
        System.out.println("Printing out remaining liquidity");
        System.out.println(TheTradingTavern.getLiquidity());
        System.out.println("----------------");
        
        System.out.println("Viewing portfolio");
        TheTradingTavern.viewPortfolio();
        

    }
}

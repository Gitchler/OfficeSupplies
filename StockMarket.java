
/**
 * Write a description of class Market here.
 *
 * @author TheG0dOfGit and Gitchler
 * @version 2/3/2023
 */
import java.util.ArrayList;

public class StockMarket
{
    // instance variables - replace the example below with your own
    private ArrayList<Stock> Market;
    
    /**
     * public Market() is a constructor to create a new Market of stocks. 
     */
    public StockMarket()
    {
        Market = new ArrayList<Stock>();
    } 
    /**
     * marketMaking initalizes the universe of stocks
     */
    public void marketMaking(Stock newStock)
    {
        Market.add(newStock);
    }
    public ArrayList getStocks()
    {
        return Market;
    }
    public void viewMarket()
    {
        for (Stock stock : Market)
        {
            System.out.println(stock.getTicker() + " | " + stock.getSector() + " | Share Price: " + "(" + stock.getPrice() + ")" + " | EPS: " + " (" + stock.getEarnings() + ")"+ " | DividendYield: " + " (" + stock.getDivYield() + ")");
        }
    }
}

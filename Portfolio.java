/**
 * File for the Bloomberg Terminal class to be used in the Office Supplies project.
 * @author TheG0dOfGit and Gitchler
 * @version 2/3/2024
 */
import java.util.ArrayList;

public class Portfolio
{
    /**
     * declaring instance variables.
     */
    private ArrayList<Stock> Portfolio;
    private StockMarket market = new StockMarket();
    private ArrayList<Stock>Market;
    private double liquidity = 100000;
    
    
    /**
     * public Portfolio() is a constructor to create a new portfolio of stocks. 
     */
    public Portfolio()
    {
        Portfolio = new ArrayList<Stock>();
    }
        
    public String fullWatchlist(StockMarket Market)
    {
        ArrayList<Stock> thisMarket = new ArrayList<Stock>();
        thisMarket = Market.getStocks();
        for (Stock stock : thisMarket)
        {
            System.out.println(stock.getTicker());
        }
        return null;
    }
    
    public String sectorScreener(String thisSector, StockMarket Market)
    {
        ArrayList<Stock> thisMarket = new ArrayList<Stock>();
        thisMarket = Market.getStocks();
        for (Stock stock : thisMarket)
        {
            if (stock.getSector().equals(thisSector))
            {
                System.out.println(stock.getTicker());
            }
        }
        return null;
    }
    
    public String valueScreener(double maxPE, StockMarket Market)
    {
        ArrayList<Stock> thisMarket = new ArrayList<Stock>();
        thisMarket = Market.getStocks();
        for (Stock stock : thisMarket)
        {
            if (stock.getPE() <= maxPE)
            {
                 System.out.println(stock.getTicker());
            }
        }
        return null;
    }
    public String divScreener(double minDivYield, StockMarket Market)
    {
        ArrayList<Stock> thisMarket = new ArrayList<Stock>();
        thisMarket = Market.getStocks();
        for (Stock stock : thisMarket)
        {
            if (stock.getDivYield() >= minDivYield)
            {
                System.out.println(stock.getTicker());
            }
        }
        return null;
    }
    public double getLiquidity()
    {
        return liquidity;
    }
    public void buy(String tickerToBuy, double quantity, StockMarket Market)
    {
        Stock toBeBought = null;
        ArrayList<Stock> thisMarket = new ArrayList<Stock>();
        thisMarket = Market.getStocks();
        for (Stock stock : thisMarket)
        {
            if (stock.getTicker().equals(tickerToBuy))
            {
                toBeBought = stock;
            }
        }
        toBeBought.setQuantity(quantity);
        Portfolio.add(toBeBought);
        liquidity = liquidity - (toBeBought.getPrice() * quantity);
        System.out.println("New position " + toBeBought.getTicker() + " | Position size: " + " (" + (toBeBought.getPrice() * quantity) + ")");
        System.out.println("new liquidity = " + liquidity);
    }
    public void viewPortfolio()
    {
        for (Stock stock : Portfolio)
        {
            System.out.println(stock.getTicker() + " " + "(" + stock.getPrice() + ")" + " " + " (" + stock.getQuantity() + ")");
        }
    }
}
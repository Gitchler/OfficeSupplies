/**
 * The Portfolio class allows the user to interact with the stocks in the StockMarket class ina  variety of manners. 
 * @author TheG0dOfGit and Gitchler
 * @version 2/3/2024
 */
import java.util.ArrayList;

public class Portfolio
{
    /**
     * declaring instance variables.
     */
    private ArrayList<Stock> portfolio;
    private StockMarket market = new StockMarket();
    private double liquidity = 100000;
    
    
    /**
     * public Portfolio() is a constructor to create a new portfolio of stocks. 
     */
    public Portfolio()
    {
        portfolio = new ArrayList<Stock>();
    }
    
    /**
     * fullWatchlist prints out the full list of stocks in the StockMarket 
     * @param the StockMarket (or stock exchange such as NYSE or NASDAQ) to be accessed. 
     */
    public void fullWatchlist(StockMarket market)
    {
        ArrayList<Stock> thisMarket = new ArrayList<Stock>();
        thisMarket = market.getStocks();
        for (Stock stock : thisMarket)
        {
            System.out.println(stock.getTicker());
        }
    }
    
    /**
     * sectorScreener prints out a screened list of stocks that belong to a specified sector. This function would be useful for an investor who is bullish on a particular sector. 
     * @param thisSector the sector to screen for
     * @param market the StockMarket to access
     */
    public String sectorScreener(String thisSector, StockMarket market)
    {
        ArrayList<Stock> thisMarket = new ArrayList<Stock>();
        thisMarket = market.getStocks();
        for (Stock stock : thisMarket)
        {
            if (stock.getSector().equals(thisSector))
            {
                System.out.println(stock.getTicker());
            }
        }
        return null;
    }
    
    /**
     * valueScreener prints out a screened list of stocks that have a price/earnings ratio below a specified maximum. The price/earnings ratio is the most fundamental measure of how over/under valued a stock is. This function would be useful for a value investor. 
     * @param maxPE the maximum price/earnings ratio to screen for
     * @param market the StockMarket to access
     */
    public void valueScreener(double maxPE, StockMarket market)
    {
        ArrayList<Stock> thisMarket = new ArrayList<Stock>();
        thisMarket = market.getStocks();
        for (Stock stock : thisMarket)
        {
            if (stock.getPE() <= maxPE)
            {
                 System.out.println(stock.getTicker());
            }
        }
    }
    
    /**
     * divScreener prints out a screened list of stocks that have a dividend yield above a specified minimum. This function would be useful for a value investor or cash-flow centric investor. 
     * @param thisSector the sector to screen for
     * @param market the StockMarket to access
     */
    public void divScreener(double minDivYield, StockMarket market)
    {
        ArrayList<Stock> thisMarket = new ArrayList<Stock>();
        thisMarket = market.getStocks();
        for (Stock stock : thisMarket)
        {
            if (stock.getDivYield() >= minDivYield)
            {
                System.out.println(stock.getTicker());
            }
        }
    }
    
    /**
     * getLiquidity returns the liquidity (remaining cash balance) of the portfolio. 
     * @return liquidity
     */
    public double getLiquidity()
    {
        return liquidity;
    }
    
    /**
     * buy purchases, or adds, a specified stock listed in the specified StockMarket at a specified quantity to the portfolio.
     * @param tickerToBuy the ticker of the stock to be "bought"
     * @param quantity the number of stocks to be "bought"
     * @param market the StockMarket in which the ticker of the stock is searched for
     */
    public void buy(String tickerToBuy, double quantity, StockMarket market)
    {
        Stock toBeBought = null;
        ArrayList<Stock> thisMarket = new ArrayList<Stock>();
        thisMarket = market.getStocks();
        for (Stock stock : thisMarket)
        {
            if (stock.getTicker().equals(tickerToBuy))
            {
                toBeBought = stock;
            }
        }
        toBeBought.setQuantity(quantity);
        portfolio.add(toBeBought);
        liquidity = liquidity - (toBeBought.getPrice() * quantity);
        System.out.println("New position " + toBeBought.getTicker() + " | Position size: " + " (" + (toBeBought.getPrice() * quantity) + ")");
        System.out.println("new liquidity = " + liquidity);
    }
    
    /**
     * viewPortfolio prints out each stock and its quantity within the portfolio. 
     */
    public void viewPortfolio()
    {
        for (Stock stock : portfolio)
        {
            System.out.println(stock.getTicker() + " " + "(" + stock.getPrice() + ")" + " " + " (" + stock.getQuantity() + ")");
        }
    }
}
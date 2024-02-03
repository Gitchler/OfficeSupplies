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
    
    public void accessMarket()
    {
        ArrayList<Stock> Market = market.getStocks();
    }
    
    public Stock fullWatchlist()
    {
        for (Stock stock : Market)
        {
            return stock;
        }
        return null;
    }
    
    public Stock sectorScreener(String thisSector)
    {
        for (Stock stock : Market)
        {
            if (stock.getSector() == thisSector)
            {
                return stock;
            }
        }
        return null;
    }
    
    public Stock valueScreener(double maxPE)
    {
        for (Stock stock : Market)
        {
            if (stock.getPE() <= maxPE)
            {
                return stock;
            }
        }
        return null;
    }
    public Stock divScreener(double minDivYield)
    {
        for (Stock stock : Market)
        {
            if (stock.getDivYield() >= minDivYield)
            {
                return stock;
            }
        }
        return null;
    }
    public double getLiquidity()
    {
        return liquidity;
    }
    public void buy(String tickerToBuy, double quantity)
    {
        Stock toBeBought = null;
        for (Stock stock : Market)
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
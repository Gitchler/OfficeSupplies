/**
 * File for a Stock class to be used in the Office Supplies Project
 * @author TheG0dOfGit and Gitchler
 * @version 2/3/2023
 */
public class Stock
{
    private String ticker;
    private String sector;
    private double price;
    private double divYield;
    private double earningsPerShare;
    private double quantity;
    /**
     * Constructor
     */
    public Stock (String ticker, String sector, double price, double divYield, double earningsPerShare)
        {
            this.ticker = ticker;
            this.sector = sector;
            this.price = price;
            this.divYield = divYield;
            this.earningsPerShare = earningsPerShare;
        }
    /**
     * Methods
     */
        public double getPrice()
        {
            return price;
        }
    public double getDivYield()
        {
            return divYield;
        }
    public double getEarnings()
        {
            return earningsPerShare;
        }
    public String getSector()
        {
            return sector;
        }
    public String getTicker()
        {
            return ticker;
        }
    public double getPE()
        {
            double ratioPE = price / earningsPerShare;
            return ratioPE;
        }
    public double getQuantity()
        {
            return quantity;
        }
    public void setQuantity(double positionQuantity)
        {
            quantity = positionQuantity;
        }
    public double getPositionSize()
        {
            return price * quantity;
        }
}




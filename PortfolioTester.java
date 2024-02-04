
/**
 * Write a description of class BloombergTerminalTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Scanner;

public class PortfolioTester
{
    public static void main(String[] args)
    {
        System.out.println("-----------------");
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
        
        
        System.out.println("Terminal commands:");
        System.out.println("To buy any stock, enter b");
        System.out.println("To screen by Price To Earnings ratio, enter PE Screen");
        System.out.println("To screen by Dividend Yield, enter Yield Screen");
        System.out.println("To screen by sector, enter Sector Screen");
        System.out.println("To view liquidity, enter Liquidity");
        System.out.println("To view portfolio, enter Portfolio");
        System.out.println("To quit, enter q");
        
        System.out.println("----------------");
        
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        
        while (!input.equals("q"))
        {
            if (input.equals("b"))
            {
                System.out.println("Enter stock ticker and quantity (Ex: AAPL)");
                Scanner TickerIn = new Scanner(System.in);
                String inTicker = TickerIn.next();
                System.out.println("Enter quantity of equities to purchase (Ex: 3)");
                Scanner QuantityIn = new Scanner(System.in);
                Double inQuantity = QuantityIn.nextDouble();
                TheTradingTavern.buy(inTicker, inQuantity, BigStock);
            }
            else if (input.equals("PE Screen"))
            {
                System.out.println("Enter maximum P/E ratio");
                Scanner inPE = new Scanner(System.in);
                Double PEMax = in.nextDouble();
                TheTradingTavern.valueScreener(PEMax, BigStock);
            }
            else if (input.equals("Yield Screen"))
            {
                System.out.println("Enter minumum dividend yield");
                Scanner inDiv = new Scanner(System.in);
                Double DivMin = in.nextDouble();
                TheTradingTavern.divScreener(DivMin, BigStock);
            }
            else if (input.equals("Sector Screen"))
            {
                System.out.println("Enter desired sector - available sectors: Information Technology, Consumer Discretionary, Financials, Industrials");
                Scanner inSector = new Scanner(System.in);
                String desiredSector = in.nextLine();
                System.out.println(TheTradingTavern.sectorScreener(desiredSector, BigStock));
            }
            else if (input.equals("Liquidity"))
            {
                System.out.println(TheTradingTavern.getLiquidity());
            }
            else if (input.equals("Portfolio"))
            {
                TheTradingTavern.viewPortfolio();
            }
            input = in.nextLine();
        }
    }
}

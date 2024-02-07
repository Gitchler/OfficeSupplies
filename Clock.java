
/**
 * The Clock class allows the user to set and tell time.
 *
 *"Time is money" - Benjamin Franklin.
 *
 * @author Gitchler and the G0dOfGit
 * @version 2/5/2024
 */
public class Clock
{
    private static String hours;
    private static String minutes;

    /**
     * Constructor for objects of class Clock
     */
    public Clock()
    {
        hours = "12";
        minutes = "00";
    }
    
    /**
     * Overloaded clock constructor
     */
    public Clock(String hoursA, String minutesA)
    {
        hours = hoursA;
        minutes = minutesA;
    }
    
    /**
     * The setTime method allows the user to set a time on the clock
     *
     */
    public static void setTime(String hoursB, String minutesB)
    {
        hours = hoursB;
        minutes = minutesB;
    }
    
    /**
     * The getTime method returns the time displayed on the clock
     * @return time the time set on the clock
     */
    public static String getTime()
    {
        String time = (hours + ":" + minutes);
        return time;
    }
}

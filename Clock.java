
/**
 * Write a description of class Clock here.
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
    
    public Clock(String hoursA, String minutesA)
    {
        hours = hoursA;
        minutes = minutesA;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void setTime(String hoursB, String minutesB)
    {
        hours = hoursB;
        minutes = minutesB;
    }
    
    public static String getTime()
    {
        String time = (hours + ":" + minutes);
        return time;
    }
}

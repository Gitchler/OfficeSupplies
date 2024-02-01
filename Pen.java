public class Pen
{
    private static int ink;
    private static boolean click;
    
    public Pen(int ink, boolean click)
    {
        this.ink = ink;
        this.click = false;
    }
    
    public static int getInk()
    {
        return ink;
    }
    
    public static String write()
    {
        
    }
}

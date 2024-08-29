
/**
 * Write a description of class point here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PointLine
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    
    public PointLine()
    {
        x = 50;
        y = 50;
    }
    
    public void increase()
    {
        x += 50;
        y += 50;
    }
    
    public int getX(){return x;}
    public int getY(){return y;}
}

import javax.swing.JComponent;
import java.awt.Graphics;
/**
 * Write a description of class drawLine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Line extends JComponent
{
    // instance variables - replace the example below with your own
    PointLine point = new PointLine();
    
    
    public void paintComponent(Graphics g)
    {
        for(int i = 0; i < 5;i++){
        point.increase();
        g.drawLine(point.getX(),point.getY(),point.getX()+100,point.getY());
        }
        /*if(count == 0)
        {
            g.drawLine(100,100,200,200);
        }
        else if(count == 1)
        {   
            g.drawLine(100,100,100,200);
                      
        }
        else
        {
            g.drawLine(100,100,100,200+50);
                
        }*/
    }
}

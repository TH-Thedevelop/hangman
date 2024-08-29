import javax.swing.*;
import java.awt.*;

/**
 * Write a description of class m1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class m1
{
    // instance variables - replace the example below with your own
    
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        JButton button = new JButton("Click me");
        JPanel panel = new JPanel();
        
        frame.setSize(400,200);
        frame.setTitle("A test Line");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Line line = new Line();
        panel.add(line);
        panel.add(button);
        frame.add(panel);
        frame.setVisible(true);
        
    }
}

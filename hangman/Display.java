
/**
 * Write a description of class Display here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Display implements ActionListener
{
    // instance variables - replace the example below with your own
    
    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JTextField textField;
    private JButton button;
    //private Line line;
    public int count = 0;
    public Display()
    {
        generateFrame();
    }
    
    public void generateFrame()
    {
        frame = new JFrame();
        frame.setTitle("JPanel Action");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800,500);
        frame.setLayout(new BorderLayout(10,10));
        frame.setLocationRelativeTo(null);
        
        //Create object (create components in a frame)
        panel = new JPanel();
        label = new JLabel("Enter your name");
        textField = new JTextField(20);
        button = new JButton("Save");
        //line = new Line();
        button.addActionListener(this);
        
        panel.add(label);
        panel.add(textField);
        panel.add(button);
        //frame.add(line); 
        frame.add(panel, BorderLayout.CENTER);
    
    }
    
    public void perform()
    {
        this.frame.setVisible(true);
    }
    
    
    
    public void actionPerformed(ActionEvent e)
    {
        {
            
            
            label.setText("Hi " + textField.getText() + "!");
            if(count == 0)
            {
                System.out.println("____");
            }
            else if(count == 1)
            {   
                System.out.println("++++");
                      
            }
            else
            {
                System.out.println("Count: " + count );
                
            }
            count++;
        } 
        
    }
}

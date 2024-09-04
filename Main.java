
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Main
{
    // instance variables - replace the example below with your own
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        hangman man;
        man = new hangman();
        man.displayGuess();
        while(!man.getStop())
        {
            System.out.print("Please enter a character: ");
            man.checkAns(in.next());
            man.displayGuess();
            man.displayHangMan();
        }
        
        
        man.display();
    }   
}

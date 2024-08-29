
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
        System.out.println(man.get());
        System.out.println(man.getHash());
        for(int i = 0; i < man.getLife() && !man.getStop();i++)
        {
            System.out.print("Please enter your answer: ");
            man.checkAns(in.next());
            man.displayGuess();
        }
        
        
        man.display();
    }   
}

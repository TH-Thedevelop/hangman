
/**
 * Write a description of class hangman here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class hangman
{
    // instance variables - replace the example below with your own
    private base b;
    final private int LIFE = 10;
    private int countLife = LIFE;
    private int score  = 0;
    private boolean checkA;
    private boolean check;
    private ArrayList<String> box;
    private HashMap<String, Integer> res;
    private boolean  stop;
    private String str;
    
    /* Life must not be final(instanct)
     * 
     * 
    */
    public hangman()
    {
        b = new base();
        str = "";
        generate();
        stop = false;
    }
    public boolean getStop()
    {
        return stop;
    }
    public String get()
    {
        return b.getRes();
    }
    
    public HashMap<String, Integer> getHash()
    {
        return res;
    }
    
    private void generate()
    {
        res = new HashMap<>();
        String word = b.getRes();
        int len = word.length();
        for(int i = 0; i < len; i++)
        {
            if(res.containsKey(word.substring(i,i+1)))
            {
                int count = res.get(word.substring(i,i+1));
                res.put(word.substring(i,i+1),++count);
            }
            else
            {
                 res.put(word.substring(i,i+1),1);
            }
            
        }
        for(int i =0; i < len; i ++)
        {
            str += "_";
        }
    }
    
    public void checkAns(String in)
    {
        String word = b.getRes();
        ///////////////////////////////////////////
        if(res.containsKey(in) && res.get(in) > 0)
        {
            int count = res.get(in);
            score ++;
            res.put(in, --count);
            if(word.contains(in))
            {
                int idx = word.indexOf(in);
                str = str.substring(0,idx) + word.substring(idx,idx+1) + str.substring(idx+1,str.length());
                word = word.substring(0,idx) + "*" + word.substring(idx+1,word.length());
            }
        }
        else
        {
            countLife --;
        }
        //Check win and lose
        if(countLife == 0 && score < word.length())
        {
            check = false;
        }
        else if(score == word.length())
        {
            check = true;
            stop = true;
        }
    }
    
    
    
    public int getLife()
    {
        return LIFE;
    }
    /*
    public boolean getAns()
    {
        return checkA;
    }*/
    
    public void displayGuess()
    {
        System.out.println("======== "+str+" ========");
    }
    
    public void display()
    {
        System.out.println("Score: " + score);
        System.out.println("Remaining life: " + countLife);
        if(check == true)
        {   
            //
            System.out.println("==================================");
            System.out.println("Congratulation!!! You won");
            System.out.println("Your final score is " + score);
        }
        else
        {
            System.out.println("==================================");
            System.out.println("You lose, good luck next time!!!");
            System.out.println("Your final score is" + score);
        }
    }
}

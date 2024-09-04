
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
    private int score  = 0;
    private int countWrong = 0;
    private boolean checkA;
    private boolean check;
    private ArrayList<String> box;
    private HashMap<String, Integer> res;
    private boolean  stop;
    private String str;
    //////////////////////
    private ArrayList<String> boxEnter;
    
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
        boxEnter = new ArrayList<>();
    }
    public boolean getStop()
    {
        return stop;
    }
    public String get()
    {
        return b.getRes();
    }
    public int getWrong()
    {
        return countWrong;
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
        
        boxEnter.add(in);
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
            countWrong ++;                                                        
        }
        //Check win and lose
        //Win
        if(score == word.length() && countWrong < 10)
        {
            check = true;
            stop = true;
        }
        // lose
        else
        {
            check = false;
            if(countWrong == 10){
            stop = true;}
        }
    }
    
    public void displayHangMan()
    {
        
        if(countWrong == 1)
        {
            System.out.println("+++++++++++++++++++++++++++");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("-----");
            System.out.println("+++++++++++++++++++++++++++");
        }
        else if(countWrong == 2)
        {   System.out.println("+++++++++++++++++++++++++++");
            System.out.println("");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("-----");
            System.out.println("+++++++++++++++++++++++++++");
        }
        else if(countWrong == 3)
        {
            System.out.println("+++++++++++++++++++++++++++");
            System.out.println("  _______");
            System.out.println("  |     ");
            System.out.println("  |     ");
            System.out.println("  |    ");
            System.out.println("  |    ");
            System.out.println("-----");
            System.out.println("+++++++++++++++++++++++++++");
        }
        else if(countWrong == 4)
        {
            System.out.println("+++++++++++++++++++++++++++");
            System.out.println("  _______");
            System.out.println("  |     |");
            System.out.println("  |     ");
            System.out.println("  |    ");
            System.out.println("  |    ");
            System.out.println("-----");
            System.out.println("+++++++++++++++++++++++++++");
        }
        else if(countWrong == 5)
        {
            System.out.println("+++++++++++++++++++++++++++");
            System.out.println("  _______");
            System.out.println("  |     |");
            System.out.println("  |     o");
            System.out.println("  | ");
            System.out.println("  |");
            System.out.println("-----");
            System.out.println("+++++++++++++++++++++++++++");
        }
        else if(countWrong == 6)
        {
            System.out.println("+++++++++++++++++++++++++++");
            System.out.println("  _______");
            System.out.println("  |     |");
            System.out.println("  |     o");
            System.out.println("  |     |");
            System.out.println("  |");
            System.out.println("-----");
            System.out.println("+++++++++++++++++++++++++++");
        }
        else if(countWrong == 7)
        {
            System.out.println("+++++++++++++++++++++++++++");
            System.out.println("  _______");
            System.out.println("  |     |");
            System.out.println("  |     o");
            System.out.println("  |    \\|");
            System.out.println("  |");
            System.out.println("-----");
            System.out.println("+++++++++++++++++++++++++++");
        }
        else if(countWrong == 8)
        {
            System.out.println("+++++++++++++++++++++++++++");
            System.out.println("  _______");
            System.out.println("  |     |");
            System.out.println("  |     o");
            System.out.println("  |    \\|/");
            System.out.println("  |");
            System.out.println("-----");
            System.out.println("+++++++++++++++++++++++++++");
        }
        else if(countWrong == 9)
        {
            System.out.println("+++++++++++++++++++++++++++");
            System.out.println("  _______");
            System.out.println("  |     |");
            System.out.println("  |     o");
            System.out.println("  |    \\|/");
            System.out.println("  |     |\\");
            System.out.println("-----");
            System.out.println("+++++++++++++++++++++++++++");
        }
        else if(countWrong == 10)
        {
            System.out.println("+++++++++++++++++++++++++++");
            System.out.println("  _______");
            System.out.println("  |     |");
            System.out.println("  |     o");
            System.out.println("  |    \\|/");
            System.out.println("  |    /|\\");
            System.out.println("-----");
            System.out.println("+++++++++++++++++++++++++++");
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
        if(boxEnter == null){System.out.println("The character enter: []");}
        else{
        System.out.println("The character enter: "+ boxEnter);}
    }
    
    public void display()
    {
        //System.out.println("Remaining life: " + countLife);
        if(check == true)
        {   
            //
            System.out.println("==================================");
            System.out.println("Congratulation!!! You won");
        }
        else
        {
            System.out.println("==================================");
            System.out.println("You lose, good luck next time!!!");
            System.out.println("Final answer is " + b.getRes());
        }
    }
}

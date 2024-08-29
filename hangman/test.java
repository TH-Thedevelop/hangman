
/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class test
{
    // instance variables - replace the example below with your own
    public static void main(String[] args)
    {
        /*ArrayList<String> t = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        //Using map for count the values of keys {"h":1,"k":1}
        boolean check;
        t.add("h");
        t.add("e");
        t.add("l");
        t.add("o");
        if(t.contains(in.next()))
        {
            check = true;
        }
        else{check = false;}
        
        System.out.println("Checking result: "+ check);*/
        
        Scanner in = new Scanner(System.in);
        String s = "hello";
        String res = "_____";
        for(int i = 0; i < 5;i++)
        {
            String c = in.next();
            if(s.contains(c))
            {
                
                int idx = s.indexOf(c);
                res = res.substring(0,idx) + s.substring(idx,idx+1) + res.substring(idx+1,res.length());
                s = s.substring(0,idx) + "*" + s.substring(idx+1,s.length());
            }
            
        }
        
        System.out.println("The final result: "+ res);
        System.out.println("The original word: " + s);
        
    }
}

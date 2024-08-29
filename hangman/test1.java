
/**
 * Write a description of class test1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class test1
{
    // instance variables - replace the example below with your own
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> dict = new HashMap<>();
        ArrayList<String> box = new ArrayList<String>();
        final int LIFE = 5;
        int life = LIFE;
        for(int i = 0; i < 5; i ++)
        {
            box.add(in.next());
        }
        
        for(int i = 0; i < 5; i ++)
        {
            
            if(dict.containsKey(box.get(i)))
            {
                int count = dict.get(box.get(i));
                dict.put(box.get(i),++count);
            }
            else
            {
                dict.put(box.get(i),1);
            }
        }
        System.out.println(dict);
        System.out.println("//////After/////");
        
        for (int i = 0; i < 5; i ++)
        {
            String c = in.next();
            if(dict.containsKey(c))
            {
                int count = dict.get(c);
                dict.put(c,--count);
            }
            else
            {
                life --;
            }
        }
        System.out.println(dict);
        System.out.println("Life: "+ life);

    }
}

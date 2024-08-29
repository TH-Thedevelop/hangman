
/**
 * Write a description of class base here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class base
{
    // instance variables - replace the example below with your own
    private String result;
    public base()
    {
        result = generate();
    }
    private String generate()
    {
        String[] data = {"word","love","cat","dog","house","car","brother"};
        return data[(int)(Math.random()*data.length)];
    }
    public String getRes()
    {
        return result;
    }
}

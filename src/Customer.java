import java.util.Comparator;

/**
 * Created by Alvarp on 10/10/2015.
 */
public class Customer implements Comparable
{
    public int getIn()
    {
        return in;
    }

    public void setIn(int in)
    {
        this.in = in;
    }

    public int getOut()
    {
        return out;
    }

    public void setOut(int out)
    {
        this.out = out;
    }

    public int in;
    public int out;
    private Utiler ute = new Utiler();


    //returns arrival and exit time of 
    Customer(int arrival, int average, int variant)
    {
        in = arrival;
        out = ute.uniform(average, variant);
    }

    @Override
    public int compareTo(Object o)
    {
        Customer comparer = (Customer)o;
        if(comparer.in < this.in)
        {
            return 1;
        }
        else if(comparer.in == this.in)
        {
            return 0;
        }
        else
        {
            return -1;
        }
    }

}

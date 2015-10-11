import java.util.Comparator;

/**
 * Created by Alvarp on 10/10/2015.
 */
public class Customer implements Comparable
{
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
        return 0;
    }
}

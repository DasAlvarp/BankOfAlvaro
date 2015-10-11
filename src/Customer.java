/**
 * Created by Alvarp on 10/10/2015.
 */
public class Customer
{
    public int in;
    public int out;
    private Utiler ute = new Utiler();


    Customer(int arrival, int average, int variant)
    {
        in = arrival;
        out = ute.uniform(average, variant);
    }
}

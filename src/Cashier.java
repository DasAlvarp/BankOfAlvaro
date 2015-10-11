import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Alvarp on 10/10/2015.
 */
public class Cashier
{
    private Queue customers;
    private int length; //instead of getting queue lengths, I'm doing a lazy way and just using a variable. bad form, I know.

    public Cashier()
    {
        customers = new LinkedList<Customer>();
        length = 0;
    }

    public void addCustomer(Customer custom)
    {
        customers.add(custom);
        length += 1;
    }

    public int getLength()
    {
        return length;
    }
}

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Alvarp on 10/10/2015.
 */
public class Cashier
{
    private Queue customers = new LinkedList();

    public Cashier()
    {

    }

    public void addCustomer(Customer custom)
    {
        customers.add(custom);
    }

    public int length()
    {
        return customers.size();
    }
}

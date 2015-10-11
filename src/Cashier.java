import java.awt.*;
import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by Alvarp on 10/10/2015.
 */
public class Cashier
{
    private Queue customers;
    private int length; //instead of getting queue lengths, I'm doing a lazy way and just using a variable. bad form, I know. (lazy code is lazy)

    public Cashier()
    {
        customers = new LinkedList<Customer>();
        length = 0;
    }

    //adds a customer
    public void addCustomer(Customer custom)
    {
        customers.add(custom);
        length += 1;
    }

    //removes from customers
    public void removeCustomer()
    {
        if(length > 0)
        {
            customers.remove();
            length -= 1;
        }
        else
        {
            System.out.println("Cannot remove from empty queue, dumbass");
        }
    }

    public int getLength()
    {
        return length;
    }

    //returns a list of events as well as relevant statistics.
    public EventSet eventList(int timeLimit)
    {
        LinkedList cust = new LinkedList<Customer>();
        for(int x = 0; x < customers.size(); x++)
        {
            cust.add(customers.toArray()[x]);//silly workaround. Probably a bad idea.
        }

        return new EventSet(cust);
    }

}

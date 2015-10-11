import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Alvarp on 10/10/2015.
 */
public class EventSet
{
    private Queue processed = new LinkedList<Integer>();
    int n = 0;
    private Queue inOut = new LinkedList<InOut>();

    public void addEvent(int timeIn, int timeOut)//adds from one customer. A bit awkward how I did it, but whatevs.
    {
        n += 1;
        processed.add(n);
        inOut.add(new InOut(timeIn, timeOut));
    }

    public EventSet(LinkedList<Customer> customers)
    {
        for(int x = 0; x < customers.size(); x++)
        {
            Customer temp = customers.get(x);
            addEvent(temp.getIn(), temp.getOut());
        }

    }


}

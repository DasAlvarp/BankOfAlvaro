import java.util.PriorityQueue;
import java.util.Queue;

public class Bank
{

    Queue events = new PriorityQueue();
    Cashier cashiers[];
    Utiler ute = new Utiler();

    // takes in number of cashiers, inter arrival meahn and variance, service *mean and variance time* and total time
    Bank(int cash, int interArriveMean, int interArriveVar, int meanService, int varService, int time)
    {
        cashiers = new Cashier[cash];//make all necesarry cashiers

        //fill cashiers
        for(int x = 0; x < cash; x++)
        {
            cashiers[x] = new Cashier();
        }


        for(int x = 0; x < time; x += ute.uniform(interArriveMean, interArriveVar))
        {
            cashiers[Shortest(cashiers)].addCustomer(new Customer(x, meanService, varService)); //makes new cashiers. Adds a customer to the shoertest cashier's line.
            System.out.println("added customer at time " + x);
        }
    }

    //returns shortest length in array of cashiers
    private int Shortest(Cashier[] cashiers)
    {
        int sh = 0;
        int shV = 0;
        for(int x = 0; x < cashiers.length; x++)
        {
            if(cashiers[x].getLength() < shV)
            {
                shV = cashiers[x].getLength();
                sh = x;
            }
        }
        return sh;
    }

}
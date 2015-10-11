import java.util.PriorityQueue;
import java.util.Queue;

public class Bank
{

    Queue events = new PriorityQueue()<Customer>;
    Cashier cashiers[];
    Utiler ute = new Utiler();


    Bank(int cash, int interArriveMean, int interArriveVar, int meanService, int varService, int time)
    {
        cashiers = new Cashier[cash];
        for(int x = 0; x < time; x++)
        {
            cashiers[Shortest(cashiers)].addCustomer(new Customer(x, meanService, varService));
        }
    }

    private int Shortest(Cashier[] cashiers)
    {
        int sh = 0;
        int shV = 0;
        for(int x = 0; x < cashiers.length; x++)
        {
            if(cashiers[x].length() < shV)
            {
                shV = cashiers[x].length();
                sh = x;
            }
        }
        return sh;
    }

}
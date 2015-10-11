import java.util.PriorityQueue;
import java.util.Queue;

public class Bank
{

    Queue events = new PriorityQueue()<Customer>;
    Cashier cashiers[];

    Bank(int cash, int interArriveMean, int interArriveVar, int meanService, int varService, int time)
    {
        cashiers = new Cashier[cash];
    }

}
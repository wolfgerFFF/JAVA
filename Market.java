import java.util.LinkedList;
import java.util.Queue;


public class Market implements QueueBehaviour, MarketBehaviour{
    private final Queue<String> queues;
    private final Queue<String> PersonalOrders;
    private final Queue<String> CompletedOrders;

    public Market(){
        //Queue<String> queue = new LinkedList<>();
        //Queue<String> orders = new LinkedList<>();
        //Queue<String> completedOrders = new LinkedList<>();

        this.queues = new LinkedList<>();
        this.PersonalOrders = new LinkedList<>();
        this.CompletedOrders = new LinkedList<>();
    }

    @Override
    public void EnteredTheQueue(String person) {
        queues.add(person);
        System.out.println(person + " встал в очередь");
    }

    @Override
    public void ExitTheQueue() {
        if (!queues.isEmpty()) {
            String person = queues.poll();
            System.out.println(person + " вышел из очереди.");
        } else {
            System.out.println("Очередь закончилась.");
        }
    }

    @Override
    public void NextInLine() {
        if (!queues.isEmpty()) {
            String person = queues.peek();
            System.out.println(person + " обслуживается.");
            CompletedOrders.add(PersonalOrders.poll());
        } else {
            System.out.println("Очередь закончилась.");
        }
    }

    @Override
    public boolean EmptyQueue() {
        return queues.isEmpty();
    }

    @Override
    public void ordered_it(String order) {
        PersonalOrders.add(order);
        System.out.println("Заказ принят: " + order);
    }

    @Override
    public void in_order() {
        if (!CompletedOrders.isEmpty()) {
            String order = CompletedOrders.poll();
            System.out.println("Заказ доставлен: " + order);
        } else {
            System.out.println("Нет заказов для доставки.");
        }
    }

    @Override
    public void update() {
        System.out.println("Идет обновление склада ");
        NextInLine();
        in_order();
    }
}


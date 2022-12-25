public class Waiters implements Runnable {

    private final int orderQty;
    private final int customerID;
    static int coffeePrice = 15000;

    public Waiters(int customerID, int orderQty) {
        this.customerID = customerID;
        this.orderQty = orderQty;
    }

    @Override
    public void run() {
        // call getCoffee method and pending it to 5000 ms
        while (true) {
            makeFood();
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void orderInfo() {
        System.out.println("==========================================================");
        System.out.println("Customer ID: " + this.customerID);
        System.out.println("Numbeer of Food: " + this.orderQty);
        System.out.println("Total Price: " + this.orderQty * coffeePrice);
        System.out.println("==========================================================");
    }
    // create synchronized method getCoffee

    public void makeFood() {
        synchronized (Restaurant.getLock()) {

            System.out.println("Waiter: Food is ready to deliver");
            Restaurant restaurant = new Restaurant();
            restaurant.setWaitingForPickup(false);

            if (Restaurant.getFoodNumber() == this.orderQty + 1) {
                orderInfo();
                System.exit(0);
            }
            Restaurant.getLock().notifyAll();
            System.out.println("Waiter: Tell the restaurant to make another food\n");
        }
    }
}
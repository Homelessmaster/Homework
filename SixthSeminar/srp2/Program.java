package SixthSeminar.srp2;

public class Program {

    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */
    public static void main(String[] args) {
        Order order = new Order();
        InputOrder inputOrder = new InputOrder(order);
        inputOrder.InputOrderFromTerminal();
        Save save = new Save(order);
        save.saveToJson();
    }

}

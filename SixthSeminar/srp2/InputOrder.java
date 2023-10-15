package SixthSeminar.srp2;

import java.util.Scanner;

public class InputOrder{

    private Order order;
    
    public InputOrder(Order order){
        this.order = order;
    }

    public void InputOrderFromTerminal(){
        String clientName = prompt("Client name: ");
        String product = prompt("Product: ");
        int qnt = Integer.parseInt(prompt("Quantity: "));
        Double price = Double.parseDouble(prompt("Price: "));
        
        order.setClientName(clientName);
        order.setProduct(product);
        order.setQnt(qnt);
        order.setPrice(price);
    }
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}

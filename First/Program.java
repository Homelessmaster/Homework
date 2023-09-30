package First;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        Product product1 = new Product("ООО Источник", "_", -200);
        //product1.name = "Бутылка с водой (1)";
        //product1.brand = "ООО Источник";

        product1.setPrice(-10);
        product1.setName("");

        System.out.println(product1.displayInfo());

        Product product2 = new Product();
        System.out.println(product2.displayInfo());

        Product product3 = new Product("Бутылка с водой (3)", 150);
        System.out.println(product3.displayInfo());


        Product bottleOfWater =
                new BottleOfWater("ООО Байкал", "Бутылка с водой (4)", 250, 1.5);
        System.out.println(bottleOfWater.displayInfo());


        Product bottleOfMilk1 =
                new BottleOfMilk("ООО Молочный дождик", "Бутылка с молоком (1)", 310, 0.5, 15);
        System.out.println(bottleOfMilk1.displayInfo());

        Product bottleOfMilk2 =
                new BottleOfMilk("ООО Молочный дождик", "Бутылка с молоком (2)", 330, 1.5, 15);
        System.out.println(bottleOfMilk2.displayInfo());

        Product bottleOfMilk3 =
                new BottleOfMilk("ООО Молочный градик", "Бутылка с молоком (3)", 340, 2.5, 35);
        System.out.println(bottleOfMilk3.displayInfo());

        Product bottleOfMilk4 =
                new BottleOfMilk("ООО Молочный снегопадик", "Бутылка с молоком (4)", 350, 1.5, 25);
        System.out.println(bottleOfMilk4.displayInfo());


        Product tea1 =
                new Tea("ООО Нура", "Чай (1)", 250, "Зелёный", "В пакетиках");
        System.out.println(tea1.displayInfo());

        Product tea2 =
                new Tea("ООО GreanFe", "Чай (2)", 250, "Черный", "Листовой");
        System.out.println(tea2.displayInfo());

        Product tea3 =
                new Tea("ООО Индийский слон", "Чай (3)", 250, "Синий", "Листовой");
        System.out.println(tea3.displayInfo());


        Product gum1 =
                new Gum("Orbit", "Жвачка (1)", 25, "Мята");
        System.out.println(gum1.displayInfo());

        Product gum2 =
                new Gum("Orbit", "Жвачка (2)", 35, "Арбуз");
        System.out.println(gum2.displayInfo());

        Product gum3 =
                new Gum("ООО Жвачка и точка", "Жвачка (3)", 45, "Мороз");
        System.out.println(gum3.displayInfo());

        Product gum4 =
                new Gum("ООО Жвачка и точка", "Жвачка (4)", 15, "Лесные ягоды");
        System.out.println(gum4.displayInfo());


        ArrayList<Product> products = new ArrayList<>();
        products.add(bottleOfWater);
        products.add(bottleOfMilk1);
        products.add(bottleOfMilk2);
        products.add(bottleOfMilk3);
        products.add(bottleOfMilk4);
        products.add(gum1);
        products.add(gum2);
        products.add(gum3);
        products.add(gum4);
        products.add(tea1);
        products.add(tea2);
        products.add(tea3);

        
        System.out.println("---------------------------------------");

        VendingMachine vendingMachine = new VendingMachine(products);

        BottleOfMilk bottleOfMilk = vendingMachine.getBottleOfMilk(1.5, 15);
        if (bottleOfMilk == null){
            System.out.println("Такой бутылки с молоком нет в автомате.");
        }
        else {
            System.out.println("Вы купили:");
            System.out.println(bottleOfMilk.displayInfo());
        }


        Gum gum = vendingMachine.getGum("Лесные ягоды");
        if (gum == null){
            System.out.println("Такой жвачки нет в автомате.");
        }
        else {
            System.out.println("Вы купили:");
            System.out.println(gum.displayInfo());
        }
        Tea tea = vendingMachine.getTea("Черный", "Листовой");
        if (tea == null){
            System.out.println("Такого чая нет в автомате.");
        }
        else {
            System.out.println("Вы купили:");
            System.out.println(tea.displayInfo());
        }

    }

}

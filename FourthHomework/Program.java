package FourthHomework;

import java.util.ArrayList;


public class Program {

    /*
    a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
    b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
    поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
    c. Для хранения фруктов внутри коробки можно использовать ArrayList;
    d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
    вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
    e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
    подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
    Можно сравнивать коробки с яблоками и апельсинами;
    f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
    Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
    Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
    g. Не забываем про метод добавления фрукта в коробку.

    Формат сдачи: ссылка на гитхаб проект
    */
    public static void main(String[] args) {

        ArrayList<Apple> appleList = new ArrayList<>();
        ArrayList<Orange> orangeList = new ArrayList<>();
        ArrayList<Orange> orangeList2 = new ArrayList<>();

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();
        Orange orange5 = new Orange();

        appleList.add(apple1);
        appleList.add(apple2);
        appleList.add(apple3);
        appleList.add(apple4);

        orangeList.add(orange1);
        orangeList.add(orange2);
        orangeList.add(orange3);
        orangeList2.add(orange4);

        Box<Orange> orangeBox1 = new Box<>(orangeList);

        orangeList2.add(orange5);
        Box<Orange> orangeBox2 = new Box<>(orangeList2);

        Box<Apple> appleBox = new Box<>(appleList);


        /*
         * task d
         */
        System.out.println(orangeBox1.getWeight());
        System.out.println(appleBox.getWeight());

        System.out.println();

        System.out.println(orangeBox1.getWeight());
        System.out.println(orangeBox2.getWeight());


        /*
         * task e
         */
        System.out.println(orangeBox1.compare(orangeBox2));

        System.out.println();

        /*
         * task f
         */
        orangeBox1.pour(orangeBox2, 2);

        for (Orange orange : orangeList2) {
            System.out.println(orange);
        }

        System.out.println();

        /*
         * task g
         */
        orangeBox2.addFruit(5);

        for (Orange orange : orangeList2) {
            System.out.println(orange);
        }
    }

}

package SecondHomework;



public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Barsik", 5);
        Plate plate = new Plate(5, 10);
        plate.info();


        if(plate.setFood(plate.getFood() - cat.getAppetite())){

            cat.eat();

        }


        // TASK 3
        Cat[] cats = new Cat[5];
        Plate plate2 = new Plate(60, 100);
        Cat cat1 = new Cat("Александр Пушкин", 10);
        Cat cat2 = new Cat("Михаил Булгаков", 15);
        Cat cat3 = new Cat("Арнальд Индридасон", 15);
        Cat cat4 = new Cat("Джордж Оруэлл", 25);
        Cat cat5 = new Cat("Стивен Кинг", 10);
        
        cats[0] = cat1;
        cats[1] = cat2;
        cats[2] = cat3;
        cats[3] = cat4;
        cats[4] = cat5;


        
        for (int i = 0; i < cats.length; i++) {
            if(plate2.setFood(plate2.getFood() - cats[i].getAppetite())){
                cats[i].eat();
            }else{}
        }

        //TASK 4
        plate2.replenishFood(150);
    }



}

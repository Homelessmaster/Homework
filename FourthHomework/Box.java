package FourthHomework;

import java.util.ArrayList;



public class Box<T extends Fruit>{

    private ArrayList<T> fruits;

    

    public Box(ArrayList<T> fruits){
        this.fruits = fruits;
    }

    public float getWeight(){
        float result = 0;
        for (T t : fruits) {
            result += t.getWeight();
        }
        return result;
    }


    public boolean compare(Box<T> o) {
        if(getWeight() == o.getWeight()){
            return true;
        }else{ return false; }
    }

    public void pour(Box<T> box, int quantity){
        T t = box.fruits.get(0);
        if(quantity <= fruits.size()){
            for (int i = 0; i < quantity; i++) {
                fruits.remove(i);
                box.fruits.add(t);
            }
        }
    }

    public void addFruit(int count){
        T t = fruits.get(0);
        for (int i = 0; i < count; i++) {
            fruits.add(t);
        }
    }
}

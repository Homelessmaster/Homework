package SecondHomework;

public class Plate {
    private int food;
    private int maxFood;

    public Plate(int food, int maxFood){

        this.food = food;
        this.maxFood = maxFood;
    }


    public int getFood(){

        return food;
    }

    public boolean setFood(int food){

        if(food < 0){
            System.out.println("В миске не хватает еды");

            return false;
        }
        else{
            this.food = food;

            return true;
        }
        
    }

    public void replenishFood(int food){
        if(this.food + food > maxFood){
            int res = this.food + food - maxFood;
            System.out.println("Вы переполнили миску и вылилось: " + res + " еды");
        }
        else{
            this.food = this.food + food;
        }
        
    }
    public void info(){
        
        System.out.println("Plate: " + food);
    }
}

package SecondHomework;

import java.util.Timer;
import java.util.TimerTask;

public class Cat {

    
    private String name;
    private int appetite;
    private boolean satiety = false;
    
    Timer timer = new Timer("Timer");
        
    long delay = 10000L;

    TimerTask task = new TimerTask() {
        public void run() {
            satiety = false;
            System.out.println(name + " голоден");
        }
    };
    
    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
    }

    public String getName(){
        return name;
    }

    public int getAppetite(){
        return appetite;
    }

    public boolean getSatiety(){
        return satiety;
    }

    public void setSatiety(boolean satiety){
        this.satiety = satiety;
    }
    

    public void eat(){
        if(satiety == false){
            this.satiety = true;
            System.out.println(name + " покушал");
            timer.schedule(task, delay);
        }
        else{
            System.out.println(name + " сыт");
        }


    }

    
}

package First;

public class BottleOfMilk extends Product {

    private double volume; // объем
    private double fat; // Содержание жирности

    public double getVolume() {
        return volume;
    }
    public double getFat() {
        return fat;
    }

    
    
    public void setVolume(double volume) {
        checkVolume(volume);
    }
    public void setFat(double fat) {
        checkFat(fat);
    }

    public BottleOfMilk(String brand, String name, double price, double volume, double fat){
        super(brand, name, price);
        checkVolume(volume);
        checkFat(fat);
    }

    @Override
    public String displayInfo() {
        return String.format("[МОЛОКО] %s - %s - %.2f - объем: %.2f; жирность: %.1f", brand, name, price, volume, fat);
    }

    
    private void checkVolume(double volume){
        if (volume < 0.25){
            this.volume = 0.25;
        }
        else {
            this.volume = volume;
        }
    }   
    private void checkFat(double fat){
        if (fat < 1 || fat > 9){
            this.fat = 3.5;
        }
        else {
            this.fat = fat;
        }
    }   
}

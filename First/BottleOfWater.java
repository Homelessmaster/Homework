package First;

public class BottleOfWater extends Product{

    private double volume; // объем

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        checkVolume(volume);
    }

    public BottleOfWater(String brand, String name, double price, double volume){
        super(brand, name, price);
        checkVolume(volume);
    }

    @Override
    public String displayInfo() {
        return String.format("[ВОДА] %s - %s - %.2f - объем: %.2f", brand, name, price, volume);
    }

    private void checkVolume(double volume){
        if (volume < 0.25){
            this.volume = 0.25;
        }
        else {
            this.volume = volume;
        }
    }   
}

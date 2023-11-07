import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class ToyStore {
    List<Toy> toys;
    List<Toy> prizeToys;
    Random rand;

    public ToyStore() {
        this.toys = new ArrayList<>();
        this.prizeToys = new ArrayList<>();
        this.rand = new Random();
    }

    public void addToy(String id, String name, int quantity, double weight) {
        this.toys.add(new Toy(id, name, quantity, weight));
    }

    public void drawPrizeToy() {
        double totalWeight = 0;
        for (Toy toy : toys) {
            totalWeight += toy.weight;
        }

        double randomValue = totalWeight * rand.nextDouble();
        for (Toy toy : toys) {
            randomValue -= toy.weight;
            if (randomValue <= 0) {
                this.prizeToys.add(toy);
                toy.quantity--;
                break;
            }
        }
    }

    public void getPrizeToy() throws IOException {
        if (!this.prizeToys.isEmpty()) {
            Toy toy = this.prizeToys.remove(0);
            FileWriter writer = new FileWriter("prizes.txt", true);
            writer.write(toy.id + "\n");
            writer.close();
        }
    }
}
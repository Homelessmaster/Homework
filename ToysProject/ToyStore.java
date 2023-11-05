import java.util.Comparator;
import java.util.PriorityQueue;

public class ToyStore {
    private PriorityQueue<Toy> toys;

    public ToyStore() {
        this.toys = new PriorityQueue<>(Comparator.comparingInt(Toy::getWeight));
    }

    public void put(String id, String name, int weight) {
        this.toys.add(new Toy(id, name, weight));
    }

    public Toy get() {
        if (this.toys.isEmpty()) {
            return null;
        }
        return this.toys.poll();
    }
}

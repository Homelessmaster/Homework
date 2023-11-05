import java.io.*;

public class Program {
    public static void main(String[] args) throws IOException {
        ToyStore store = new ToyStore();
        store.put("1", "конструктор", 2);
        store.put("2", "робот", 2);
        store.put("3", "кукла", 6);

        FileWriter writer = new FileWriter("ToysProject\\output.txt");
        for (int i = 0; i < 10; i++) {
            Toy toy = store.get();
            if (toy != null) {
                writer.write(toy.getId() + "\n");
            }
        }
        store.get();
        writer.close();
    }
}



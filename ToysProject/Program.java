import java.io.*;


public class Program {
    public static void main(String[] args) throws IOException {
        ToyStore store = new ToyStore();
        store.addToy("1", "конструктор", 10, 0.2);
        store.addToy("2", "робот", 10, 0.2);
        store.addToy("3", "кукла", 10, 0.6);

        for (int i = 0; i < 10; i++) {
            store.drawPrizeToy();
            store.getPrizeToy();
        }
    }
}

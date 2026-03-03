import java.util.LinkedList;
import java.util.Queue;
public class SpaService {
    private Queue<Pet> queue = new LinkedList<>();
    public void checkIn(Pet pet) {
        queue.add(pet);
    }
    public Pet serveNext() {
        return queue.poll();
    }
    public void showWaiting() {
        if (queue.isEmpty()) {
            System.out.println("No pets waiting.");
            return;
        }
        for (Pet p : queue) {
            System.out.println(p);
        }
    }
}
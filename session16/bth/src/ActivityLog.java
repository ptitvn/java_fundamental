import java.util.Stack;
public class ActivityLog {
    private Stack<String> history = new Stack<>();
    public void record(String description) {
        history.push(description);
    }
    public void undo() {
        if (history.isEmpty()) {
            System.out.println("No actions to undo.");
        } else {
            System.out.println("Undo: " + history.pop());
        }
    }
}
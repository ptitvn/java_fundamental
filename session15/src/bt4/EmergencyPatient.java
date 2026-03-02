package bt4;
public class EmergencyPatient {

    private String id;
    private String name;
    private int priority; // 1: cấp cứu, 2: thường

    public EmergencyPatient(String id, String name, int priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }

    public String getId() { return id; }

    public String getName() { return name; }

    public int getPriority() { return priority; }

    @Override
    public String toString() {
        return "Patient{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", priority=" + priority +
                '}';
    }
}
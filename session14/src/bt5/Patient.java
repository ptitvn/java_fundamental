package bt5;

public class Patient {

    private String name;
    private int severity;      // 1: Nguy kịch, 2: Nặng, 3: Nhẹ
    private int arrivalTime;   // Ví dụ: 800 = 8:00

    public Patient(String name, int severity, int arrivalTime) {
        this.name = name;
        this.severity = severity;
        this.arrivalTime = arrivalTime;
    }

    public String getName() {
        return name;
    }

    public int getSeverity() {
        return severity;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public String toString() {
        return name + " (Mức " + severity + ", đến lúc " + arrivalTime + ")";
    }
}
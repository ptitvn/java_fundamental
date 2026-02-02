public class bt4 {
    public static void main(String[] args) {

        ClassRoom s1 = new ClassRoom("An");
        ClassRoom s2 = new ClassRoom("Bình");
        ClassRoom s3 = new ClassRoom("Cường");

        s1.payFund(100_000);
        s2.payFund(150_000);
        s3.payFund(200_000);

        ClassRoom.showClassFund();
    }
}

class ClassRoom {

    private static int classFund = 0;
    private String studentName;

    public ClassRoom(String studentName) {
        this.studentName = studentName;
    }

    public void payFund(int amount) {
        classFund += amount;
        System.out.println(studentName + " đóng " + amount + " | Quỹ hiện tại: " + classFund);
    }

    public static void showClassFund() {
        System.out.println("Tổng quỹ lớp: " + classFund);
    }
}

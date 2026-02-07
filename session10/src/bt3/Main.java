package bt3;
public class Main {
    public static void main(String[] args) {
        bt3.Duck duck = new bt3.Duck("Vịt Donald");
        Fish fish = new Fish("Cá Nemo");

        duck.swim();
        duck.fly();

        fish.swim();
        // fish.fly(); ❌ lỗi biên dịch (đúng yêu cầu bài)
    }
}

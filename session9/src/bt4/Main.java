public class Main {
    public static void main(String[] args) {

        Animal animal = new Dog();

        animal.sound();

        // Lỗi compile-time
        // animal.wagTail();

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal; 
            dog.wagTail();
        }
    }
}

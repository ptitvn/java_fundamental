package bt3;

public class Main {
    public static void main(String[] args) {

        MedicationProcessChecker checker = new MedicationProcessChecker();

        System.out.println("=== Test 1: Hợp lệ ===");
        String[] actions1 = {"PUSH", "PUSH", "POP", "POP"};
        checker.checkProcess(actions1);

        System.out.println("\n=== Test 2: POP sai ===");
        String[] actions2 = {"POP", "PUSH"};
        checker.checkProcess(actions2);

        System.out.println("\n=== Test 3: Chưa hoàn tất ===");
        String[] actions3 = {"PUSH", "PUSH", "POP"};
        checker.checkProcess(actions3);
    }
}
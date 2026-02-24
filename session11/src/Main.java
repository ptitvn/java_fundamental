package src;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ARENA OF HEROES ===");

        GameCharacter[] characters = new GameCharacter[3];
        characters[0] = new Warrior("Yasuo", 500, 50, 20);
        characters[1] = new Mage("Veigar", 400, 100, 200);

        // Anonymous Class cho Goblin
        characters[2] = new GameCharacter("Goblin", 100, 10) {
            @Override
            public void attack(GameCharacter target) {
                System.out.println("[Quái vật] Goblin cắn trộm " + target.getName() + "!");
                target.takeDamage(10);
            }
        };

        System.out.println("Đã khởi tạo " + GameCharacter.count + " nhân vật tham gia đấu trường.\n");

        characters[0].attack(characters[2]);
        ((ISkill)characters[1]).useUltimate(characters[0]);
        characters[2].attack(characters[1]);

        System.out.println("\n=== THÔNG SỐ SAU LƯỢT ĐẤU ===");
        for (GameCharacter c : characters) {
            c.displayInfo();
        }
    }
}

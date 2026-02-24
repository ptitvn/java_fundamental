package src;

public class Warrior extends GameCharacter implements ISkill {
    private int armor;

    public Warrior(String name, int hp, int attackPower, int armor) {
        super(name, hp, attackPower);
        this.armor = armor;
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.println("[Chiến binh] " + name + " tấn công " + target.getName() + "!");
        target.takeDamage(attackPower);
    }

    @Override
    public void useUltimate(GameCharacter target) {
        System.out.println(name + " dùng chiêu cuối 'Đấm ngàn cân' lên " + target.getName() + "!");
        target.takeDamage(attackPower * 2);
        hp -= hp * 0.1; // mất 10% HP
    }

    @Override
    public void takeDamage(int amount) {
        int realDamage = amount - armor;
        if (realDamage < 0) realDamage = 0;
        super.takeDamage(realDamage);
    }

    @Override
    public void displayInfo() {
        System.out.println("Tên: " + name + " | HP: " + hp + " | Giáp: " + armor);
    }
}

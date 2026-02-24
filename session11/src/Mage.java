package src;

public class Mage extends GameCharacter implements ISkill {
    private int mana;

    public Mage(String name, int hp, int attackPower, int mana) {
        super(name, hp, attackPower);
        this.mana = mana;
    }

    @Override
    public void attack(GameCharacter target) {
        if (mana >= 5) {
            System.out.println("[Pháp sư] " + name + " tấn công " + target.getName() + "!");
            target.takeDamage(attackPower);
            mana -= 5;
        } else {
            System.out.println("[Pháp sư] " + name + " hết mana, đánh thường!");
            target.takeDamage(attackPower / 2);
        }
    }

    @Override
    public void useUltimate(GameCharacter target) {
        if (mana >= 50) {
            System.out.println(name + " dùng chiêu cuối 'Hỏa cầu' lên " + target.getName() + "!");
            target.takeDamage(attackPower * 3);
            mana -= 50;
        } else {
            System.out.println(name + " không đủ mana để dùng chiêu cuối!");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Tên: " + name + " | HP: " + hp + " | Mana: " + mana);
    }
}

package src;

public abstract class GameCharacter {
    protected String name;
    protected int hp;
    protected int attackPower;
    public static int count = 0;

    public GameCharacter(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
        count++;
    }

    public String getName() { return name; }
    public int getHp() { return hp; }
    public void setHp(int hp) { this.hp = hp; }

    public abstract void attack(GameCharacter target);

    public void takeDamage(int amount) {
        hp -= amount;
        if (hp <= 0) {
            hp = 0;
            System.out.println(name + " đã bị hạ gục!");
        }
    }

    public void displayInfo() {
        System.out.println("Tên: " + name + " | HP: " + hp);
    }
}


import java.util.Random;

public class Cleric {
    String name;
    int hp = 50;
    static final int MAX_HP = 50;
    int mp = 10;
    static final int MAX_MP = 10;

    Cleric(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    Cleric(String name, int hp) {
        this(name, hp, Cleric.MAX_MP);
    }

    Cleric(String name) {
        this(name, Cleric.MAX_HP);
    }

    public void selfAid() {
        if (this.mp < 5) {
            System.out.println("MPが足りません！");
            return;
        }
        this.mp -= 5;
        this.hp = Cleric.MAX_HP;
        System.out.println("HPを最大値まで回復しました！");
    }

    public int pray(int sec) {
        int mpRecoveryAmount = sec + new Random().nextInt(3);
        int actualMpRecoveryAmount = Math.min(Cleric.MAX_MP - this.mp, mpRecoveryAmount);
        this.mp += actualMpRecoveryAmount;
        System.out.println("MPが" + actualMpRecoveryAmount + "回復した。");
        return actualMpRecoveryAmount;
    }
}

public class Wand {
    private String name; // 杖の名前
    private double power; // 杖の魔力

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("名前がnullである。処理を中断。");
        }
        if (name.length() < 3) {
            throw new IllegalArgumentException("名前が短すぎる。処理を中断。");
        }
        this.name = name;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        if (power < 0.5 || 100 < power) {
            throw new IllegalArgumentException("増幅率が不適切。処理を中断。");
        }
        this.power = power;
    }
}

package homeWork_2.food;

public abstract class Food {
    private String name;
    private int satiety;

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }
}

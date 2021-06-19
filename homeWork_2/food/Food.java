package homeWork_2.food;

public abstract class Food {
    private int satiety;

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public abstract String getName();
}

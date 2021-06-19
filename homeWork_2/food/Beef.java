package homeWork_2.food;

public class Beef extends Meat {
    private final int beefMeatEnergy = 3;

    @Override
    public int getSatiety() {
        return beefMeatEnergy;
    }

    @Override
    public String getName() {
        return "beef";
    }
}

package homeWork_2.food;

public class ChickenMeat extends Meat {
    private final int chickenMeatEnergy = 2;

    @Override
    public int getSatiety() {
        return chickenMeatEnergy;
    }

    @Override
    public String getName() {
        return "chicken meat";
    }
}

package homeWork_2.food;

public class Flower extends Grass {
    private final int flowerEnergy = 1;

    @Override
    public int getSatiety() {
        return flowerEnergy;
    }

    @Override
    public String getName() {
        return "flower";
    }
}

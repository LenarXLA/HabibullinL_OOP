package homeWork_2.food;

public class Dandelion extends Grass {
    private final int dandelionEnergy = 1;

    @Override
    public int getSatiety() {
        return dandelionEnergy;
    }

    @Override
    public String getName() {
        return "dandelion";
    }
}

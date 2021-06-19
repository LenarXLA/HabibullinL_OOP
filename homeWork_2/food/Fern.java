package homeWork_2.food;

public class Fern extends Grass {
    private final int fernEnergy = 2;

    @Override
    public int getSatiety() {
        return fernEnergy;
    }

    @Override
    public String getName() {
        return "fern";
    }
}

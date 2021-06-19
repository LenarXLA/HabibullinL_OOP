package homeWork_2.animals;

public class Fish extends Herbivore {
    private final String name = "Fish";

    @Override
    public void swim() {
        System.out.println("Fish swimming!");
        super.setEnergy(getEnergy() - 1);
    }

    @Override
    public String getNameOfAnimal() {
        return name;
    }
}

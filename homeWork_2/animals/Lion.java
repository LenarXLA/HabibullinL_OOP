package homeWork_2.animals;

public class Lion extends Carnivorous {
    private final String name = "Lion";

    @Override
    public void run() {
        System.out.println("Lion running!");
        super.setEnergy(getEnergy() - 1);
    }

    @Override
    public String voice() {
        return "Rrrrraaaaaa!";
    }

    @Override
    public String getNameOfAnimal() {
        return name;
    }
}

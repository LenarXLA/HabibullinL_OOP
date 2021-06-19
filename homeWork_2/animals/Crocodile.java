package homeWork_2.animals;

public class Crocodile extends Carnivorous {
    private final String name = "Crocodile";

    @Override
    public void run() {
        System.out.println("Crocodile running!");
        super.setEnergy(getEnergy() - 1);
    }

    @Override
    public void swim() {
        System.out.println("Crocodile swimming!");
        super.setEnergy(getEnergy() - 2);
    }

    @Override
    public String voice() {
        return "Arrrgh!";
    }

    @Override
    public String getNameOfAnimal() {
        return name;
    }
}

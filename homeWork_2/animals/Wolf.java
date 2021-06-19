package homeWork_2.animals;

public class Wolf extends Carnivorous {
    private final String name = "Wolf";

    @Override
    public void run() {
        System.out.println("Wolf running!");
        super.setEnergy(getEnergy() - 1);
    }

    @Override
    public String voice() {
        return "Khrrrr!";
    }

    @Override
    public String getNameOfAnimal() {
        return name;
    }
}

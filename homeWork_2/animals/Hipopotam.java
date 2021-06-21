package homeWork_2.animals;

public class Hipopotam extends Herbivore {
    public Hipopotam(String name, int size) {
        super(name, size);
    }

    @Override
    public String voice() {
        return "Ghhhhh!";
    }

    @Override
    public void sailFast() {
        System.out.printf("%s swim fast!%n", super.getName());
        super.setEnergy(getEnergy() - 2);
    }

    @Override
    public void diving() {
        System.out.printf("%s diving!%n", super.getName());
        super.setEnergy(getEnergy() - 1);
    }

    @Override
    public void hopOff() {

    }

    @Override
    public void toLand() {

    }

    @Override
    public void race() {

    }

    @Override
    public void go() {

    }

    @Override
    public void crawl() {

    }
}

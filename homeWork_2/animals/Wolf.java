package homeWork_2.animals;

public class Wolf extends Carnivorous {
    public Wolf(String name, int size) {
        super(name, size);
    }

    @Override
    public String voice() {
        return "Khrrrr!";
    }

    @Override
    public void race() {
        System.out.printf("%s run fast!%n", super.getName());
        super.setEnergy(getEnergy() - 3);
    }

    @Override
    public void go() {
        System.out.printf("%s walk slowly%n", super.getName());
        super.setEnergy(getEnergy() - 2);
    }

    @Override
    public void crawl() {
        System.out.printf("%s crawl%n", super.getName());
        super.setEnergy(getEnergy() - 1);
    }

    @Override
    public void hopOff() {

    }

    @Override
    public void toLand() {

    }

    @Override
    public void sailFast() {

    }

    @Override
    public void diving() {

    }
}

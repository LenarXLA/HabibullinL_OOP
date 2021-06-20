package homeWork_2.animals;

public class Duck extends Herbivore {
    @Override
    public String voice() {
        return "Krya-Krya!";
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
        System.out.printf("%s hop off!%n", super.getName());
        super.setEnergy(getEnergy() - 2);
    }

    @Override
    public void toLand() {
        System.out.printf("%s to land!%n", super.getName());
        super.setEnergy(getEnergy() - 1);
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

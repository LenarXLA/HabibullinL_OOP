package homeWork_2.animals;

public class Lion extends Carnivorous {
    @Override
    public String voice() {
        return "Rrrrraaaaaa!";
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

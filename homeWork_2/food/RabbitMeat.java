package homeWork_2.food;

public class RabbitMeat extends Meat {
    private final int rabbitMeatEnergy = 2;

    @Override
    public int getSatiety() {
        return rabbitMeatEnergy;
    }

    @Override
    public String getName() {
        return "rabbit meat";
    }
}

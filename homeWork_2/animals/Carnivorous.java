package homeWork_2.animals;

import homeWork_2.food.Food;
import homeWork_2.food.Grass;

public abstract class Carnivorous extends Animal {
    @Override
    public String eat(Food food) {
        // Проверяем будет ли есть эту еду данное животное
        if (food instanceof Grass)
            return getName() + " not eat this " + food.getName() + "!";

        // Добавляем энергии животному при подходящей еде
        super.setEnergy(getEnergy() + food.getSatiety());

        return getName() + " eat " + food.getName() + "!";
    }
}

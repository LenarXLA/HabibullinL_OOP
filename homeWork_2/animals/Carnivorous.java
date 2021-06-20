package homeWork_2.animals;

import homeWork_2.WrongFoodException;
import homeWork_2.food.Food;
import homeWork_2.food.Grass;

public abstract class Carnivorous extends Animal {
    @Override
    public String eat(Food food) throws WrongFoodException {
        // Проверяем будет ли есть эту еду данное животное
        if (food instanceof Grass)
            throw new WrongFoodException(getName() + " not eat this " + food.getName() + "!");

        // Добавляем энергии животному при подходящей еде
        super.setEnergy(getEnergy() + food.getSatiety());

        return getName() + " eat " + food.getName() + "!";
    }
}

package homeWork_2.animals;

import homeWork_2.WrongFoodException;
import homeWork_2.food.Food;
import homeWork_2.food.Meat;

public abstract class Herbivore extends Animal {
    @Override
    public String eat(Food food) throws WrongFoodException {
        // Проверяем будет ли есть эту еду данное животное
        if (food instanceof Meat)
            throw new WrongFoodException(getName() + " not eat this " + food.getName() + "!");

        // Добавляем энергии животному при подходящей еде
        super.setEnergy(food.getSatiety());

        return getName() + " eat " + food.getName() + "!";
    }
}

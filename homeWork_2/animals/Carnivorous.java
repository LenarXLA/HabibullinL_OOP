package homeWork_2.animals;

import homeWork_2.WrongFoodException;
import homeWork_2.food.Food;
import homeWork_2.food.Grass;
import homeWork_2.food.Meat;

public abstract class Carnivorous extends Animal {
    public Carnivorous(String name, int size) {
        super(name, size);
    }

    @Override
    public String eat(Food food) {
        // Проверяем будет ли есть эту еду данное животное
        try {
            if (food instanceof Grass)
                throw new WrongFoodException(getName() + " not eat this " + food.getName() + "!");
            else {
                // Добавляем энергии животному при подходящей еде
                super.setEnergy(food.getSatiety());
                return getName() + " eat " + food.getName() + "!";
            }
        } catch (WrongFoodException e) {
            e.printStackTrace();
        }
        return "";
    }
}

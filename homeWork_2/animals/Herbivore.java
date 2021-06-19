package homeWork_2.animals;

import homeWork_2.food.Food;
import homeWork_2.food.Meat;

public class Herbivore extends Animal {
    @Override
    public String eat(Food food) {
        // Проверяем будет ли есть эту еду данное животное
        if (food instanceof Meat)
            return getNameOfAnimal() + " not eat this " + food.getName() + "!";

        // Добавляем энергии животному при подходящей еде
        super.setEnergy(food.getSatiety());

        return getNameOfAnimal() + " eat " + food.getName() + "!";
    }

    @Override
    public String getNameOfAnimal() {
        return null;
    }

    @Override
    public void fly() {
    }

    @Override
    public void run() {
    }

    @Override
    public void swim() {
    }

    @Override
    public String voice() {
        return null;
    }
}

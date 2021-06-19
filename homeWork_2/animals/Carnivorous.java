package homeWork_2.animals;

import homeWork_2.food.Food;
import homeWork_2.food.Grass;

public class Carnivorous extends Animal {
    @Override
    public String eat(Food food) {
        // Проверяем будет ли есть эту еду данное животное
        if (food instanceof Grass)
            return getNameOfAnimal() + " not eat this " + food.getName() + "!";

        // Добавляем энергии животному при подходящей еде
        super.setEnergy(getEnergy() + food.getSatiety());

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

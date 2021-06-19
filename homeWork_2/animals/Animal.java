package homeWork_2.animals;

import homeWork_2.food.Food;

public abstract class Animal implements Fly, Run, Swim, Voice {
    private int energy;

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public abstract String eat(Food food);
    public abstract String getNameOfAnimal();
}

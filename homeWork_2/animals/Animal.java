package homeWork_2.animals;

import homeWork_2.food.Food;

public abstract class Animal implements Voice, Fly, Run, Swim {
    private String name;
    private int energy;

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String eat(Food food);
}

package homeWork_2.animals;

import homeWork_2.WrongFoodException;
import homeWork_2.food.Food;

public abstract class Animal implements Voice, Fly, Run, Swim {
    private String name;
    private int energy;
    private int size;

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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public abstract String eat(Food food) throws WrongFoodException;

    @Override
    public int hashCode() {
        // идею кода взял с habr
        final int prime = 31;
        int result = 1;
        result = prime * result + energy;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Animal etc = (Animal) obj;
        if (energy != etc.energy)
            return false;
        return true;
    }
}

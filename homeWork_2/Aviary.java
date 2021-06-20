package homeWork_2;

import homeWork_2.animals.Animal;

import java.util.HashMap;
import java.util.Map;

public class Aviary <T extends Animal> {
    private SizeOfAviary sizeAviary;

    public Aviary(SizeOfAviary sizeAviary) {
        this.sizeAviary = sizeAviary;
    }

    private Map<String, T> animalInAviary = new HashMap<>();

    public SizeOfAviary getSizeAviary() {
        return sizeAviary;
    }

    public void setSizeAviary(SizeOfAviary sizeAviary) {
        this.sizeAviary = sizeAviary;
    }

    public void addAnimal(T t) {
        if ((sizeAviary.getSize() - t.getSize()) > 0) {
            System.out.printf("%s added this aviary%n", t.getName());
            animalInAviary.put(t.getName(), t);
            sizeAviary.setSize(sizeAviary.getSize() - t.getSize());
        } else {
            System.out.printf("Sorry, %s do not contain this aviary%n", t.getName());
        }
    }

    public void deleteAnimal(String key) {
        animalInAviary.remove(key);
    }

    public T getAnimal(String key) {
        return animalInAviary.get(key);
    }

    public void printAviary() {
        for (Map.Entry entry : animalInAviary.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }
}

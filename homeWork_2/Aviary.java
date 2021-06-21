package homeWork_2;

import homeWork_2.animals.Animal;
import homeWork_2.animals.Carnivorous;
import homeWork_2.animals.Herbivore;

import java.util.HashMap;
import java.util.Map;

public class Aviary <T extends Animal> {
    private SizeOfAviary sizeAviary;

    public Aviary(SizeOfAviary sizeAviary) {
        this.sizeAviary = sizeAviary;
    }

    private final Map<String, T> animalInAviary = new HashMap<>();

    public SizeOfAviary getSizeAviary() {
        return sizeAviary;
    }

    public void setSizeAviary(SizeOfAviary sizeAviary) {
        this.sizeAviary = sizeAviary;
    }

    // Вспомогательный метод добавление животных с проверкой размера животных
    public void addAnimalCompareSize(T t) {
        if ((sizeAviary.getSize() - t.getSize()) > 0) {
            System.out.printf("%s added this aviary%n", t.getName());
            animalInAviary.put(t.getName(), t);
            sizeAviary.setSize(sizeAviary.getSize() - t.getSize());
        } else {
            System.out.printf("Sorry, %s do not contain this aviary%n", t.getName());
        }
    }

    // Добавление животных с проверкой типа животных (сделал такой костыль - проверил инстансы в HashMap вот так)
    public void addAnimal(T t) {
        if (animalInAviary.isEmpty()) {
            addAnimalCompareSize(t);
        } else {
            for (Map.Entry entry : animalInAviary.entrySet()) {
                if (entry.getValue() instanceof Herbivore) {
                    if (t instanceof Herbivore) {
                        addAnimalCompareSize(t);
                    } else {
                        System.out.printf("This aviary do not for this %s!!!%n", t.getName());
                    }
                } else {
                    if (t instanceof Carnivorous) {
                        addAnimalCompareSize(t);
                    } else {
                        System.out.printf("This aviary do not for this %s!!!%n", t.getName());
                    }
                }
                break;
            }
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

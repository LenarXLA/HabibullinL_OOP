package homeWork_2;


import homeWork_2.animals.Animal;
import homeWork_2.food.Food;

public class Worker {
    public void feed(Animal animal, Food food) {
        System.out.println(animal.eat(food));
    }

    public void getVoice(Animal animal) {
        if (animal.voice() == null) {
            new Exception().printStackTrace();
            System.exit(1);
        }
        System.out.println(animal.getName() + " says: " + animal.voice());
    }
}

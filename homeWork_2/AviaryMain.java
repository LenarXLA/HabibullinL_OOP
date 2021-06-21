package homeWork_2;

import homeWork_2.animals.*;
import homeWork_2.food.Flower;

public class AviaryMain {
    public static void main(String[] args) {
        Aviary<Animal> aviary1 = new Aviary<>(SizeOfAviary.LARGE);
        Aviary<Animal> aviary2 = new Aviary<>(SizeOfAviary.ULTRA_SMALL);


        Herbivore hipopotam = new Hipopotam("Hippo", 30);
        Herbivore duck = new Duck("Duck", 5);
        Carnivorous lion = new Lion("Leo", 15);
        Carnivorous wolf = new Wolf("Wolfgang", 12);
        Carnivorous crocodile = new Crocodile("Gena", 25);

        // Попытаемся поместить большое животное в маленький вольер
        aviary2.addAnimal(hipopotam);

        System.out.println("___________________________________________");

        // Поместить хищников в их вольер
        aviary1.addAnimal(lion);
        aviary1.addAnimal(wolf);
        aviary1.addAnimal(crocodile);

        System.out.println("___________________________________________");
        // Попытаемся поместить травоядное вольер хищников
        aviary1.addAnimal(duck);
        System.out.println("___________________________________________");

        // Проверим остаток места
        System.out.printf("The remainder of the aviary: %s%n", aviary1.getSizeAviary().getSize());

        System.out.println("___________________________________________");

        // Посмотрим животных в вольере
        aviary1.printAviary();

        System.out.println("___________________________________________");

        //  удалим животное из вольера
        aviary1.deleteAnimal("Leo");
        System.out.println("After deleting:");
        aviary1.printAviary();

        System.out.println("___________________________________________");

        // получим ссылку на животное в вольере по его кличке и распечатаем имя
        System.out.println(aviary1.getAnimal("Wolfgang").getName());

        // исключение если еда не подходит животному
        System.out.println(crocodile.eat(new Flower()));

    }
}

package homeWork_2;

import homeWork_2.animals.*;
import homeWork_2.food.Flower;

public class AviaryMain {
    public static void main(String[] args) throws WrongFoodException {
        Aviary<Carnivorous> carnivorousAviary = new Aviary<>(SizeOfAviary.LARGE);
        Aviary<Herbivore> herbivoreAviary = new Aviary<>(SizeOfAviary.ULTRA_SMALL);


        Hipopotam hipopotam = new Hipopotam();
        hipopotam.setName("Hippo");
        hipopotam.setSize(30);
        Lion lion = new Lion();
        lion.setName("Leo");
        lion.setSize(15);
        Wolf wolf = new Wolf();
        wolf.setName("Wolfgang");
        wolf.setSize(12);
        Crocodile crocodile = new Crocodile();
        crocodile.setName("Gena");
        crocodile.setSize(25);

        // Попытаемся поместить большое животное в маленький вольер
        herbivoreAviary.addAnimal(hipopotam);

        System.out.println("___________________________________________");

        // Поместить хищников в их вольер
        carnivorousAviary.addAnimal(lion);
        carnivorousAviary.addAnimal(wolf);
        carnivorousAviary.addAnimal(crocodile);

        // Проверим остаток места
        System.out.printf("The remainder of the aviary: %s%n", carnivorousAviary.getSizeAviary().getSize());

        System.out.println("___________________________________________");

        // Посмотрим животных в вольере
        carnivorousAviary.printAviary();

        System.out.println("___________________________________________");

        //  удалим животное из вольера
        carnivorousAviary.deleteAnimal("Leo");
        System.out.println("After deleting:");
        carnivorousAviary.printAviary();

        System.out.println("___________________________________________");

        // получим ссылку на животное в вольере по его кличке и распечатаем имя
        System.out.println(carnivorousAviary.getAnimal("Wolfgang").getName());

        // исключение если еда не подходит животному
        System.out.println(crocodile.eat(new Flower()));

    }
}

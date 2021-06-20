package homeWork_2;

import homeWork_2.animals.*;
import homeWork_2.food.*;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static void main(String[] args) throws WrongFoodException {
        Worker worker = new Worker();

        Duck duck = new Duck();
        duck.setName("Donald-Duck");
        Fish fish = new Fish();
        fish.setName("Nemo-fish");
        Hipopotam hipopotam = new Hipopotam();
        hipopotam.setName("Hippo");

        Lion lion = new Lion();
        lion.setName("King-lion");
        Wolf wolf = new Wolf();
        wolf.setName("Dark-wolf");
        Crocodile crocodile = new Crocodile();
        crocodile.setName("Gena-Crocodile");

        Beef beef = new Beef();
        ChickenMeat chickenMeat = new ChickenMeat();
        RabbitMeat rabbitMeat = new RabbitMeat();

        Dandelion dandelion = new Dandelion();
        Fern fern = new Fern();
        Flower flower = new Flower();

        List<Animal> animals = new ArrayList<>();
        animals.add(duck);
        animals.add(fish);
        animals.add(hipopotam);
        animals.add(lion);
        animals.add(wolf);
        animals.add(crocodile);

        List<Food> foods = new ArrayList<>();
        foods.add(beef);
        foods.add(chickenMeat);
        foods.add(rabbitMeat);
        foods.add(dandelion);
        foods.add(fern);
        foods.add(flower);

        // Попытаемся накормить животное и травой и мясом, и вызвать голос
        for (Animal an : animals) {
            for (Food f : foods) {
                worker.feed(an, f);
            }
        }

        // Вызываем голос некоторых животных
        worker.getVoice(lion);
        worker.getVoice(duck);
        worker.getVoice(hipopotam);

        // Попытаемся голос рыбы (для теста убирать комментарии)
        // worker.getVoice(fish);

        // Создадим пруд
        Animal[] pond = new Animal[4];
        pond[0] = fish;
        pond[1] = hipopotam;
        pond[2] = duck;
        pond[3] = crocodile;

        for (Animal anim : pond) {
            anim.sailFast();
            anim.diving();
        }

        //  Испытаем энергию животного
        System.out.printf("Energy of %s = %s%n", lion.getName(), lion.getEnergy());
        worker.feed(lion, chickenMeat);
        System.out.printf("Energy of %s = %s%n", lion.getName(), lion.getEnergy());
        lion.race();
        lion.crawl();
        System.out.printf("Energy of %s = %s%n", lion.getName(), lion.getEnergy());

    }
}

package homeWork_2;

import homeWork_2.animals.*;
import homeWork_2.food.*;

public class Zoo {
    public static void main(String[] args) {
        Worker worker = new Worker();

        Duck duck = new Duck();
        Fish fish = new Fish();
        Hipopotam hipopotam = new Hipopotam();

        Lion lion = new Lion();
        Wolf wolf = new Wolf();
        Crocodile crocodile = new Crocodile();

        Beef beef = new Beef();
        ChickenMeat chickenMeat = new ChickenMeat();
        RabbitMeat rabbitMeat = new RabbitMeat();

        Dandelion dandelion = new Dandelion();
        Fern fern = new Fern();
        Flower flower = new Flower();

        // Попытаемся накормить утку и травой и мясом, и вызват голос животного
        worker.feed(duck, dandelion);
        worker.feed(duck, rabbitMeat);
        worker.getVoice(duck);

        // Попытаемся накормить бегемота и травой и мясом, и вызват голос животного
        worker.feed(hipopotam, fern);
        worker.feed(hipopotam, chickenMeat);
        worker.getVoice(hipopotam);

        // Попытаемся накормить льва и травой и мясом, и вызват голос животного
        worker.feed(lion, flower);
        worker.feed(lion, beef);
        worker.getVoice(lion);

        // Попытаемся накормить льва и травой и мясом, и вызват голос животного
        worker.feed(crocodile, fern);
        worker.feed(crocodile, rabbitMeat);
        worker.getVoice(crocodile);

        // Попытаемся голос рыбы (для теста убирать комментарии)
        // worker.getVoice(fish);

        // Создадим пруд
        Animal[] pond = new Animal[5];
        pond[0] = fish;
        pond[1] = hipopotam;
        pond[2] = duck;
        pond[3] = crocodile;
        pond[4] = new Fish();

        for (Animal anim : pond) {
            anim.swim();
        }

        //  Испытаем энергию животного
        System.out.printf("Energy of %s = %s%n", lion.getNameOfAnimal(), lion.getEnergy());
        worker.feed(lion, chickenMeat);
        System.out.printf("Energy of %s = %s%n", lion.getNameOfAnimal(), lion.getEnergy());
        lion.run();
        System.out.printf("Energy of %s = %s%n", lion.getNameOfAnimal(), lion.getEnergy());

    }
}

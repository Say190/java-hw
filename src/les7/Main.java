package les7;

public class Main {

    private static final Animal[] ANIMALS = new Animal[] {
            new Dog(" Мясо", "Дома", "Лабрадор", "Леля"),
            new Dog(" Корм", "Дома", "Шитцу", "Мишель"),
            new Cat ("корм", "дома", true, "Петя"),
            new Cat ("рыбу", "улица", false, "Мурзик"),
            new Horse ("сено", "сарай", 35, "Толя"),
            new Horse ("яблоки", "сарай", 20, "Ляля")
    };

    private static final Veterinarian VET = new Veterinarian();

    public static void main(String[] args){

        int dogCount = 0;
        int catCount = 0;
        int horseCount = 0;

        for (int i = 0; i < ANIMALS.length; i++){
            Animal animal = ANIMALS[i];
            System.out.println("Животное" + (i + 1));

            animal.makeNoise();
            animal.eat(animal.getFood());
            animal.sleep();

            VET.treatAnimal(animal);
            VET.examine(animal);
            System.out.println(animal);

            if (animal instanceof Dog) {
                dogCount++;
            } else if (animal instanceof Cat) {
                catCount++;
            } else if (animal instanceof Horse) {
                horseCount++;
            }
        }

        System.out.println("Итог");
        System.out.println("Собак: " + dogCount);
        System.out.println("Кошек: " + catCount);
        System.out.println("Лошадей: " + horseCount);


    }
}

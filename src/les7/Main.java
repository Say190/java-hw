package les7;

public class Main {

    public static void main(String[] args){

        Animal[] animals = new Animal[] {
                new Dog(" Мясо ", " Дома ", " Лабрадор ", "Леля "),
                new Dog(" Корм ", " Дома ", " Шитцу ", "Мишель "),
                new Cat (" корм ", " дома ", true, "Петя "),
                new Cat (" рыбу ", " улица ", false, "Мурзик "),
                new Horse (" сено ", " сарай ", 35, "Толя "),
                new Horse (" яблоки ", " сарай ", 20, "Ляля ")
        };

        Veterinarian vet = new Veterinarian();

        int dogs = 0;
        int cats = 0;
        int horses = 0;

        for (int i = 0; i < animals.length; i++){
            Animal animal = animals[i];
            System.out.println("Животное" + (i + 1));

            animal.makeNoise();
            animal.eat(animal.getFood());
            animal.sleep();

            vet.treatAnimal(animal);
            vet.examine(animal);
            System.out.println(animal);

            if (animal instanceof Dog) {
                dogs++;
            } else if (animal instanceof Cat) {
                cats++;
            } else if (animal instanceof Horse) {
                horses++;
            }
        }


        System.out.println("Итог");
        System.out.println("Собак: " + dogs);
        System.out.println("Кошек: " + cats);
        System.out.println("Лошадей: " + horses);


    }
}

package les4.main;

import les4.cat.Cat;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int i = 0;
        while (i < 10) {
            Cat cat = new Cat();
            System.out.println("Имя и возраст кошки: " + cat);
            i++;
        }

        for (int a = 0; a < 10; a++) {
            Cat cat = new Cat();
            cat.setAge(2);
            cat.setName("Муся");
            System.out.println("Возраст через год: " + cat.getAge() + " Имя от мамы: " + cat.getName());
        }

        int l = 0;
        do {
            Cat cat = new Cat("Сажик", 3);
            System.out.println("Возраст и имя  кота подруги: " + cat);
            l++;
        } while (l < 10);

        Cat[] cats = new Cat[5];

        for (int b = 0; b < cats.length; b++) {
            cats[b] = new Cat();

        }

        for (Cat newCat : cats) {
            System.out.println(" Имя: " + newCat.getName() + " Возраст: " + newCat.getAge());

        }

        Random random = new Random();

        System.out.print("Имя кота:");
        int s = 0;
        while (s < 10) {
            char nameRandom =(char) ('a'+ random.nextInt(26));
            System.out.print(nameRandom);
            s++;
        }

        int ageRandom = random.nextInt(28);
        System.out.println( " Возраст кота " + ageRandom );
    }


}
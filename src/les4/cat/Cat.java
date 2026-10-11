package les4.cat;

import java.util.Objects;

public class Cat {

    public static final String DEFAULT_NAME = "Муфи"; // Мою кошку так зовут
    public static final int DEFAULT_AGE = 1;

    private String name;
    private int age;

    public Cat() {
        this.name = DEFAULT_NAME  ; // моя кошка
        this.age = DEFAULT_AGE ;
    }

    public Cat(String name, int  age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

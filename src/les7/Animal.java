package les7;

public class Animal {

    private String food;
    private String location;

    Animal() {

    }

    Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Животное издает звук");
    }

    public void eat(String food) {
        System.out.println( "Животное ест"+ food);
    }

    public final void sleep() {
        System.out.println( "Животное спит");
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Animal [food=" + food + ", location=" + location + "]";
    }


}

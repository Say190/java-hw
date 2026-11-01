package les7;

public class Dog extends Animal {

    private String breed;
    public String name ;

    public  Dog (String food, String location, String breed, String name ){
        super(food, location);
        this.breed = breed;
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println( name + " издает Гав гав");
    }

    @Override
    public void eat(String food) {
        System.out.println( name + " ест " + food);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog [food=" + getFood() + ", location=" + getLocation() + ", breed=" + breed + "]";
    }
}

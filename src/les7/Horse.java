package les7;

public class Horse extends Animal {

    private int maxSpeed;
    public String name ;

    public Horse (String food, String location, int maxSpeed, String name ){
        super(food, location);
        this.maxSpeed = maxSpeed;
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println( name + " издает и го го");
    }

    @Override
    public void eat(String food) {
        System.out.println( name + " ест " + food);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Horse [food=" + getFood() + ", location=" + getLocation() + ", maxSpeed=" + maxSpeed + "]";
    }
}

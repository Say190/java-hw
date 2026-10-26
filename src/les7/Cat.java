package les7;

public class Cat extends Animal {

    private boolean isIndoor;
    public String name;

    Cat (String food, String location, boolean isIndoor, String name ){
        super(food, location);
        this.isIndoor = isIndoor;
        this.name = name;

    }

    @Override
    public void makeNoise() {
        System.out.println( name + "издает мяу мяу");
    }

    @Override
    public void eat(String food) {
        System.out.println( name + "ест" + getFood());
    }


    public boolean isIndoor() {
        return isIndoor;
    }

    public void setIndoor(boolean indoor) {
        isIndoor = indoor;
    }

    @Override
    public String toString() {
        return "Cat [food=" + getFood() + ", location=" + getLocation() + ", isIndoor=" + isIndoor + "]";
    }
}

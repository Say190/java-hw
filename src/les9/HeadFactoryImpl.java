package les9;

public class HeadFactoryImpl implements Factory<Robot.Head> {

    @Override
    public Robot.Head create(int index) {
        HeadType type = HeadType.values()[index];
        return new Robot.Head(type);
    }
}
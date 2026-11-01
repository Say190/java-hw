package les9;

public class BodyFactoryImpl implements Factory<Robot.Body> {

    @Override
    public Robot.Body create(int index) {
        BodyType type = BodyType.values()[index];
        return new Robot.Body(type);
    }
}
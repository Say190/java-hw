package les8;

public class BodyFactoryImpl implements BodyFactory {

    @Override
    public Robot.Body createBody(int index) {
        BodyType type = BodyType.values()[index];
        return new Robot.Body(type);
    }
}
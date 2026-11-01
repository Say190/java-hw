package les8;

public class HeadFactoryImpl implements HeadFactory {

    @Override
    public Robot.Head createHead(int index) {
        HeadType type = HeadType.values()[index];
        return new Robot.Head(type);
    }
}
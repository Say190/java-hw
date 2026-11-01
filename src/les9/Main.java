package les9;

public class Main {

    public static void main(String[] args) {
        Factory<Robot.Head> headFactory = new HeadFactoryImpl();
        Factory<Robot.Body> bodyFactory = new BodyFactoryImpl();

        int number = 1;

        for (int i = 0; i < HeadType.values().length; i++) {
            for (int j = 0; j < BodyType.values().length; j++) {
                Robot.Head head = headFactory.create(i);
                Robot.Body body = bodyFactory.create(j);

                Robot robot = new Robot("Robot " + number, head, body);
                System.out.println(robot);

                number++;
            }
        }
    }
}
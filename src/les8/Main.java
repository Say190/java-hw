package les8;

public class Main {

    public static void main(String[] args) {
        HeadFactory headFactory = new HeadFactoryImpl();
        BodyFactory bodyFactory = new BodyFactoryImpl();

        int number = 1;

        for (int i = 0; i < HeadType.values().length; i++) {
            for (int j = 0; j < BodyType.values().length; j++) {
                Robot.Head head = headFactory.createHead(i);
                Robot.Body body = bodyFactory.createBody(j);

                Robot robot = new Robot("Robot " + number, head, body);
                System.out.println(robot);

                number++;
            }
        }
    }
}
package les10;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MyList<String> list = new MyArrayList<>();

        list.add("Яблоко");
        list.add("Банан");
        list.add("Вишня");
        list.add(1, "Груша");
        printList(list);

        System.out.println(list.get(2));
        System.out.println(list.contains("Банан"));
        System.out.println(list.indexOf("Вишня"));

        list.set(0, "Апельсин");
        list.remove("Груша");
        list.remove(0);
        printList(list);

        list.addAll(Arrays.asList("Киви", "Манго"));
        printList(list);

        MyList<String> copy = new MyArrayList<>(list);
        printList(copy);

        System.out.println(list.size());
        System.out.println(list.isEmpty());
    }

    private static void printList(MyList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
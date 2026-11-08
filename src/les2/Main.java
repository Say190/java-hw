package les1;

public class Main {

    public static int globalInt = 3;
    public static double globalDouble = 6.6;
    public static char globalChar = 'G';
    public static boolean globalBoolean = true;

    public static Integer globalIntWrapper = 3;
    public static Double globalDoubleWrapper = 6.6;
    public static Boolean globalBooleanWrapper = true;

    public static void main(String[] args) {

        int localInt = 30;
        double localDouble = 60.6;
        boolean localBoolean = false;

        Integer localIntWrapper = 30;
        Double localDoubleWrapper = 60.6;
        Boolean localBooleanWrapper = false;

        DataHolder holder = new DataHolder();

        holder.setIntValue(3);
        holder.setDoubleValue(6.6);
        holder.setBooleanValue(true);

        holder.setIntWrapper(3);
        holder.setDoubleWrapper(6.6);
        holder.setBooleanWrapper(true);

        int holderInt = holder.getIntValue();

        byte b = 10;
        int i = b;        // byte → int
        long l = i;       // int → long
        double d = l;     // long → double

        //double d = 9.99; ошибка: java: variable d is already defined in method main(java.lang.String[])
        //int i = (int) d;

        double d1 = 9.99;
        int i1 = (int) d1;  // 9 — дробная часть отбрасывается

        long big = 300L;
        byte small = (byte) big;  // переполнение

        Integer boxed = 100;      // autoboxing: int → Integer
        int unboxed = boxed;      // unboxing:  Integer → int

        Integer nullable = null;
        //int x = nullable;         // ❌ NullPointerException во время выполнения Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because "nullable" is null
        //	at les1.Main.main(Main.java:52)

        //Integer a = 1000;  ошибка java: variable b is already defined in method main(java.lang.String[])
        //Integer b = 1000;
        //System.out.println(a == b);        // false (разные объекты)
        //System.out.println(a.equals(b));   // true  (сравнение значений)

        Integer a1 = 1000;
        Integer b1 = 1000;
        System.out.println(a1 == b1);        // false (разные объекты)
        System.out.println(a1.equals(b1));   // true  (сравнение значений)

        System.out.println("b = " + b);
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("d = " + d);

        System.out.println("d1 = " + d1 + " = i1 = " + i1);

        System.out.println("big = " + big + " = small = " + small);

        System.out.println("boxed   = " + boxed);
        System.out.println("unboxed = " + unboxed);

        System.out.println("nullable = " + nullable);

        System.out.println("DataHolder.intValue = " + holderInt);

        System.out.println("DataHolder.doubleValue = " + holder.getDoubleValue());
        System.out.println("DataHolder.booleanValue = " + holder.getBooleanValue());

        System.out.println("DataHolder.intWrapper = " + holder.getIntWrapper());
        System.out.println("DataHolder.doubleWrapper = " + holder.getDoubleWrapper());
        System.out.println("DataHolder.booleanWrapper = " + holder.getBooleanWrapper());

        System.out.println("Main.globalInt = " + globalInt);
        System.out.println("Main.globalDouble = " + globalDouble);
        System.out.println("Main.globalChar = " + globalChar);
        System.out.println("Main.globalBoolean = " + globalBoolean);

        System.out.println("Main.globalIntWrapper = " + globalIntWrapper);
        System.out.println("Main.globalDoubleWrapper = " + globalDoubleWrapper);
        System.out.println("Main.globalBooleanWrapper = " + globalBooleanWrapper);

        System.out.println("localInt = " + localInt);
        System.out.println("localDouble = " + localDouble);
        System.out.println("localBoolean = " + localBoolean);

        System.out.println("localIntWrapper = " + localIntWrapper);
        System.out.println("localDoubleWrapper = " + localDoubleWrapper);
        System.out.println("localBooleanWrapper = " + localBooleanWrapper);


    }
}
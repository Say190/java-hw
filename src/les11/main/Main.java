package les11.main;

import les11.exception.EmptyNameException;
import les11.exception.InsufficientFundsException;
import les11.exception.InvalidAgeException;

public class Main {

    public static void main(String[] args) {

        try {
            checkAge(-5);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Проверка закончена");
        }

        try {
            checkName(null);
        } catch (EmptyNameException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Проверка закончена");
        }

        try {
            String result = registerUser("Аня", 20);
            System.out.println(result);

            String result1 = registerUser("", 20);
            System.out.println(result1);
        } catch (EmptyNameException | InvalidAgeException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Проверка закончена");
        }

        try {
            int remainingBalance = withdraw(100, 30);
            System.out.println(remainingBalance);

            int remainingBalance1 = withdraw(20, 30);
            System.out.println(remainingBalance1);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Проверка закончена");
        }


    }

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Неверный возраст");
        }

    }

    public static void checkName(String name) {
        if (name == null || name.isEmpty()) {
            throw new EmptyNameException("Неверное имя");
        }

    }

    public static String registerUser(String name, int age) throws InvalidAgeException {
        checkName(name);
        checkAge(age);
        return "Регистрация успешна";

    }

    public static int withdraw(int balance, int amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Неверное снятие");
        }
        return balance - amount;

    }

}

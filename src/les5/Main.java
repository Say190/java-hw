package les5;
import java.util.Random;


public class Main {

    private static Random random = new Random();

    public static void main(String[] args) {

        Object[][] matrix = new Object[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                int number = i * 10 + j;
                if(number % 3 == 0){
                    matrix[i][j] = generateDouble();
                } else if (random.nextBoolean()){
                    matrix[i][j] = generateDouble();
                } else {
                    matrix[i][j] = generateString();
                }

                System.out.printf("%-10s",matrix[i][j]);
            }
            System.out.println();
        }

        Object[] oneDiagonal = new Object[10];
        Object[] twoDiagonal = new Object[10];

        for (int i = 0; i < 10; i++){
            oneDiagonal[i] = matrix[i][i];
            twoDiagonal[i] = matrix[i][9 - i];
        }

        boolean isEqual = true;

        for (int i = 0; i < 10; i++){
            if(!oneDiagonal[i].equals(twoDiagonal[i])) {
                isEqual = false;
            }
        }

        if(isEqual){
            System.out.println("Диагонали совпадают");
        } else {
            System.out.println("Диагонали различаются");
        }

        Object[] fullDiagonal = new Object[20];

        for (int i = 0; i < 10; i++){
            fullDiagonal[i] = oneDiagonal[i];
            fullDiagonal[i + 10] = twoDiagonal[i];
        }

        StringBuilder sb = new StringBuilder();
        Object[] roundedNum = new Object[20];
        int k = 0;

        for (int i = 0; i < fullDiagonal.length; i++) {
            if (fullDiagonal[i] instanceof String) {
                String text = String.valueOf(fullDiagonal[i]);
                String piece = text.substring(1, 4);

                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append(piece);
            }

            else if (fullDiagonal[i] instanceof Double) {
                double value = (Double) fullDiagonal[i];
                double fraction = value - Math.floor(value);
                long rounded = (fraction >= 0.7) ? (long) Math.ceil(value) : (long) Math.floor(value);
                roundedNum[k] = rounded;
                k ++;
            }
        }

        System.out.println(sb);

        StringBuilder sbNum = new StringBuilder();
        for (int i = 0; i < k; i++){
            if (sbNum.length() > 0) {
                sbNum.append('_');
            }
            sbNum.append(roundedNum[i]);
        }
        System.out.println(sbNum);

    }

    public static double generateDouble() {
        StringBuilder sb = new StringBuilder();

        sb.append(random.nextInt(9) + 1);
        sb.append('.');

        for (int i = 0; i < 4; i++) {
            sb.append(random.nextInt(10));
        }

        sb.append(random.nextInt(9) + 1);

        return Double.parseDouble(sb.toString());
    }

    public static String generateString() {
        StringBuilder sb = new StringBuilder();
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < 7; i++) {
            int index = random.nextInt(52);
            char letter = letters.charAt(index);

            sb.append(letter);
        }

        return sb.toString();
    }

}

import java.util.Arrays;

public class Massiv {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 6, 9, 15, 7};
        System.out.println(Arrays.toString(numbers));
        int summa = 0;
        for (int x : numbers) {
            summa = summa + x;
        }
        System.out.println("Summa " + summa);
        double srednee = (double) summa / numbers.length;
        System.out.println("Srednee " + srednee);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > srednee) {
                System.out.print(numbers[i] + " ");
            }
        }


    }
}

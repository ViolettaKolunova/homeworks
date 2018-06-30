import java.util.Arrays;

public class NaiboljsheePervim {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(numbers));
        int naiboljshee = 0;
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > naiboljshee) {
                naiboljshee = numbers[i];
                index = i;
            }
        }
        numbers[index] = numbers[0];
        numbers[0] = naiboljshee;
        System.out.println(Arrays.toString(numbers));

    }
}

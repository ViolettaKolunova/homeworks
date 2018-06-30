import java.util.Arrays;

public class PuzirkovajaSortirovka {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 6, 1, 2, 7, 4, 8, 10};
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length - i; j++) {
                if (numbers[j] < numbers[j-1]) {
                    int sklad = numbers[j];
                    numbers[j] = numbers[j-1];
                    numbers[j-1] = sklad;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}

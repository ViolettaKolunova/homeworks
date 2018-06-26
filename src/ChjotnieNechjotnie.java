import java.util.Arrays;

public class ChjotnieNechjotnie {
    public static void main(String[] args) {
        int[] numbers ={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(numbers));
        int chjotnie = 0;
        int nechjotnie = 0;
        for (int i = 0; i < numbers.length; i++) {
            if ((i % 2) == 0) {
                chjotnie = chjotnie + 1;
            } else {
                if ((i % 2) != 0) {
                    nechjotnie = nechjotnie + 1;
                }

            }
        }
        System.out.println("Chjotnie " + chjotnie);
        System.out.println("Nechjotnie " + nechjotnie);

    }
}

public class DvoichnijPoisk {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int chislo = 7;
        int low = 0, high = numbers.length, mid;
        while (low < high) {
            mid = (low + high) / 2;
            if (chislo == numbers[mid]) {
                System.out.println(mid);
                low = mid;
                high = mid;
            }
            if (chislo < numbers[mid]) {
                high = mid;
            } else {
                low = mid;
            }
        }
    }
}

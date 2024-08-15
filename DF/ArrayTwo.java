public class ArrayTwo {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int total = 0;

        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];

        }
        int avg = total / numbers.length;
        System.out.println(avg);
    }
}

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int[] numbers = {31, -1, 25, 0, 6};
        System.out.println(numbers[2] + ", " + numbers[0]);
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));
        numbers[3] = 67;
        // numbers[13] = 9;
        System.out.println(Arrays.toString(numbers));

        double[] digits = new double[3];
        System.out.println(Arrays.toString(digits));
        digits[1] = 1.5;
        System.out.println(Arrays.toString(digits));
        digits = new double[5];
        System.out.println(Arrays.toString(digits));

        int[][] array2D = new int[4][3];
        array2D[1][2] = 3;
        System.out.println(Arrays.deepToString(array2D));

        String[][] students = {{"Jim", "Bob"}, {"Jane", "Lucy"}};
        System.out.println(Arrays.deepToString(students));
    }
}

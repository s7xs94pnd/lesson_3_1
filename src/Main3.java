import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i = i + 1) {
            System.out.println("Hello " + i);
            System.out.println(i * i);
        }
        System.out.println("------------");
        for (int i = 1; i <= 10; i++) { // increment: i = i + 1 = > i++
            System.out.println("5 x " + i + " = " + 5 * i);
        }
        System.out.println("------------");
        for (int i = 10; i >= 1; i--) { // decrement: i = i - 1 = > i--
            System.out.println("7 x " + i + " = " + 7 * i);
        }
        System.out.println("------------");
        for (int i = 10; i >= 2; i = i - 2) { // i = i - 2 => i-=2, i = i * 7 => i*=7
            System.out.println("9 x " + i + " = " + 9 * i);
        }

        int a = 0;
        while (a < 3) {
            System.out.println("Hi " + a);
            a++;
        }

        String str = "#";
        // System.out.println(str.replace("a", "###"));
        while (str.length() <= 5) {
            System.out.println(str);
            str = str + "#";
        }

        String[] robots = new String[7];
        System.out.println(Arrays.toString(robots));
        /*robots[0] = "CDI01";
        robots[1] = "CDI02";
        robots[2] = "CDI03";
        robots[3] = "CDI04";
        robots[4] = "CDI05";*/
        for (int i = 0; i < robots.length; i++) {
            robots[i] = "CDI0" + (i + 1);
        }
        System.out.println(Arrays.toString(robots));

        String[] names = {"Jack", "Bill", "Jim"};
        for (String element : names) {
            System.out.println("Hi " + element);
        }
        System.out.println("--------------");
        int[] numbers = {56, -8, 91, -6, 71};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                break; // экстренно завершает работу всего цикла
            }
            System.out.println(numbers[i]);
        }
        System.out.println("--------------");
        // int[] numbers = {56, -8, 91, -6, 71};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                continue; // экстренно завершает работу текущего круга
            }
            System.out.println(numbers[i]);
        }

        for (int i = 1; i <= 3; i++) {
            System.out.println("Наружный цикл " + i);
            for (int j = 1; j <= 5; j++) {
                System.out.println("Внутренний цикл " + j);
            }
        }
    }
}

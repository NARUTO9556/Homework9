import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int [] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    private static void task1() {
        System.out.println("Задача 1");
        int [] arr = generateRandomArray();
        int sum = 0;
        for (int element: arr) {
            sum += element;
        }
        System.out.println(String.format("Сумма трат за месяц составила %s рублей", sum));
    }

    private static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int minSpending = arr[0];
        int maxSpending = arr[0];
        for (int i: arr) {
            if (i<minSpending){
                minSpending = i;
            } if (i>maxSpending){
                maxSpending = i;
            }
        }
        System.out.println(String.format("Минимальная сумма трат за день составила %s рублей. Максимальная сумма трат за день составила %s рублей", minSpending, maxSpending));
    }

    private static void task3() {
        System.out.println("Задача 3");
        int [] arr = generateRandomArray();
        int sum = 0;
        for (int element: arr) {
            sum += element;
        }
        int days = arr.length;
        double averageSpending = (double) sum / days;
        System.out.println(String.format("Средняя сумма трат за месяц составила %s рублей", averageSpending));
    }

    private static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
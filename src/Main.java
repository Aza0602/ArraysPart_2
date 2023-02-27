import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    private static void task1() {
        System.out.println("Задача 1");

        int[] arr = generateRandomArray();
        System.out.println("«Сгенерированный массив: " + Arrays.toString(arr) + " рублей».");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("«Сумма трат за месяц составила " + sum + " рублей».");
    }

    private static void task2() {
        System.out.println("Задача 2");

        int[] arr = generateRandomArray();
        System.out.println("«Сгенерированный массив: " + Arrays.toString(arr) + " рублей».");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("«Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей».");
    }

    private static void task3() {
        System.out.println("Задача 3");

        int[] arr = generateRandomArray();
        System.out.println("«Сгенерированный массив: " + Arrays.toString(arr) + " рублей».");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        if (arr.length != 0);
        System.out.println("«Средняя сумма трат за месяц составила " + (double) sum / arr.length + " рублей».");
    }

    private static void task4() {
        System.out.println("Задача 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }

}
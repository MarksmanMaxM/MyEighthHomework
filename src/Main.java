public class Main {
    public static void main(String[] args) {
        int sum = 0;
        sum = task1();
        task2();
        task3(sum);
        task4();

    }

    public static int task1() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.printf("Сумма трат за месяц составила %d рублей \n", sum);
        return sum;


    }

    public static void task2() {
        int[] arr = generateRandomArray();
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей \n", min, max);


    }

    public static void task3(int sum) {
        double avr = 0;
        avr = sum / 30f;
        System.out.printf("Средняя сумма трат за месяц составила %,.2f рублей \n", avr);


    }

    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        String result = "";
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            result += reverseFullName[i];
        }
        System.out.println(result);

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}

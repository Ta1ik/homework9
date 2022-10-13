import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] randomArray = generateRandomArray();
        Task1(randomArray);
        Task2(randomArray);
        Task3(randomArray);
        Task4();

    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
//            System.out.println(arr[i]);
        }
        return arr;
    }

    public static void Task1(int[] arr) {
        System.out.println("Задача 1");
        /*
        Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
        Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        в формате: «Сумма трат за месяц составила … рублей».
         */
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила: " + sum);
    }

    public static void Task2(int[] arr) {
        System.out.println("Задача 2");
        /*
        Следующая задача — найти минимальную и максимальную трату за день.
        Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        в формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
        */

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        int max = arr[0];
        for (int a = 0; a < arr.length; a++) {
            if (arr[a] > max) {
                max = arr[a];
            }
        }
        System.out.printf("Минимальная трата за день составила %d рублей. Максимальная трата за день составила %d рублей", min, max);
    }
    public static void Task3(int [] arr){
        System.out.println("\n" + "Задача 3");
        /*
        А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
        Нужно написать программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц поделить на количество дней),
        и вывести в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
         */

        double sum = 0;
        for (int i : arr) {
            sum += i;
        }
        sum = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила: " + sum);
    }
    public static void Task4 () {
        System.out.println("\n" + "Задача 4");
        /*
        В нашей бухгалтерской книге появился баг. Что-то пошло нет так, и Ф.И.О. сотрудников начали отображаться в обратную сторону.
        Т. е. вместо «Иванов Иван Иванович» мы имеем «чивонавИ навИ вонавИ».
        Данные с именами сотрудников хранятся в виде массива символов (char[]).
        Напишите код, который в случае такого бага будет выводить Ф. И. О. сотрудников в корректном виде. В качестве данных для массива используйте:
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        В результате в консоль должно быть выведено "Ivanov Ivan".
         */
        char [] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);

        }

    }
}

package Tasks;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Написать функцию, возвращающую разницу между самым большим
 * и самым маленьким элементами переданного не пустого массива.
 */

public class Task_2 {
    public static void main(String[] args) {
        difference();
    }

    public static void difference(){
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int count = 0;
        System.out.println("Введите числа массива: ");
        for (int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);

        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("Разница между max и min: " + (array[array.length - 1] - array[0]));
    }

}

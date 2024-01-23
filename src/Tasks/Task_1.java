package Tasks;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Написать метод, возвращающий количество чётных элементов массива.
 * countEvens([2, 1, 2, 3, 4]) → 3
 * countEvens([2, 2, 0]) → 3
 * countEvens([1, 3, 5]) → 0
 */

public class Task_1 {

    public static void main(String[] args) {
        countEven();
    }

    public static void countEven(){
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int count = 0;
        System.out.println("Введите числа массива: ");
        for (int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
            if (array[i] % 2 == 0){
                count = count + 1;
            }
        }
        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("Количество четных цифр: " + count);
    }



}

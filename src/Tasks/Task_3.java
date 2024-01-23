package Tasks;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Написать функцию, возвращающую истину,
 * если в переданном массиве есть два соседних элемента, с нулевым значением.
 */
public class Task_3 {
    public static void main(String[] args) {
        printBoolean(similar());
    }

    public static boolean similar(){
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int count = 0;
        System.out.println("Введите числа массива: ");
        for (int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Массив: " + Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]){
                count++;
            }
        }
        if(count > 0){
            return true;
        }
        else return false;
    }

    public static void printBoolean(boolean foo){
        System.out.println(foo);
    }
}

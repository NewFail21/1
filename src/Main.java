import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.sql.SQLXML;

public class Main {

    public static void quickSort(int[] a, int low, int high) {
        if (a.length == 0)
            return; //завершение выполнение алгоритма, если длина массива равна 0

        if (low >= high)
            return; //завершение выполнение алгоритма, если уже нечего делить

        // выбор опорного элемента
        int middle = low + (high - low) / 2;
        int op = a[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (a[i] < op) {
                i++;
            }
            while (a[j] > op) {
                j--;
            }

            if (i <= j) { //меняем элементы местами
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(a, low, j);

        if (high > i)
            quickSort(a, i, high);
    }
    public static void main(String[] args) {
        int arr[] = new int[]{7,1,0,3,5,61,6,16,6,1,-61,6,61,61,6,6,16,1,7,6,9,4,23,745,5446,2,2,36};

        quickSort(arr, 0, arr.length - 1);

        for(int i = 0; i < arr.length; i++) System.out.println(arr[i]);
    }
}
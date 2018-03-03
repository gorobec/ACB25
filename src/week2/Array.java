package week2;

import java.util.Arrays;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class Array {
    public static void main(String[] args) {
        char[] array = new char[10];


        array[0] = 'A';
        array[1] = 'b';
        array[9] = 'Z';
//        array[10] = '8';

        int[] arr = {1, 5, 89, -8, 7};


        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);

//        String asString = Arrays.toString(arr);
        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }

    int[] arr2 = null;

        if(arr2 != null) {
            arr2[0] = 5;
        }
    }
}

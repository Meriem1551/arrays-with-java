package org.arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.println(Arrays.toString(numbers));// because if I just display the numbers array it displays an address of it in memory
        int [] numbers2 = {1, 5, 2, 4, 8};
        System.out.println(numbers2.length);
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));

        //MULTI-DIMENSIONAL ARRAYS:
        int[][] mulDimArray = new int[2][3];//2 lines & 3 lines
        mulDimArray[0][0] = 45;
        mulDimArray[0][1] = 90;
        System.out.println(Arrays.deepToString(mulDimArray));
        // to create 3d array int[][][] and so on
        int[][] mulDimArray2 = {{1, 4, 8}, {45, 34, 8}};
        //or if you want to change an existing array;
        mulDimArray =new int[][]{ {1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(mulDimArray));
    }
}
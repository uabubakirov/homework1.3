package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] digits = {1.1, 15.2, -15.4, 23.5, 45.6, -54.5, 22.2, -9.5, -2.5, 4.6, 5.6, 2.4, 7.2, -24.5, 9.2};
        double result = 0;
        int possitiveNum = 0;
        boolean isNegative = false;
        for (double inDigits : digits) {
         if (inDigits < 0){
               isNegative = true;
           }else if (isNegative){
               result += inDigits;
               possitiveNum++;
           }
       }

       System.out.println(result/possitiveNum);

        System.out.println("***************************************************************************************************");

        int [] numbers = {8, 6, 3, 2, -2, -4};

        boolean isSorted = false;
        int sort;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < numbers.length-1; i++) {
                if(numbers[i] > numbers[i+1]){
                    isSorted = false;

                    sort = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = sort;
                    System.out.println(Arrays.toString(numbers));
                }

            }
        }

    }

}

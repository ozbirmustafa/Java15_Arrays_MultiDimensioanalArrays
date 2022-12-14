package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        //size verilen poz ve neg sayılar içeren bir int arraydeki " en büyük negatif " ve " en küçük pozitif" elemanı bulunuz.

        int arr [] = {-12, 18, -5 , 0 , 23 , -2};
        Arrays.sort(arr);
        int maxNegative = arr[0];
        int minPositive = arr[arr.length-1];

        for (int w: arr) {
            if (w<0){
                maxNegative = Math.max(maxNegative,w);
            }
            if (w>0){
                minPositive = Math.min(minPositive,w);
            }
        }
        System.out.println(maxNegative + " and " + minPositive);








    }

}

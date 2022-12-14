package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays02 {
    public static void main(String[] args) {

        //Multidimensional Array oluşturmanın kısa yolu

        char arr [][] ={{'a','b'},{'C','D','E'},{'?'}};
        System.out.println(Arrays.deepToString(arr));

        //Bir string multidimensional arrayde içinde "a" olan elemanları console a yazdırınız.

        String brr[][] = { {"learn", "java", "it"}, {"is", "easy"} };

        for (String [] w : brr ) {

            for (String k : w){
                if (k.contains("a")){
                    System.out.print(k + " ");
                }
            }

        }








    }
}

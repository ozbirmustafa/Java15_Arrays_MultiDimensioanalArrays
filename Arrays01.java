package day15arraysmultidimensionalarrays;

import java.lang.ref.SoftReference;
import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        //binarySearch() Method : bir elamanın arrayde olup olmadığını anlarız.
        //binarySearch() Methodunu kullanmdan önce mutlaka Arrays.sort() kullanılmalıdır.
        //binarySearch() Methodu aradığımız eleman Arrayde varsa o elemanın index ini return eder.
        //Aradığımız eleman Arrayde yoksa "-a" şeklinde bir negatif sayi alırız.
        //negatif in anlamı bu eleman Arrayde yok demektir. "a" nın anlamı olsaydı kaçıncı sırada (indexte DEĞİL) var olurdu.
        //binarySearch() Methodu tekrarlayan elemanlar için kullanılmaz.


        int arr [] = {12, 31 ,43, 14};

        int sayi = 43;

        Arrays.sort(arr);

        int idx1 = Arrays.binarySearch(arr,sayi);
        System.out.println(idx1);//3(index no)

        int sayi2 = 17;
        int sonuc = Arrays.binarySearch(arr,sayi2);
        System.out.println(sonuc);// -5 ===> '-' eleman yok.
                                  // Olsaydı hangi sırada (indexte DEĞİL) var olurdu.












    }
}

package day01;

import java.util.Arrays;
import java.util.Scanner;

public class P01_Array {
// kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini
//kullanicidan alan ve girilen array elemanlarinin en buyuk ile en kucuk
//elemaninin arasinki farki gosteren java programi yazin

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Array de olmasını istediğimiz elaman sayısını giriniz ");
        int sayi = scanner.nextInt();

        int arr [] =new int[sayi];

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+1+". elemanı giriniz " );
            int sayi2= scanner.nextInt();
            arr[i]= sayi2;

        }

        Arrays.sort(arr); // oluşan array in sıralama da olmama ihtimaline binane naturel sıralama yaptık
        int arrMax = arr[arr.length-1];
        int arrMin = arr[0];
        System.out.println("Arraydekin En Büyük Eleman: "+arrMax+
                "\nArraydekin En Küçük Eleman: "+arrMin+
                "\nAralarındaki fark: "+(arrMax-arrMin));

        }
    }


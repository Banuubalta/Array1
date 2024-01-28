package day01;

import java.util.Arrays;

public class P04_Array {

    /*
     * $ ve £ isareti olanlarin toplamlarini ayri ayri bulun
     *
     * String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
     */
    public static void main(String[] args) {

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 " ;
        String arr[] = str.split(" ");
       // System.out.println(Arrays.toString(arr)); hepsini yazdır dediğinde bu metodu kullanıyoruz

        int toplamDolar =0;
        int toplamPound =0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i].contains("$")){
                toplamDolar+=(Integer.parseInt(arr[i].replace("$" , "")));
            }else {
                toplamPound+=(Integer.parseInt(arr[i].replace("£" , "")));

            }
        }


        System.out.println("Dolar toplamı : " +toplamDolar+"$");
        System.out.println( "Paunt toplamı :" +toplamPound+"£");




    }

}

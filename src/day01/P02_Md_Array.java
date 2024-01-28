package day01;

import java.util.Arrays;

public class P02_Md_Array {
    public static void main(String[] args) {
// multidimensional arrayin iç array lerindeki tüm elemanların toplamını birer
// birer bulan
// ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana
// yazdıran programı yaziniz.
// input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}


        int mdaerr [][] = {{10,5,35}, {7,13},{12,48,50}};
        int output []=new int[mdaerr.length];
        for (int i = 0; i <mdaerr.length ; i++) {
            for (int j = 0 ; j < mdaerr[i].length;j++){
                output[i]= mdaerr[i][i];

        }
            System.out.println(Arrays.toString(output));
        }

        System.out.println(Arrays.toString(output));






    }
}

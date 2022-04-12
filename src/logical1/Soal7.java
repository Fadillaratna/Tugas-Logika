package logical1;

import java.util.Arrays;
import java.util.Scanner;

public class Soal7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int index, arr[], i, nilai, l, result = 0;

        String desc = "TODAK ADA";

        System.out.println("========== Menentukan Bilangan Maksimum Chapter 2 ==========\n");

        System.out.print("Inputkan jumlah index : ");
        index = scan.nextInt();
        arr = new int[index];

        System.out.println("\nMasukkan " + index + " angka");
        for (i = 0; i < index; i++) {
            System.out.print("Elemen[" + (i) + "]             : ");
            arr[i] = scan.nextInt();
        }

        for (i = 0; i < index; i++) {
            for (l = i + 1; l < index; l++) {
                if (arr[i] == arr[l]) {
                    result++;
                }

            }
        }

        if (result > 0) {
            desc = "ADA";
        }

        String arrValue = Arrays.toString(arr);
        System.out.println("\nArray yang dimasukkan adalah " + arrValue);
        System.out.println("Apakah mungkin? " + desc);
     
    }

}

package logical1;

import java.util.Arrays;
import java.util.Scanner;

public class Soal5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max, index, arr[], i, locIndex;

        locIndex = 1;

        System.out.println("========== Menentukan Bilangan Maksimum Chapter 2 ==========\n");

        System.out.print("Inputkan jumlah index : ");
        index = scan.nextInt();
        arr = new int[index];

        System.out.println("\nMasukkan " + index + " angka");
        for (i = 0; i < index; i++) {
            System.out.print("Elemen[" + (i) + "]             : ");
            arr[i] = scan.nextInt();
        }
        
        max = arr[0];
        for(i = 0; i < index; i++){
            if(arr[i] > max){
                max = arr[i];
                locIndex = i;
            }
        }
        
        String arrValue = Arrays.toString(arr);
        System.out.println("\nArray yang dimasukkan adalah " + arrValue);
        System.out.println("Bilangan maksimum adalah " + max + " berada di index ke " + locIndex);
    }

}

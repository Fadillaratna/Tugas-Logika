package logical1;

import java.util.Arrays;
import java.util.Scanner;

public class Soal4 {

    public static void main(String[] args) {
        int i, index, num[];
        String arr [];
        Scanner scan = new Scanner(System.in);

        System.out.println("========== Menentukan Bilangan Ganjil/Genap Chapter 2\n");

        System.out.print("Inputkan jumlah index : " );
        index = scan.nextInt();
        num = new int[index];
        arr = new String[index];

        System.out.println("\nMasukkan " + index + " angka");
        for (i = 0; i < index; i++) {
            System.out.print("Elemen[" + (i) + "]             : ");
            num[i] = scan.nextInt();
        }
        
        String arrValue = Arrays.toString(num);
        System.out.println("\nArray yang dimasukkan adalah " + arrValue);
        
        for(i = 0; i < index; i++){
            if(num[i] % 2 == 0){
                arr[i] = "genap";
            }else{
                arr[i] = "ganjil";
            }
            
        }
        String arrDesc = Arrays.toString(arr);
        System.out.println("Hasil = " + arrDesc);
    }

}

package logical1;
import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num;
        String desc = null;
        
        System.out.println("============== Menentukan Bilangan Ganjil/Genap ==============\n");
        
        System.out.print("Silahkan Inputkan Bolangan : ");
        num = scan.nextInt();
        
        if(num % 2 == 0){
            desc = "genap";
        }else{
            desc = "ganjil";
        }
        
        System.out.println("\nBilangan " + num + " adalah bilangan " + desc);
    }
    
}

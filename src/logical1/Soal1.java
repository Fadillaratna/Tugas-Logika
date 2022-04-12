package logical1;
import java.util.Scanner;

public class Soal1 {

    public static void main(String[] args) {
        int num1, num2, num3, biggestNumber;
        Scanner scan = new Scanner(System.in);
        
        biggestNumber = 0;
        
        System.out.println("=========== Menentukan Bilangan Terbesar ===========\n");
        
        System.out.println("Silahkan Inputkan Bilangan\n");
        
        System.out.print("Bilangan 1 : ");
        num1 = scan.nextInt();
        
        System.out.print("\nBilangan 2 : ");
        num2 = scan.nextInt();
        
        System.out.print("\nBilangan 3 : ");
        num3 = scan.nextInt();
        
        if(num1 > num2 && num1 > num3){
            biggestNumber = num1;
        }else if(num2 > num3){
            biggestNumber = num2;
        }else if(num3 > num2){
            biggestNumber = num3;
        }
        
        System.out.println("\nBilangan yang terbesar adalah " + biggestNumber);
    }
    
    
}

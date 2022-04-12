package logical1;
import java.util.Scanner;

public class Soal3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num,  sum;
        sum = 0;
      
        
        System.out.println("========= Menghitung Total Penjumlahan 1-N\n");
        
        System.out.print("Silahkan inputkan bilangan : " );
        num = scan.nextInt();
        
         for (int i=1; i<=num; i++){
            sum += i;
            if(i <num){
                System.out.print(i + " + ");
            }else if(i == num){
                System.out.print(i);
            }
         }
     
        System.out.println("\nTotal Penjumlahan = " + sum);
        
    }
    
}

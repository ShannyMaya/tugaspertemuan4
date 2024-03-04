import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println ("Masukkan nilai n : ");
        int n = scanner.nextInt();
        
        
        if (n >= 1){
            for(int i = 1; i <= n; i++){
                System.out.println(i);
            }
        }else{
            System.out.println ("Out");
        }
        scanner.close();
    }
    
}

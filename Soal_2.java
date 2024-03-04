import java.util.Scanner;

public class Perulangan_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan batas awal : ");
        int a = scanner.nextInt();
        
        System.out.println("Masukkan batas akhir : ");
        int b = scanner.nextInt();
        
        int hitungGanjil = 0;
        
        System.out.println ("Bilangan ganjil antara " + a + "dan" + b + ":");
        
        for (int i = a; i <= b; i++) {
            hitungGanjil += (i % 2 != 0) ? 1 : 0;
            System.out.println((i % 2 != 0) ? i : "");
        }
        
        System.out.println("Jumlah bilangan ganjil: " + hitungGanjil);
        
        scanner.close();
    }
}

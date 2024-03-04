import java.util.Scanner;

public class Perulangan_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();

        int faktor = 1;

        System.out.print(n + "! = ");

        for (int i = n; i > 0; i--) {
            faktor *= i;
            System.out.print(i + ((i > 1) ? " * " : ""));
        }

        System.out.println(" = " + faktor);

        scanner.close();
    }
}

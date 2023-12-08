package P14.Rekursif.src;
import java.util.Scanner;

public class Tugas1_07 {
    public static void main(String[] args) {
        Scanner ayleen07 = new Scanner(System.in);
        int bilangan;

        System.out.print("Masukkan bilangan N (akhir) : ");
        bilangan = ayleen07.nextInt();

        System.out.println("Fungsi Rekursif : ");
        rekursif(bilangan);

        System.out.println();

        System.out.println("Fungsi Iteratif : ");
        iteratif(bilangan);
    }
    static void rekursif(int n) {
        if (n == 0) {
            System.out.println(0);
        } else {
            System.out.print(n + ", ");
            rekursif(n - 1);
        }
    }
    static void iteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

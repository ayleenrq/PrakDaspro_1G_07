package P14.Rekursif.src;
import java.util.Scanner;

public class Tugas2_07 {
    public static void main(String[] args) {
        Scanner ayleen07 = new Scanner(System.in);
        int n, hasilRekursif;

        System.out.println("Bilangan penjumlahan 1 - N");
        System.out.print("Masukkan N (bilangan akhir) : ");
        n = ayleen07.nextInt();

        hasilRekursif = rekursif(1, n);

        System.out.println(" = " +(hasilRekursif));
    }
    static int rekursif(int x, int y) {
        if (x == y) {
            System.out.print(x);
            return (x);
        } else {
            System.out.print(x + " + ");
            return x + rekursif(x + 1, y);
        }
    }
}

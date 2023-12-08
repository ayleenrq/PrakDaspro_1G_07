package P14.Rekursif.src;
import java.util.Scanner;

public class Tugas3_07 {
    public static void main(String[] args) {
        Scanner ayleen07 = new Scanner(System.in);
        int n;

        System.out.println("Bilangan prima atau bukan?");
        System.out.print("Masukkan bilangan : ");
        n = ayleen07.nextInt();

        if (cekPrima(n, n / 2)) {
            System.out.println(n + " adalah bilangan prima");
        } else {
            System.out.println(n + " bukan bilangan prima");
        }
    }
    static boolean cekPrima(int n, int i) {
        if (i <= 1) {
            return true;
        } else {
            if (n % i == 0) {
                return false;
            } else {
                return cekPrima(n, i - 1);
            }
        }
    }
}

package P14.Rekursif.src;
import java.util.Scanner;

public class Percobaan2_07 {
    public static void main(String[] args) {
        Scanner ayleen07 = new Scanner(System.in);

        int bilangan, pangkat;

        System.out.print("Bilangan yang dihitung : ");
        bilangan = ayleen07.nextInt();
        System.out.print("Pangkat : ");
        pangkat = ayleen07.nextInt();

        System.out.println(hitungPangkat(bilangan, pangkat));
    }
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return (1);
        } else {
            return (x * hitungPangkat(x, y - 1));
        }
    }
}

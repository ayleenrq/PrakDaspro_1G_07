package P4;
import java.util.Scanner;

public class Lingkaran07 {
    public static void main(String[] args) {
        Scanner sc07 =new Scanner(System.in);

        int r;
        double keliling, luas, phi = 3.14;

        System.out.println("Masukkan jari-jari lingkaran: ");
        r=sc07.nextInt();

        keliling = 2*phi*r;
        luas = phi*r*r;

        System.out.println("Keliling Lingkaran: " + keliling);
        System.out.println("Luas Lingkaran: " + luas);
    }
}

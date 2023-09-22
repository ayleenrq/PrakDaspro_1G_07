package P4;
import java.util.Scanner;

public class Lingkaran07 {
    public static void main(String[] args) {
        Scanner sc07 =new Scanner(System.in);

        int r;
        double keliling, luas;

        System.out.println("Masukkan jari-jari lingkaran: ");
        r=sc07.nextInt();

        keliling = 2*3.14*r;
        luas = 3.14*r*r;

        System.out.println("Keliling Lingkaran: " + keliling);
        System.out.println("Luas Lingkaran: " + luas);
    }
}

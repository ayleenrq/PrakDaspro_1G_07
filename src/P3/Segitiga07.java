package P3;
import java.util.Scanner;

public class Segitiga07 {
    public static void main(String[] args) {
        Scanner sc07 =new Scanner(System.in);

        int alas, tinggi;
        float luas;

        System.out.print("Masukkan alas:");
        alas = sc07.nextInt();

        System.out.print("Masukkan tinggi: ");
        tinggi = sc07.nextInt();

        luas = alas * tinggi / 2;

        System.out.println("Luas segitiga: " + luas);
    }
}

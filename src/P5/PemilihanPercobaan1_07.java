package P5;
import java.util.Scanner;

public class PemilihanPercobaan1_07 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);

        System.out.print("Masukkan Angka: ");
        int angka = input07.nextInt();

        String jenisAngka = (angka % 2 == 0) ? "genap" : "ganjil" ;
        System.out.println("Angka " +angka+ " bilangan " +jenisAngka);
    }
}

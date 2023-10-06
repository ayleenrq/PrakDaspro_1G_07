package P5;
import java.util.Scanner;

public class PemilihanPercobaan1_07 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);

        int angka;

        System.out.print("Masukkan Angka: ");
        angka = input07.nextInt();

        if (angka % 2 == 0)
            System.out.println("Angka " +angka+ " bilangan genap");
            
        else
            System.out.println("Angka " +angka+ " bilangan ganjil");
    }
}

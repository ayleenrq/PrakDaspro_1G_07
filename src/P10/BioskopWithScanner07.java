package P10;
import java.util.Scanner;

public class BioskopWithScanner07 {
    public static void main(String[] args) {
        Scanner ayleen07 = new Scanner(System.in);

        String nama, next;
        int baris, kolom;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukkan nama : ");
            nama = ayleen07.nextLine();

            System.out.print("Masukkan baris : ");
            baris = ayleen07.nextInt();

            System.out.print("Masukkan kolom : ");
            kolom = ayleen07.nextInt();
            ayleen07.nextLine();

            penonton[baris -1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n) : ");
            next = ayleen07.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }    
}

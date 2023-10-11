package P6;
import java.util.Scanner;

public class Pemilihan2Percobaan2_07 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);

        System.out.print("Masukkan Sudut 1: ");
        float sudut1 = input07.nextFloat();

        System.out.print("Masukkan Sudut 2: ");
        float sudut2 = input07.nextFloat();

        System.out.print("Masukkan Sudut 3: ");
        float sudut3 = input07.nextFloat();

        float totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) {
                if ((sudut1 == sudut2) || (sudut1 == sudut3) || (sudut2 == sudut3)) {
                    System.out.println("Segitiga Siku-Siku dan Sama Kaki");
                } else
                    System.out.println("Segitiga Siku-Siku");
            }
            else if ((sudut1 == sudut2) && (sudut2 == sudut3)) {
                System.out.println("Segitiga Sama Sisi");
            }
            else if ((sudut1 == sudut2) || (sudut1 == sudut3) || (sudut2 == sudut3)) {
                System.out.println("Segitiga Sama Kaki");
            }
            else
                System.out.println("Segitiga Sembarang");
        } else
            System.out.println("Bukan Segitiga");
    }
}
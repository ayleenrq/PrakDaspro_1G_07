package P11;
import java.util.Scanner;

public class Tugas1_07 {
    public static void main(String[] args) {
        Scanner ayleen07 = new Scanner(System.in);

        System.out.print("Masukkan nilai N (minimal 3) : ");
        int N = ayleen07.nextInt();

        if (N >= 3) {
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N - i; j++) {
                System.out.print(" "); 
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print(k);
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Nilai tidak valid! (minimal 3)");
        }
    }
}

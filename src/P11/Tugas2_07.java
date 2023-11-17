package P11;
import java.util.Scanner;

public class Tugas2_07 {
    public static void main(String[] args) {
        Scanner ayleen07 = new Scanner(System.in);

        System.out.print("Masukkan nilai N (minimal 3) : ");
        int N = ayleen07.nextInt();

        if (N >= 3) {
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N ; j++) {
                    if ((i == 1) || (i == N) || (j == 1) || (j == N)) {
                        System.out.print(N + " ");
                    } else {
                        System.out.print("  ");
                    }
                } System.out.println();
            }
        }
        else {
            System.out.println("Nilai tidak valid! (minimal 3)");
        }
    }
}

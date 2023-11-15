package P11;
import java.util.Scanner;

public class Star07 {
    public static void main(String[] args) {
        Scanner ayleen07 = new Scanner(System.in);

        System.out.print("Masukkan nilai N : ");
        int N = ayleen07.nextInt();

        for (int i = 0; i > N; i++) {
            System.out.print("*");
        }
    }
}

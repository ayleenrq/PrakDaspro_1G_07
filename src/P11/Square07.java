package P11;
import java.util.Scanner;

public class Square07 {
    public static void main(String[] args) {
        Scanner ayleen07 = new Scanner(System.in);

        System.out.print("Masukkan nilai N : ");
        int nilai = ayleen07.nextInt();

        for (int i = 1; i <= nilai; i++) {
            for (int j = 0; j <= nilai; j++) {
                System.out.print("*");
            }
        }
    }
}

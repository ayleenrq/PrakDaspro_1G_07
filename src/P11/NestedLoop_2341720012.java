package P11;
import java.util.Scanner;

public class NestedLoop_2341720012 {
    public static void main(String[] args) {
        Scanner ayleen07 = new Scanner(System.in);
        int[][] array = new int[5][7];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Kota ke-" + (i+1));
            for (int j = 0; j < array[0].length; j++) {
                System.out.print("Hari ke-" + (j+1) + " : ");
                array[i][j] = ayleen07.nextInt();
            }
            System.out.println();
        }
        int i = 0;
        for (int baris[] : array) {
            System.out.print("Kota ke-" + (i+1) + " : ");
            for (int kolom : baris) {
                System.out.print(kolom + " ");
            }
            System.out.println();
            i++;
        }
    }
}

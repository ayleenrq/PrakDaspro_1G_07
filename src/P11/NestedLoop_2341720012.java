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
        for (int i = 0; i < array.length; i++) {
            System.out.print("Kota ke-" + (i+1) + " : ");
            int total = 0;
            for (int j = 0; j < array[0].length; j++) {
                total += array[i][j];
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
            double rataRata = (double) total / array[0].length;
            System.out.println("Rata-rata Kota ke-" + (i+1) + " : " + rataRata);
        }
    }
}

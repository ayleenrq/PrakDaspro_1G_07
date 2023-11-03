package P9;
import java.util.Scanner;

public class ArrayRataNilai07 {
    public static void main(String[] args) {
        Scanner ayleen07 = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        int banyakLulus = 0;
        double total = 0;
        double rata2;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = ayleen07.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }

        for  (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                banyakLulus++;
            }
        }

        System.out.println("Banyaknya mahasiswa yang lulus adalah " + banyakLulus);

        rata2 = total / nilaiMhs.length;
        System.out.println("Rata - rata nilai = " + rata2);
    }
}

package P9;
import java.util.Scanner;

public class Tugas07 {
    public static void main(String[] args) {
        Scanner ayleen07 = new Scanner(System.in);

        int[] nilai;
        int jumlah = 0, banyakElemen = 0;
        double rata2 = 0;

        System.out.print("Masukkan jumlah elemen : ");
        banyakElemen = ayleen07.nextInt();
        nilai = new int[banyakElemen];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan elemen array ke-" + (i+1) + " : ");
            nilai[i] = ayleen07.nextInt();
        }

        int nilaiTinggi = nilai[0];
        int nilaiRendah = nilai[0];

        for (int i = 0; i < nilai.length; i++ ) {
            jumlah += nilai[i];

            if (nilai[i] > nilaiTinggi) {
                nilaiTinggi = nilai[i];
            }
            else if (nilai[i] < nilaiRendah) {
                nilaiRendah = nilai[i] ;
            }
        }
        rata2 = (double) jumlah / nilai.length;

        System.out.println("Nilai tertinggi : " + nilaiTinggi);
        System.out.println("Nilai terendah : " + nilaiRendah);
        System.out.println("Nilai rata-rata : " + rata2);
    }
}
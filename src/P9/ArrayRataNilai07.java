package P9;
import java.util.Scanner;
public class ArrayRataNilai07 {
    public static void main(String[] args) {
        Scanner ayleen07 = new Scanner(System.in);

        int[] nilaiMhs;
        int jumlahMahasiswa, banyakLulus = 0, banyakTidakLulus = 0;
        double totalLulus = 0, totalTdkLulus = 0;
        double rataLulus=0, rataTdkLulus=0;

        System.out.print("Masukkan jumlah mahasiswa : ");
        jumlahMahasiswa = ayleen07.nextInt();
        nilaiMhs = new int[jumlahMahasiswa];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = ayleen07.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                banyakLulus++;
            } else {
                totalTdkLulus += nilaiMhs[i];
                banyakTidakLulus++;
            }
        }
        rataLulus = totalLulus / banyakLulus;
        rataTdkLulus = totalTdkLulus / banyakTidakLulus;
    
        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTdkLulus);
    }
}

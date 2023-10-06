package P5;
import java.util.Scanner;

public class PemilihanPercobaan2_07 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);

        float uas, uts, kuis, tugas, total;
        String hasil;
        int nilai;

        System.out.print("Masukkan Nilai UAS   : ");
        uas = input07.nextFloat();

        System.out.print("Masukkan Nilai UTS   : ");
        uts = input07.nextFloat();

        System.out.print("Masukkan Nilai Kuis  : ");
        kuis = input07.nextFloat();

        System.out.print("Masukkan Nilai Tugas : ");
        tugas = input07.nextFloat();

        total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        hasil = (total < 65) ? "remidi" : "tidak remidi";
        System.out.println("Nilai Akhir : " +total+ " sehingga anda " +hasil);
        
        nilai=(int)total;
        if (nilai > 80 && nilai <= 100){
            System.out.println("Nilai anda A setara IPK 4 dengan Kualifikasi Sangat Baik");
        }
        else if (nilai > 73 && nilai <= 80){
            System.out.println("Nilai anda B+ setara IPK 3.5 dengan Kualifikasi Lebih dari Baik");
        }
        else if (nilai > 65 && nilai <= 73){
            System.out.println("Nilai anda B setara IPK 3 dengan Kualifikasi Baik");
        }
        else if (nilai > 60 && nilai <= 65){
            System.out.println("Nilai anda C+ setara IPK 2,5 dengan Kualifikasi Lebih dari Cukup");
        }
        else if (nilai > 50 && nilai <= 60){
            System.out.println("Nilai anda C setara IPK 2 dengan Kualifikasi Cukup");
        }
        else if (nilai > 39 && nilai <= 50){
            System.out.println("Nilai anda D setara IPK 1 dengan Kualifikasi Kurang");
        }
        else {
            System.out.println("Nilai anda E setara IPK 0 dengan Kualifikasi Gagal");
        }
    }
}

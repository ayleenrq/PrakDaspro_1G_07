package P5;
import java.util.Scanner;

public class PemilihanPercobaan2_07 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);

        float uas, uts, kuis, tugas, total;
        String nilaiAkhir;

        System.out.print("Masukkan Nilai UAS   : ");
        uas = input07.nextFloat();

        System.out.print("Masukkan Nilai UTS   : ");
        uts = input07.nextFloat();

        System.out.print("Masukkan Nilai Kuis  : ");
        kuis = input07.nextFloat();

        System.out.print("Masukkan Nilai Tugas : ");
        tugas = input07.nextFloat();

        total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        nilaiAkhir = (total < 65) ? "remidi" : "tidak remidi";
        System.out.println("Nilai Akhir : " +total+ " sehingga anda " +nilaiAkhir);
    }
}

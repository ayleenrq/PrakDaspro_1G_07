package P14.Rekursif.src;
import java.util.Scanner;

public class Percobaan3_07 {
    public static void main(String[] args) {
        Scanner ayleen07 = new Scanner(System.in);
        double saldoAwal;
        int tahun;

        System.out.print("Jumlah saldo awal : ");
        saldoAwal = ayleen07.nextDouble();

        System.out.print("Lamanya investasi (tahun) : ");
        tahun = ayleen07.nextInt();

        System.out.print("Jumlah saldo setelah " + tahun + " tahun : ");
        System.out.println(hitungLaba(saldoAwal, tahun));
    }
    static double hitungLaba(double saldo, int tahun) {
        if (tahun == 0) {
            return (saldo);
        } else {
            return (1.11 * hitungLaba(saldo, tahun - 1));
        }
    }
}

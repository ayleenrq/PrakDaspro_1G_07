package P14.Rekursif.src;
import java.util.Scanner;

public class Tugas4_07 {
    public static void main(String[] args) {
        Scanner ayleen07 = new Scanner(System.in);
        int bulan, jumlahMarmut;

        System.out.print("Masukkan bulan ke berapa: ");
        bulan = ayleen07.nextInt();
        jumlahMarmut = hitungMarmut(bulan);

        System.out.println("Jumlah pasangan marmut pada bulan ke-" + bulan + " adalah: " + jumlahMarmut);
    }
    
    static int hitungMarmut(int bulan) {
        if (bulan <= 1) 
            return bulan;
        else
            return hitungMarmut(bulan-2) + hitungMarmut(bulan-1);
    }
}

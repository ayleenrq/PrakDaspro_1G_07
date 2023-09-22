package P4;
import java.util.Scanner;

public class HargaBayar07 {
    public static void main(String[] args) {
        Scanner sc07 =new Scanner(System.in);

        int harga, jumlah;
        double total, bayar, jmlDis, dis = 0.1;

        System.out.println("Masukkan harga barang yang dibeli: ");
        harga=sc07.nextInt();

        System.out.println("Masukkan jumlah barang yang dibeli: ");
        jumlah=sc07.nextInt();

        total = harga * jumlah;
        jmlDis = total * dis;
        bayar = total - jmlDis;

        System.out.println("Diskon yang anda dapatkan adalah: " + jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah: " + bayar);
    }
}

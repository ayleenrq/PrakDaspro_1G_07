package P4;
import java.util.Scanner;

public class HargaBayar07 {
    public static void main(String[] args) {
        Scanner sc07 =new Scanner(System.in);

        String merkBuku;
        int harga, jumlah, jmlHalBuku, dis;
        double total, bayar, jmlDis;

        System.out.println("Masukkan Merk Buku: ");
        merkBuku=sc07.nextLine();

        System.out.println("Masukkan Jumlah Halaman Buku: ");
        jmlHalBuku=sc07.nextInt();

        System.out.println("Masukkan harga barang yang dibeli: ");
        harga=sc07.nextInt();

        System.out.println("Masukkan jumlah barang yang dibeli: ");
        jumlah=sc07.nextInt();

        System.out.println("Masukkan jumlah diskon: ");
        dis=sc07.nextInt();
        
        total = harga * jumlah;
        jmlDis = total * (dis/100);
        bayar = total - jmlDis;

        System.out.println("Diskon yang anda dapatkan adalah: " + jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah: " + bayar);
    }
}

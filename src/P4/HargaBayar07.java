package P4;
import java.util.Scanner;

public class HargaBayar07 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        String merkBuku;
        int harga, jumlah, jmlHalBuku;
        double total, bayar, dis, jmlDis;

        System.out.println("Masukkan Merk Buku: ");
        merkBuku=input.nextLine();

        System.out.println("Masukkan Jumlah Halaman Buku: ");
        jmlHalBuku=input.nextInt();

        System.out.println("Masukkan harga barang yang dibeli: ");
        harga=input.nextInt();

        System.out.println("Masukkan jumlah barang yang dibeli: ");
        jumlah=input.nextInt();

        System.out.println("Masukkan jumlah diskon: ");
        dis=input.nextInt();

        total = harga * jumlah;
        jmlDis = total * (dis/100);
        bayar = total - jmlDis;
        
        System.out.println("Diskon yang anda dapatkan adalah: " + jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah: " + bayar);
        input.close();
    }
}

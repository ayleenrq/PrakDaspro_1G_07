package P4;
import java.util.Scanner;

public class Gaji07 {
    public static void main(String[] args) {
        Scanner sc07 =new Scanner(System.in);

        int jmlMasuk, JmlTdkMasuk, TotGaji, gaji, potGaji;

        System.out.println("Masukkan besaran gaji: ");
        gaji=sc07.nextInt();

        System.out.println("Masukkan potongan gaji: ");
        potGaji=sc07.nextInt();

        System.out.println("Jumlah Hari Masuk Kerja: ");
        jmlMasuk=sc07.nextInt();

        System.out.println("Jumlah Hari Tidak Masuk Kerja: ");
        JmlTdkMasuk=sc07.nextInt();

        TotGaji = (jmlMasuk * gaji) - (JmlTdkMasuk * potGaji);

        System.out.println("Gaji yang diterima: " + TotGaji);
    }    
}

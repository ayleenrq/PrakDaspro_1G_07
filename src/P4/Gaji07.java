package P4;
import java.util.Scanner;

public class Gaji07 {
    public static void main(String[] args) {
        Scanner sc07 =new Scanner(System.in);

        int jmlMasuk, JmlTdkMasuk, TotGaji;
        int gaji = 40000, potGaji = 25000;

        System.out.println("Jumlah Hari Masuk Kerja: ");
        jmlMasuk=sc07.nextInt();

        System.out.println("Jumlah Hari Tidak Masuk Kerja: ");
        JmlTdkMasuk=sc07.nextInt();

        TotGaji = (jmlMasuk * gaji) - (JmlTdkMasuk * potGaji);

        System.out.println("Gaji yang diterima: " + TotGaji);
    }    
}

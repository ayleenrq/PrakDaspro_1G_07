package P7;
import java.util.Scanner;

public class DoWhileCuti07 {
    public static void main(String[] args) {
        Scanner sc07 = new Scanner(System.in);

        String konfirmasi;
        int jatahCuti, jumlahHari;

        System.out.print("Jatah cuti: ");
        jatahCuti = sc07.nextInt();

        do {
            System.out.print("Apakah anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc07.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jumlahHari = sc07.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                }
                else {
                    System.out.println("Sisa jatah cuti anda tidak mencukupi");
                    continue;
                }
            } else if (konfirmasi.equals("t")) {
                break;
            }
        } while (jatahCuti > 0);
    }    
}

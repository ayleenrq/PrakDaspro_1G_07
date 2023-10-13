package P7;
import java.util. Scanner;

public class WhileGaji07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur = 0, totalGajiLembur = 0;
        String jabatan;
        jabatan= "Direktur";
        jabatan= "Manager"; 
        jabatan= "karyawan";

        System.out.print("Masukkan jumlah karyawan: ");
        jumlahKaryawan = scan.nextInt();

        int i = 0;
        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manager, Karyawan");
            System.out.print("Masukkan jabatan karyawan ke-" + (i+1) + ": ");
            jabatan = scan.next();

            System.out.print("Masukkan jumlah jam lembur: ");
            jumlahJamLembur = scan.nextInt();

            if (jabatan.equalsIgnoreCase("Direktur")) {
                continue;
            }
            else if (jabatan.equalsIgnoreCase("Manager")) {
                gajiLembur = jumlahJamLembur * 100000;
            }
            else if (jabatan.equalsIgnoreCase("Karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            }
            totalGajiLembur += gajiLembur;
            i++;
        }
        System.out.println("Total gaji lembur: " + totalGajiLembur); 
        scan.close();
    }
}

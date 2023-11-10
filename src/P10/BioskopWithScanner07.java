package P10;
import java.util.Scanner;

public class BioskopWithScanner07 {
    public static void main(String[] args) {
        Scanner ayleen07 = new Scanner(System.in);

        String nama, next, menu;
        int baris, kolom;
        String[][] penonton = new String[5][5];
        boolean exit = false;

        do {
            System.out.println("Menu 1: Input data penonton");
            System.out.println("Menu 2: Tampilkan daftar penonton");
            System.out.println("Menu 3: Exit");
            System.out.print("Masukkan Menu (1/2/3) : ");
            menu = ayleen07.nextLine();

            switch (menu) {
                case "1":
                while (true) {
                    System.out.print("Masukkan nama : ");
                    nama = ayleen07.nextLine();
                    System.out.print("Masukkan baris : ");
                    baris = ayleen07.nextInt();
                    System.out.print("Masukkan kolom : ");
                    kolom = ayleen07.nextInt();
                    ayleen07.nextLine();

                    if ((baris <= penonton.length) && (kolom <= penonton[baris-1].length)) {
                        penonton[baris -1][kolom-1] = nama;
                        System.out.println("Data berhasil di inputkan");
                    } else {
                        System.out.println("Pilihan kursi tidak tersedia, silahkan pilih ulang!");
                    }
    
                    System.out.print("Input penonton lainnya? (y/n) : ");
                    next = ayleen07.nextLine();
        
                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }
                break;
                case "2":
                    for (int i = 0; i < penonton.length; i++) {
                        System.out.println("Penonton pada baris ke-" + (i+1) + " : " + String.join(", ", penonton[i]));
                    }
                break;
                case "3":
                    exit = true;
                break;
                default:
                    System.out.println("Pilihan tidak valid!");
                break;
            }
        } while (exit != true);
    }    
}
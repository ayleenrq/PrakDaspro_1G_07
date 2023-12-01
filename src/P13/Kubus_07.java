package P13;

import java.util.Scanner;

public class Kubus_07 {
    public static void main(String[] args) {
        Scanner ayleen07 = new Scanner(System.in);
        int[][] nilaiTugas = {
            {20, 19, 25, 20, 10, 0, 10},
            {30, 30, 40, 10, 15, 20, 25},
            {5, 0, 20, 25, 10, 5, 45},
            {50, 0, 7, 8, 0, 30, 60},
            {15, 10, 16, 15, 10, 10, 5}
        };

        String[] namaMahasiswa = {"Sari  ", "Rina  ", "Yani  ", "Dwi   ", "Lusi  "};

        boolean exit = false;

        do {
            System.out.println("==========================================");
            System.out.println("| Menu 1: Input nilai mahasiswa          |");
            System.out.println("| Menu 2: Tampilkan data mahasiswa       |");
            System.out.println("| Menu 3: Tampilkan Mahasiswa tertinggi  |");
            System.out.println("| Menu 4: Exit                           |");
            System.out.println("==========================================");
            System.out.print("| Masukkan Menu (1/2/3) : ");
            String menu = ayleen07.nextLine();
            System.out.println("==========================================");

            switch (menu) {
                case "1":
                    System.out.print("Masukkan jumlah mahasiswa: ");
                    int jumlahMahasiswa = ayleen07.nextInt();
                    System.out.print("Masukkan jumlah tugas: ");
                    int jumlahTugas = ayleen07.nextInt();

                    nilaiTugas = new int[jumlahMahasiswa][jumlahTugas];
                    namaMahasiswa = new String[jumlahMahasiswa];

                    for (int i = 0; i < jumlahMahasiswa; i++) {
                        System.out.print("Masukkan nama mahasiswa " + (i + 1) + ": ");
                        namaMahasiswa[i] = ayleen07.next();
                    }

                    inputDataMahasiswa(nilaiTugas, namaMahasiswa, ayleen07);
                    tampilkanNilaiMahasiswa(nilaiTugas, namaMahasiswa);
                break;
                case "2":
                    tampilkanNilaiMahasiswa(nilaiTugas, namaMahasiswa);
                break;
                case "3":
                    int mingguTertinggi = cariMingguTertinggi(nilaiTugas);
                    System.out.println("Minggu dengan nilai tertinggi: " + mingguTertinggi);
                    tampilkanMahasiswaTertinggi(nilaiTugas, namaMahasiswa, mingguTertinggi);                
                break;
                case "4":
                    System.out.println("Terimakasih telah menggunakan program ini!");
                    exit = true;
                break;
                default:
                    System.out.println("Pilihan tidak valid!");
                break;
            }
        } while (exit != true);
    }
    static void inputDataMahasiswa(int[][] nilaiTugas, String[] namaMahasiswa, Scanner scanner) {
        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.println("Input nilai mahasiswa " + namaMahasiswa[i]);
            for (int j = 0; j < nilaiTugas[i].length; j++) {
                System.out.print("Minggu " + (j + 1) + ": ");
                nilaiTugas[i][j] = scanner.nextInt();
            }
        }
    }
    static void tampilkanNilaiMahasiswa(int[][] nilaiTugas, String[] namaMahasiswa) {
        System.out.println("      Minggu1 Minggu2 Minggu3 Minggu4 Minggu5 Minggu6 Minggu7 ");
        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.print(namaMahasiswa[i] + ":\t");
            for (int j = 0; j < nilaiTugas[i].length; j++) {
                System.out.print(nilaiTugas[i][j] + "\t");
            }
            System.out.println();
        }
    }
    static int cariMingguTertinggi(int[][] nilaiTugas) {
        int mingguTertinggi = 0;
        int totalNilaiTertinggi = 0;
    
        for (int minggu = 0; minggu < nilaiTugas[0].length; minggu++) {
            int totalNilaiMinggu = 0;
            for (int mahasiswa = 0; mahasiswa < nilaiTugas.length; mahasiswa++) {
                totalNilaiMinggu += nilaiTugas[mahasiswa][minggu];
            }
    
            if (totalNilaiMinggu > totalNilaiTertinggi) {
                totalNilaiTertinggi = totalNilaiMinggu;
                mingguTertinggi = minggu + 1;
            }
        }
    
        return mingguTertinggi;
    }
    static void tampilkanMahasiswaTertinggi(int[][] nilaiTugas, String[] namaMahasiswa, int mingguTertinggi) {
        System.out.println("\nMahasiswa dengan nilai tertinggi pada minggu ke-" + mingguTertinggi + ":");
    
        for (int i = 0; i < nilaiTugas.length; i++) {
            if (nilaiTugas[i][mingguTertinggi - 1] == nilaiTugas[cariIndeksMahasiswaTertinggi(nilaiTugas, mingguTertinggi)][mingguTertinggi - 1]) {
                System.out.println(namaMahasiswa[i] + " memiliki nilai " + nilaiTugas[i][mingguTertinggi - 1] + " pada minggu ke-" + mingguTertinggi);
            }
        }
    }
    static int cariIndeksMahasiswaTertinggi(int[][] nilaiTugas, int mingguTertinggi) {
        int indeksMahasiswaTertinggi = 0;
        int nilaiTertinggi = nilaiTugas[0][mingguTertinggi - 1];
    
        for (int i = 1; i < nilaiTugas.length; i++) {
            if (nilaiTugas[i][mingguTertinggi - 1] > nilaiTertinggi) {
                nilaiTertinggi = nilaiTugas[i][mingguTertinggi - 1];
                indeksMahasiswaTertinggi = i;
            }
        }
    
        return indeksMahasiswaTertinggi;
    }
}

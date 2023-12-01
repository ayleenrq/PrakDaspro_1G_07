package P13;

import java.util.Scanner;

public class Ucapan_07 {
    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + "\nMay the force be with you.");
    }
    public static String PenerimaUcapan() {
        Scanner ayleen07 = new Scanner(System.in);
        System.out.print("Tuliskan Nama orang yang ingin Anda beri ucapan : ");
        String namaOrang = ayleen07.nextLine();
        ayleen07.close();
        return namaOrang;
    }
}

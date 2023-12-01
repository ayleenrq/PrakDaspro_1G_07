package P13;

import java.util.Scanner;

public class UcapanTerimaKasih_07 {
    public static void main(String[] args) {
        UcapanTerimaKasih();
        String ucapan = "I hope your wish comes true";
        UcapanTambahan(ucapan);
    }
    public static String PenerimaUcapan() {
        Scanner ayleen07 = new Scanner(System.in);
        System.out.print("Tuliskan Nama orang yang ingin Anda beri ucapan : ");
        String namaOrang = ayleen07.nextLine();
        ayleen07.close();
        return namaOrang;
    }
    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you "+ nama +" for being the best teacher in the wolrd.\n" +
        "You inspired in me a love for learning and made me feel like I could ask you anything.");
        String ucapan = "I hope your wish comes true";
    }
    public static void UcapanTambahan(String ucapan) {
        System.out.println(ucapan);
    }
}

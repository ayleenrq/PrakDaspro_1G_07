package P13;

import java.util.Scanner;

public class Percobaan6_07 {
    public static void main(String[] args) {
        Scanner ayleen07 = new Scanner(System.in);

        int p, l, t, L, vol;

        System.out.print("Masukkan panjang : ");
        p = ayleen07.nextInt();
        System.out.print("Masukkan lebar : ");
        l = ayleen07.nextInt();
        System.out.print("Masukkan tinggi : ");
        t = ayleen07.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas Persegi panjang adalah : " + L);

        vol = hitungVolume(p, l, t);
        System.out.println("Volume balok adalah : " + vol);
    }
    static int hitungLuas (int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }
    static int hitungVolume (int tinggi, int a, int b) {
        int volume = hitungLuas(a,b) * tinggi;
        return volume;
    }
}

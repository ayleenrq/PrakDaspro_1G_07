package P9;
import java.util.Scanner;

public class LinearSearch07 {
    public static void main(String[] args) {
        Scanner ayleen07 = new Scanner(System.in);

        int[] arrayInt;
        int key = 0;
        int hasil = 0;

        System.out.print("Masukkan jumlah elemen array : ");
        int jumlah = ayleen07.nextInt();
        arrayInt = new int[jumlah];

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen array ke-" + (i+1) + " : ");
            arrayInt[i] = ayleen07.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari : ");
        key = ayleen07.nextInt();
        
            for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }
        System.out.println("Key ada di posisi indeks ke-" + hasil);
    }
}

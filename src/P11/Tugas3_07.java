package P11;
import java.util.Scanner;

public class Tugas3_07 {
    public static void main(String[] args) {
        Scanner ayleen07 = new Scanner(System.in);
        String[] olahraga = {"Badminton", "Tenis Meja", "Basket", "Bola Voli"};
        String[][] atlet = new String[olahraga.length][5];
        
        for (int i = 0; i < atlet.length; i++) {
            System.out.println("Masukkan nama Atlet " + olahraga[i]);
            for (int j = 0; j < atlet[0].length; j++) {
                System.out.print("Atlet ke-" + (j+1) + " : ");
                atlet[i][j] = ayleen07.nextLine();
            }
            System.out.println();
        }
        for (int i = 0; i < atlet.length; i++) {
            for (int j = 0; j < atlet[i].length - 1; j++) {
                for (int k = 0; k < atlet[i].length - j - 1; k++) {
                    if (atlet[i][k].compareTo(atlet[i][k + 1]) > 0) {
                        String temp = atlet[i][k];
                        atlet[i][k] = atlet[i][k + 1];
                        atlet[i][k + 1] = temp;
                    }
                }
            }
        }
        for (int i = 0; i < atlet.length; i++) {
            System.out.println("Cabang Olahraga " + olahraga[i]);
            for (int j = 0; j < atlet[0].length; j++) {
                System.out.println("Atlet ke-" + (j+1) + " : " + atlet[i][j]);
            }
        }
    }
}

package P5;
import java.util.Scanner;

public class PemilihanPercobaan3_07 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);
        
        double angka1, angka2, hasil;
        char operator;

        System.out.print("Masukkan angka pertama: ");
        angka1 = input07.nextDouble();

        System.out.print("masukkan angka kedua: ");
        angka2 = input07.nextDouble();

        System.out.print("Masukkan operator (+ - * /): ");
        operator = input07.next().charAt(0);

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + " + " + angka2 + "=" + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + " - " + angka2 + "=" + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println(angka1 + " * " + angka2 + "=" + hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                System.out.println(angka1 + " / " + angka2 + "=" + hasil);
                break;
        }
    }    
}

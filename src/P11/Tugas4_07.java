package P11;

public class Tugas4_07 {
    public static void main(String[] args) {
        char[] nama = {'A', 'y', 'l', 'e', 'e', 'n', 'R', 'u', 'h', 'u', 'l', 'Q', 'i', 's', 't', 'h', 'y'};
        char[][] namaArray = new char[8][5];
        int index = 0;

        for (int i = 0; i < namaArray.length; i++) {
            for (int j = 0; j < namaArray[0].length; j++) {
                if (index < nama.length) {
                    namaArray[i][j] = nama[index];
                    index++;
                    System.out.print(namaArray[i][j] + "  ");
                } else {
                    index = 0;
                    namaArray[i][j] = nama[index];
                    index++;
                    System.out.print(namaArray[i][j] + "  ");
                }
            }
            System.out.println();
        }
    }
}

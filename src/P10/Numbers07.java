package P10;

import java.util.Arrays;

public class Numbers07 {
    public static void main(String[] args) {
        int[][] numbers = new int[3][];
        numbers[0] = new int[5];
        numbers[1] = new int[3];
        numbers[2] = new int[1];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(Arrays.toString(numbers[i]));
        }
    }
}

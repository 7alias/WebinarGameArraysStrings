import java.util.Arrays;
import java.util.Scanner;

public class Massive {

    public static void main(String[] args) {
        int count = 0;
        int max = 0;
        int min = 100;
        int[][] massive;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите высоту массива");

        int size1 = scanner.nextInt();
        System.out.println("Введите ширину массива: ");
        int size2 = scanner.nextInt();
        massive = new int[size1][size2];
        int[] diagonal = new int[size1];

        for (int i = 0; i < massive.length; i++) {
            System.out.println();

            for (int j = 0; j < massive[i].length; j++) {
                System.out.println("ВВедите элемент массива " + i + "");
                massive[i][j] = scanner.nextInt();

                if (max < massive[i][j]) {
                    max = massive[i][j];
                }
                if (min > massive[i][j]) {
                    min = massive[i][j];
                }

            }
            for (int k = 0; k < massive.length; k++) {

                for (int l = 0; l < massive[k].length; l++) {
                    System.out.print(massive[k][l]);
                }
                System.out.println();

            }
        }
        for (int h = 0; h < massive.length; h++) {
            for (int o = 0; o < massive[h].length; o++) {
                if (h + o == massive.length - 1) {
                    diagonal[count++] = massive[h][o];
                }
            }
        }

        System.out.println(Arrays.toString(diagonal));
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}

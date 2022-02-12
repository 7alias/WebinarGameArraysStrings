import java.util.Scanner;

import static java.lang.Math.random;

public class Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = 100 * random();
        //guess number
        int h = (int) x;
        System.out.println(h);
        System.out.println("Угадай число: ");

        int g = scanner.nextInt();
        while (true) {
            if (g > h) {
                System.out.println("Число меньше");

            } else if (g < h ){
                System.out.println("Число больше");

            }
            else {
                System.out.println("Угадал!");
                break;
            }
        }

    }
}







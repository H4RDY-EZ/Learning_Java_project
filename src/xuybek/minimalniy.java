package xuybek;
import java.util.Scanner;

public class minimalniy {

    public static void main (String[] args) {
        int[] sueta = new int[5];
        Scanner scanner = new Scanner(System.in);

        for(int e = 0; e < sueta.length; e++) {
            System.out.print("бидяня номря яз: ");
            int value = scanner.nextInt();
            sueta[e] = value;

            int minimal = sueta[0];
            for(int i = 0; i < sueta.length; i++) {
                if(sueta[i] < minimal)
                    minimal = sueta[i];
                System.out.println("Минимальное число: " + minimal);
                }
            }
        }
    }


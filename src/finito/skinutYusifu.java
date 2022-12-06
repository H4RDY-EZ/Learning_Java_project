package finito;

import java.util.Scanner;

public class skinutYusifu {
    void Test()
    {
        int[] sueta = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type numbers: ");
        for(int i = 0; i < sueta.length; i++)
        {
            sueta[i] = scanner.nextInt();
        }

        int minimal = sueta[0];

        for(int f = 0; f < sueta.length; f++)
        {
            if(sueta[f] < minimal){
                minimal = sueta[f];
            }
        }
        System.out.println("Minimum number is: " + minimal);
    }
}

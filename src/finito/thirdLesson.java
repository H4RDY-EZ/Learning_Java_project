package finito;

public class thirdLesson {
    String[] cars = {"Flex", "Anus", "Shithole"};
    int[] numbersblyat = {1,5,123,521,5213};

    void Test()
    {
        // case 1
        for(int i : numbersblyat)
        {
            System.out.println(i);
        }


        // next subject || case 2
        int i = 40;
        while(i < 40)
        {
            if(i == 4)
            {
                i++;
                continue;
            }
            {
                System.out.println(i);
                i++;
            }
        }

        // case 3

        int [][] shithole = {{5,3,2},{1,2,3}};
        System.out.println(shithole[0][2]);



    }


    public static int sum(int k)
    {
        if(k > 0)
        {
            return k + sum(k-1);
        }
        else {
            return 0;
        }
    }


    void Shit()
    {
        int[] daynito = {1, 4, 5 ,2};
        for(int i : daynito)
        {
            System.out.println(i);
        }
    }
}

class Person
{
    private int age;

    public int getAge()
    {
        return age;
    }

    public void setAge(int newAge)
    {
        this.age = newAge;
    }

}
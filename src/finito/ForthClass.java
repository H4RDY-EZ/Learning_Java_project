package finito;

import java.util.Arrays;

public class ForthClass {
    private String[] Flex;

    public void getName()
    {
        System.out.println(Arrays.toString(Flex));
    }

    public void setName(String[] newName)
    {
        this.Flex = newName;
    }


}
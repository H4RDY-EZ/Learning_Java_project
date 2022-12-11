package finito;
import java.lang.Math.*;

public class FifthClass {
    private float L;

    double exp = Math.pow(10, 6);
    int expo = (int)exp;

    public float L(float C, float Fb2, int n)
    {
        L = ((expo) * (C / Fb2)) / (365 * 24 * 60 * n);
        return L;
    }
}

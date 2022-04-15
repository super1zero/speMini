package calculator;

import java.lang.Math;
public class Calculator {
    public double SquareRoot(int x)
    {
        return Math.sqrt(x);
    }
    public double factorial(int x)
    {
        double fac = 1;
        for(int i =2;i<=x;i++)
        {
            fac = fac*i;
        }
        return fac;
    }

    public double log(int x)
    {
        return Math.log(x);
    }

    public double power(int x , int y)
    {
        return Math.pow(x, y);
    }
}
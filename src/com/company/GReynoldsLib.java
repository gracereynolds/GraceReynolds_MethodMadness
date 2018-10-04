package com.company;

public class GReynoldsLib {
    public static boolean isPalindrome(String pal)
    {
        String str1 = "";
        for(int i = pal.length()-1; i >= 0; i--)
        {
            str1 += pal.substring(i,i+1);
        }
        return str1.equals(pal);
    }
    public static String cutOut(String str2, String cut)
    {
        int ind = str2.indexOf(cut);
        return str2.substring(0,ind) + str2.substring(ind + cut.length());
    }
    public static String fooBarBaz(int num)
    {
        String str3 = "";
        for(int x = 1; x <= num; x++)
        {
            if(x%3 == 0)
            {
                if(x%5 == 0)
                {
                    str3 += "baz ";
                }
                else
                {
                    str3 += "foo ";
                }
            }
            else if(x%5 == 0)
            {
                str3 += "bar ";
            }
            else
            {
                str3 += x + " ";
            }
        }
        return str3;
    }
    public static int sumUpTo(int num)
    {
        int sum = 0;
        for(int n = 1; n <= num; n++)
        {
            sum += n;
        }
        return sum;
    }
    public static String quadsolver(double a, double b, double c)
    {
        double root1, root2;
        if((b*b-4*a*c) < 0)
        {
            return "Imaginary root";
        }
        root1 = (-b + Math.sqrt(b*b-4*a*c))/2*a;
        root2 = (-b - Math.sqrt(b*b-4*a*c))/2*a;
        return "The roots are " + root1 + " and " + root2;
    }
}

package com.company;

public class testfile {
    public static void main(String[] args) {
        System.out.println(GReynoldsLib.isPalindrome("racecar"));  //checks if input is a palindrome. should return true
        System.out.println(GReynoldsLib.isPalindrome("boat")); //should return false
        System.out.println(GReynoldsLib.cutOut("catatonic", "cat")); //removes cut from str2. should return atonic
        System.out.println(GReynoldsLib.cutOut("fish", "i")); //should return fsh
        System.out.println(GReynoldsLib.cutOut("lonely", "ly")); //should return lone
        System.out.println(GReynoldsLib.sumUpTo(3)); //adds up every integer from 1 to num. should return 6
        System.out.println(GReynoldsLib.sumUpTo(6)); //should return 21
        System.out.println(GReynoldsLib.quadsolver(3,4,5)); //finds the roots. should return "Imaginary root"
        System.out.println(GReynoldsLib.quadsolver(1,5,6)); //should return "The roots are -2 and -3"
        System.out.println(GReynoldsLib.fooBarBaz(15)); //replaces multiples os 3 with foo, 5 with bar, and both with baz.
        //should return "1 2 foo 4 bar foo 7 8 foo bar 11 foo 13 14 baz"
    }
}

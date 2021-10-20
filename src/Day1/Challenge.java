package Day1;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        int firsLine = scan.nextInt();
        double secondLine = scan.nextDouble();
        scan.nextLine();
        String thirdLine = scan.nextLine();

        System.out.println(i + firsLine);
        System.out.println(d + secondLine);
        System.out.println(s + thirdLine);

        scan.close();
    }
}

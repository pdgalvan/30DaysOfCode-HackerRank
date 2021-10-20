package Day10;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        String binary = Integer.toString(n, 2);
        int []arr = new int[binary.length()];
        int max = 0;
        int tempRes = 0;
        for(int i = 0; i < binary.length(); i++){
            arr[i] = Integer.parseInt(String.valueOf(binary.charAt(i)));
        }
        for(int number : arr){
            if(number == 1){
                tempRes++;
            }else{
                if(tempRes > max){
                    max = tempRes;
                }
                tempRes = 0;
            }
        }
        if(tempRes > max){
            max = tempRes;
        }
        System.out.println(max);
        bufferedReader.close();

    }
}


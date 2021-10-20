package Day11;

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

        List<List<Integer>> arr = new ArrayList<>();

        List<Integer> row_one;
        List<Integer> row_two;
        List<Integer> row_three;
        List<Integer> auxiliarList;

        int max = Integer.MIN_VALUE;
        int sum = 0;

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        for(int i = 0; i < arr.size() - 2; i++){
            row_one = arr.get(i);
            row_two = arr.get(i + 1);
            row_three = arr.get(i + 2);
            for(int j = 0; j < arr.get(0).size() - 2; j++){
                auxiliarList = new ArrayList<>();
                auxiliarList.addAll(row_one.subList(j,j+3));
                auxiliarList.add(row_two.get(j+1));
                auxiliarList.addAll(row_three.subList(j,j+3));
                sum = 0;
                for(int k : auxiliarList){
                    sum+=k;
                }
                if(sum > max){
                    max = sum;
                }
            }
        }
        System.out.println(max);
        bufferedReader.close();
    }
}


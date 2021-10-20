package Day6;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String words[] = null;
        String firstOutput = "";
        String secondOutput= "";

        int numberOfInputs = scanner.nextInt();
        words = new String[numberOfInputs];
        scanner.nextLine();

        for(int i = 0; i < numberOfInputs; i++){
            words[i] = scanner.nextLine();
        }

        for(int i = 0; i < numberOfInputs; i++){

            for(int j=0; j< words[i].length(); j++){
                if((j % 2) == 0){
                    char aux_one = words[i].charAt(j);
                    firstOutput = firstOutput.concat(String.valueOf(words[i].charAt(j)));
                }else{
                    secondOutput = secondOutput.concat(String.valueOf(words[i].charAt(j)));
                }
            }
            System.out.println(firstOutput+" "+secondOutput);
            firstOutput = "";
            secondOutput = "";
        }

    }
}

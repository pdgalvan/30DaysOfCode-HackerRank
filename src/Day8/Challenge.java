package Day8;

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        String notFound = "Not found";
        HashMap<String, Integer> phoneNumbers = new HashMap<String, Integer>();
        int n = in.nextInt();

        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneNumbers.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            Integer value = phoneNumbers.get(s);
            if(value != null){
                System.out.println(s+"="+value);
            }else{
                System.out.println(notFound);
            }
        }
        in.close();
    }
}


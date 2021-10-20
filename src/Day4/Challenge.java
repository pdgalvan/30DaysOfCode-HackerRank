package Day4;

import java.io.*;
import java.util.*;

public class Person {
    private int age;
    String youngMsg = "You are young.";
    String teenagerMsg = "You are a teenager.";
    String oldMsg = "You are old.";
    String ageNotValidMsg = "Age is not valid, setting age to 0.";
    public Person(int initialAge) {
        if(initialAge < 0){
            age = 0;
            System.out.println(ageNotValidMsg);
        }
        age = initialAge;
    }

    public void amIOld() {
        if(age < 13){
            System.out.println(youngMsg);
        }else{
            if(age >= 13 && age < 18){
                System.out.println(teenagerMsg);
            }else{
                System.out.println(oldMsg);
            }
        }
    }

    public void yearPasses() {
        age++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}
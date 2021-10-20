package Day12;

import java.util.*;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

}

class Student extends Person{
    private int[] testScores;

    Student(String firstName, String lastName, int identification, int[] testScores){
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }

    public Character calculate() {
        int avg = average();
        if (avg < 40){
            return 'T';
        }else{
            if(avg <55){
                return 'D';
            }else{
                if(avg < 70){
                    return 'P';
                }else{
                    if(avg < 80){
                        return 'A';
                    }else{
                        if(avg < 90){
                            return 'E';
                        }else{
                            return 'O';
                        }
                    }
                }
            }
        }
    }
    private int average(){
        int sum = 0;
        for (int score : testScores) {
            sum+=score;
        }
        return sum/ testScores.length;
    }
}

class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }
}

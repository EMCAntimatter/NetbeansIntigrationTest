package forloopproof;
import java.util.Scanner;
public class ForLoopProof {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double total = 0;
        for(int i = 0; i <= 4; i++){
            System.out.println("Enter grade " + i + ": \n");
            total += scnr.nextDouble();
        }
        double average = total/5;
        System.out.println("Your average is: " + average);
        if (average < 60){
            System.out.println("Your letter grade is an F");
        }
        else if (average >= 60 && average < 70){
            System.out.println("Your letter grade is a D");
        }
        else if (average >= 70 && average < 80){
            System.out.println("Your letter grade is an C");
        }
        else if (average >= 80 && average < 90){
            System.out.println("Your letter grade is an B");
        }
        else if (average >= 90 && average < 100){
            System.out.println("Your letter grade is an A");}}}
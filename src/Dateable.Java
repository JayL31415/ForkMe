import java.util.Scanner;
public class Dateable
{
    public static void main (String[] args) {
       Scanner input = new Scanner (System.in); // Create a scanner
       System.out.println("Input Your Age"); // Says input your age
       double age = input.nextDouble(); //
        double answer= age/2+7;
        System.out.println ("You should date somebody at least " + answer + " years old");



    }}


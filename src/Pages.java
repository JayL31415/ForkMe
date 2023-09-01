import java.util.Scanner;
public class Pages {

    public static void main (String[] args) {
        Scanner input = new Scanner (System.in); // Ceate a scanner
        System.out.println("Input Your Age"); // Says input your age
            int age = input.nextInt();
            int answer = 100 - age;
            System.out.println(age + " year olds should read at least " + answer + " pages before giving up on a book");

        }}


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        int answer,guess;
        int k=5;
        final int MAX=100;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean correct=false;
        System.out.println("I am thinking of a number between 1 and 100.\nYou have 5 tries to guess the number.");
        answer=rand.nextInt(MAX)+1;
        while(!correct){
            System.out.println("Guessing a number between 1 and 100:");
            guess=sc.nextInt();
            if(guess > answer){
                System.out.println("Too high, try again.\nYou have "+(k-1)+" tries left.");
            }
            else if(guess < answer){
                System.out.println("Too low, try again.\nYou have "+(k-1)+" tries left.");
                k--;
            }
            else{
                System.out.println("Yes, you guessed the number.\nCongratulations you win.");
            }
            k--;
        }
        if(correct == false){
            System.out.println("you ran out of tries.\nYou lose!");
        }
       }
}
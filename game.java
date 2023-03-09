package Java_project;
import java.util.Random;
import java.util.Scanner;

public class game {
    public int number;
    public int inputnumber;
    public int noOfGuess;         // to find out in how many number of attempt it is

    public int getNoOfGuess() {
        return noOfGuess;
    }

    public void setNoOfGuess(int noOfGuess) {
        this.noOfGuess = noOfGuess;
    }

    game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void takeUserInput() {
        System.out.println("Guess the number : ");
        Scanner sc = new Scanner(System.in);
        inputnumber = sc.nextInt();
    }

    boolean isCorrect() {
        noOfGuess++;
        if (inputnumber == number) {
            System.out.println("Yes...! You Guess it ,Number  was  " + number + "\n\n Guess  Attempt was: " + noOfGuess);
            return true;
        } else if (inputnumber < number) {
            System.out.println("Your Guess is To less...");
        } else if (inputnumber > number) {
            System.out.println("Your Guess is To heigh...");
        }
        return false;
    }

    public static void main(String[] args)       //Main function
    {
        game g = new game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            g.isCorrect();
        }
    }
}

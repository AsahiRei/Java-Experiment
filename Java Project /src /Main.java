//Guessing Game
//coded by arn
//
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int min = 1;
        int max = 5;
        int temp = 0;
        int getTotalAttempt = 0;
        //fixed random number starting from 1 instead of 0
        int randomNumber = rand.nextInt(max - min + 1) + min;
        boolean getFlag = false;
        do {
            int res = 0;
            //get the total attempt while in its loop
            getTotalAttempt++;
            try {
                System.out.println("Guess a number from 1 to 5!");
                res = scan.nextInt();
                temp = res;
                //if the input is equaly to a random number
                //the flag will eventually registered
                if (res == randomNumber) {
                    getFlag = true;
                										break;
                }
                //catch a error if the value is out of 10
                else if ((max + 1) <= res) {
                    throw new Exception("Out of range.");
                }
                //check the condition if it is too low or too high
                else if (res <= 3) {
                    System.out.println("Too low. Try again.");
                }
                else {
                    System.out.println("Too high. Try again.");
                }
            }
            catch (Exception e) {
                if ((max + 1) <= res) {
                    System.out.println(e.getMessage());
                }
                else {
                    System.out.println("Invalid input.");
                }
                //the purpose of this one is to prevent
                //the print loop from catch
                scan.nextLine();
            }
        } while(true);
        //when the flag is registered the value of
        //total attempt will displace in
        if (getFlag) {
            if (temp == 1) {
                System.out.println("You got it in " + getTotalAttempt + " attempt!");
            }
            else {
                System.out.println("You got it in " + getTotalAttempt + " attempt(s)!");
            }
        }
    }
}

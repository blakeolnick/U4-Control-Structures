import java.util.Scanner;
import java.util.Random;
public class Main{
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Random rand = new Random();

        /*int number = 1;

        while(number < 10){
            System.out.println(number);
            number++;
        }

        System.out.println("Program Ended.");*/
        /*int number = 10;

        while(number > 0){
            System.out.println(number);
            number--;
        }*/
        /*int number = 1;

        while(number < 30){
            System.out.println(number);
            number+=3;
        }*/

        /*int number = rand.nextInt(19) + 1;

        while(number%2 8){

            number=rand.nextInt(19) + 1;
        }
        System.out.println(number);
    }*/
        String password = "Food";

        System.out.println("Please enter your password.");
        String userGuess = read.nextLine();

        while (!password.equals(userGuess)) {

            System.out.println("Please enter your password.");
            userGuess = read.nextLine();
        }
    }
}

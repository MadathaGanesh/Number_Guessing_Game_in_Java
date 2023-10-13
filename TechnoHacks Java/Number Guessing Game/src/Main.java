import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numberofTries=0;
        boolean isCorrectlyGuessed=false;
        Random randint=new Random();
        int randomNumber=randint.nextInt(1,100);
        System.out.println("Welcome to Number Guessing Game .....");
        while (!isCorrectlyGuessed){
            System.out.println("Enter a Random Number : ");
            Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();
            numberofTries++;
            if (num==randomNumber){
                System.out.println("Entered Number " + num + " Random Number  " + randomNumber + " are same ");
                System.out.println("You have taken " + numberofTries +" chances to Guess correctly");
                System.out.println("Generated Random Number is : "+randomNumber);
            }else {
                if (num>randomNumber){
                    System.out.println("Entered Number "+num + " is Greater than Random Number . Please enter small Number ");
                }else {
                    System.out.println("Entered Number "+num + " is Less than Random Number . Please enter highest Number ");
                }
            }sc.close();
        }
    }
}
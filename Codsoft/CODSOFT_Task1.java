import java.util.*;
public class CODSOFT_Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int rounds = 0;
        int max_attempts = 10;
        boolean playgame = true;
        int total_attempts = 0;
        int min = 1;
        int max = 100;

        System.out.println("______________THE GAME OF GUESSING A NUMBER_____________");
        System.out.println("\nYOU NEED TO GUESS A NUMBER FROM " + min + " to " + max + " : ");
        while(playgame){
            rounds++;
            int attempts = 1;
            boolean correctguess = false;
            int randomnumber = random.nextInt(max - min + 1) + min;
            System.out.println("<--You have maximum 10 attempts for round " + rounds + " --> ");
            while(attempts <= max_attempts){
                System.out.println("Round: " + rounds + " Attempt: " + attempts);
                System.out.print("Enter the number you guess: ");
                int userguess = in.nextInt();
                attempts++;
                if(userguess < min || userguess > max){
                    System.out.println("KINDLY PLEASE..Enter the number between " + min + " and " + max + " : ");
                }
                else{
                    if(userguess == randomnumber){
                        correctguess = true;
                        total_attempts += attempts;
                        System.out.println("CONGRATULATIONS..!!,You guessed the correct number.");
                        break;
                    }
                    else if (userguess < randomnumber){
                        System.out.println("TOO LOW...!!,Give another try...!!");
                    }
                    else{
                        System.out.println("TOO HIGH..!!,Give another try...!!");
                    }
                }
            }
            if(!correctguess){
                System.out.println("OOPS...!!You are out of attempts..!!\nThe correct number was: " + randomnumber);
            }

            System.out.print("Do you want to go for another round(yes/no): ");
            String option = in.next();
            playgame = option.equalsIgnoreCase("yes");
        }
        float average_attempts = (float)total_attempts/rounds;
        System.out.println("THANK YOU FOR PLAYING..!!\n\nYour average attempts per round was: " + average_attempts);
    }
}

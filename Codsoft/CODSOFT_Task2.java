import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class CODSOFT_Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("______________________WORD COUNTER________________________");
        System.out.println("1. Enter the text through typing.\n2. Enter the file:");
        System.out.print("Enter any one option: ");
        int option  = in.nextInt();
        in.nextLine();
        String text = "";
        if(option == 1){
            System.out.println("Enter the text: ");
            text = in.nextLine();
        }
        else if(option == 2){
            try{
                System.out.println("Enter the file path: ");
                String filepath = in.nextLine();
                text = readtext(filepath);
            }catch(IOException e){
                System.out.println("OOPS...!!\nAn error occured while reading the filepath..!!");
                return;
            }
        }
        else{
            System.out.println("Invalid Option....!!");
            return;
        }
        String[] words = text.split("[\\s.,;!?]+");
        int countofwords = words.length;

        System.out.println("Total number of words int the given text was " + countofwords);
    }

    private static String readtext(String filepath) throws IOException {
        StringBuilder article = new StringBuilder();
        try (BufferedReader bread = new BufferedReader(new FileReader(filepath))) {
            String line;
            while ((line = bread.readLine()) != null) {
                article.append(line).append("\n");
            }
        }
        return article.toString();
    }
}

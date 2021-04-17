import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static Scanner input= new Scanner(System.in);

    //method for first name
    public static void firstNameValidation() {

            System.out.println("Enter the first name: ");
            String firstName = input.nextLine();

            //regex expression for first name
            Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
            Matcher matcher = pattern.matcher(firstName);
            if (matcher.matches() == true)
                System.out.println("First name is: " + firstName);
            else
                System.out.println("INVALID NAME");
        }

    //main method
    public static void main(String args[]){
        firstNameValidation();
    }
}

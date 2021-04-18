import java.util.Scanner;
import java.util.regex.*;

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
                System.out.println("INVALID FIRST NAME");
        }

    //method for last name
    public static void lastNameValidation() {

        System.out.println("Enter the last name: ");
        String lastName = input.nextLine();

        //regex expression for second name
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
        Matcher matcher = pattern.matcher(lastName);
        if (matcher.matches() == true)
            System.out.println("Last name is: " + lastName);
        else
            System.out.println("INVALID LAST NAME");
    }

    //method for email
    public static void emailValidation(){
        System.out.println("Enter the email");
        String email=input.nextLine();

        //regex expression for email
	Pattern pattern=Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$");
        Matcher matcher= pattern.matcher(email);
        if (matcher.matches()==true)
            System.out.println("email is: "+email);
        else
            System.out.println("INVALID EMAIL");

    }

    //main method
    public static void main(String args[]){
        firstNameValidation();
        lastNameValidation();
        emailValidation();
       

    }
}

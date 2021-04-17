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

    //method for phone number
    public static void phoneNumberValidation(){
        System.out.println("Enter the phone number");
        String phoneNumber=input.nextLine();

        //regex expression for phone number
        Pattern pattern=Pattern.compile("^[0-9]{2}[: :][0-9]{10}$");
        Matcher matcher= pattern.matcher(phoneNumber);
        if (matcher.matches()==true)
            System.out.println("Phone number is: "+phoneNumber);
        else
            System.out.println("INVALID PHONE NUMBER");

    }

    //method for password
    public static void passwordValidation(){
        System.out.println("Enter the password");
        String password= input.nextLine();

        //regex expression for password
        Pattern pattern=Pattern.compile("(([a-zA-Z@#$%&%!])(?=.*[0-9])(?=.*[A-Z])).{8,}");
        Matcher matcher=pattern.matcher(password);
        if(matcher.matches()==true)
            System.out.println("VALID PASSWORD");
        else
            System.out.println("INVALID PASSWORD");

    }

    //main method
    public static void main(String args[]){
        firstNameValidation();
        lastNameValidation();
        phoneNumberValidation();
        passwordValidation();

    }
}

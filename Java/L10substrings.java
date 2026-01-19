import java.util.Scanner;

public class L10substrings {
    public static void main(String[] args) {

        // .substring() = A method used to extract a portion of a string
        //                string.substring(start, end)

        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");
        
        email = scanner.indexLine();
        username = eamil.substring(0, 6);
        //String username = eamil.substring(0, email.indexOf("@"));
        domain = email.substring(7, 16);
        //String domain = email.substring(7, email.indexOf("m"));

        System.out.println(username); // Bro123
        System.out.println(domain); // gmail.com

        scanner.close();
    }
}
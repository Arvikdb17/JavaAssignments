package StaticBlocks;

import javax.naming.Name;
import java.util.Scanner;

public class LoginPage {
    private static String NAME;
    private static String PASSWORD;
    static {
        NAME ="Zoho";
        PASSWORD="Zoho@123";

    }
    public static boolean verify(String name,String password){
        return NAME.equalsIgnoreCase(name)&&PASSWORD.equals(password);
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Username");
        String name=scanner.nextLine();
        System.out.println("Enter Password");
        String password=scanner.nextLine();
        if(verify(name,password))
            System.out.println("Login Successful");
        else
            System.out.println("Login failed");

        scanner.close();

    }
}

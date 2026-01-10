
import java.util.Scanner;



public class Main{  // public matlab class can be accessed from anywhere 
    public static void main(String[] args){    // static is there coz we want to run main without creating any object |||| void is a return type
    //     System.out.println("hello world");
Scanner input = new Scanner(System.in);
String name = input.nextLine();
System.out.println(name);
input.close();

        
    }
}
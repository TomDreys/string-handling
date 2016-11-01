import java.util.Scanner;

public class Main
{
    
    public static void Main(String[]args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter a string: ");
       String string = sc.next();
       String temp ="";
       int length = string.length();
       int x = 1;
       
       for (int i=1; i <= string.length(); i++)
       {
           temp = temp + string.charAt(string.length()-i);
       }
       
       System.out.println(temp);
       
       if (temp.equals(string)) 
       {
           System.out.println("the string is a palindrome");
       }
       
       else
       {
           System.out.println("the string is not a palindrome");
       }
       

    }

}

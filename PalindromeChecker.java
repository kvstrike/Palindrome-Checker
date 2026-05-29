
import java.util.*;
public class PalindromeChecker
{
   public static void main(String[] args)
   {
      Stack<Character> stack = new Stack<>();      

      Scanner scan = new Scanner(System.in);
      System.out.println("Please enter a word or phrase:");

      String original = scan.nextLine();
      
      //removes all non-alphabetic characters and converts to lowercase
      String cleaned = original.replaceAll("[^a-zA-Z]", "").toLowerCase();

      //adds every character from the string to the stack 1 by 1
      for(int i = 0; i < cleaned.length(); i++)
      {
         stack.push(cleaned.charAt(i));
      }

      //StringBuilder is used to efficiently build the reversed string
      StringBuilder reversed = new StringBuilder();

      //pops characters from the stack and appends to the reversed string
      while(!stack.isEmpty())
      {
         reversed.append(stack.pop());
      }

      //compares the cleaned string with the reversed string to check for palindrome
      if(cleaned.equals(reversed.toString()))
      {
         System.out.println(original + " is a palindrome.");
      }
      else
      {
         System.out.println(original + " is not a palindrome.");
      }
      //closes the scanner
      scan.close();
   }
}
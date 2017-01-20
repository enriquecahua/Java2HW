
package lab1;
import java.io.*;
import java.util.Scanner;
import java.lang.StringBuffer;
import java.util.ArrayList;
import java.util.ArrayDeque;
/**
 *
 * @author Enrique Cahua v1.1
 */
public class Lab1 {
    
    /* declaration of array with size predetermined because I could  not figure out how to do so
       without specifying the array size first. Originally wanted to have the method accept an interger
       of any size
    */
    static int myarray[] = new int[3];
  
     public static void main(String[] args) {
         //read input as int instead of string
       System.out.print("Enter a three digit number:");
       Scanner sc = new Scanner(System.in);
       int response = sc.nextInt();
       String str = String.valueOf(response);
       String result = sumNums(str);
       String result2= reverseNums(str);
       System.out.println("The sum of the number is " + result);
       System.out.println("The reverse of the number is " + result2);
       getArray(response);
       System.out.println("Priting Array");
       for (int i = 0; i < myarray.length; i++) {
           System.out.println(myarray[i]);
       }
    }
   
    private static String sumNums (String input ) {
        StringBuffer buffer = new StringBuffer(input);
        char digit1 = buffer.charAt(0);
        char digit2 = buffer.charAt(1);
        char digit3 = buffer.charAt(2);
        int sum = Character.getNumericValue(digit1) + Character.getNumericValue(digit2) + Character.getNumericValue(digit3);
        String answer2 = Integer.toString(sum);
        return answer2;
    }
    
    private static String reverseNums (String input ) {
        
        StringBuffer buffer = new StringBuffer(input);
        ArrayList<String> answer = new ArrayList<String>();
        for(int i = 0; i < buffer.length(); i++) {
            answer.add(Character.toString(buffer.charAt(buffer.length()-i-1)));
        }
        String mystring = "";
        for (int y = 0; y < answer.size();y ++) {
           mystring = mystring + answer.get(y);
        }
        return mystring;
    }    
    
    /*
    // String version of the getArray method
    public static void getArray (String input ) {
        StringBuffer buffer = new StringBuffer(input);
        ArrayList<String> answer = new ArrayList<String>();
        
        for(int i = 0; i < buffer.length(); i++) {
            answer.add(Character.toString(buffer.charAt(i)));
        }
       
        String arr[] = new String[answer.size()];
        
        for( int y = 0; y < arr.length; y++) {
            arr[y] = answer.get(y);
            System.out.println(arr[y]);
        }
        
    } */
    public static void getArray (int input) {
        String var1 = Integer.toString(input);
        
        for ( int i = 0; i < myarray.length; i++) {
            myarray[i] = (var1.charAt(i) -48);
        }
        
    }
}

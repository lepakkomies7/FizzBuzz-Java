/*
Written by me, after applying the logic from Tom Scott's video:
https://www.youtube.com/watch?v=QPZ0pIK_wsc

Problem solved correctly on my own, and checked afterwise in comparison.
Logic and "point" to solve the problem this way applied from the video.

Using this code / file as a tool to test out GitHub.
*/


public class FizzBuzz {
  public static void main(String args[]) {
      
    System.out.println("FizzBuzz Generator test thingy"); // "Subject" for the program
    
    
    /* An empty variable "output" is created to store the to-be-printed value or text. 
    By storing the value separately, we can more easily adjust the printing conditions later, if needed. */
    String output = "";  

    
    for (int i = 0; i <= 100; i++) { // code runs 101* times, from zero to one hundred.
        
        if (i % 3 == 0 && i % 5 == 0) {output = "FizzBuzz";} // if 'i' is divisible by 3 and 5 -> turn the Output variable to "FizzBuzz". This is checked first, as this is the most rare case. Other checks are been done only, if this does not match.
        else if (i % 3 == 0) {output = "Fizz";} // if previous statement is not true, check if "i" is divisible by 3. If so, turn the output variable to "Fizz". This statement is "equal in value" to the next line.  
        else if (i % 5 == 0) {output = "Buzz";} // if previous statement is not true, check if "i" is divisible by 5. If so, turn the output variable to "Buzz". This statement is "equal in value" to the next line.  
        // else if (i % 7 == 0) {output = "Seiska";} // "test row", working as intended.
        else {output = Integer.toString(i);} // if neither check is true, then the "output" string will be changed to the value of "i". "i" needs to be changed to from Integer to String, which is is why .toString method is used for.
        /* 
        By storing the printable value separately, we can later adjust the conditions of altering the printable more easily.
        Now we could just alter the already existing lines OR create completely new lines for examples numbers 2, 7, 9 etc.
        This code would not be perfect, as it does not check if the value is already divisible by other numbers first. For example, if i % 9 == 0, it already matches with the previous statement "3", thus turning "output" to Fizz, before it would change to the equivelant of "9".
        
        */
        
    System.out.println(i + ": " + output); // printing out the number of the row + the updated "output" variable as a string. 
        
    }
    
    
    
  }
}
import java.util.*;

public class StringTokenizerDemo {
   public static void main(String[] args) {
      // creating string tokenizer
      StringTokenizer st = new StringTokenizer("Tutorialspoint is the best site");
      
      // counting tokens
      System.out.println("Total tokens : " + st.countTokens());       
   }
}

//Let us compile and run the above program, this will produce the following result.

//Total tokens : 5

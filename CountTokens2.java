import java.util.*;

public class StringTokenizerDemo {
   public static void main(String[] args) {
      // creating string tokenizer
      StringTokenizer st = new StringTokenizer("Come to learn");
      
      // checking elements
      while (st.hasMoreElements()){
          System.out.println("Next element : " + st.nextElement());    
      }
   }
}

//Let us compile and run the above program, this will produce the following result.

//Next element : Come
//Next element : to
//Next element : learn

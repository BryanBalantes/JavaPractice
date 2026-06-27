public class PostAndPreDecrement {
     public static void main (String[] args) {
         /*
 	    decrement (--)
 	    post-decrement var--
 	    pre-decrement --var
	*/

          // int num1 = 100;
          // int num2 = --num1;

          // System.out.println(num1);

           int num1 = 100;
           int num2 = num1++;
           int num3 = ++num2;
           int num4 = num3--;
           int num5 = ++num3;
           int num6 = num5--;

           System.out.println(num6);
     }
}


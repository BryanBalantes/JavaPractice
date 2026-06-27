public class Operators {
   public static void main (String[] args) {
       // Arithmetic Operator
       // int num1 = 10;
       // int num2 = 3;
       
       // int sum = num1 + num2;
       // System.out.println(num1 + " + " + num2 + " = " + sum);

       // int difference = num1 - num2;
       // System.out.println(num1 + " - " + num2 + " = " + difference);

       // int product = num1 * num2;
       // System.out.println(num1 + " \u00D7 " + num2 + " = " + product);

       // double quotient = (double) num1 / num2;
       // System.out.println(num1 + " \u00F7 " + num2 + " = " + quotient);

       // int remainder = num1 % num2;
       // System.out.println(num1 + " % " + num2 + " = " + remainder);

       // System.out.println();

       // Logical Operator

       // boolean b1 = true;
       // boolean b2 = !true; // logical not (!)
       // System.out.println(b1);
       // System.out.println(b2);


       // boolean b1 = true;
       // boolean b2 = false;

       // boolean expression1 = b1 && b2; // Logical AND 
       // boolean expression2 = b1 | b2; // Bitwise OR

       // System.out.println("Logical AND");
       // System.out.println(b1 + " && " + b2 + " = "  + expression1);
       // System.out.println();
       // System.out.println("Bitwise OR");
       // System.out.println(b1 + " | " + b2 + " = "  + expression2);

        
       int num1 = 10;
       int num2 = 11;

       boolean expression = (num1++ >= num2) && (num1++ == num2);
       System.out.println(expression);
       System.out.println(num1);
   }
}
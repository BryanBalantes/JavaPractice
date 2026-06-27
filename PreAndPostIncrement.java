public class PreAndPostIncrement {
    public static void main(String[] args) {

//       for(int i = 2; i < 10; i = i * i ) {
//           System.out.println(i);
//       }

//        int num1 = 100;
//        int num2 = num1++; // 100
//        int num3 = num2++; // 100
//        int num4 = num3;   // 100
//        int num5 = num4++; // 100
//        System.out.print(num5); // 100

//        int num1 = 100;
//        int num2 = num1++; // 100
//        int num3 = num2++; // 100
//        int num4 = num2++;   // 101
//        int num5 = num3++; // 100
//        int num6 = num4++; // 101
//        System.out.println(num6); // 101

        int num1 = 10;
        int num2 = num1++;
        int num3 = num2;
        int num4 = num3;
        int num5 = num2++;
//        int num6 = num4++;
        System.out.println(num4);


    }
}
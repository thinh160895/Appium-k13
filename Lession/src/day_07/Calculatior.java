package day_07;

public class Calculatior {

    //  Without params
    /*
   [access modifier] | class method/or NOT (optional) | return type | function's name (param){...code...}
     */
      public static void welcome(String name){
          System.out.println("Welcome ".concat(name));
      }

      // Method signature
      public static int sum3(int num1, int num2){
          int total = num1 + num2;
          return total;
      }
      public static int sum3(int num1, int num2, int num3){
          return num1 + num2 + num3;
    }

    /*
    * Over loading?
    * . SAME class
    * . Compile time
    * . Base on method signature: Same function name + DIFFERENT params -> Overloading
    * */
}

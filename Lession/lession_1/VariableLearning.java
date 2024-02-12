package lession_1;

public class VariableLearning {

    public static void main(String[] args) {
        // naming convention: camelCase (java), snake_case (Python), PascalCase
        int myInt = 18;
        // Re-asign value
        myInt = 19;

        //Re-declaration is NOT allowed
        //int myInt = 20

        int my_num = 18;
        int MyValue = 10;

        long myLongNum = 10L;

        float myFloatNum = 3.14f;
        double myDoubleNum = 3.14d;
        boolean myDecision = true;

        // byte, short, int, long
        System.out.println(Short.MAX_VALUE);

        // incompatible types: possible conversion from int to byte
        // byte myByte = 32768;

        // constant
        final float PI_NUMBER = 3.14f;
        // cannot re-assign constant
        //final float PI_NUMBER = 3.15f;
    }
}

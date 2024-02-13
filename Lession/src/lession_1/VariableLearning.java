package lession_1;

public class VariableLearning {

    public static void main(String[] args) {
        // naming convention: camelCase (java), snake_case (Python), PascalCase
        // camelCase:
        int myCurrentAge = 18;
        // snake_case in Python: int my_current_age = 18;
        // PascalCase: int MyCurrentAge = 18;
        // Re-asign value
        myCurrentAge = 19;

        //Re-declaration is NOT allowed
        //int myCurrentAge = 20

        int snake_case = 18;
        int PascalCase = 10;

        long myLongNum = 10L;

        float myFloatNum = 3.14f;
        double myDoubleNum = 3.14d;
        boolean myDecision = true;

        // byte, short, int, long
        System.out.println (Short.MAX_VALUE);

        // incompatible types: possible conversion from int to byte
        // byte myByte = 32768;

        // constant: số không thể thay đổi.
        // constant nên được viết hoa để làm nổi bật.
        final float PI_NUMBER = 3.14f;

        // cannot re-assign constant
        //final float PI_NUMBER =
        //new code
    }
}

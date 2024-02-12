package lession_2;

public class PrefixPostfix {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        //Prefix (++) a, b(++) Postfix
        int c = ++a + b++;
        /*
            Prefix < right operand > assign value for left operand > postfix
            ++a chạy a  1st, thêm 1 đơn vị > tính + (++a) and b = 2+2 =4=c > tính b, thêm 1 đơn vị = 2+1 = 3
            a = 2
            c = 4
            b =3
         */

        System.out.println( "a = %d; b= %d; c= %d\n; a ,b, c");

    }
}

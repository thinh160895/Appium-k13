package lession_2;

public class OperatorLearning {

    public static void main(String[] args) {
        int myNumber1 = 1;
        int myMumber2 = 2;

        // Left operand an right oerand
        int total = myNumber1 + myMumber2;
        // in xong nhảy xuống dòng mới thì: pritln
        // in xong ở nguyên dòng cũ: print
        System.out.println("Total: " + total);

        // Print with format:
        // %d: số nguyên - byte, short, interger, long;
        // %f: số thực - float, double;
        // %b: boolean - true/false;
        // %s: charater, string...;
        System.out.printf("Total: %d\n", total);

        //Chia lấy phần nguyên
        System.out.printf("\tPhep chia %d cho %d, co phan nguyen la %d\n", 5, 2, 5 / 2);

        // Chia lấy phần dư
        System.out.printf("\tPhep chia %d cho %d, co phan du la %d\n", 5, 2, 5 % 2);

        // Mún thụt vào 1 ô : \t ở cuối
        // Mún xuống dòng: \n ở cuối
    }
}

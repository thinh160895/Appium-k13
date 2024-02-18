 /* Lab 6.3:
  * String myStr = "100 minutes";
  * NOT using REGEX, extract digit character from that String
  * Expected output: "100".
  * EX: "12345nabc678" -> "12345678"
  */
package Lab6;
public class Lab6_3 {
    public static void main(String[] args) {
        String inputStr = "12345na !? bc678!";
        String extractChar = extractDigits(inputStr);
        System.out.println(extractChar);
    }

    public static String extractDigits(String inputStr) {
        StringBuilder result = new StringBuilder();
        char[] characters = inputStr.toCharArray();
        for (char character : characters) {
            // Kiểm tra xem ký tự có phải là chữ số không
            if (Character.isDigit(character)) {
                result.append(character); // Thêm chữ số tìm được vào StringBuilder
            }
        }
        return result.toString();
    }
}

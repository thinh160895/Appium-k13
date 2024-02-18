 /* Lab 6.1:
  * Given input string: "2hrs and 5 minutes"
  * Please calculate how many minutes in total
  */

package Lab6;
 public class Lab6_1 {

     public static void main(String[] args) {
         final String TIME = "10 hrs and 19 minutes";
         int totalMins = calculateTotalMins(TIME);
              System.out.println("Total minutes: " + totalMins);
          }
     public static int calculateTotalMins(String timeInput) {
         // Split the input string using the word "and" as the delimiter
         String[] timeSplited = timeInput.split("and");

         // Extract the numerical values
         String hourNumStr = timeSplited[0].replaceAll("[^0-9]", "").trim();
         String minuteNumStr = timeSplited[1].replaceAll("[^0-9]", "").trim();

         // Parse the numerical values as integers
         int hourNum = Integer.parseInt(hourNumStr);
         int minuteNum = Integer.parseInt(minuteNumStr);

         // Calculate the total time in minutes
         int totalMins = hourNum * 60 + minuteNum;

         return totalMins;
     }
 }

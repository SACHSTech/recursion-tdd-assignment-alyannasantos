package recursionAssignment;

public class Recursion{

  // Problem Set 1 - count7
  public static int count7(int n) {

    // negative numbers not allowed
    if (n < 0) {
      return -1;
    }   

    // convert input into string
    String strNum = n + "";
    int maxIndex = strNum.length() - 1;
    return checkDigit(strNum, 0, maxIndex);
  }

  // recursive method
  private static int checkDigit(String strNum, int curIndex, int maxIndex) {

    // end of recursion when maximum index is reached
    if (curIndex > maxIndex) {
      return 0;
    }

    int counter = 0;

    // check if number at current index is 7
    if (strNum.charAt(curIndex) == '7') {
      counter = 1;
    }

    curIndex++;

    // accumulate total recursive checks
    counter = counter + checkDigit(strNum, curIndex, maxIndex);
    return counter;
  }

}

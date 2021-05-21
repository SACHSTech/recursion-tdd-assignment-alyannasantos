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

  // Problem Set 2 - changePi
  public static String changePi(String str) {

    int curIndex = 0;
    int maxIndex = str.length() - 1;
    return checkPi(str, curIndex, maxIndex);
  }

  private static String checkPi(String strInput, int curIndex, int maxIndex) {

    if (curIndex > maxIndex) {
      return "";
    } else if (curIndex == maxIndex) {
      return strInput.charAt(curIndex) + "";
    }

    String pi = "pi";
    String result = "";

    if (pi.equals(strInput.substring(curIndex, curIndex + 2))) {
      result = "3.14";
      curIndex = curIndex + 2;
    } else {
      result = strInput.charAt(curIndex) + "";
      curIndex = curIndex + 1;
    }

    result = result + checkPi(strInput, curIndex, maxIndex);
    return result;
  }

}

package recursionAssignment;

public class Recursion{

  public static int count7(int n) {

    if (n < 0) {
      return -1;
    }   

    String strNum = n + "";
    int maxIndex = strNum.length() - 1;
    return checkDigit(strNum, 0, maxIndex);
    
  }

  private static int checkDigit(String strNum, int curIndex, int maxIndex) {

    if (curIndex > maxIndex) {
      return 0;
    }

    int counter = 0;

    if (strNum.charAt(curIndex) == '7') {
      counter++;
    }

    curIndex++;

    counter = counter + checkDigit(strNum, curIndex, maxIndex);
    return counter;

  }

}

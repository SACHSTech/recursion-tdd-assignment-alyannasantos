package recursionAssignment;

/**
* This java program uses recursion methods to get results
* @author: Alyanna Santos
*
*/
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

    // initial values
    int curIndex = 0;
    int maxIndex = str.length() - 1;
    return checkPi(str, curIndex, maxIndex);
  }

  // recursive method
  private static String checkPi(String strInput, int curIndex, int maxIndex) {

    // end of recursion when 1 or no more characters left to evaluate
    if (curIndex > maxIndex) {
      return "";
    } else if (curIndex == maxIndex) {
      return strInput.charAt(curIndex) + "";
    }

    // initialize variables
    String pi = "pi";
    String result = "";
    String piNum = "3.14";

    // convert "pi" to 3.14
    if (pi.equals(strInput.substring(curIndex, curIndex + 2))) {
      result = piNum;
      curIndex = curIndex + 2;
    } else {
      result = strInput.charAt(curIndex) + "";
      curIndex = curIndex + 1;
    }

    // join resulting string together
    result = result + checkPi(strInput, curIndex, maxIndex);
    return result;
  }

  // Problem Set 3 - stringClean
  public static String stringClean(String str) {

    // null or empty inputs returns empty string
    if (str == null || str.length() == 0) {
      return "";
    }

    // initial values
    int curIndex = 0; 
    int maxIndex = str.length() - 1;
    int lastUniqueIndex = 0;
    return checkCharacters(str, curIndex, maxIndex, lastUniqueIndex);
  }

  // recursive method
  private static String checkCharacters(String strInput, int curIndex, int maxIndex, int lastUniqueIndex) {

    // end of recursion when maximum index is reached
    if (curIndex > maxIndex) {
      return "";
    }

    // initialize variables
    String result = "";
    String lastUniqueString = strInput.charAt(lastUniqueIndex) + "";
    String currentString = strInput.charAt(curIndex) + "";
    
    // derive resulting string based on current character and last unique character
    if (curIndex == lastUniqueIndex) {
      result = currentString;
    } else if (lastUniqueString.equals(currentString)) {
      result = "";
    } else {
      result = currentString;
      lastUniqueIndex = curIndex;
    } 

    // position current index to next index
    curIndex++;

    // join resulting string
    result = result + checkCharacters(strInput, curIndex, maxIndex, lastUniqueIndex);
    return result;
  }

}

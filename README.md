# Recursion Assignment

[1. Choose Problems](#1-choose-problems)  
[2. Test/Implement Solutions](#2-testimplement-solutions)  
[3. Solution Communication](#3-solution-communication)  


## 1. Choose Problems
You will choose one problem from each of the three problem sets.

### Problem Set 1

#### count7 
`public static int count7(int n)`  
Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
```
count7(717) → 2
count7(7) → 1
count7(123) → 0
```

#### count8
`public static int count8(int intN)`  
Given a non-negative `intN`, compute recursively (no loops) the count of the occurrences of 8 as a digit, except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4. Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
```
count8(8) → 1
count8(818) → 2
count8(8818) → 4
```

#### countHi
`public static int countHi(String str)`  
Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
```
countHi("xxhixx") → 1
countHi("xhixhix") → 2
countHi("hi") → 1
```

### Problem Set 2

#### changePi
`public static String changePi(String str) `  
Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".
```
changePi("xpix") → "x3.14x"
changePi("pipi") → "3.143.14"
changePi("pip") → "3.14p"
```
#### pairStar
`public static String pairStar(String str)`  
Given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".
```
pairStar("hello") → "hel*lo"
pairStar("xxyy") → "x*xy*y"
pairStar("aaaa") → "a*a*a*a"
```

#### endX
`public static String endX(String str)`  
Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string.
```
endX("xxre") → "rexx"
endX("xxhixx") → "hixxxx"
endX("xhixhix") → "hihixxx"
```

### Problem Set 3

#### array220
`public static boolean array220(int[] intNums, int index)`  
Given an array of ints, compute recursively if the array contains somewhere a value followed in the array by that value times 10. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.
```
array220([1, 2, 20], 0) → true
array220([3, 30], 0) → true
array220([3], 0) → false
```

#### stringClean
`public static String stringClean(String str)`  
Given a string, return recursively a "cleaned" string where adjacent chars that are the same have been reduced to a single char. So "yyzzza" yields "yza".
```
stringClean("yyzzza") → "yza"
stringClean("abbbcdd") → "abcd"
stringClean("Hello") → "Helo"
```

#### strCopies
`public static boolean strCopies(String str, String sub, int n)`  
Given a string and a non-empty substring sub, compute recursively if at least n copies of sub appear in the string somewhere, possibly with overlapping. N will be non-negative.
```
strCopies("catcowcat", "cat", 2) → true
strCopies("catcowcat", "cow", 2) → false
strCopies("catcowcat", "cow", 1) → true
```

## 2. Test/Implement Solutions
Using the TDD **Red-Green-Refactor** process, implement your the solutions for your selected recursion problems.  For full process marks, be sure to log a commit after the each red, green, and refactor step. More specifically, log a commit after:
* defining a test (which should fail on initial run)
* editing your code to pass the test (first step into green state)
* cleaning up your code (refactor).  

Be sure to consider various cases to thoroughly verify your code.  Don't forget to consider *corner cases*.  

It must be clear in your commit history that you are working through the TDD **Red-Green-Refactor** stages.  This makes it imperitavive to think through your solution before you start to code.


## 3. Solution Communication
Choose one of your solutions and create a video that explains how it works.
* Level 3 - A code walk-through video where you talk about each line of your code and explain how it contributes to a working solution.
* Level 4 - A whiteboard (digital i.e jamboard, or on paper) demonstration where you trace through your chosen problem and explain how your solution works. See my the recursion lesson video(s) and accompanying jamboard for an example.






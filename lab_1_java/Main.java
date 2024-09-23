package imo_233_kuz.lab_1_java;

public class Main {

    // firts half of task 
    
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
        //sleepIn
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
 
        return (aSmile && bSmile) || (!aSmile && !bSmile);
        //monkeyTrouble
    }

    public int sumDouble(int a, int b) {
  
        int sum = a + b;
        if (a == b) {
            return 2 * sum;
        } else {
            return sum;
        }
        //sumDouble
    }
    
    public int diff21(int n) {
  
        if (n > 21) {
            return 2 * (n - 21);
        } else {
            return 21 - n;
        }
    
    }
    
    //diff21

    public boolean parrotTrouble(boolean talking, int hour) {

        return talking && (hour < 7 || hour > 20);
    
    
    }
    //parrotTrouble

    public boolean makes10(int a, int b) {

        return (a == 10 || b == 10 || (a + b) == 10);
    
    
    }//makes10
    
    public boolean nearHundred(int n) {

        return (Math.abs(n - 100) <= 10) || (Math.abs(n - 200) <= 10);
    
    
    }//nearHundred

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return a < 0 && b < 0;
        } else {
            return (a < 0 && b > 0) || (a > 0 && b < 0);
        }
    }//posNeg

    public String notString(String str) {
        if (str.startsWith("not")) {
            return str;
        } else {
            return "not " + str;
        }
    }//notString

    public String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1);
    }//missingChar

    public String frontBack(String str) {
        if (str.length() <= 1) {
            return str; 
        }
       
        String middle = str.substring(1, str.length() - 1);
        return str.charAt(str.length() - 1) + middle + str.charAt(0);
    }//frontBack
    
    public String front3(String str) {
        String front;
        if (str.length() >= 3) {
            front = str.substring(0, 3);
        } else {
            front = str; 
        }
        return front + front + front; 
    }//front3
    
    public String backAround(String str) {
       
        char lastChar = str.charAt(str.length() - 1);
        return lastChar + str + lastChar;
    }//backAround
    
    public boolean or35(int n) {
        return (n % 3 == 0) || (n % 5 == 0);
    }//or35

    String front22(String str) {
        String front = str.length() < 2 ? str : str.substring(0, 2);
        return front + str + front;
    }//front22
  
    public static void main(String[] args) {
  
    }
    
    
}

package practice.practice12;

/******************************************************************************
 *  Author:        Zhang Xuan
 *  Written:       2018/6/19
 *  Last updated:  2018/6/19
 *  Compilation:   javac EX07.java
 *  Description: 
 *
 ******************************************************************************/


public class EX07 {

    public static String mystery(String s) {
        int N = s.length();
        if (N <= 1) return s;
        String a = s.substring(0, N/2);
        String b = s.substring(N/2, N);
        return mystery(b) + mystery(a);
    }

    public static void main(String[] args) {
        String s = "12345";
        System.out.println(mystery(s));
    }
}

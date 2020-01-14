package practice.practice11;

import org.omg.CORBA.PUBLIC_MEMBER;
import structures.Stack;

/******************************************************************************
 *  Author:        Zhang Xuan
 *  Written:       2019/1/18
 *  Last updated:  2019/1/18
 *  Compilation:   javac CompletionLeft.java
 *  Description:   编写一段程序，从标准输入得到一个缺少左括号的表达式并打印出补                   全括号之后的终须表达式
 *
 ******************************************************************************/


public class CompletionLeft {

    /**
     * 编写一段程序，从标准输入得到一个缺少左括号的表达式并打印出补                   全括号之后的中序表达式
     *  input -> 1 + 2 ) * 3 - 4 ) * 5 - 6))) ；
     *  output -> ((1 + 2) * ((3 - 4) * (5 - 6)))
     * @param input 等待补全的方程式
     */
    public static void CompletionEquation(String input) {
        Stack<String> numbers = new Stack<>();
        Stack<String> symbols = new Stack<>();

        String outInput = "";
        for (int i = 0; i < input.length(); i++) {
            String s = String.valueOf(input.charAt(i));
            if (s.equals("+")) {
                symbols.push(s);
            } else if (s.equals("-")) {
                symbols.push(s);
            } else if (s.equals("*")) {
                symbols.push(s);
            } else if (s.equals("/")) {
                symbols.push(s);
            } else if (s.equals(")")) {
                symbols.push(s);
            } else if (s.equals(")")) {
                numbers.push(s);
            } else {
                numbers.push(s);
            }
        }

        System.out.println(numbers);
        System.out.println(symbols);
    }

    /**
     *
     * @param
     * @return
     */
    /*public static String InfixToPostfix(String input) {

    }*/

    public static void main(String[] args) {
        // CompletionEquation("1 + 2 ) * 3 - 4 ) * 5 - 6)))");

        String[] A = {"标题", "正文"};
        String[] B = {"A","B", "C"};

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++)
                System.out.println(A[i] +"="+B[j]);
        }


    }
}

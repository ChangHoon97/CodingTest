package String;

import java.util.Scanner;
//회문 문자열
//ex) gooG
public class palindrome {
    public String solution(String str){
        String answer="NO";

        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)){
            return "YES";
        }

        /*
        int len = str.length();
        str = str.toUpperCase();
        for(int i = 0; i< len/2; i++){
            if(str.charAt(i) != str.charAt(len-i-1)){
                return "NO";
            }
        }
        // String answer ="YES" 로 바꿔줘야한다.
         */

        return answer;
    }

    public static void main(String[] args) {
        palindrome T = new palindrome();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
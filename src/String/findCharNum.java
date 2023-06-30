package String;

import java.util.Scanner;
// ex) computercontroller c
public class findCharNum {
    public int solution(String str, char t ){
        int answer =0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for(char x : str.toCharArray()){    //toCharArray() : 문자열을 문자 배열로 만들어줌
            if(x == t){
                answer++;
            }
        }
       /*
       for(int i =0; i<str.length(); i++){
            if(str.charAt(i) == t){
                answer++;
            }
        }
        */
        return answer;
    }

    public static void main(String[] args) {
        findCharNum T = new findCharNum();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        System.out.println(T.solution(str, c));
    }
}
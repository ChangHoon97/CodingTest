package String;

import java.util.Scanner;
//특정 단어 뒤집기
//ex) a#b!GE*T@S
public class specificAlphabetChange {
    public String solution(String str){
        String answer;
        char[] s = str.toCharArray();
        int lt = 0, rt = str.length() - 1;
        while(lt<rt){
            if(!Character.isAlphabetic(s[lt])){
                lt++;
            } else if (!Character.isAlphabetic(s[rt])) {
                rt--;
            }else{
                char tmp = s[lt];
                s[lt]=s[rt];
                s[rt]=tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);
        return answer;
    }

    public static void main(String[] args) {
        specificAlphabetChange T = new specificAlphabetChange();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
package String;

import java.util.Scanner;
//숫자만 추출
//ex) g0en2T0s8eSoft
public class extractNum {
    public int solution(String s) {

        String answer ="";
        for(char x : s.toCharArray()){
            if(Character.isDigit(x)){   // 이게 숫자냐
                answer += x;
            }
        }
        return Integer.parseInt(answer);
        //parseInt 하지 않고 String으로 출력하면 0208로 출력된다.
        
        
        /*
        int answer= 0;
        for(char x : s.toCharArray()){
            if(x>=48 && x<=57){
                answer = answer*10 + (x-48);
            }
        }
        return answer;
        
         */
    }

    public static void main(String[] args) {
        extractNum T = new extractNum();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
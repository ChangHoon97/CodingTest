import java.util.Scanner;
//유효한 펠린드롬
//ex) found7, time: study; Yduts; emit, 7Dnuof
public class validPallindrome {
    public String solution(String s){
        String answer="NO";
        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(s).reverse().toString();
        if(s.equalsIgnoreCase(tmp)){
            return "YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        validPallindrome T = new validPallindrome();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}